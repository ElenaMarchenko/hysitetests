package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUs extends HysBasePageObject {

    @FindBy(id = "full_name")
    public WebElement FullName;

    @FindBy(id = "email")
    public WebElement YourEmail;

    @FindBy(id = "phone")
    public WebElement PhoneNumber;

    @FindBy(id = "country")
    public WebElement YourCountry;

    @FindBy(id = "message")
    public WebElement Message;

    @FindBy(xpath = "//div[2]//label[1]//label[1]")
    public WebElement TermsCheckBox;

    @FindBy(xpath = "/html/body/section/div/div/div/div[1]/div/div[1]/div/form/div/div[6]/div[4]/button")
    public WebElement contact_for_submit;

    @FindBy(xpath = "//*[@id=\"contact-form\"]/div/div[6]/div[4]/div")
    public WebElement thanksMessage;

    @FindBy(xpath = "//*[@id=\"hs-eu-confirmation-button\"]")
    public WebElement closeCookieMessage;
}

