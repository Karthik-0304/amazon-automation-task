package test;
import baseClass.BaseClass;
import data.SignPojo;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pagesObjectModel.*;
import testcomponents.Listenersclass;

@Listeners(Listenersclass.class)
public class EndtoEndTest extends BaseClass
{

//    @Test
//    public void test(){
//        new Login(driver)
//                .accAndLogionbtn()
//                .phoneNofiled("8754257575")
//                .setContinueBtn()
//                .enterPass("karthik@27")
//                .signupBtn()
//                .searchField("boat wired earphone")
//                .searchBtnenter()
//                .Productclick("Bassheads 100 in Ear Wired Headphones with Mic (White)")
//                .windowswitch()
//                .cartBtn()
//                .cartconf()
//                .Proceedtobuy()
//                .cntToCart()
//                .CashOnDeli()
//                .usethispayment()
//                .paymentcnf()
//                .OrderChecking();
//    }

    ProductSearch productSearch;
    AddToCart addToCart;
    PaymentPage paymentPage;
    OrderConfirmation orderConfirmation;
    SignPojo signPojo = new SignPojo();





    @Test(priority = 1)
    public void login()
    {
        login.accAndLogionbtn();
        login.phoneNofiled(signPojo.getPhno());
        login .setContinueBtn();
        login .enterPass("karthik@27");
        productSearch= login .signupBtn();
    }


    @Test(priority = 2)
    public void product()
    {
        productSearch .searchField("boat wired earphone");
        productSearch .searchBtnenter();
        productSearch .Productclick("Bassheads 100 in Ear Wired Headphones with Mic (White)");
        addToCart = productSearch .windowswitch();
    }

    @Test(priority = 3)
    public void cart(){
        addToCart .cartBtn();
        addToCart .cartconf();
        addToCart  .Proceedtobuy();
        paymentPage = addToCart  .cntToCart();
    }

    @Test(priority = 4)
    public void  payment(){
        paymentPage   .CashOnDeli();
        paymentPage  .usethispayment();
        orderConfirmation = paymentPage  .paymentcnf();
        orderConfirmation  .OrderChecking();
    }


    public void test()
    {

    }

}
