package com.octopusinvestments.cucumber;

import com.octopusinvestments.basepage.BasePage;
import com.octopusinvestments.browserselector.BrowserSelector;
import com.octopusinvestments.loadproperty.LoadProperty;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BasePage {
    @Before
    public void init() {
        new BrowserSelector().selectBrowser(new LoadProperty().getMyProperty("browser"));
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
