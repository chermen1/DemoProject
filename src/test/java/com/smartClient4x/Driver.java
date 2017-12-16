package com.smartClient4x;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by cdzebisov on 12/11/17.
 */
public class Driver {

//    String x = null;
//
//    void setX(String x) {
//        this.x = x;
//    }

    URL appiumUrl = new URL("http://127.0.0.1:4723/wd/hub");


    public Driver() throws MalformedURLException {
    }


    public AppiumDriver getDriver() {
        AppiumDriver driver;
        String type = Props.INSTANCE.props("platform");
        if (type.equals("android")) {
            driver = new AndroidDriver(appiumUrl, androidCapabilities());
        } else {
            driver = new IOSDriver<WebElement>(appiumUrl, iosCapabilities());
            driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS );
        }
        return driver;

    }


    public DesiredCapabilities iosCapabilities() {
        DesiredCapabilities iosCapabilities= new DesiredCapabilities();
       
        iosCapabilities.setCapability("deviceName", "iPhone 5s");
        //iosCapabilities.setCapability(MobileCapabilityType.UDID,"B5CBD9FB-2CF1-4A2C-A6D2-C60F291F1FF9");
        iosCapabilities.setCapability("platformName", "iOS");
        iosCapabilities.setCapability("platformVersion", "11.0");
        iosCapabilities.setCapability("appiumVersion", "1.7.1");
        //iosCapabilities.setCapability("automationName", AutomationName.IOS_XCUI_TEST); // this needed when the ios version is above 10.x
        iosCapabilities.setCapability("app", "/Users/cdzebisov/Desktop/cher/learn/MyProjects/BankOfTrust4x.app");
        //iosCapabilities.setCapability(DesiredCapabilities);
        iosCapabilities.setCapability("autoWebview", true); //This will switch the appium to the WEBVIEW


        return iosCapabilities;
    }


    public DesiredCapabilities androidCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName", "BH90427B1L");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "6.0.1");
        capabilities.setCapability("autoWebview", true); //This will switch the appium to the WEBVIEW
        capabilities.setCapability("unicodeKeyboard", true); //This will disable soft keyboard
        capabilities.setCapability("resetKeyboard", true);
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "90");//this will make driver to wait 30 sec before the element is located.

        File appDir = new File(Props.INSTANCE.props("appPath"));
        File app = new File(appDir, Props.INSTANCE.props("androidapp"));
        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath()); // this will install the apk file on the deivice and launch it.

        return capabilities;
    }


}
