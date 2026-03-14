package pagesObjectModel;
import abstractmethods.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login extends CommonMethods {
    WebDriver driver;

    public Login(WebDriver driver)
    {
        super(driver);
        this.driver=driver;

    }
    By accAndLogin=By.xpath("//span[@id='nav-link-accountList-nav-line-1']");
    By phoneNoFiled=By.xpath("//input[@id='ap_email_login']");
    By continueBtn=By.xpath("//input[@type='submit']");
    By passField=By.xpath("//input[@id='ap_password']");
    By signUpBtn=By.xpath("//input[@id='signInSubmit']");

    public void accAndLogionbtn()
    {
        clickBy(accAndLogin);

    }

    public void phoneNofiled(String Notext){
        type(phoneNoFiled,Notext);

    }

    public void setContinueBtn()
    {
        clickBy(continueBtn);

    }

    public void enterPass(String passtext)
    {
        type(passField,passtext);

    }

    public ProductSearch signupBtn(){
        clickBy(signUpBtn);
        return new ProductSearch(driver);
    }

    public void load(String url)
    {
        driver.get(url);
    }


}
