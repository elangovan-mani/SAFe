package org.safe.general;

import org.safe.web.ChromeWebDriver;
import org.safe.web.FirefoxWebDriver;

import org.openqa.selenium.WebDriver;

/**
 * Created by elango on 3/14/17.
 */
public class main {

    public static WebDriver driver;

    public static void main(String[] args){

        ChromeWebDriver cwdriver = new ChromeWebDriver();
        cwdriver.ChromeWebDriver(driver,"https://www.google.com");



    }

}
