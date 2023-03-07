package com.cydeo.pages;

import com.cydeo.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public static final String HOME_BUTTON = "home button page";
    public static final String ONLINE_BANKING = "online banking page";
    public static final String FEED_BACK = "feed back page";
    public static final String ZERO_BANK = "zero bank button";
    public static final String SETTINGS = "settings";
    public static final String LOG_OUT = "log out button";
    public static final String SEARCH_BAR = "search bar";
    public static final String ONLINE_BANKING_MORE_SERVICES = "online banking link services button";
    public static final String ACCOUNT_ACTIVITY = "account activity";
    public static final String TRANSFER_FOUNDS = "transfer founds";
    public static final String MY_MONEY_MAPS = "money maps";
    public static final String LOGIN_PAGE = "login page";
    public static final String USER_DROPDOWN = "user drop down";
    public static final String HELP_LINK = "help link";

    @FindBy(xpath = "//strong[.='Home']")
    public WebElement home_button;

    @FindBy(xpath = "//strong[.='Online Banking']")
    public WebElement online_banking;

    @FindBy(xpath = "//strong[.='Feedback']")
    public WebElement feed_back;

    @FindBy(xpath = "//a[@href='/index.html']")
    public WebElement zero_button;

    @FindBy(xpath = "(//b[@class='caret'])[1]")
    public WebElement settings_dropdown;

    @FindBy(xpath = "(//a[@class='dropdown-toggle'])[2]")
    public WebElement user_dropdown;

    @FindBy(id = "help_link")
    public WebElement help_link;

    @FindBy(id = "logout_link")
    public WebElement log_out_link;

    @FindBy(id = "searchTerm")
    public WebElement search_bar;

    @FindBy(xpath = "//a[@id='online-banking']")
    public WebElement more_services_online_banking;

    @FindBy(id = "account_activity_link") //1-2
    public WebElement account_act_link;

    @FindBy(xpath = "//a[@href='/bank/redirect.html?url=transfer-funds.html']")
    public WebElement transer_funds;

    @FindBy(id = "money_map_link")
    public WebElement money_map;

    @FindBy(id = "signin_button")
    public WebElement signIn_button;


    private static final Map<String, BasePage> PAGE_OBJECT_MAP = new HashMap<>();

    //if i put string as a key here, it will return me needed web element.
    public BasePage pageObjectFactory(String page) {
        if (PAGE_OBJECT_MAP.containsKey(page)) {
            return PAGE_OBJECT_MAP.get(page);
        } else {
            switch (page) {
                //   public static final String HOME_BUTTON = "home button page";
                case LOGIN_PAGE: return PAGE_OBJECT_MAP.put(page, new LoginPage());
                    //    public static final String ONLINE_BANKING = "online banking page";
                    //    public static final String FEED_BACK = "feed back page";
                    //    public static final String ZERO_BANK = "zero bank button";
                    //    public static final String SETTINGS ="settings";
                    //    public static final String LOG_OUT = "log out button";
                    //    public static final String SEARCH_BAR = "search bar";
                    //    public static final String ONLINE_BANKING_MORE_SERVICES ="online banking link services button";
                    //    public static final String ACCOUNT_ACTIVITY = "account activity";
                    //    public static final String TRANSFER_FOUNDS = "transfer founds";
                    //    public static final String MY_MONEY_MAPS = "money maps";
                default: throw new RuntimeException("BasePage--page--is not identify");
            }


            }


        }

    public void clearObjects(){
        PAGE_OBJECT_MAP.clear();

    }

    public WebElement getElement(String element){

    switch (element) {

        case HOME_BUTTON: return home_button;

        case ONLINE_BANKING: return online_banking;

        case FEED_BACK: return feed_back;

        case ZERO_BANK: return zero_button;

        case SETTINGS: return settings_dropdown;

        case LOG_OUT: return log_out_link;

        case SEARCH_BAR: return search_bar;

        case ONLINE_BANKING_MORE_SERVICES: return more_services_online_banking;

        case ACCOUNT_ACTIVITY: return account_act_link;

        case TRANSFER_FOUNDS: return transer_funds;

        case MY_MONEY_MAPS: return money_map;

        case USER_DROPDOWN: return user_dropdown;

        case HELP_LINK: return help_link;

        default: throw new RuntimeException("No matching element");
    }





}

    public WebDriverWait waits(){
WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

return wait;
    }

    public WebElement get_dropdown_options(WebElement dropdownLocator,String str ){
        Select select = new Select(dropdownLocator);
        List<WebElement> dropdowns = select.getOptions();
        WebElement needed = select.getFirstSelectedOption();

        for (WebElement dropdown : dropdowns) {
            if(dropdown.getText().equalsIgnoreCase(str)){
                needed=dropdown;
            }
        }

        return needed;
    }
}
