package pagesObjectModel;
import abstractmethods.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class ProductSearch extends CommonMethods {

    WebDriver driver;

    public ProductSearch(WebDriver driver){
        super(driver);
        this.driver=driver;
    }

    By searchBar=By.xpath("//input[@id='twotabsearchtextbox']");
    By searchBtn=By.xpath("//input[@id='nav-search-submit-button']");
    By productList = By.xpath("//div[@class='a-section']//a//h2//span");

    public ProductSearch searchField(String text){
        type(searchBar,text);
        return this;
    }

    public ProductSearch searchBtnenter(){
        clickBy(searchBtn);
        return this;
    }

    public ProductSearch Productclick(String text){
        List<WebElement> products=driver.findElements(productList);
        for (WebElement element:products){
            if(element.getText().toLowerCase().contains(text.toLowerCase())){
                System.out.println(element.getText());
                element.click();
                break;
            }
        }
        return this;
    }

    public AddToCart windowswitch(){
        Set<String> windows = driver.getWindowHandles();
        for(String window : windows){
            driver.switchTo().window(window);
        }
        return new AddToCart(driver);
    }

}
