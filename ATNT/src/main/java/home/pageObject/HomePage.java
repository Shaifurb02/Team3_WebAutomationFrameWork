package home.pageObject;

import home.webElement.WebElementHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class HomePage extends WebElementHomePage {

//    @FindBy(how = How.XPATH, using = WebElementHomePage.xPathClickOnSearchBox)
//    WebElement clickOnSearchBox;
//    public void checkSearchBox(){
//        clickOnSearchBox.click();
//        clickOnSearchBox.sendKeys("Apple iPhones", Keys.ENTER);
//    }
//
//    @FindBy (how = How.XPATH, using = WebElementHomePage.xPathClickOnMenuBar)
//    WebElement clickMenuButton;
//    public void checkMenuButton(){
//        clickMenuButton.click();
//    }
//
//    @FindBy (how = How.XPATH, using = WebElementHomePage.xPathClickOnSupport)
//    WebElement clickOnSupport;
//    public void checkOnSupport(){
//        clickOnSupport.click();
//    }
//
//    @FindBy (how = How.XPATH, using = WebElementHomePage.xPathClickOnShoppingCart)
//    WebElement clickOnShoppingCart;
//    public void checkShoppingCart(){
//        clickOnShoppingCart.click();
//    }
//
//    @FindBy (how = How.XPATH, using = WebElementHomePage.xPathClickOnAccount)
//    WebElement clickOnAccount;
//    public void checkOnAccount (){
//        clickOnAccount.click();
//    }
//
//    @FindBy (how = How.XPATH, using = WebElementHomePage.xPathClickOnAccount)
//    WebElement clickOnAccountMenu;
//    public void checkOnAccountMenu (){
//        clickOnAccountMenu.click();
//        driver.findElement(By.xpath(xPathClickOnSignIn)).click();
//    }
//
//    @FindBy (how = How.XPATH, using = WebElementHomePage.xPathClickOnAccount)
//    WebElement clickOnAccountMenuSignIn;
//    public void checkOnAccountMenuSignIn () throws InterruptedException {
//        clickOnAccountMenuSignIn.click();
//        sleepFor(2);
//        driver.findElement(By.xpath(xPathClickOnSignIn)).click();
//        sleepFor(4);
//        driver.findElement(By.xpath(xPathCreateOneNow)).click();
//        sleepFor(2);
//    }
//
//    @FindBy (how = How.XPATH, using = WebElementHomePage.xPathClickOnBusiness)
//    WebElement clickOnBusiness;
//    public void checkOnBusinessButton(){
//        clickOnBusiness.click();
//    }
//
//    @FindBy (how = How.XPATH, using = WebElementHomePage.xPathClickOnDeals)
//    WebElement clickOnDealsButton;
//    public void checkOnDealsButton(){
//        clickOnDealsButton.click();
//    }
//
//    @FindBy (how = How.XPATH, using = WebElementHomePage.xPathClickOnPhones)
//    WebElement clickOnPhonesButton;
//    public void checkOnPhonesButton(){
//        clickOnPhonesButton.click();
//    }
//
//    @FindBy (how = How.XPATH, using = WebElementHomePage.xPathClickOnWireless)
//        WebElement clickOnWirelessButton;
//    public void checkOnWirelessButton(){
//        clickOnWirelessButton.click();
//    }
//
//    @FindBy (how = How.XPATH, using = WebElementHomePage.xPathInternetButton)
//    WebElement clickOnInternetButton;
//    public void checkOnInternetButton (){
//        clickOnInternetButton.click();
//    }

    @FindBy (how = How.XPATH, using = WebElementHomePage.xPathTVButton)
    WebElement clickOnTVButton;
    public void checkOnTVButton () {
        clickOnTVButton.click();
    }







}
