package com.cydeo.pages;

import com.cydeo.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.*;

public class AccountSummaryPage extends AccountActivityPage {

    public AccountSummaryPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    private static final String CASH_ACCOUNTS = "cash account";

    public String getCashAccounts() {
        return CASH_ACCOUNTS;
    }

    @FindBy(xpath = "(//table)[1]//tr/td")
    public List<WebElement> cash_accounts;

    private static final String INVESTMENT_ACCOUNTS = "investment account";

    public String getInvestmentAccounts() {
        return INVESTMENT_ACCOUNTS;
    }

    @FindBy(xpath = "(//table)[2]//tr/td")
    public List<WebElement> investment_accounts;

    private static final String CREDIT_ACCOUNTS = "credit account";

    public String getCreditAccounts() {
        return CREDIT_ACCOUNTS;
    }

    @FindBy(xpath = "(//table)[3]//tr/td")
    public List<WebElement> credit_accounts;

    private static final String LOAN_ACCOUNTS = "loan account";

    public String getLoanAccounts() {
        return LOAN_ACCOUNTS;
    }

    ////td/a[@href][.='Savings']
    @FindBy(xpath = "(//table)[4]//tr/td")
    public List<WebElement> loan_accounts;


    public void click_needed_account(List<WebElement> link, String index) {
        Integer indexNumerical = Integer.parseInt(index);
        if (link.size() == 0) {
            System.out.println("This user don't have match account, that match conditions");
        } else{
            link.get(indexNumerical).click();

        }




      /*  for (WebElement element : link) {
            elementStr =index+ element.getText();
            if(element.getText().equalsIgnoreCase(account)){
                element.click();
                break;*/
            }
        }









