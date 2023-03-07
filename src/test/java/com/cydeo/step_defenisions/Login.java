package com.cydeo.step_defenisions;

import com.cydeo.pages.AccountActivityPage;
import com.cydeo.pages.BasePage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utils.ConfigurationReader;
import com.cydeo.utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
    LoginPage page = new LoginPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);


    @Given("User on the login page")
    public void user_on_the_login_page() {


        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Assert.assertTrue(((LoginPage) page).getLoginPageElement(LoginPage.LOG_IN_ZERO).isDisplayed());
        Assert.assertTrue(((LoginPage) page).getLoginPageElement(LoginPage.FORGET_PASSWORD).isDisplayed());
    }
    @When("user enters username {string}")
    public void user_enters_username(String string) {
        page.enterUsername(string);
    }
    @When("user enters password {string}")
    public void user_enters_password(String string) {
       page.enterPassword(string);
    }
    @When("user puts signIn button")
    public void user_puts_sign_in_button() {
        page.loginButtonClick();
    }
    @Then("user see error message")
    public void user_see_error_message() {
       Assert.assertTrue(page.getLoginPageElement(LoginPage.ALERT_WRONG_USER_OR_PASS).isDisplayed());
    }

    @When("user gets on a {string}")
    public void user_gets_on_a(String string) {
        Driver.getDriver().navigate().back();
        page.waits().until(ExpectedConditions.visibilityOf(page.getElement(BasePage.USER_DROPDOWN)));
      Assert.assertTrue(page.getElement(BasePage.HOME_BUTTON).isDisplayed());

    }
    @Then("user logouts")
    public void user_logouts() {
        page.getElement(BasePage.USER_DROPDOWN).click();
        page.waits().until(ExpectedConditions.visibilityOf(page.getElement(BasePage.LOG_OUT)));
        page.getElement(BasePage.LOG_OUT).click();
    }


}