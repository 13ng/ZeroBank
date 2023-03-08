package com.cydeo.pages;

import com.cydeo.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferFundsPage extends AccountActivityPage{

    public TransferFundsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public static final String FROM_ACCOUNT = "from account";
    @FindBy(xpath = "//select[@id='tf_fromAccountId']")
    public WebElement fromAccount;

    public static final String TO_ACCOUNT = "to account";
    @FindBy(xpath = "//select[@id='tf_toAccountId']")
    public WebElement ToAccount;

public static final String AMOUNT = "amount";
@FindBy(xpath = "//input[@id='tf_amount']")
    public WebElement amount;

public static final String DESCRIPTION = "description";
@FindBy(xpath = "//input[@id='tf_description']")
    public WebElement description;

public static final String CONTROL_INPUT_EMPTY = "input empty";
@FindBy(css = "div[class='control-group']>label[for='tf_description']")
    public WebElement inputEmpty;

public static final String CONTINUE_BUTTON = "continue button";
@FindBy(css = "button[type='submit']")
    public WebElement continueButton;

    public static final String SUBMIT_BUTTON = "submit button";
    @FindBy(css = "button[type='submit']")
    public WebElement submitButton;
//btn_cancel
public static final String CANCEL_BUTTON = "cancel button";
    @FindBy(id = "btn_cancel")
    public WebElement cancelButton;
    //div[class='alert alert-success']
    public static final String SUCCESSFUL_TRANSACTION =   "successfully submitted";
@FindBy(css = "div[class='alert alert-success']")
    public WebElement successfulTransaction;

public static final String ANOTHER_TRANSACTION_LINK = "another transaction link";
@FindBy(xpath = "//a[@href='/bank/transfer-funds.html']")
    public WebElement anotherTransactionLink;

//funds-verify url contains as assert


}
