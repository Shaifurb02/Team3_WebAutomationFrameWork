//package stepDefinition;
//
//import TestHome.TestHomePage;
//import io.cucumber.java.en.*;
//import org.openqa.selenium.By;
//
//public class HomePageStepDefinition extends TestHomePage {
//
//
//    @Given("I am at ATNT HomePage")
//    public void i_am_at_ATNT_HomePage() {
//        getLocalDriver("windows", "chrome");
//        driver.get("https://www.att.com/");
//        driver.manage().window().maximize();
//    }
//
//    @Then("I click on SearchBox and Type {string}")
//    public void i_click_on_SearchBox_and_Type(String Apple_iPhone) {
//        driver.findElement(By.xpath())
//                //findElement(By.xpath(webElementSearchBox))
//                //.click();
//    }
//
//    @Then("I Select EnglishUs By click on it")
//    public void i_Select_EnglishUs_By_click_on_it() {
//        driver.findElement(By.xpath(web)).click();
//    }
//
//
//}
//
//
