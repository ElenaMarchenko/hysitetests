package steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import pages.ContactUs;
import pages.MainPage;


public class ContactRequestSteps {
    MainPage mainPage;

    ContactUs contactUs;


    @Step
    public void openMainPage(){
        mainPage.open();
    }

    @Step
    public void ClickOnContactUsButton(){
        mainPage.contactUs_button.click();
    }

    @Step
    public void EnterFullNameValue(){
        contactUs.FullName.sendKeys("Gregory");
    }

    @Step
    public void EnterFullEmailValue(){
        contactUs.YourEmail.sendKeys("Gregory@gmail.com");
    }

    @Step
    public void EnterFullPhoneValue(){
        contactUs.PhoneNumber.sendKeys("+380631234567");
    }

    @Step
    public void EnterFullCountryValue(){
        contactUs.YourCountry.sendKeys("Ukraine");
    }

    @Step
    public void EnterFullMessageValue(){
        contactUs.Message.sendKeys("Hillel Test :)");
    }

    @Step
    public void MarkCheckBoxes(){
        contactUs.TermsCheckBox.click();
    }

    @Step
    public void ClickOnSend() throws Throwable {
        Thread.sleep(5000);
        contactUs.closeCookieMessage.click();
        Thread.sleep(2000);
        contactUs.contact_for_submit.click();
    }
    @Step
    public void checkThatThanksForContactingUsMessageIsDisplayed() {

        Assert.assertTrue(contactUs.thanksMessage.isDisplayed());

    }


}
