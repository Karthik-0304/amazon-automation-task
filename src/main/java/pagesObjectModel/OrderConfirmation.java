package pagesObjectModel;
import abstractmethods.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderConfirmation extends CommonMethods {

    WebDriver driver;

    public OrderConfirmation(WebDriver driver)
    {
        super(driver);
        this.driver=driver;
    }

    By placeorder=By.xpath("//span[@id='submitOrderButtonId']//input[@id='placeOrder']");


    public OrderConfirmation OrderChecking() {
        try {
            clickBy(placeorder);

        } finally {
            //By conmsg=By.xpath("//h4[@class='a-alert-heading']");
            WebElement confirmationmessage = driver.findElement(By.xpath("//h4[@class='a-alert-heading']"));
            String successful = confirmationmessage.getText();
            System.out.println(successful);
            String confirm = "Order placed, thank you!";
            if (successful.equalsIgnoreCase(confirm)) {
                System.out.println("Successfully completesd the end to end flow");
            } else {
                System.out.println("Error");
            }

        }
        return this;
    }


}
