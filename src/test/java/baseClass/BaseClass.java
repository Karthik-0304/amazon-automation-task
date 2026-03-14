package baseClass;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pagesObjectModel.Login;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class BaseClass {
    public static WebDriver driver;

    public Login login;
    private static final ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

    public WebDriver getDriver()
    {
        return tlDriver.get();
    }



    public WebDriver initilize()
    {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return driver;
    }

    @BeforeClass(alwaysRun = true)
    public Login setup()
    {
        driver = initilize();
        tlDriver.set(driver);
        login = new Login(driver);
//        login.load("https://www.amazon.in/");
        driver.get("https://www.amazon.in/");
        return login;
    }


    public String takeScreenShoot(String testcaseName) throws IOException
    {
        WebDriver driver1 = getDriver();
        File src = ((TakesScreenshot) driver1).getScreenshotAs(OutputType.FILE);
        String folderPath = System.getProperty("user.dir") + "/reports/screenshots/";
        File directory = new File(folderPath);
        if (!directory.exists())
            directory.mkdirs();
        String fileName = testcaseName + "_" + System.currentTimeMillis() + ".png";
        File fullPath = new File(folderPath + fileName);
        FileUtils.copyFile(src, fullPath);
        return "screenshots/" + fileName;
    }


//    @AfterClass
//    public void teardown(){
//        driver.quit();
//    }
}
