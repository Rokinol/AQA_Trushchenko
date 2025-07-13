import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainPage extends BasePage {

    //Окно онлайн пополнения
    @FindBy(xpath = "//div[@class=\"pay__wrapper\"]")
    private WebElement payWindow;

    //Кнопка продолжить
    @FindBy(xpath = "//button[contains(text(), 'Продолжить')]")
    private WebElement continueButton;

    //Дропдаун кнопка
    @FindBy(xpath = "//button[@class=\"select__header\"]")
    private WebElement dropDownButton;

    //Поля Услуги связи
    @FindBy(xpath = "//ul[@class=\"select__list\"]//p[contains(text(), 'Услуги связи')]")
    private WebElement dropDownOne;

    @FindBy(id = "connection-phone")
    private WebElement phoneField;

    @FindBy(id = "connection-sum")
    private WebElement sumField;

    @FindBy(id = "connection-email")
    private WebElement emailField;

    //Поля Домашний интернет
    @FindBy(xpath = "//ul[@class=\"select__list\"]//p[contains(text(), 'Домашний интернет')]")
    private WebElement dropDownTwo;

    @FindBy(id = "internet-phone")
    private WebElement internetPhoneField;

    @FindBy(id = "internet-sum")
    private WebElement internetSumField;

    @FindBy(id = "internet-email")
    private WebElement internetEmailField;

    //Поля  Рассрочка
    @FindBy(xpath = "//ul[@class=\"select__list\"]//p[contains(text(), 'Рассрочка')]")
    private WebElement dropDownThree;

    @FindBy(id = "score-instalment")
    private WebElement scoreField;

    @FindBy(id = "instalment-sum")
    private WebElement sumInstalmentField;

    @FindBy(id = "instalment-email")
    private WebElement emailInstalmentField;

    //Поля задолженность
    @FindBy(xpath = "//ul[@class=\"select__list\"]//p[contains(text(), 'Задолженность')]")
    private WebElement dropDownFour;

    @FindBy(id = "score-arrears")
    private WebElement scoreArrearsField;

    @FindBy(id = "arrears-sum")
    private WebElement sumArrearsField;

    @FindBy(id = "arrears-email")
    private WebElement emailArrearsField;

    @FindBy(xpath = "//a[contains(@href, '/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/')]")
    private WebElement link;

    @FindBy(xpath = "//*[@id=\"pay-section\"]//img")
    private List<WebElement> allPaymentPartners;

    //работа с лого платежных систем
    public boolean areAllPartnersDisplayed() {
        return allPaymentPartners.stream()
                .allMatch(WebElement::isDisplayed);
    }

    public boolean isPartnerDisplayed(String partnerName) {
        return allPaymentPartners.stream()
                .anyMatch(img -> img.getAttribute("alt").equals(partnerName)
                        && img.isDisplayed());
    }

    public Map<String, Boolean> getPartnersStatus() {
        Map<String, Boolean> statusMap = new HashMap<>();
        String[] expectedPartners = {
                "Visa",
                "Verified By Visa",
                "MasterCard",
                "MasterCard Secure Code",
                "Белкарт"
        };

        for (String partner : expectedPartners) {
            statusMap.put(partner, isPartnerDisplayed(partner));
        }

        return statusMap;
    }
    //-------------------------------------------------

    //Наличие блока "Онлайн пополнение без комисиии"
    public boolean isMainWindowDisplayed() {
        return payWindow.isDisplayed();
    }

    //Методы для работы с полем Номер телефона
    public MainPage enterPhone(String phoneNumber) {
        phoneField.sendKeys(phoneNumber);
        return this;
    }

    //Метод для работы с плейсходерами
    public void verifyAllPlaceholders() {
        verifyPlaceholder(phoneField, "Номер телефона");
        verifyPlaceholder(sumField, "Сумма");
        verifyPlaceholder(emailField, "E-mail для отправки чека");
    }

    private void verifyPlaceholder(WebElement field, String expected) {
        String actual = field.getAttribute("placeholder");
        if (!expected.equals(actual)) {
            throw new AssertionError("Ожидалось: " + expected + ", но было: " + actual);
        }
    }

    //Методы для работы с полем Сумма
    public MainPage enterSum(String sum) {
        sumField.sendKeys(sum);
        return this;
    }

    public MainPage enterEmail(String email) {
        emailField.sendKeys(email);
        return this;
    }

    public MainPage clickContinue() {
        continueButton.click();
        return this;
    }

    public MainPage clickDropDown() {
        dropDownButton.click();
        return this;
    }

    public MainPage clickLink() {
        link.click();
        return this;
    }
}