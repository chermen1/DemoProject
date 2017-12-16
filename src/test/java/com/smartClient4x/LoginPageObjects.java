package com.smartClient4x;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

/**
 * Created by cdzebisov on 12/5/17.
 */
public class LoginPageObjects {
    //IOSDriver<IOSElement> driver;
    //WebDriver dirver;

//    AppiumDriver driver;
    WebDriverWait wait;



    // USerNAme Input Field:
    public WebElement userInputField(AppiumDriver driver){
        return locateAndWaitForElement(driver, By.xpath("//div/input[@data-ng-model=\"loginData.username\"]"));
    }
    public WebElement passwordInputField (){
      //  configs.locateAndWaitForElement("xpath", "//div/input[@data-ng-model=\"loginData.password\"]");
      //  return (configs.driver.findElement(By.xpath("//div/input[@data-ng-model=\"loginData.password\"]")));
        return null;
    }




    /** -------------------------------------------------------------------------------------------------
     * This method locates and waits for teh element
     */
    public WebElement locateAndWaitForElement0(AppiumDriver driver, String webElmLocatr, String webElmLocatrValue){
        wait = new WebDriverWait(driver, 20);
        WebElement x = null;
        if (webElmLocatr=="xpath1")           {x=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(webElmLocatrValue)));}
        else if (webElmLocatr=="id")               {x=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(webElmLocatrValue)));}
        else if (webElmLocatr=="className")        {x=wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(webElmLocatrValue)));}
        else if (webElmLocatr=="cssSelector")      {x=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(webElmLocatrValue)));}
        else if (webElmLocatr=="linkText")         {x=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(webElmLocatrValue)));}
        else if (webElmLocatr=="partialLinkText")  {x=wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(webElmLocatrValue)));}
        else if (webElmLocatr=="name")             {x=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(webElmLocatrValue)));}
        else if (webElmLocatr=="tagName")          {x=wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName(webElmLocatrValue)));}
        else if (webElmLocatr=="xpath") {x=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(webElmLocatrValue)));
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(webElmLocatrValue)));}
        return x;
    }

    public WebElement locateAndWaitForElement(AppiumDriver driver, By webElmLocatr){
        wait = new WebDriverWait(driver, 20);
        WebElement x = null;
        x=wait.until(ExpectedConditions.visibilityOfElementLocated(webElmLocatr));

        return x;
    }









}
