package com.cydeo.step_defenisions;

import com.cydeo.pages.AccountActivityPage;
import com.cydeo.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AccountActivity {
AccountActivityPage activityPage  = new AccountActivityPage();
WebDriverWait wait = new WebDriverWait(Driver.getDriver(),1);
    @Given("user on Account Activity page")
    public void user_on_account_activity_page() {

        activityPage.account_activity.click();
        wait.until(ExpectedConditions.urlContains("activity"));
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("activity"));


    }
    @When("user choose account from a dropdown")
    public void user_choose_account_from_a_dropdown() {
       List<WebElement> options =activityPage.dropdownOptions(activityPage.show_transaction_dropdown);
        for (WebElement option : options) {
            option.click();


        }


    }

    @Then("user see account transactions information")
    public void user_see_account_transactions_information() {
      if(activityPage.all_transactions_for_account.getText().contains("Description")){
    Assert.assertTrue(activityPage.show_transaction_table.isDisplayed());
}else {
          Assert.assertTrue(activityPage.no_result_exeption.isDisplayed());
      }
    }

}
