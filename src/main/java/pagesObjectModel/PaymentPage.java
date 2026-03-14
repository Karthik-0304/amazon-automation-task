package pagesObjectModel;
import abstractmethods.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage extends CommonMethods {
    WebDriver driver;

    public PaymentPage(WebDriver driver)
    {
        super(driver);
        this.driver=driver;
    }

    By cashonDeli=By.xpath("//span[@class='a-color-base a-text-bold'  and normalize-space()='Cash on Delivery/Pay on Delivery']");
    By UsethisPayme=By.xpath("//span[@id='checkout-primary-continue-button-id']//input[@type='submit']");
    By placeyourOrder=By.xpath("//span[@id='bottomSubmitOrderButtonId']//input[@id='placeOrder']");

    public PaymentPage CashOnDeli(){
        clickBy(cashonDeli);
        return this;
    }

    public PaymentPage usethispayment(){
        clickBy(UsethisPayme);
        return this;
    }

    public OrderConfirmation paymentcnf(){
        clickBy(placeyourOrder);
        return new OrderConfirmation(driver);
    }
}
