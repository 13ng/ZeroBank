package com.cydeo.step_defenisions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utils.ConfigurationReader;
import com.cydeo.utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.LinkedList;
import java.util.List;

public class Hooks {
    @Before(value = "@wip")
    public void setupScenarioForLogins() {
        System.out.println("before");
        LoginPage page = new LoginPage();
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        page.enterUsername("true");
        page.enterPassword("true");
        page.loginButtonClick();
        Driver.getDriver().navigate().back();
        page.account_act_link.click();


    }

    @After(value = "@wip")
    public void setupScenarioForLogout() {
        LoginPage page = new LoginPage();
        page.getElement(BasePage.USER_DROPDOWN).click();
        page.waits().until(ExpectedConditions.visibilityOf(page.getElement(BasePage.LOG_OUT)));
        page.getElement(BasePage.LOG_OUT).click();

    }

}






