package home.pageObject;

import home.webElement.WebElementATTHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class ATTHomePage extends WebElementATTHomePage {

//    @FindBy(how = How.XPATH, using = WebElementATTHomePage.xPathClickOnSearchBox)
//    WebElement clickOnSearchBox;
//    public void checkSearchBox() throws InterruptedException {
//        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/button")).click();
//        sleepFor(3);
//        clickOnSearchBox.click();
//        clickOnSearchBox.sendKeys("Apple iPhones", Keys.ENTER);
//    }
//
//    @FindBy (how = How.XPATH, using = WebElementATTHomePage.xPathClickOnMenuBar)
//    WebElement clickMenuButton;
//    public void checkMenuButton() throws InterruptedException {
//        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/button")).click();
//        sleepFor(3);
//        clickMenuButton.click();
//    }
//
//    @FindBy (how = How.XPATH, using = WebElementATTHomePage.xPathClickOnSupport)
//    WebElement clickOnSupport;
//    public void checkOnSupport() throws InterruptedException {
//        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/button")).click();
//        sleepFor(3);
//        clickOnSupport.click();
//    }
//
//    @FindBy (how = How.XPATH, using = WebElementATTHomePage.xPathClickOnShoppingCart)
//    WebElement clickOnShoppingCart;
//    public void checkShoppingCart() throws InterruptedException {
//        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/button")).click();
//        sleepFor(3);
//        clickOnShoppingCart.click();
//    }
//
//    @FindBy (how = How.XPATH, using = WebElementATTHomePage.xPathClickOnAccount)
//    WebElement clickOnAccount;
//    public void checkOnAccount () throws InterruptedException {
//        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/button")).click();
//        sleepFor(3);
//        clickOnAccount.click();
//    }
//
//    @FindBy (how = How.XPATH, using = WebElementATTHomePage.xPathClickOnAccount)
//    WebElement clickOnAccountMenu;
//    public void checkOnAccountMenu () throws InterruptedException {
//        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/button")).click();
//        sleepFor(3);
//        clickOnAccountMenu.click();
//        driver.findElement(By.xpath(xPathClickOnSignIn)).click();
//    }
//
//    @FindBy (how = How.XPATH, using = WebElementATTHomePage.xPathClickOnAccount)
//    WebElement clickOnAccountMenuSignIn;
//    public void checkOnAccountMenuSignIn () throws InterruptedException {
//        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/button")).click();
//        sleepFor(3);
//        clickOnAccountMenuSignIn.click();
//        sleepFor(2);
//        driver.findElement(By.xpath(xPathClickOnSignIn)).click();
//        sleepFor(4);
//        driver.findElement(By.xpath(xPathCreateOneNow)).click();
//        sleepFor(2);
//    }
//
//    @FindBy (how = How.XPATH, using = WebElementATTHomePage.xPathClickOnBusiness)
//    WebElement clickOnBusiness;
//    public void checkOnBusinessButton() throws InterruptedException {
//        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/button")).click();
//        sleepFor(3);
//        clickOnBusiness.click();
//    }
//
//    @FindBy (how = How.XPATH, using = WebElementATTHomePage.xPathClickOnDeals)
//    WebElement clickOnDealsButton;
//    public void checkOnDealsButton() throws InterruptedException {
//        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/button")).click();
//        sleepFor(3);
//        clickOnDealsButton.click();
//    }
//
//    @FindBy (how = How.XPATH, using = WebElementATTHomePage.xPathClickOnPhones)
//    WebElement clickOnPhonesButton;
//    public void checkOnPhonesButton() throws InterruptedException {
//        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/button")).click();
//        sleepFor(3);
//        clickOnPhonesButton.click();
//    }
//
//    @FindBy (how = How.XPATH, using = WebElementATTHomePage.xPathClickOnWireless)
//        WebElement clickOnWirelessButton;
//    public void checkOnWirelessButton() throws InterruptedException {
//        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/button")).click();
//        sleepFor(3);
//        clickOnWirelessButton.click();
//    }
//
//    @FindBy (how = How.XPATH, using = WebElementATTHomePage.xPathInternetButton)
//    WebElement clickOnInternetButton;
//    public void checkOnInternetButton () throws InterruptedException {
//        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/button")).click();
//        sleepFor(3);
//        clickOnInternetButton.click();
//    }
//
//    @FindBy (how = How.XPATH, using = WebElementATTHomePage.xPathTVButton)
//    WebElement clickOnTVButton;
//    public void checkOnTVButton () throws InterruptedException {
//        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/button")).click();
//        sleepFor(3);
//        clickOnTVButton.click();
//    }
//
//    @FindBy (how = How.XPATH, using = WebElementATTHomePage.xPathClickOnPrePaid)
//    WebElement clickOnPrePaid;
//    public void checkOnPrePaid () throws InterruptedException {
//        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/button")).click();
//        sleepFor(3);
//        clickOnPrePaid.click();
//    }
//
//    @FindBy (how = How.XPATH, using = WebElementATTHomePage.xPathClickOnBundles)
//    WebElement clickOnBundles;
//    public void checkOnBundles () throws InterruptedException {
//        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/button")).click();
//        sleepFor(3);
//        clickOnBundles.click();
//    }
//
//    @FindBy (how = How.XPATH, using = WebElementATTHomePage.xPathClickOnShopNow)
//    WebElement clickOnShopNow;
//    public void checkOnShopNow () throws InterruptedException {
//        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/button")).click();
//        sleepFor(3);
//        clickOnShopNow.click();
//    }
//
//    @FindBy (how = How.XPATH, using = WebElementATTHomePage.xPathClickOnLearnMore)
//    WebElement clickOnLearnMore;
//    public void checkOnLearnMore () throws InterruptedException {
//        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/button")).click();
//        sleepFor(3);
//        clickOnLearnMore.click();
//    }
//
//    @FindBy (how = How.XPATH, using = WebElementATTHomePage.xPathClickOnComingSoonLearnMore)
//    WebElement clickOnComingSoonLearnMore;
//    public void checkOnComingSoonLearnMore () throws InterruptedException {
//        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/button")).click();
//        sleepFor(3);
//        clickOnComingSoonLearnMore.click();
//    }
//
//    @FindBy (how = How.XPATH, using = WebElementATTHomePage.xPathClickOnAdvantageLearnMore)
//    WebElement clickOnAdvantageLearnMore;
//    public void checkOnAdvantageLearnMore () throws InterruptedException {
//        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/button")).click();
//        sleepFor(3);
//        clickOnAdvantageLearnMore.click();
//    }
//
//    @FindBy (how = How.XPATH, using = WebElementATTHomePage.xPathClickOnFiveGForYou)
//    WebElement clickOnClickOnFiveGForYou;
//    public void checkOnClickOnFiveGForYou () throws InterruptedException {
//        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/button")).click();
//        sleepFor(3);
//        clickOnClickOnFiveGForYou.click();
//    }
//
//    @FindBy (how = How.XPATH, using = WebElementATTHomePage.xPathProtectAdvantage)
//    WebElement clickOnProtectAdvantage;
//    public void checkOnProtectAdvantage () throws InterruptedException {
//        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/button")).click();
//        sleepFor(3);
//        clickOnProtectAdvantage.click();
//    }
//    @FindBy (how = How.XPATH, using = WebElementATTHomePage.xPathATTTV)
//    WebElement clickOnATTTV;
//    public void checkOnATTTV () throws InterruptedException {
//        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/button")).click();
//        sleepFor(3);
//        clickOnATTTV.click();
//    }
//    @FindBy (how = How.XPATH, using = WebElementATTHomePage.xPathAllPhoneDeals)
//    WebElement clickOnAllPhoneDeals;
//    public void checkOnAllPhoneDeals () throws InterruptedException {
//        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/button")).click();
//        sleepFor(3);
//        clickOnAllPhoneDeals.click();
//    }
//    @FindBy (how = How.XPATH, using = WebElementATTHomePage.xPathTwoAppleWatches)
//    WebElement clickOnTwoAppleWatches;
//        public void checkOnTwoAppleWatches () throws InterruptedException {
//            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/button")).click();
//            sleepFor(3);
//            clickOnTwoAppleWatches.click();
//    }
//    @FindBy (how = How.XPATH, using = WebElementATTHomePage.xPathEnterEmail)
//    WebElement clickOnEnterEmail;
//    public void checkOnEnterEmail () throws InterruptedException {
//        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/button")).click();
//        sleepFor(3);
//        clickOnEnterEmail.click();
//        sleepFor(3);
//        clickOnEnterEmail.sendKeys("testemail@gmail.com", Keys.ENTER);
//        sleepFor(3);
//    }
//    @FindBy (how = How.XPATH, using = WebElementATTHomePage.xPathConnectDropDownMenu)
//    WebElement clickOnConnectDropDownMenu;
//    public void checkOnConnectDropDownMenu () throws InterruptedException {
//        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/button")).click();
//        sleepFor(3);
//        clickOnConnectDropDownMenu.click();
//        sleepFor(3);
//        clickOnConnectDropDownMenu.findElements(By.xpath("//a[contains(text(),'iPhone 11 Pro')]"));
//        clickOnConnectDropDownMenu.click();
//        sleepFor(3);
//    }









}
