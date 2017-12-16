package com.smartClient4x;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 *
 *
 - TxstingMethods - is the class that contains the test cases.
 It pulls the driver from the Driver class,
 then it pulls the methods from LoginPageObjects
 and do the manipulations upon them.
 */
public class TxstingMethods {
    LoginPageObjects elm = new LoginPageObjects();
    AppiumDriver driver;

    @BeforeClass
    public void setupAppium() throws MalformedURLException {
        driver = new Driver().getDriver();


    }

    @Test(description = "Dummy test. sending keys to the login field. First test making sure the driver is set up and configured properly")
    public void verifyLogInFieldTest() {
        elm.userInputField(driver).sendKeys(Props.INSTANCE.props("username"));
        if(Props.INSTANCE.props("platform").equals("ios")) {
            System.out.println("this test is for ios paltform");
            driver.switchTo().alert().accept(); // to accept an alert
        }
        elm.locateAndWaitForElement(driver, By.xpath("//span[@translate=\"login.dock.more.link\"]")).click();
        elm.locateAndWaitForElement(driver,By.xpath("//a[@translate=\"more.options.subnav.faq.label\"]")).click();
    }


    @AfterClass
    public void tearDown() throws Exception {
        //if (driver != null) driver.quit();
    }


}
