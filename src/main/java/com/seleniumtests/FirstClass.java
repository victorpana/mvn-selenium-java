package com.seleniumtests;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class FirstClass {

    @Test
    public void gotofirefox() {
        final ChromeOptions chromeOptions = new ChromeOptions();
        //chromeOptions.addArguments("--start-fullscreen");
        chromeOptions.addArguments("--disable-web-security");

        final DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
        capabilities.setPlatform(Platform.WIN10);
        capabilities.setBrowserName("chrome");
        System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");



        WebDriver chromeDriver = new ChromeDriver(chromeOptions);
        chromeDriver.get("http://www.google.com");


        
    }
}
