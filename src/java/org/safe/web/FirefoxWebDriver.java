package org.safe.web;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by elango on 3/14/17.
 */
public class FirefoxWebDriver {

    public void FirefoxWebDriver(WebDriver driver, String url){

        System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");

        DesiredCapabilities dc = DesiredCapabilities.firefox();
        dc.setCapability("marionette", true);

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
    }

}
