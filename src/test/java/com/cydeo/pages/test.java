package com.cydeo.pages;

import com.cydeo.utils.ConfigurationReader;
import com.cydeo.utils.Driver;
import org.openqa.selenium.WebElement;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class test {
    public static void main(String[] args) {


        AccountActivityPage page = new AccountActivityPage();

        List<String> testRes = new ArrayList<>();
//
        LoginPage pageLogin = new LoginPage();
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        pageLogin.enterUsername("true");
        pageLogin.enterPassword("true");
        pageLogin.loginButtonClick();
        Driver.getDriver().navigate().back();
        page.account_act_link.click();

        //
List<String> testTableOrder = new ArrayList<>();
page.table_elements.forEach(p->testTableOrder.add(p.getText()));
        for (int i = 0; i < testTableOrder.size(); i++) {
            System.out.println(testTableOrder.get(i)+" "+i);
        }
        System.out.println("----hyinaney----");

        //
        System.out.println(page.element_is_visable(page.find_transaction_table));



    }



}
