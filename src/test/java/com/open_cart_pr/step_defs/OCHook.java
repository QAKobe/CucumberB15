package com.open_cart_pr.step_defs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.commons.io.filefilter.ConditionalFileFilter;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

import java.sql.Driver;

public class OCHook {

    WebDriver driver = DriverHelper.getDriver();

   @Before
    public void setUp(){
        driver.get(ConfigReader.readProperty("OCURL"));
    }

    @After
    public void tearDown(){
        driver.quit();
    }

}
