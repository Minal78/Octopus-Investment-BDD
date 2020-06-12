package com.octopusinvestments.cucumber;

import com.octopusinvestments.pages.MainPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class MyStepdefs {

    @Steps
    MainPage mainPage;

    @Given("^user is on main page$")
    public void userIsOnMainPage() {
        mainPage.popUpHandling();
    }

    @When("^user click on what we offer$")
    public void userClickOnWhatWeOffer() {
        mainPage.clickOnwhatWeOffer();
    }

    @And("^user click on About us$")
    public void userClickOnAboutUs() {
        mainPage.clickOnAboutUs();
    }

    @And("^user click on Resources$")
    public void userClickOnResources() {
        mainPage.clickOnResources();
    }

    @And("^user click on Webinar$")
    public void userClickOnWebinar() {
        mainPage.clickOnWebinars();
    }

    @And("^user click on  contact$")
    public void userClickOnContact() {
        mainPage.clickOnConatct();
    }

    @Then("^user should able to get appropriate page$")
    public void userShouldAbleToGetAppropriatePage() {
    }

    @Given("^user is on the main page$")
    public void userIsOnTheMainPage() {
        mainPage.popUpHandling();
    }

    @When("^user click on the search bar$")
    public void userClickOnTheSearchBar() {
        mainPage.clickOnSearchField();
    }

    @And("^user enter \"([^\"]*)\" in search field$")
    public void userEnterInSearchField(String text) {
     mainPage.enterText(text);
    }

    @Then("^user should able to see name \"([^\"]*)\" at result$")
    public void userShouldAbleToSeeNameAtResult(String arg0) {

    }

    @When("^user click on the Brouchures option$")
    public void userClickOnTheBrouchuresOption() {
        mainPage.clickOnBrouchers();
    }

    @Then("^user should able to navigate to the Resources center$")
    public void userShouldAbleToNavigateToTheResourcesCenter() {
        mainPage.brouchersPage();
    }
}
