import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.jupiter.api.Assertions.*;

public class MainPage extends BasePage {

    //Логотипы платежных систем
    @FindBy(xpath = "//*[@id=\"pay-section\"]//img[@alt=\"Visa\"]")
    private WebElement visaLogo;

    @FindBy(xpath = "//*[@id=\"pay-section\"]//img[@alt=\"Verified By Visa\"]")
    private WebElement verifiedByVisaLogo;

    @FindBy(xpath = "//*[@id=\"pay-section\"]//img[@alt=\"MasterCard\"]")
    private WebElement masterCardLogo;

    @FindBy(xpath = "//*[@id=\"pay-section\"]//img[@alt=\"MasterCard Secure Code\"]")
    private WebElement masterCardSecureCodeLogo;

    @FindBy(xpath = "//*[@id=\"pay-section\"]//img[@alt=\"Белкарт\"]")
    private WebElement belkartLogo;

    //Окно онлайн пополнения
    @FindBy(xpath = "//div[@class=\"pay__wrapper\"]")
    private WebElement payWindow;

    @FindBy(xpath = "//div[@class=\"pay__wrapper\"]//h2")
    private WebElement payWindowText;

    //Кнопка продолжить
    @FindBy(xpath = "//button[contains(text(), 'Продолжить')]")
    private WebElement continueButton;

    //Дропдаун кнопка
    @FindBy(xpath = "//button[@class=\"select__header\"]")
    private WebElement dropDownButton;

    //Поля Услуги связи
    @FindBy(xpath = "//ul[@class=\"select__list\"]//p[contains(text(), 'Услуги связи')]")
    private WebElement dropDownServices;

    @FindBy(id = "connection-phone")
    private WebElement phoneField;

    @FindBy(id = "connection-sum")
    private WebElement sumField;

    @FindBy(id = "connection-email")
    private WebElement emailField;

    //Поля Домашний интернет
    @FindBy(xpath = "//ul[@class=\"select__list\"]//p[contains(text(), 'Домашний интернет')]")
    private WebElement dropDownInternet;

    @FindBy(id = "internet-phone")
    private WebElement internetPhoneField;

    @FindBy(id = "internet-sum")
    private WebElement internetSumField;

    @FindBy(id = "internet-email")
    private WebElement internetEmailField;

    //Поля Рассрочка
    @FindBy(xpath = "//ul[@class=\"select__list\"]//p[contains(text(), 'Рассрочка')]")
    private WebElement dropDownInstalment;

    @FindBy(id = "score-instalment")
    private WebElement scoreInstalmentField;

    @FindBy(id = "instalment-sum")
    private WebElement sumInstalmentField;

    @FindBy(id = "instalment-email")
    private WebElement emailInstalmentField;

    //Поля задолженность
    @FindBy(xpath = "//ul[@class=\"select__list\"]//p[contains(text(), 'Задолженность')]")
    private WebElement dropDownDebt;

    @FindBy(id = "score-arrears")
    private WebElement scoreArrearsField;

    @FindBy(id = "arrears-sum")
    private WebElement sumArrearsField;

    @FindBy(id = "arrears-email")
    private WebElement emailArrearsField;

    //ссылка для проверки
    @FindBy(xpath = "//a[contains(@href, '/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/')]")
    private WebElement link;

    //Методы

    @Step("Проверка наличия логотипов платежных систем")
    public void areAllPaymentLogosDisplayed() {
        assertAll(
                () -> assertTrue(visaLogo.isDisplayed(), "Логотип Visa не отображается"),
                () -> assertTrue(verifiedByVisaLogo.isDisplayed(), "Логотип Verified by Visa не отображается"),
                () -> assertTrue(masterCardLogo.isDisplayed(), "Логотип MasterCard не отображается"),
                () -> assertTrue(masterCardSecureCodeLogo.isDisplayed(), "Логотип MasterCard Secure Code не отображается"),
                () -> assertTrue(belkartLogo.isDisplayed(), "Логотип Белкарт не отображается")
        );
    }

    @Step("Проверка отображения поля 'Онлайн пополнение без комиссии'")
    public void isMainWindowDisplayed() {
        assertTrue(payWindow.isDisplayed(),
                "Элемент с текстом 'Онлайн пополнение' не отображается на странице");

        String actualText = payWindowText.getText()
                .replaceAll("\\s+", " ")
                .trim();
        assertTrue(actualText.contains("Онлайн пополнение без комиссии"),
                "Текст не совпадает. Ожидалось: 'Онлайн пополнение без комиссии', Фактически: '" + actualText + "'");
    }

    @Step("Клик по кнопке 'Продолжить'")
    public MainPage clickContinue() {
        continueButton.click();
        return this;
    }

    @Step("Клик по дропдаун кнопке 'Услуги связи'")
    public MainPage clickDropDown() {
        dropDownButton.click();
        return this;
    }

    @Step("Ввод номера в поле 'Номер телефона'")
    public MainPage enterPhone(String phoneNumber) {
        phoneField.sendKeys(phoneNumber);
        return this;
    }

    @Step("Ввод суммы в поле Сумма")
    public MainPage enterSum(String sum) {
        sumField.sendKeys(sum);
        return this;
    }

    @Step("Ввод имейла в поле E-mail")
    public MainPage enterEmail(String email) {
        emailField.sendKeys(email);
        return this;
    }

    @Step("Проверка текста в пустых плейсхолдерах")
    public void checkFirstPlaceholders() {
        assertAll(
                () -> assertEquals("Номер телефона", phoneField.getAttribute("placeholder"),
                        "Неверный плейсхолдер для поля 'Номер телефона'"),

                () -> assertEquals("Сумма", sumField.getAttribute("placeholder"),
                        "Неверный плейсхолдер для поля 'Сумма'"),

                () -> assertEquals("E-mail для отправки чека", emailField.getAttribute("placeholder"),
                        "Неверный плейсхолдер для поля 'E-mail'")
        );
    }

    @Step("Клик по дропдаун кнопке 'Домашний интернет'")
    public MainPage clickDropDownInternet() {
        dropDownInternet.click();
        return this;
    }

    @Step("Проверка текста в пустых плейсхолдерах")
    public void checkHomeInternetPlaceholders() {
        assertAll(
                () -> assertEquals("Номер абонента", internetPhoneField.getAttribute("placeholder"),
                        "Неверный плейсхолдер для поля номера абонента"),
                () -> assertEquals("Сумма", internetSumField.getAttribute("placeholder"),
                        "Неверный плейсхолдер для поля суммы"),
                () -> assertEquals("E-mail для отправки чека", internetEmailField.getAttribute("placeholder"),
                        "Неверный плейсхолдер для поля email")
        );
    }

    @Step("Клик по дропдаун кнопке 'Рассрочка'")
    public MainPage clickDropDownInstalment() {
        dropDownInstalment.click();
        return this;
    }

    @Step("Проверка текста в пустых плейсхолдерах")
    public void checkInstalmentPlaceholders() {
        assertAll(
                () -> assertEquals("Номер счета на 44", scoreInstalmentField.getAttribute("placeholder"),
                        "Неверный плейсхолдер для номера счета"),
                () -> assertEquals("Сумма", sumInstalmentField.getAttribute("placeholder"),
                        "Неверный плейсхолдер для суммы"),
                () -> assertEquals("E-mail для отправки чека", emailInstalmentField.getAttribute("placeholder"),
                        "Неверный плейсхолдер для email")
        );
    }

    @Step("Клик по дропдаун кнопке 'Задолженность'")
    public MainPage clickDropDownDebt() {
        dropDownDebt.click();
        return this;
    }

    @Step("Проверка текста в пустых плейсхолдерах")
    public void checkDebtPlaceholders() {
        assertAll(
                () -> assertEquals("Номер счета на 2073", scoreArrearsField.getAttribute("placeholder"),
                        "Неверный плейсхолдер для номера счета"),
                () -> assertEquals("Сумма", sumArrearsField.getAttribute("placeholder"),
                        "Неверный плейсхолдер для суммы"),
                () -> assertEquals("E-mail для отправки чека", emailArrearsField.getAttribute("placeholder"),
                        "Неверный плейсхолдер для email")
        );
    }

    @Step("Переход по ссылке 'Подробнее о сервисе'")
    public MainPage clickLink() {
        link.click();
        return this;
    }
}