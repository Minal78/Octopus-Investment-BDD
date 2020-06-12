package com.octopusinvestments.browserselector;

import com.octopusinvestments.basepage.BasePage;
import com.octopusinvestments.loadproperty.LoadProperty;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserSelector extends BasePage {

    String baseUrl = new LoadProperty().getMyProperty("baseUrl");

    public void selectBrowser(String browser) {

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\driver\\chrome_driver\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get(baseUrl);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        } else {
            System.out.println("Select valid browser");
        }
    }
}
