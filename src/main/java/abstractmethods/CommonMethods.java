package abstractmethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

// actions
// select
//waits
// window handels
// click

public class CommonMethods
{
    WebDriver driver;

    public CommonMethods(WebDriver driver)
    {
        this.driver = driver;
    }

    public void waitForElementElementBy(By by)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void clickBy(By by)
    {
        waitForElementElementBy(by);
        driver.findElement(by).click();
    }



    public void type(By by,String text)
    {
        waitForElementElementBy(by);
        driver.findElement(by).sendKeys(text);
    }
}
