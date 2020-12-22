package home.pageObject;

import home.webElement.WebElementUnitedHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UnitedHomePage extends WebElementUnitedHomePage {

    //Method 1
    @FindBy(how = How.XPATH, using = WebElementUnitedHomePage.xPathSignIn)
    WebElement clickOnSignIn;
    public void checkSignIn() {
        clickOnSignIn.click();
    }
    //Method 2
    @FindBy(how = How.XPATH, using = WebElementUnitedHomePage.xPathSignIn)
    WebElement clickOnSignInFormModel;
    public void checkSignInFormModel() throws InterruptedException {
        clickOnSignInFormModel.click();
        sleepFor(3);
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]")).click();
        sleepFor(3);
        clickOnSignInFormModel.click();
        clickOnSignInFormModel.sendKeys("12345",Keys.ENTER);
        sleepFor(3);
    }
    //Method 3
    @FindBy(how = How.XPATH, using = WebElementUnitedHomePage.xPathSignIn)
    WebElement clickOnEnrollInMileage;
    public void checkEnrollInMileage() throws InterruptedException {
        clickOnEnrollInMileage.click();
        sleepFor(3);
        clickOnEnrollInMileage.findElement(By.xpath("//span[contains(text(),'Enroll in MileagePlus')]")).click();
        sleepFor(3);
    }
    //Method 4
    @FindBy(how = How.XPATH, using = WebElementUnitedHomePage.xPathSignIn)
    WebElement clickOnEnrollInMileageAccept;
    public void checkEnrollInMileageAccept() throws InterruptedException {
        clickOnEnrollInMileageAccept.click();
        sleepFor(3);
        clickOnEnrollInMileageAccept.findElement(By.xpath("//span[contains(text(),'Enroll in MileagePlus')]")).click();
        sleepFor(3);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,3500)");
        sleepFor(3);
        driver.findElement(By.xpath("//button[@id='btnEnroll']")).click();
    }
    //Method 5
    @FindBy(how = How.XPATH, using = WebElementUnitedHomePage.xPathFlightStatus)
    WebElement clickOnFlightStatus;
    public void checkFlightStatus() {
        clickOnFlightStatus.click();
    }
    //Method 6
    @FindBy(how = How.XPATH, using = WebElementUnitedHomePage.xPathCheckIn)
    WebElement clickOnCheckIn;
    public void checkCheckIn() {
        clickOnCheckIn.click();
    }
    //Method 7
    @FindBy(how = How.XPATH, using = WebElementUnitedHomePage.xPathMyTrips)
    WebElement clickOnMyTrips;
    public void checkMyTrips () {
        clickOnMyTrips.click();
    }
    //Method 8
    @FindBy(how = How.XPATH, using = WebElementUnitedHomePage.xPathHoverOverReservations)
    WebElement HoverOverReservations;
        public void checkHoverOverReservations() throws InterruptedException {
            Actions builder = new Actions(driver);
            Action mouseOverHome = builder.moveToElement(HoverOverReservations).build();
            mouseOverHome.perform();
            sleepFor(3);
        }
    //Method 9
    @FindBy(how = How.XPATH, using = WebElementUnitedHomePage.xPathHoverOverReservations)
    WebElement AfterHoverReservationsRoundTrip;
    public void checkAfterHoverReservationsRoundTrip() throws InterruptedException {
        Actions builder = new Actions(driver);
        Action mouseOverHome = builder.moveToElement(AfterHoverReservationsRoundTrip).build();
        mouseOverHome.perform();
        sleepFor(3);
        driver.findElement(By.xpath("//div[@id='headerNav0-panel']//div[1]//ul[1]//li[2]")).click();
        sleepFor(10);
    }
    //Method 10
    @FindBy(how = How.XPATH, using = WebElementUnitedHomePage.xPathTravelInformation)
    WebElement clickOnTravelInformation;
    public void checkTravelInformation() {
        clickOnTravelInformation.click();
    }
    //Method 11
    @FindBy(how = How.XPATH, using = WebElementUnitedHomePage.xPathTravelInformation)
    WebElement clickOnUnitedPolaris;
    public void checkUnitedPolaris() throws InterruptedException {
        clickOnUnitedPolaris.click();
        sleepFor(3);
        driver.findElement(By.xpath("//a[contains(text(),'United Polaris')]")).click();
        sleepFor(3);
    }
    //Method 12
    @FindBy(how = How.XPATH, using = WebElementUnitedHomePage.xPathTravelInformation)
    WebElement clickOnUnitedPolarisButton;
    public void checkUnitedPolarisButton() throws InterruptedException {
        clickOnUnitedPolarisButton.click();
        sleepFor(3);
        driver.findElement(By.xpath("//a[contains(text(),'United Polaris')]")).click();
        sleepFor(3);
        clickOnUnitedPolarisButton.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[6]")).click();
        sleepFor(3);
    }
    //Method 13
    @FindBy(how = How.XPATH, using = WebElementUnitedHomePage.xPathDealsAndOffers)
    WebElement clickOnDealsAndOffers;
    public void checkDealsAndOffers() throws InterruptedException {
        clickOnDealsAndOffers.click();
        sleepFor(3);
    }
    //Method 14
    @FindBy(how = How.XPATH, using = WebElementUnitedHomePage.xPathDealsAndOffers)
    WebElement clickOnHoverOverReservation;
    public void checkHoverOverReservation() throws InterruptedException {
        clickOnHoverOverReservation.click();
        sleepFor(3);
        Actions builder = new Actions(driver);
        Action hoverOverReservation = builder.moveToElement(driver.findElement(By.xpath("//a[@id='header-option-tcm76-4859-1024']"))).build();
        hoverOverReservation.perform();
        sleepFor(3);
    }
    //Method 15
    @FindBy(how = How.XPATH, using = WebElementUnitedHomePage.xPathPlayBackControl)
    WebElement clickOnPlayBackControl;
    public void checkPlayBackControl() throws InterruptedException {
        clickOnPlayBackControl.click();
        sleepFor(3);
        }
    //Method 16
    @FindBy(how = How.XPATH, using = WebElementUnitedHomePage.xPathPlayBackControl)
    WebElement clickOnPlayBackControlOptionZero;
    public void checkPlayBackControlOptionZero() throws InterruptedException {
        clickOnPlayBackControlOptionZero.click();
        sleepFor(3);
        driver.findElement(By.xpath("//button[@id='carousel-homepage-option-0']")).click();
        sleepFor(3);
        }
    //Method 17
    @FindBy(how = How.XPATH, using = WebElementUnitedHomePage.xPathPlayBackControl)
    WebElement clickOnPlayBackControlOptionOne;
    public void checkPlayBackControlOptionOne() throws InterruptedException {
        clickOnPlayBackControlOptionOne.click();
        sleepFor(3);
        driver.findElement(By.xpath("//button[@id='carousel-homepage-option-1']")).click();
        sleepFor(3);
        }
    //Method 18
    @FindBy(how = How.XPATH, using = WebElementUnitedHomePage.xPathPlayBackControl)
    WebElement clickOnPlayBackControlOptionTwo;
    public void checkPlayBackControlOptionTwo() throws InterruptedException {
        clickOnPlayBackControlOptionTwo.click();
        sleepFor(3);
        driver.findElement(By.xpath("//button[@id='carousel-homepage-option-2']")).click();
        sleepFor(3);
    }
    //Method 19
    @FindBy(how = How.XPATH, using = WebElementUnitedHomePage.xPathPlayBackControl)
    WebElement clickOnPlayBackControlOptionThree;
    public void checkPlayBackControlOptionThree() throws InterruptedException {
        clickOnPlayBackControlOptionThree.click();
        sleepFor(3);
        driver.findElement(By.xpath("//button[@id='carousel-homepage-option-3']")).click();
        sleepFor(3);
    }
    //Method 20
    @FindBy(how = How.XPATH, using = WebElementUnitedHomePage.xPathPlayBackControl)
    WebElement clickOnPlayBackControlOptionFour;
    public void checkPlayBackControlOptionFour() throws InterruptedException {
        clickOnPlayBackControlOptionFour.click();
        sleepFor(3);
        driver.findElement(By.xpath("//button[@id='carousel-homepage-option-4']")).click();
        sleepFor(3);
    }
    //Method 21
    @FindBy(how = How.XPATH, using = WebElementUnitedHomePage.xPathPlayBackControl)
    WebElement clickOnPlayBackControlOptionFive;
    public void checkPlayBackControlOptionFive() throws InterruptedException {
        clickOnPlayBackControlOptionFive.click();
        sleepFor(3);
        driver.findElement(By.xpath("//button[@id='carousel-homepage-option-5']")).click();
        sleepFor(3);
    }
    //Method 22
    @FindBy(how = How.XPATH, using = WebElementUnitedHomePage.xPathPlayBackControl)
    WebElement clickOnOptionFiveDealLink;
    public void checkOptionFiveDealLink() throws InterruptedException {
        clickOnOptionFiveDealLink.click();
        sleepFor(3);
        driver.findElement(By.xpath("//button[@id='carousel-homepage-option-5']")).click();
        sleepFor(2);
        driver.findElement(By.xpath("//button[@id='complementary-link']")).click();
        sleepFor(3);
    }
    //Method 23
    @FindBy(how = How.XPATH, using = WebElementUnitedHomePage.xPathPlayBackControl)
    WebElement clickOnOptionFiveDealLinkOrigin;
    public void checkOptionFiveDealLinkOrigin() throws InterruptedException {
        clickOnOptionFiveDealLinkOrigin.click();
        sleepFor(3);
        driver.findElement(By.xpath("//button[@id='carousel-homepage-option-5']")).click();
        sleepFor(2);
        driver.findElement(By.xpath("//button[@id='complementary-link']")).click();
        sleepFor(3);
        driver.findElement(By.xpath("//input[@id='origin-airport-autocomplete']")).click();
        Actions linkOrigin = new Actions(driver);
        Action enterDestination = linkOrigin.sendKeys("New York").build();
        enterDestination.perform();
        sleepFor(3);
    }
    //Method 24
    @FindBy(how = How.XPATH, using = WebElementUnitedHomePage.xPathPlayBackControl)
    WebElement clickOnOptionFiveDealLinkDestination;
    public void checkOptionFiveDealLinkDestination() throws InterruptedException {
        clickOnOptionFiveDealLinkDestination.click();
        sleepFor(3);
        driver.findElement(By.xpath("//button[@id='carousel-homepage-option-5']")).click();
        sleepFor(2);
        driver.findElement(By.xpath("//button[@id='complementary-link']")).click();
        sleepFor(3);
        driver.findElement(By.xpath("//input[@id='origin-airport-autocomplete']")).click();
        Actions linkOrigin = new Actions(driver);
        Action enterDestination = linkOrigin.sendKeys("New York",Keys.TAB,Keys.TAB).build();
        enterDestination.perform();
        sleepFor(3);
    }
    //Method 25
    @FindBy(how = How.XPATH, using = WebElementUnitedHomePage.xPathPlayBackControl)
    WebElement clickOnOptionFiveDealLinkFinalDestination;
    public void checkOptionFiveDealLinkFinalDestination() throws InterruptedException {
        clickOnOptionFiveDealLinkFinalDestination.click();
        sleepFor(3);
        driver.findElement(By.xpath("//button[@id='carousel-homepage-option-5']")).click();
        sleepFor(2);
        driver.findElement(By.xpath("//button[@id='complementary-link']")).click();
        sleepFor(3);
        driver.findElement(By.xpath("//input[@id='origin-airport-autocomplete']")).click();
        Actions linkOrigin = new Actions(driver);
        Action enterDestination = linkOrigin.sendKeys("New York",Keys.TAB,Keys.TAB).build();
        Action finalDestination = linkOrigin.sendKeys("California",Keys.ENTER).build();
        enterDestination.perform();
        sleepFor(3);
        finalDestination.perform();
        sleepFor(3);
    }



}
