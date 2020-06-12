package com.octopusinvestments.pages;
import com.octopusinvestments.utility.Utility;
import org.openqa.selenium.By;


public class MainPage extends Utility {

    static String a;
    static String aa = "//h3[contains(text(),\\\"Search results for '";
    static String bb = "'\\\")]\"";

    //--------------------------------------------------------------------------//
    By what_we_offer = By.id("menu-item-88");
    By about_us = By.id("menu-item-440");
    By resources = By.xpath("//ul[@id='menu-primary']//a[contains(text(),'Resources')]");
    By webinar = By.xpath("//ul[@id='menu-primary']//a[contains(text(),'Webinars')]");
    By contact = By.xpath("//ul[@id='menu-primary']//a[contains(text(),'Contact')]");
    By investor = By.xpath("//input[contains(text(),'Investors')]");
    By confirm = By.xpath("//input[@class='btn wp-block-button investor-confirm-button']");
    By acceptC = By.id("ccc-notify-accept");
    By searchButton = By.xpath("//span[contains(text(),'Search')]");
    By textField = By.xpath("//input[@id='input-focus']");
    By searchSubmit = By.xpath("//i[@class='search-submit']");
    By brouchers = By.xpath("//a[contains(text(),'Brochures')]");
    //----------------------------------------------------------------------//

    public void popUpHandling() {
        clickOnElement(acceptC);
        clickOnElement(investor);
        clickOnElement(confirm);
    }

    public void clickOnwhatWeOffer() {
        clickOnElement(what_we_offer);
    }

    public void clickOnAboutUs() {
        clickOnElement(about_us);
    }

    public void clickOnResources() {
        clickOnElement(resources);
    }

    public void clickOnWebinars() {
        clickOnElement(webinar);
    }

    public void clickOnConatct() {
        clickOnElement(contact);
    }

    public void clickOnSearchField() {
        clickOnElement(searchButton);
    }

    public void enterText(String text) {
        waitFor();
        sendTextToElement(textField, text);
        waitFor();
        clickOnElement(searchSubmit);
    }

    public void verifySearchResultPage(String text) {

        a = "Search results for '" + text + "'";
        By searchResultPage = By.xpath(aa + a + bb);
        String searchText = getTextFromElement(searchResultPage);
        verifyExpectedAndActual(searchText, text);

    }

    public void clickOnBrouchers() {
        clickOnElement(brouchers);
    }

    public void brouchersPage() {
        verifyExpectedAndActual("Brochures | Octopus Investments", driver.getTitle());
    }

}
