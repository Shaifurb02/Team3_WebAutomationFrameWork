package TestHome;

import common.WebAPI;
import home.pageObject.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHomePage extends WebAPI {


//    @Test (priority = 1)
//    public void testSearchBox() throws InterruptedException {
//        HomePage home = PageFactory.initElements(driver,HomePage.class);
//        driver.manage().window().maximize();
//        sleepFor(5);
//        home.checkSearchBox();
//    }
//
//    @Test (priority = 2)
//    public void testMenuButton() throws InterruptedException {
//        HomePage home = PageFactory.initElements(driver,HomePage.class);
//        driver.manage().window().maximize();
//        sleepFor(5);
//        home.checkMenuButton();
//
//    }
//
//    @Test (priority = 3)
//    public void testSupportButton () throws InterruptedException {
//        HomePage home = PageFactory.initElements(driver,HomePage.class);
//        driver.manage().window().maximize();
//        sleepFor(5);
//        home.checkOnSupport();
//    }
//
//    @Test (priority = 4)
//    public void testShoppingCartButton () throws InterruptedException {
//        HomePage home = PageFactory.initElements(driver,HomePage.class);
//        driver.manage().window().maximize();
//        sleepFor(5);
//        home.checkShoppingCart();
//    }
//
//    @Test (priority = 5)
//    public void testAccount () throws InterruptedException {
//        HomePage home = PageFactory.initElements(driver,HomePage.class);
//        driver.manage().window().maximize();
//        sleepFor(5);
//        home.checkOnAccount();
//    }
//    @Test (priority = 6)
//    public void testAccountMenu () throws InterruptedException {
//        HomePage home = PageFactory.initElements(driver,HomePage.class);
//        driver.manage().window().maximize();
//        sleepFor(4);
//        home.checkOnAccountMenu();
//    }
//
//    @Test (priority = 7)
//    public void testAccountMenuSignIn () throws InterruptedException {
//        HomePage home = PageFactory.initElements(driver,HomePage.class);
//        driver.manage().window().maximize();
//        sleepFor(2);
//        home.checkOnAccountMenuSignIn();
//    }
//
//    @Test (priority = 8)
//    public void testClickOnBusinessButton () throws InterruptedException {
//        HomePage home = PageFactory.initElements(driver,HomePage.class);
//        driver.manage().window().maximize();
//        sleepFor(2);
//        home.checkOnBusinessButton();
//    }
//
//    @Test (priority = 8)
//    public void testClickOnDealsButton () throws InterruptedException {
//        HomePage home = PageFactory.initElements(driver,HomePage.class);
//        driver.manage().window().maximize();
//        sleepFor(2);
//        home.checkOnDealsButton();
//    }
//
//    @Test (priority = 9)
//    public void testClickOnPhonesButton () throws InterruptedException {
//        HomePage home = PageFactory.initElements(driver,HomePage.class);
//        driver.manage().window().maximize();
//        sleepFor(4);
//        home.checkOnPhonesButton();
//    }
//
//    @Test (priority = 10)
//    public void testClickOnWirelessButton () throws InterruptedException {
//        HomePage home = PageFactory.initElements(driver,HomePage.class);
//        driver.manage().window().maximize();
//        sleepFor(4);
//        home.checkOnWirelessButton();
//    }
//
//    @Test (priority = 11)
//    public void testClickOnInternetButton ()  throws InterruptedException {
//        HomePage home = PageFactory.initElements(driver, HomePage.class);
//        driver.manage().window().maximize();
//        sleepFor(4);
//        home.checkOnInternetButton();
//    }

//
//    @Test (priority = 12)
//    public void testTVButton ()  throws InterruptedException {
//        HomePage home = PageFactory.initElements(driver, HomePage.class);
//        driver.manage().window().maximize();
//        sleepFor(4);
//        home.checkOnTVButton();
//    }
//

    @Test (priority = 13)
    public void testPrePaid ()  throws InterruptedException {
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        driver.manage().window().maximize();
        sleepFor(3);
        home.checkOnPrePaid();
    }













}
