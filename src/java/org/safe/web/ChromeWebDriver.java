package org.safe.web;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

/**
 * Created by elango on 3/14/17.
 */
public class ChromeWebDriver {

    public void ChromeWebDriver(WebDriver driver, String url){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    public void closeChromeDriver(WebDriver driver){
        driver.close();
        driver.quit();
    }

}
