//package pagesObjectModel;
//
//import baseClass.BaseClass;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.testng.annotations.Test;
//
//import java.util.List;
//import java.util.Set;
//
//public class FullFlowTest extends BaseClass {
//    @Test
//    public void login() {
//        By accAndLogin=By.xpath("//span[@id='nav-link-accountList-nav-line-1']");
//        By phoneNoFiled=By.xpath("//input[@id='ap_email_login']");
//        By continueBtn=By.xpath("//input[@type='submit']");
//        By passField=By.xpath("//input[@id='ap_password']");
//        By signUpBtn=By.xpath("//input[@id='signInSubmit']");
//
//        clickBy(accAndLogin);
//        type(phoneNoFiled,"8754257575");
//        clickBy(continueBtn);
//        type(passField,"karthik@27");
//        clickBy(signUpBtn);
//
//
//        By searchBar=By.xpath("//input[@id='twotabsearchtextbox']");
//        By searchBtn=By.xpath("//input[@id='nav-search-submit-button']");
//        By productList = By.xpath("//div[@class='a-section']//a//h2//span");
////        By addTocart=By.xpath(".//following::button[@name='submit.addToCart']");
//
//        type(searchBar,"boat wired earphone");
//        clickBy(searchBtn);
//        List<WebElement> products=driver.findElements(productList);
//
//        String productname="Bassheads 100 in Ear Wired Headphones with Mic (White)";
//        for (WebElement element:products){
//            if(element.getText().toLowerCase().contains(productname.toLowerCase())){
//                System.out.println(element.getText());
//                element.click();
//               break;
//            }
//        }
//
//        Set<String> windows = driver.getWindowHandles();
//        for(String window : windows){
//            driver.switchTo().window(window);
//        }
//
//        By addTocart=By.xpath("//div[@class='a-section a-spacing-none a-padding-none']//div[@id='addToCart_feature_div']//div//input[@id='add-to-cart-button']");
//        clickBy(addTocart);
//
//        By cartBtn=By.xpath("//span[@class='a-button a-button-primary attach-button-large attach-primary-cart-button']");
//        //By noThanks = By.xpath("//input[contains(@aria-labelledby,'attachSiNoCoverage')]");
//
//
//        clickBy(cartBtn);
//
//
//        By proceedToBuy=By.xpath("//input[@name='proceedToRetailCheckout']");
//        By continuetocart=By.xpath("//span[@cel_widget_id='byg-ptc-button-top-desktop']//a[@name='checkout-byg-ptc-button' and normalize-space()='Continue to checkout']");
//
//
//
//        By ChangeAddress=By.xpath("//a[normalize-space()='Change']");
//        By AddnewAddress=By.xpath("//a[@id='add-new-address-desktop-sasp-tango-link']");
//        By Fname=By.xpath("//input[@id='address-ui-widgets-enterAddressFullName']");
//        By MobileNo=By.xpath("//input[@id='address-ui-widgets-enterAddressPhoneNumber']");
//        By PinCode=By.xpath("//input[@id='address-ui-widgets-enterAddressPostalCode']");
//        By HouiseNo=By.xpath("//input[@id='address-ui-widgets-enterAddressLine1']");
//        By Area=By.xpath("//input[@id='address-ui-widgets-enterAddressLine1']");
//        By Town=By.xpath("//input[@id='address-ui-widgets-enterAddressCity']");
//        By Statedropdown=By.xpath("//span[@id='address-ui-widgets-enterAddressStateOrRegion']//span[@class='a-button-text a-declarative']");
//        By TamilNadu=By.xpath("//a[@id='address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId_30']");
//        By selectAddress=By.xpath("//span[@id='select-destination-on-sasp-desktop-panel-id-6EFROB6EE3NSKUG5PDKQG12CMXRGGW8VEA1CEV8WGGRXMCCPXTQ2EQA2OX63ABKD']//i[@class='a-icon a-icon-radio']");
//        By deliverToaddress=By.xpath("//input[@data-csa-c-slot-id='checkout-secondary-continue-shipaddressselect']");
////        By deliveryTime=By.xpath("//input[contains(@id,'vas-next')]");
//
//
//        clickBy(proceedToBuy);
//        clickBy(continuetocart);
//
////        clickBy(ChangeAddress);
////        clickBy(selectAddress);
////        clickBy(deliverToaddress);
////        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
////        By deliveryTime = By.xpath("//input[contains(@id,'vas-next')]");
////
////        WebElement option = wait.until(
////                ExpectedConditions.elementToBeClickable(deliveryTime)
////        );
////
////        option.click();
////
////        By scanAndPay = By.xpath("//div[contains(@class,'pmts-inline-field-block')]//input[@type='radio']");
////        clickBy(scanAndPay);
//
//        By cashonDeli=By.xpath("//span[@class='a-color-base a-text-bold'  and normalize-space()='Cash on Delivery/Pay on Delivery']");
//        clickBy(cashonDeli);
//
//        By addresslist=By.xpath("//div[@class='a-row']//div[@aria-labelledby='delivery-addresses-section-header-id']");
//        //By usethispayment=By.xpath("//span[@class='a-button-inner']//span[normalize-space()='Use this payment method']");
//        By UsethisPayme=By.xpath("//span[@id='checkout-primary-continue-button-id']//input[@type='submit']");
//        clickBy(UsethisPayme);
//
//        By placeyourOrder=By.xpath("//span[@id='bottomSubmitOrderButtonId']//input[@id='placeOrder']");
//        clickBy(placeyourOrder);
//
//        By placeorder=By.xpath("//span[@id='submitOrderButtonId']//input[@id='placeOrder']");
//
//
//
//        try {
//            clickBy(placeorder);
//
//        }finally {
//            //By conmsg=By.xpath("//h4[@class='a-alert-heading']");
//            WebElement confirmationmessage=driver.findElement(By.xpath("//h4[@class='a-alert-heading']"));
//            String successful=confirmationmessage.getText();
//            System.out.println(successful);
//            String confirm="Order placed, thank you!";
//        if(successful.equalsIgnoreCase(confirm)){
//            System.out.println("Successfully completesd the end to end flow");
//        }
//        else {
//            System.out.println("Error");
//        }
//
//    }
//    }
//
//}
