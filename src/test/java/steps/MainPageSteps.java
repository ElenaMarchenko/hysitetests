package steps;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.ContactUs;
import pages.MainPage;
import pages.MainPageReferencePopUp;
@DefaultUrl("/events/")
public class MainPageSteps {
    MainPage mainPage;
    MainPageReferencePopUp mainPageReferencePopUp;
    WebDriver driver;
    ContactUs contactUs;

    @Step
    public void openMainPage() {
        mainPage.open();
    }

    @Step
    public void scrollDownToAskReferenceButton() {
        mainPage.scrollToReferenceButton();
    }

    @Step
    public void clickOnReferenceButton() {
        mainPage.askForReferenceButton.click();
    }

    @Step
    public void verifyThatModelFormIsDisplayed() {
        Assert.assertTrue(mainPageReferencePopUp.referenceFormNameTextField.isDisplayed());
    }

    @Step
    public void enterRandomReferenceFormName() {
        mainPageReferencePopUp.referenceFormEmaileTextField
                .sendKeys("test@gmail.com");
    }

    @Step
    public void enterRandomReferenceFormEmail() {
        mainPageReferencePopUp.referenceFormNameTextField
                .sendKeys("Gregory");
    }

    @Step
    public void clickOnTermsAndAgreementsCheckbox() {
        mainPageReferencePopUp.termsAndAgreementsCheckBox.click();
        //mainPageReferencePopUp.termsAndAgreementsCheckBox.submit();
        //mainPageReferencePopUp.scrollDownToreferenceFormSubmitButton();
    }

    @Step
    public void clickOnReferenceFormSubmitButton() {
        mainPageReferencePopUp.scrollDownToReferenceFormSubmitButton();
        mainPageReferencePopUp.referenceFormSubmitButton.submit();
    }

    @Step

    public void checkThatThanksMessageIsDisplayedOnReferenceForm() {
        Assert.assertTrue(mainPageReferencePopUp.referenceFormModalDialogThanksMessage.isDisplayed());
        mainPage.closeMessagePopUp.click();
    }
    public void scrollToLetsNetworkBlock(){
        mainPage.scrollToLetsNetworkBlock();
    }


    @Step
    public void clickOnSeeMoreEvents(){
       mainPage.getDriver().get("https://www.hys-enterprise.com/events/");
    }

    @Step
    public void eventPageOpened() {
        Assert.assertTrue(mainPage.Events.isDisplayed());}
}


