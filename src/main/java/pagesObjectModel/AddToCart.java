package pagesObjectModel;


import abstractmethods.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddToCart extends CommonMethods {

    WebDriver driver;

    public AddToCart(WebDriver driver)
    {
        super(driver);
        this.driver=driver;
    }

    By addTocart=By.xpath("//div[@class='a-section a-spacing-none a-padding-none']//div[@id='addToCart_feature_div']//div//input[@id='add-to-cart-button']");
    By cartBtn=By.xpath("//span[@class='a-button a-button-primary attach-button-large attach-primary-cart-button']");
    By proceedToBuy=By.xpath("//input[@name='proceedToRetailCheckout']");
    By continuetocart=By.xpath("//span[@cel_widget_id='byg-ptc-button-top-desktop']//a[@name='checkout-byg-ptc-button' and normalize-space()='Continue to checkout']");


    public AddToCart cartBtn(){
        clickBy(addTocart);
        return this;
    }

    public AddToCart cartconf(){
        clickBy(cartBtn);
        return this;
    }

    public AddToCart Proceedtobuy(){
        clickBy(proceedToBuy);
        return this;
    }

    public PaymentPage cntToCart(){
        clickBy(continuetocart);
        return new PaymentPage(driver);
    }

}
