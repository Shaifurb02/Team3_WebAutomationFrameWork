package TestHome;

import common.WebAPI;
import home.pageObject.UnitedHomePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestUnitedHomePage extends WebAPI {

    @Test  (priority = 1)
    public void testSignIn() throws InterruptedException {
        UnitedHomePage home = PageFactory.initElements(driver, UnitedHomePage.class);
        driver.manage().window().maximize();
        sleepFor(2);
        home.checkSignIn();
    }
    @Test  (priority = 2)
    public void testSignInFormModel() throws InterruptedException {
        UnitedHomePage home = PageFactory.initElements(driver, UnitedHomePage.class);
        driver.manage().window().maximize();
        sleepFor(2);
        home.checkSignInFormModel();
    }

    @Test  (priority = 3)
    public void testEnrollInMileage() throws InterruptedException {
        UnitedHomePage home = PageFactory.initElements(driver, UnitedHomePage.class);
        driver.manage().window().maximize();
        sleepFor(5);
        home.checkEnrollInMileage();
    }
    @Test  (priority = 4)
    public void testEnrollInMileageAccept() throws InterruptedException {
        UnitedHomePage home = PageFactory.initElements(driver, UnitedHomePage.class);
        driver.manage().window().maximize();
        sleepFor(5);
        home.checkEnrollInMileageAccept();
    }
    @Test  (priority = 5)
    public void testFlightStatus() throws InterruptedException {
        UnitedHomePage home = PageFactory.initElements(driver, UnitedHomePage.class);
        driver.manage().window().maximize();
        sleepFor(5);
        home.checkFlightStatus();
    }
    @Test  (priority = 6)
    public void testCheckIn() throws InterruptedException {
        UnitedHomePage home = PageFactory.initElements(driver, UnitedHomePage.class);
        driver.manage().window().maximize();
        sleepFor(5);
        home.checkCheckIn();
    }
    @Test  (priority = 7)
    public void testMyTrips() throws InterruptedException {
        UnitedHomePage home = PageFactory.initElements(driver, UnitedHomePage.class);
        driver.manage().window().maximize();
        sleepFor(5);
        home.checkMyTrips();
    }
    @Test  (priority = 8)
    public void testHoverOverReservations() throws InterruptedException {
        UnitedHomePage home = PageFactory.initElements(driver, UnitedHomePage.class);
        driver.manage().window().maximize();
        sleepFor(5);
        home.checkHoverOverReservations();
    }
    @Test  (priority = 9)
    public void testAfterHoverReservationsRoundTrip() throws InterruptedException {
        UnitedHomePage home = PageFactory.initElements(driver, UnitedHomePage.class);
        driver.manage().window().maximize();
        sleepFor(5);
        home.checkAfterHoverReservationsRoundTrip();
    }
    @Test  (priority = 10)
    public void testTravelInformation() throws InterruptedException {
        UnitedHomePage home = PageFactory.initElements(driver, UnitedHomePage.class);
        driver.manage().window().maximize();
        sleepFor(5);
        home.checkTravelInformation();
    }
    @Test  (priority = 11)
    public void testUnitedPolaris() throws InterruptedException {
        UnitedHomePage home = PageFactory.initElements(driver, UnitedHomePage.class);
        driver.manage().window().maximize();
        sleepFor(5);
        home.checkUnitedPolaris();
    }
    @Test  (priority = 12)
    public void testUnitedPolarisButton() throws InterruptedException {
        UnitedHomePage home = PageFactory.initElements(driver, UnitedHomePage.class);
        driver.manage().window().maximize();
        sleepFor(5);
        home.checkUnitedPolarisButton();
    }
    @Test  (priority = 13)
    public void testDealsAndOffers() throws InterruptedException {
        UnitedHomePage home = PageFactory.initElements(driver, UnitedHomePage.class);
        driver.manage().window().maximize();
        sleepFor(5);
        home.checkDealsAndOffers();
    }
    @Test  (priority = 14)
    public void testHoverOverReservation() throws InterruptedException {
        UnitedHomePage home = PageFactory.initElements(driver, UnitedHomePage.class);
        driver.manage().window().maximize();
        sleepFor(5);
        home.checkHoverOverReservation();
    }
    @Test  (priority = 15)
    public void testPlayBackControl() throws InterruptedException {
        UnitedHomePage home = PageFactory.initElements(driver, UnitedHomePage.class);
        driver.manage().window().maximize();
        sleepFor(3);
        home.checkPlayBackControl();
    }
    @Test  (priority = 16)
    public void testPlayBackControlOptionZero() throws InterruptedException {
        UnitedHomePage home = PageFactory.initElements(driver, UnitedHomePage.class);
        driver.manage().window().maximize();
        sleepFor(3);
        home.checkPlayBackControlOptionZero();
    }
    @Test  (priority = 17)
    public void testPlayBackControlOptionOne() throws InterruptedException {
        UnitedHomePage home = PageFactory.initElements(driver, UnitedHomePage.class);
        driver.manage().window().maximize();
        sleepFor(3);
        home.checkPlayBackControlOptionOne();
    }
    @Test  (priority = 18)
    public void testPlayBackControlOptionTwo() throws InterruptedException {
        UnitedHomePage home = PageFactory.initElements(driver, UnitedHomePage.class);
        driver.manage().window().maximize();
        sleepFor(3);
        home.checkPlayBackControlOptionTwo();
    }
    @Test  (priority = 19)
    public void testPlayBackControlOptionThree() throws InterruptedException {
        UnitedHomePage home = PageFactory.initElements(driver, UnitedHomePage.class);
        driver.manage().window().maximize();
        sleepFor(3);
        home.checkPlayBackControlOptionThree();
    }
    @Test  (priority = 20)
    public void testPlayBackControlOptionFour() throws InterruptedException {
        UnitedHomePage home = PageFactory.initElements(driver, UnitedHomePage.class);
        driver.manage().window().maximize();
        sleepFor(3);
        home.checkPlayBackControlOptionFour();
    }
    @Test  (priority = 21)
    public void testPlayBackControlOptionFive() throws InterruptedException {
        UnitedHomePage home = PageFactory.initElements(driver, UnitedHomePage.class);
        driver.manage().window().maximize();
        sleepFor(3);
        home.checkPlayBackControlOptionFive();
    }
    @Test  (priority = 22)
    public void testOptionFiveDealLink() throws InterruptedException {
        UnitedHomePage home = PageFactory.initElements(driver, UnitedHomePage.class);
        driver.manage().window().maximize();
        sleepFor(3);
        home.checkOptionFiveDealLink();
    }
    @Test  (priority = 23)
    public void testOptionFiveDealLinkOrigin() throws InterruptedException {
        UnitedHomePage home = PageFactory.initElements(driver, UnitedHomePage.class);
        driver.manage().window().maximize();
        sleepFor(3);
        home.checkOptionFiveDealLinkOrigin();
    }
    @Test  (priority = 24)
    public void testOptionFiveDealLinkDestination() throws InterruptedException {
        UnitedHomePage home = PageFactory.initElements(driver, UnitedHomePage.class);
        driver.manage().window().maximize();
        sleepFor(3);
        home.checkOptionFiveDealLinkDestination();
    }
    @Test  (priority = 25)
    public void testOptionFiveDealLinkFinalDestination() throws InterruptedException {
        UnitedHomePage home = PageFactory.initElements(driver, UnitedHomePage.class);
        driver.manage().window().maximize();
        sleepFor(3);
        home.checkOptionFiveDealLinkFinalDestination();
    }




}


