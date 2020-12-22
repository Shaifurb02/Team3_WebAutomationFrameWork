package TestHome;

import common.WebAPI;
import home.pageObject.ATTHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestATTHomePage extends WebAPI {


//    @Test (priority = 1)
//    public void testSearchBox() throws InterruptedException {
//        ATTHomePage home = PageFactory.initElements(driver, ATTHomePage.class);
//        driver.manage().window().maximize();
//        sleepFor(5);
//        home.checkSearchBox();
//    }
//    @Test (priority = 2)
//    public void testMenuButton() throws InterruptedException {
//        ATTHomePage home = PageFactory.initElements(driver, ATTHomePage.class);
//        driver.manage().window().maximize();
//        sleepFor(5);
//        home.checkMenuButton();
//
//    }
//
//    @Test (priority = 3)
//    public void testSupportButton () throws InterruptedException {
//        ATTHomePage home = PageFactory.initElements(driver, ATTHomePage.class);
//        driver.manage().window().maximize();
//        sleepFor(5);
//        home.checkOnSupport();
//    }
//
//    @Test (priority = 4)
//    public void testShoppingCartButton () throws InterruptedException {
//        ATTHomePage home = PageFactory.initElements(driver, ATTHomePage.class);
//        driver.manage().window().maximize();
//        sleepFor(5);
//        home.checkShoppingCart();
//    }
//
//    @Test (priority = 5)
//    public void testAccount () throws InterruptedException {
//        ATTHomePage home = PageFactory.initElements(driver, ATTHomePage.class);
//        driver.manage().window().maximize();
//        sleepFor(5);
//        home.checkOnAccount();
//    }
//    @Test (priority = 6)
//    public void testAccountMenu () throws InterruptedException {
//        ATTHomePage home = PageFactory.initElements(driver, ATTHomePage.class);
//        driver.manage().window().maximize();
//        sleepFor(4);
//        home.checkOnAccountMenu();
//    }
//
//    @Test (priority = 7)
//    public void testAccountMenuSignIn () throws InterruptedException {
//        ATTHomePage home = PageFactory.initElements(driver, ATTHomePage.class);
//        driver.manage().window().maximize();
//        sleepFor(2);
//        home.checkOnAccountMenuSignIn();
//    }
//
//    @Test (priority = 8)
//    public void testClickOnBusinessButton () throws InterruptedException {
//        ATTHomePage home = PageFactory.initElements(driver, ATTHomePage.class);
//        driver.manage().window().maximize();
//        sleepFor(2);
//        home.checkOnBusinessButton();
//    }
//
//    @Test (priority = 8)
//    public void testClickOnDealsButton () throws InterruptedException {
//        ATTHomePage home = PageFactory.initElements(driver, ATTHomePage.class);
//        driver.manage().window().maximize();
//        sleepFor(2);
//        home.checkOnDealsButton();
//    }
//
//    @Test (priority = 9)
//    public void testClickOnPhonesButton () throws InterruptedException {
//        ATTHomePage home = PageFactory.initElements(driver, ATTHomePage.class);
//        driver.manage().window().maximize();
//        sleepFor(4);
//        home.checkOnPhonesButton();
//    }
//
//    @Test (priority = 10)
//    public void testClickOnWirelessButton () throws InterruptedException {
//        ATTHomePage home = PageFactory.initElements(driver, ATTHomePage.class);
//        driver.manage().window().maximize();
//        sleepFor(4);
//        home.checkOnWirelessButton();
//    }
//
//    @Test (priority = 11)
//    public void testClickOnInternetButton ()  throws InterruptedException {
//        ATTHomePage home = PageFactory.initElements(driver, ATTHomePage.class);
//        driver.manage().window().maximize();
//        sleepFor(4);
//        home.checkOnInternetButton();
//    }
//
//
//    @Test (priority = 12)
//    public void testTVButton ()  throws InterruptedException {
//        ATTHomePage home = PageFactory.initElements(driver, ATTHomePage.class);
//        driver.manage().window().maximize();
//        sleepFor(4);
//        home.checkOnTVButton();
//    }
//
//
//    @Test (priority = 13)
//    public void testPrePaid ()  throws InterruptedException {
//        ATTHomePage home = PageFactory.initElements(driver, ATTHomePage.class);
//        driver.manage().window().maximize();
//        sleepFor(3);
//        home.checkOnPrePaid();
//    }
//
//    @Test (priority = 14)
//    public void testBundles ()  throws InterruptedException {
//        ATTHomePage home = PageFactory.initElements(driver, ATTHomePage.class);
//        driver.manage().window().maximize();
//        sleepFor(3);
//        home.checkOnBundles();
//    }
//
//    @Test (priority = 15)
//    public void testShopNow ()  throws InterruptedException {
//        ATTHomePage home = PageFactory.initElements(driver, ATTHomePage.class);
//        driver.manage().window().maximize();
//        sleepFor(3);
//        home.checkOnShopNow();
//    }
//
//    @Test (priority = 16)
//    public void testLearnMore ()  throws InterruptedException {
//        ATTHomePage home = PageFactory.initElements(driver, ATTHomePage.class);
//        driver.manage().window().maximize();
//        sleepFor(3);
//        home.checkOnLearnMore();
//    }
//
//    @Test (priority = 17)
//    public void testComingSoonLearnMore ()  throws InterruptedException {
//        ATTHomePage home = PageFactory.initElements(driver, ATTHomePage.class);
//        driver.manage().window().maximize();
//        sleepFor(3);
//        home.checkOnComingSoonLearnMore();
//    }
//
//    @Test (priority = 18)
//    public void testAdvantageLearnMore ()  throws InterruptedException {
//        ATTHomePage home = PageFactory.initElements(driver, ATTHomePage.class);
//        driver.manage().window().maximize();
//        sleepFor(3);
//        home.checkOnAdvantageLearnMore();
//    }
//
//    @Test (priority = 19)
//    public void testFiveGForYou ()  throws InterruptedException {
//      ATTHomePage home = PageFactory.initElements(driver, ATTHomePage.class);
//      driver.manage().window().maximize();
//      sleepFor(3);
//      home.checkOnClickOnFiveGForYou();
//}
//    @Test (priority = 20)
//    public void testProtectAdvantage ()  throws InterruptedException {
//        ATTHomePage home = PageFactory.initElements(driver, ATTHomePage.class);
//        driver.manage().window().maximize();
//        sleepFor(3);
//        home.checkOnProtectAdvantage();
//}
//    @Test (priority = 21)
//    public void testATTTV ()  throws InterruptedException {
//        ATTHomePage home = PageFactory.initElements(driver, ATTHomePage.class);
//        driver.manage().window().maximize();
//        sleepFor(3);
//        home.checkOnATTTV();
//}
//    @Test (priority = 22)
//    public void testAllPhoneDeals ()  throws InterruptedException {
//        ATTHomePage home = PageFactory.initElements(driver, ATTHomePage.class);
//        driver.manage().window().maximize();
//        sleepFor(3);
//        home.checkOnAllPhoneDeals();
//}
//    @Test (priority = 23)
//    public void testTwoAppleWatches ()  throws InterruptedException {
//        ATTHomePage home = PageFactory.initElements(driver, ATTHomePage.class);
//        driver.manage().window().maximize();
//        sleepFor(3);
//        home.checkOnTwoAppleWatches();
//    }
//    @Test (priority = 24)
//    public void testEnterEmail ()  throws InterruptedException {
//        ATTHomePage home = PageFactory.initElements(driver, ATTHomePage.class);
//        driver.manage().window().maximize();
//        sleepFor(3);
//        home.checkOnEnterEmail();
//    }
//    @Test (priority = 25)
//    public void testConnectDropDownMenu ()  throws InterruptedException {
//        ATTHomePage home = PageFactory.initElements(driver, ATTHomePage.class);
//        driver.manage().window().maximize();
//        sleepFor(3);
//        home.checkOnConnectDropDownMenu();
//    }

}
