package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import steps.CareerPageSteps;
import steps.MainPageSteps;
import steps.SeeMoreReferencesSteps;
import steps.VacanciesPageSteps;

public class SeeMoreReferencesStepDefinition {


    @Steps
    MainPageSteps mainPageSteps;

    @Steps
    SeeMoreReferencesSteps seeMoreReferencesSteps;

    @Given("^I access  https://www.hys-enterprise.com/")
    public void iAccessMainPageHysSite() {
        mainPageSteps.openMainPage();
    }


    @When("^I Scroll down to see ‘See more references’ button.$")
    public void seeMoreReferences() {
        mainPageSteps.scrollDownToAskReferenceButton();
    }

    @And("^I click on ‘See more references’ button.$")
    public void iClickOnMoreReferencesButton() {
        seeMoreReferencesSteps.clickOnSeeMoreReferencesbutton();
    }


    @Then("^references page is opened \\(https://www\\.hys-enterprise\\.com/references/\\)$")
    public void referencesPageIsOpened()  {
        seeMoreReferencesSteps.isPageOpened();
    }
}
