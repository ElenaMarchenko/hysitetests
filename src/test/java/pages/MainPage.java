package pages;

        import org.openqa.selenium.By;
        import org.openqa.selenium.JavascriptExecutor;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.interactions.Action;
        import org.openqa.selenium.interactions.Actions;
        import org.openqa.selenium.support.FindBy;

public class MainPage extends HysBasePageObject {
    WebDriver driver;

    @FindBy(xpath = "//button[@data-target='#getReferenceModal']")
    public WebElement askForReferenceButton;

    @FindBy(xpath = "/html/body/section[7]")
    public WebElement letsNetworkBlock;

    @FindBy(xpath = "//span[text()='Upcoming events']")
    public WebElement seeMoreEventsButton;


    @FindBy(xpath = "//span[contains(text(),  'See more publications')]")
    public WebElement seeMorePublications;


    @FindBy(xpath = "//a[contains(text(),  'Contact us')]")
    public WebElement contactUs_button;

    @FindBy(xpath = "//a[contains(text(),  'About us')]")
    public WebElement aboutUs_button;

    @FindBy(xpath = "//*[@id=\"primary-menu-affix\"]/li[2]/a")
    public WebElement services_button;

    @FindBy(xpath = "//a[contains(text(),  'Software Modernization')]")
    public WebElement soft_modernization;


    @FindBy(xpath = " //a[contains(text(),  'Quality Assurance')]")
    public WebElement qiality_assurance;

    @FindBy(xpath = " //a[contains(text(),  'Software Maintenance')]")
    public WebElement software_maintenance;

    @FindBy(xpath = " //a[contains(text(),  'IT Consulting and Advising')]")
    public WebElement services_consulting;

    @FindBy(xpath = " //a[contains(text(),  'Custom Software and Product Development')]")
    public WebElement services_custom_software;

    @FindBy(xpath = " //a[contains(text(),  'Enterprise Applications')]")
    public WebElement services_enterprise;

    @FindBy(xpath = "/html/body/section[5]/div/div/div/div/div[2]/a/span")
    public WebElement seeMoreReferencesbutton;

    @FindBy(xpath = "/html/body/section[2]/div/div/div")
    public WebElement letsHandshake;

    @FindBy(xpath = "/html/body/section/div/div/div[1]/div/h2")
    public WebElement Events;

    @FindBy(xpath = "//*[@id=\"hs-eu-confirmation-button\"]")
    public WebElement closeCookieMessage;

    @FindBy(xpath = "/html/body/section[7]/div/div/div[1]/div/a")
    public WebElement closePopUpMessage;

    @FindBy(xpath = "//*[@id=\"getReferenceModal\"]/div/div/div[1]/button/span")
    public WebElement closeMessagePopUp;

    @FindBy(xpath = "//iframe[@title='chat widget']")
    public WebElement Frame;

    @FindBy(xpath = "//button[@aria-label='Dismiss']")
    public WebElement closeMessage;


    public void scrollToReferenceButton(){
        scrollDown("300");
    }

    public void scrollToLetsNetworkBlock(){
        scrollDown(letsNetworkBlock);
    }

    public void clickOnSeeMoreEvents() {

        seeMoreEventsButton.click();
    }
    public void setSeeMorePublications() {
        seeMorePublications.click();
    }
    public void contactUs() {
        contactUs_button.click();
    }
    public void aboutUs () {
        aboutUs_button.click();
    }
    public void services () {
        services_button.click();
    }
    public void modernization () {
        soft_modernization.click();
    }
    public void services_qa () {
        qiality_assurance.click();
    }
    public void services_maintenance () {
        software_maintenance.click();

    }
    public void services_consulting () {
        services_consulting.click();

    }
    public void services_custom_software () {
        services_custom_software.click();

    }
    public void services_enterprise () {
        services_enterprise.click();

       }
}

