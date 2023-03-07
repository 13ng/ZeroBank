package com.cydeo.pages;

import com.cydeo.utils.ConfigurationReader;
import com.cydeo.utils.Driver;
import com.github.javafaker.Faker;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;
import java.util.Random;

public class LoginPage extends BasePage {

  public LoginPage() {
    PageFactory.initElements(Driver.getDriver(), this);

  }

  public static final String LOGIN = "login";
  @FindBy(id = "user_login")
  public WebElement user_login;


  public static final String PASSWORD = "password";
  @FindBy(id = "user_password")
  public WebElement user_password;


  public static final String SIGN_IN_BUTTON = "sign in button";
  @FindBy(css = "input[value='Sign in']")
  public WebElement signIn_button;

  public static final String USER_REMEMBER_ME = "remember me";
  @FindBy(id = "user_remember_me")
  public WebElement remember_me;

  public static final String FORGET_PASSWORD = "Forgot your password ?";
  @FindBy(linkText = "Forgot your password ?")
  public WebElement forgot_password;

  public static final String LOG_IN_ZERO = "log in zero bank";
  @FindBy(xpath = "//h3[contains(.,'Log in to ZeroBank')]")
  public WebElement login_h3;

  public static final String ALERT_WRONG_USER_OR_PASS = "wrong user/pass alert";
  @FindBy(css = "div[class='alert alert-error']")
  public WebElement alert_wrongLogOrPas;


  public WebElement getLoginPageElement(String element) {

    switch (element) {
      case LOGIN:
        return user_login;
      case PASSWORD:
        return user_password;
      case SIGN_IN_BUTTON:
        return signIn_button;
      case USER_REMEMBER_ME:
        return remember_me;
      case FORGET_PASSWORD:
        return forgot_password;
      case LOG_IN_ZERO:
        return login_h3;
      case ALERT_WRONG_USER_OR_PASS:
        return alert_wrongLogOrPas;
      default:
        throw new NoSuchElementException();
    }


  }

  public void backToLoginFunction() {

      getElement(USER_DROPDOWN).click();
      waits().until(ExpectedConditions.visibilityOf(getElement(LOG_OUT)));
      getElement(LOG_OUT).click();
    }



    public void enterUsername (String type){
      Faker faker = new Faker();
      if (type.equalsIgnoreCase("true")) {
        getLoginPageElement(LOGIN).clear();
        getLoginPageElement(LOGIN).sendKeys(ConfigurationReader.getProperty("user"));
      } else if (type.equalsIgnoreCase("false")) {
        getLoginPageElement(LOGIN).clear();
        getLoginPageElement(LOGIN).sendKeys(faker.bothify("?#?#?#?#?#"));
      } else if (type.equalsIgnoreCase("empty")) {
        getLoginPageElement(LOGIN).clear();
        getLoginPageElement(LOGIN).sendKeys(faker.bothify(""));
      } else if (type.equalsIgnoreCase("blank")) {
        getLoginPageElement(LOGIN).clear();
        getLoginPageElement(LOGIN).sendKeys(faker.bothify(" "));
      } else {
        getLoginPageElement(LOGIN).clear();
        getLoginPageElement(LOGIN).sendKeys(type);
      }


    }
  public void enterPassword (String type) {
    Faker faker = new Faker();
    if (type.equalsIgnoreCase("true")) {
      getLoginPageElement(PASSWORD).clear();
      getLoginPageElement(PASSWORD).sendKeys(ConfigurationReader.getProperty("password"));
    } else if (type.equalsIgnoreCase("false")) {
      getLoginPageElement(PASSWORD).clear();
      getLoginPageElement(PASSWORD).sendKeys(faker.bothify("?#?#?#?#?#"));
    } else if (type.equalsIgnoreCase("empty")) {
      getLoginPageElement(PASSWORD).clear();
      getLoginPageElement(PASSWORD).sendKeys(faker.bothify(""));
    } else if (type.equalsIgnoreCase("blank")) {
      getLoginPageElement(PASSWORD).clear();
      getLoginPageElement(PASSWORD).sendKeys(faker.bothify(" "));
    } else {
      getLoginPageElement(PASSWORD).clear();
      getLoginPageElement(PASSWORD).sendKeys(type);
    }
  }
    public void enterPassword (){
      getLoginPageElement(PASSWORD).clear();
      getLoginPageElement(PASSWORD).sendKeys(ConfigurationReader.getProperty("password"));;
    }

    public void loginButtonClick () {
      getLoginPageElement(SIGN_IN_BUTTON).click();
    }


}


