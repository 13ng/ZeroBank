package com.cydeo.utils;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class BrowserUtils {
    public static void sleep (int second){
        /*
This method will accept int (in second ) and execute Thread.sleep for given duration
 */
        second *=1000;
        try {
            Thread.sleep(second);
        }catch (InterruptedException e){

        }





    }

    //This method needs to switch the window, and check if title and url contains expected value
    public static void switchWindowAndVerify( String expectedInUrl, String expectedTitle){

        Set<String> allWindowsHandles = Driver.getDriver().getWindowHandles();

        for (String each : allWindowsHandles) {

            Driver.getDriver().switchTo().window(each);

            System.out.println(Driver.getDriver().getCurrentUrl());

            if (Driver.getDriver().getCurrentUrl().contains(expectedInUrl)) {
                break; // if loop is on this page, i want to break the loop
                //to leave it here

            }
        }
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));


    }

    public static void verifyTitle( String expectedTitle){

        Assert.assertEquals(Driver.getDriver().getTitle(),expectedTitle);


    }


    public static void login_crm(WebDriver driver){

        //Method #1 info:
        //• Name: login_crm()
        //• Return type: void
        //• Arg1: WebDriver



    }
}
