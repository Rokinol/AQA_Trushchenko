import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    @FindBy(xpath = "//div[@class=\"pay__wrapper\"]")
    private WebElement payWindow;

    @FindBy(id = "connection-phone")
    private WebElement phoneField;

    @FindBy(id = "connection-sum")
    private WebElement sumField;

    @FindBy(id = "connection-email")
    private WebElement emailField;

    @FindBy(xpath = "//button[contains(text(), 'Продолжить')]")
    private WebElement continueButton;

    @FindBy(xpath = "//button[@class=\"select__header\"]")
    private WebElement dropDownButton;

    @FindBy(xpath = "//*[@id=\"pay-section\"]//img[@alt=\"Visa\"]")
    private WebElement payPartnerVisa;

    @FindBy(xpath = "//*[@id=\"pay-section\"]//img[@alt=\"Verified By Visa\"]")
    private WebElement payPartnerVBV;

    @FindBy(xpath = "//*[@id=\"pay-section\"]//img[@alt=\"MasterCard\"]")
    private WebElement payPartnerMasterCard;

    @FindBy(xpath = "//*[@id=\"pay-section\"]//img[@alt=\"MasterCard Secure Code\"]")
    private WebElement payPartnerMSSC;

    @FindBy(xpath = "//*[@id=\"pay-section\"]//img[@alt=\"Белкарт\"]")
    private WebElement payPartnerBelCard;

    public boolean isMainWindowDisplayed(){
        return  payWindow.isDisplayed();
    }

    public MainPage enterPhone(String phoneNumber){
        phoneField.sendKeys(phoneNumber);
        return this;
    }

    public MainPage  enterSum(String sum){
        sumField.sendKeys(sum);
        return this;
    }

    public MainPage  enterEmail(String email){
        emailField.sendKeys(email);
        return this;
    }

    public MainPage clickContinue(){
        continueButton.click();
        return this;
    }

    public MainPage clickDropDown(){
        dropDownButton.click();
        return this;
    }
}


