This is the Demo project for the Mobile UI Automation using:
- Java
- Maven
- Selenium WebDriver
- TestNG
- Appium

The order of the test cases being executed defined in “testSuite.xml” file
The variables needed for the project are being pulled from “project-settings.properties” file

This project has one package “com.smartClient4x” and following classes:
- Configurations
- Driver
- LoginPageObjects
- PropertyReader
- TestingMethods

Here is the description of each class:
- Configurations - this is not being used at this time will user it later
- Driver - is the class where we set up the Appium driver with it’s capabilities 
           that is going to be used in the project
- PropertyReader - has the getFromProperties method that pulls the properties
                   from “project-settings.properties” file and is being used
                   across the whole project
- LoginPageObjects - has the methods that locate the objects in the LogIn page
- TestingMethods - is the class that contains the test cases.
                   It pulls the driver from the Driver class,
                   then it pulls the methods from LoginPageObjects
                   and do the manipulations upon them.

