package com.cydeo.step_defenisions;

import com.cydeo.pages.AccountActivityPage;
import com.cydeo.utils.BrowserUtils;
import com.cydeo.utils.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class FindTransaction {
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
    AccountActivityPage activityPage = new AccountActivityPage();
    List<String> inputs = new ArrayList<>();

    List<WebElement> dropOptions = new ArrayList<>();

    @When("user click find transaction tab to search option {int} {string} {string}")
    public void user_click_find_transaction_tab_to_search_option(Integer optionIndex, String filter, String input) { //not work
        dropOptions = activityPage.dropdownOptions(activityPage.show_transaction_dropdown);
        WebElement option = activityPage.dropdownChooseOption(activityPage.show_transaction_dropdown, optionIndex);
        option.click();
        BrowserUtils.sleep(1);
        inputs = activityPage.table_take_inputs_filter(activityPage.table_elements, filter, input);

        if (activityPage.element_is_visable(activityPage.no_result_exeption)) {
            Assert.assertTrue(activityPage.no_result_exeption.isDisplayed());
            activityPage.find_transaction.click();
            System.out.println("no result");
        } else {
            activityPage.find_transaction.click();
            System.out.println("have elements");
        }
    }

    @When("user choose type of transaction {string}")
    public void user_choose_type_of_transaction(String string) {

        WebElement option = activityPage.dropdownChooseOption(activityPage.type_transaction_dropdown, string);
        option.click();
        Assert.assertTrue(activityPage.type_transaction_dropdown.isDisplayed());
    }

    @Then("user input correct information {string} to see transaction details")
    public void user_input_correct_information_to_see_transaction_details(String inputBar) {
        if (inputs.isEmpty()) {
            System.out.println("No actual information for this test");

        } else {
            for (String input : inputs) {
                activityPage.inputBar(inputBar).clear();
                activityPage.inputBar(inputBar).sendKeys(input);
                activityPage.button_submit.click();
                wait.until(ExpectedConditions.textToBePresentInElement(activityPage.find_transaction_table, input));
                ;
                Assert.assertTrue(activityPage.find_transaction_table.getText().contains(input));
            }


        }


    }

    @When("user click find transaction tab to search option {string}")
    public void user_click_find_transaction_tab_to_search_option(String typeInformation) {

        activityPage.find_transaction.click();
        Assert.assertTrue(activityPage.find_transaction_Description.isDisplayed());
        Assert.assertTrue(activityPage.find_transaction_ToData.isDisplayed());
        Assert.assertTrue(activityPage.find_transaction_FromAmount.isDisplayed());


    }
    @Then("user input incorrect information {string} to see transaction details {string}")
    public void user_input_incorrect_information_to_see_transaction_details(String inputBar, String information) {
       /* if (inputBar.equalsIgnoreCase("dataT") || inputBar.equalsIgnoreCase("dataF") && activityPage.numerical(information)) {
            activityPage.inputBar(inputBar).clear();
            activityPage.inputBar(inputBar).sendKeys(information);
            activityPage.button_submit.click();
            activityPage.button_submit.click();
            BrowserUtils.sleep(2);*/
            activityPage.inputBar(inputBar).clear();
            activityPage.inputBar(inputBar).sendKeys(information);
            activityPage.button_submit.click();


            wait.until(ExpectedConditions.visibilityOf(activityPage.no_result_find_trans));
          Assert.assertTrue(activityPage.no_result_find_trans.isDisplayed());
        System.out.println("displayed");





    }

}




