package com.cydeo.step_defenisions;


import com.cydeo.pages.AccountActivityPage;
import com.cydeo.pages.AccountSummaryPage;
import com.cydeo.utils.ConfigurationReader;
import com.cydeo.utils.Driver;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Background;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.LinkedList;
import java.util.List;

public class AccountSummary {
AccountActivityPage page = new AccountSummaryPage();
WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
List<WebElement> links = new LinkedList<>();
    List<String> inputs = new LinkedList<>();




    @Given("user on Account Summary page") //changed
    public void user_on_account_summary_page() {
       // Driver.getDriver().get(ConfigurationReader.getProperty("urlAS"));
        page.account_summary.click();
        wait.until(ExpectedConditions.urlContains("summary"));
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("summary"));


    }
    @When("user click on account {string}")
    public void user_click_on_account(String string) {
        inputs= page.table_take_inputs(page.table_elements,"balance");
        links=page.account_0_filter(inputs,page.table_links,"true");
        ((AccountSummaryPage)page).click_needed_account(links,string);

    }

    @When("user click on account with balance zero {string}")
    public void user_click_on_account_with_balance_zero(String string) {
        inputs= page.table_take_inputs(page.table_elements,"balance");
        links=page.account_0_filter(inputs,page.table_links,"false");
        ((AccountSummaryPage)page).click_needed_account(links,string);
    }


    @When("user see transactions information")
    public void user_see_transactions_information() {
        Assert.assertTrue("Table with transactions is not viasible",page.show_transaction_table.isDisplayed());
    }
    @Then("user click on link {string}")
    public void user_click_on_link(String string) {
        //page.page_link(page.getAccountSummary());

    }

    @When("user can not see transactions information")
    public void user_can_not_see_transactions_information() {
        wait.until(ExpectedConditions.visibilityOf(page.no_result_exeption));
        Assert.assertTrue("Table with transactions is viasible",page.no_result_exeption.isDisplayed());
    }


    }




