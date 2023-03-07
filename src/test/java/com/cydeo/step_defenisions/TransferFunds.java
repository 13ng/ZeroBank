package com.cydeo.step_defenisions;

import com.cydeo.pages.AccountActivityPage;
import com.cydeo.pages.TransferFundsPage;
import com.cydeo.utils.BrowserUtils;
import com.cydeo.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class TransferFunds {

    AccountActivityPage activityPage = new TransferFundsPage();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),2);
    Select selectAccountTo;
    Select selectAccountFrom;
    @Given("user on Transfer Funds page")
    public void user_on_transfer_funds_page() {
activityPage.transer_funds.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("transfer-funds"));



        // ((AccountSummaryPage)page).click_needed_account(links,string);

    }
    @When("user choose account {int} to make transaction from")
    public void user_choose_account_to_make_transaction_from(Integer account1Index) {
        selectAccountFrom = new Select(((TransferFundsPage)activityPage).fromAccount);
      selectAccountFrom.selectByIndex(account1Index);






    }
    @When("user choose account {int} to make transaction to")
    public void user_choose_account_to_make_transaction_to(Integer account2Index) {
         selectAccountTo = new Select(((TransferFundsPage)activityPage).ToAccount);
      selectAccountTo.selectByIndex(account2Index);
    }
    @When("user enter amount {string} for transfer")
    public void user_enter_amount_for_transfer(String amountTranser) {
       ((TransferFundsPage)activityPage).amount.sendKeys(amountTranser);

    }
    @When("user enter description name {string}")
    public void user_enter_description_name(String description) {
        ((TransferFundsPage)activityPage).description.sendKeys(description);
    }


    @When("user clicks continue button")
    public void user_clicks_continue_button() {
        ((TransferFundsPage)activityPage).continueButton.click();
        wait.until(ExpectedConditions.urlContains("transfer-funds-verify"));
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("transfer-funds-verify") );

    }
    @When("user confirms transaction")
    public void user_confirms_transaction() {
        ((TransferFundsPage)activityPage).button_submit.click();
      wait.until(ExpectedConditions.urlContains("transfer-funds-confirm"));

    }
    @Then("user see message about successful transaction")
    public void user_see_message_about_successful_transaction() {
        wait.until(ExpectedConditions.visibilityOf(((TransferFundsPage)activityPage).successfulTransaction));
        Assert.assertTrue(((TransferFundsPage)activityPage).successfulTransaction.isDisplayed());
    }

    @Then("user can not see message about successful transaction")
    public void user_can_not_see_message_about_successful_transaction() {
        Assert.assertFalse(((TransferFundsPage)activityPage).successfulTransaction.isDisplayed());
    }

    @When("user click on find transaction tab")
    public void user_click_on_find_transaction_tab() {
        activityPage.find_transaction.click();
        Assert.assertTrue(activityPage.find_transaction_Description.isDisplayed());
    }
    @When("user input new description in description bar {string}")
    public void user_input_new_description_in_description_bar(String description) {
activityPage.find_transaction_Description.sendKeys(description);

    }
    @When("user click find button")
    public void user_click_find_button() {
        activityPage.find_button.click();
        BrowserUtils.sleep(1);
        activityPage.find_button.click();

    }
    @Then("user see new transaction information in a table")
    public void user_see_new_transaction_information_in_a_table() {
        System.out.println("clicked");
        Assert.assertTrue(activityPage.find_transaction_table.isDisplayed());
    }




}
