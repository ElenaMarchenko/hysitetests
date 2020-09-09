package steps;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.MainPage;
import org.junit.Assert;

public class SeeMoreReferencesSteps {
    @Managed
    WebDriver driver;


    MainPage mainPage;


    @Step
    public void openMainPage() {
        mainPage.open();
    }

    @Step
    public void clickOnSeeMoreReferencesbutton() {
        mainPage.scrollDown("100");
        mainPage.seeMoreReferencesbutton.click();
    }


    @Step
    public void isPageOpened() {
        Assert.assertTrue(mainPage.letsHandshake.isDisplayed());
    }
}
