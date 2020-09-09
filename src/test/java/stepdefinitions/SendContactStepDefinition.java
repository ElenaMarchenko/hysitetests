package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.ContactUs;
import steps.ContactRequestSteps;
import steps.MainPageSteps;

public class SendContactStepDefinition {

    @Steps

    ContactRequestSteps contactRequestSteps;

    @Given("^I go to  https://www.hys-enterprise.com/$")
    public void iAccessMainPageHysSite() {
        contactRequestSteps.openMainPage();
    }


    @And("^I click on ‘Contact us’  button.$")
    public void iClickOnContactUsButton() {
        contactRequestSteps.ClickOnContactUsButton();
    }
    
    @And("^on the opened page I find  ‘You Full Name’ field and enter there  ‘Full Name’ value.$")
    public void iEnterFullNameValue() {
        contactRequestSteps.EnterFullNameValue();
    }

    @And("^I find  ‘You Email’ field and enter there  ‘_____@hys-enterprise.com’ value.$")
    public void iEnterFullEmailValue() {
        contactRequestSteps.EnterFullEmailValue();
    }

    @And("^I find  ‘Your Phone Number’ field and enter there  ‘123456789’ value.$")
    public void iEnterFullPhoneValue() {
        contactRequestSteps.EnterFullPhoneValue();
    }

    @And("^I find  ‘Your Country’ field and enter there  ‘Country’ value.$")
    public void iEnterFullCountryValue() {
        contactRequestSteps.EnterFullCountryValue();
    }

    @And("^I find  ‘Message’ field and enter there  ‘Message’ value.$")
    public void iEnterFullMessageValue() {
        contactRequestSteps.EnterFullMessageValue();
    }

    @And("^I mark all necessary check-boxes.$")
    public void iMarkCheckBoxes() {
        contactRequestSteps.MarkCheckBoxes();
    }

    @When("^I click on ‘Send’ button$")
    public void iClickOnSend() throws Throwable {contactRequestSteps.ClickOnSend();}

    @Then("^confirmation  message ‘Thank you for contacting us! Our team will respond to your request shortly!’ is displayed.$")
    public void thanksForContactingUsPopUpIsDisplayed()  {
        contactRequestSteps.checkThatThanksForContactingUsMessageIsDisplayed();
    }

}
