import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

    //работа с лого платежных систем
    @Step("Проверка наличия логотипов платежных систем")
    public boolean areAllPaymentLogosDisplayed() {
        return visaLogo.isDisplayed() &&
                verifiedByVisaLogo.isDisplayed() &&
                masterCardLogo.isDisplayed() &&
                masterCardSecureCodeLogo.isDisplayed() &&
                belkartLogo.isDisplayed();
    }

    //Окно онлайн пополнения
    @FindBy(xpath = "//div[@class=\"pay__wrapper\"]")
    private WebElement payWindow;

    @Step("Проверка отображения поля 'Онлайн пополнение без комиссии'")
    public boolean isMainWindowDisplayed() {
        return payWindow.isDisplayed();
    }

    //Кнопка продолжить
    @FindBy(xpath = "//button[contains(text(), 'Продолжить')]")
    private WebElement continueButton;

    @Step("Клик по кнопке 'Продолжить'")
    public MainPage clickContinue() {
        continueButton.click();
        return this;
    }

    //Дропдаун кнопка
    @FindBy(xpath = "//button[@class=\"select__header\"]")
    private WebElement dropDownButton;

    @Step("Клик по дропдаун кнопке 'Услуги связи'")
    public MainPage clickDropDown() {
        dropDownButton.click();
        return this;
    }

    //Поля Услуги связи
    @FindBy(xpath = "//ul[@class=\"select__list\"]//p[contains(text(), 'Услуги связи')]")
    private WebElement dropDownServices;

    @FindBy(id = "connection-phone")
    private WebElement phoneField;

    @Step("Ввод номера в поле 'Номер телефона'")
    public MainPage enterPhone(String phoneNumber) {
        phoneField.sendKeys(phoneNumber);
        return this;
    }

    @FindBy(id = "connection-sum")
    private WebElement sumField;

    @Step("Ввод суммы в поле Сумма")
    public MainPage enterSum(String sum) {
        sumField.sendKeys(sum);
        return this;
    }

    @FindBy(id = "connection-email")
    private WebElement emailField;

    @Step("Ввод имейла в поле E-mail")
    public MainPage enterEmail(String email) {
        emailField.sendKeys(email);
        return this;
    }
    @Step("Проверка текста в пустых плейсхолдерах")
    public void checkFirstPlaceholders() {
        assert phoneField.getAttribute("placeholder").equals("Номер телефона");
        assert sumField.getAttribute("placeholder").equals("Сумма");
        assert emailField.getAttribute("placeholder").equals("E-mail для отправки чека");
    }

    //Поля Домашний интернет
    @FindBy(xpath = "//ul[@class=\"select__list\"]//p[contains(text(), 'Домашний интернет')]")
    private WebElement dropDownInternet;

    @Step("Клик по дропдаун кнопке 'Домашний интернет'")
    public MainPage clickDropDownInternet() {
        dropDownInternet.click();
        return this;
    }

    @FindBy(id = "internet-phone")
    private WebElement internetPhoneField;

    @FindBy(id = "internet-sum")
    private WebElement internetSumField;

    @FindBy(id = "internet-email")
    private WebElement internetEmailField;

    @Step("Проверка текста в пустых плейсхолдерах")
    public void checkHomeInternetPlaceholders() {
        assert internetPhoneField.getAttribute("placeholder").equals("Номер абонента");
        assert internetSumField.getAttribute("placeholder").equals("Сумма");
        assert internetEmailField.getAttribute("placeholder").equals("E-mail для отправки чека");
    }

    //Поля Рассрочка
    @FindBy(xpath = "//ul[@class=\"select__list\"]//p[contains(text(), 'Рассрочка')]")
    private WebElement dropDownInstalment;

    @Step("Клик по дропдаун кнопке 'Рассрочка'")
    public MainPage clickDropDownInstalment() {
        dropDownInstalment.click();
        return this;
    }

    @FindBy(id = "score-instalment")
    private WebElement scoreInstalmentField;

    @FindBy(id = "instalment-sum")
    private WebElement sumInstalmentField;

    @FindBy(id = "instalment-email")
    private WebElement emailInstalmentField;

    @Step("Проверка текста в пустых плейсхолдерах")
    public void checkInstalmentPlaceholders() {
        assert scoreInstalmentField.getAttribute("placeholder").equals("Номер счета на 44");
        assert sumInstalmentField.getAttribute("placeholder").equals("Сумма");
        assert emailInstalmentField.getAttribute("placeholder").equals("E-mail для отправки чека");
    }

    //Поля задолженность
    @FindBy(xpath = "//ul[@class=\"select__list\"]//p[contains(text(), 'Задолженность')]")
    private WebElement dropDownDebt;

    @Step("Клик по дропдаун кнопке 'Задолженность'")
    public MainPage clickDropDownDebt() {
        dropDownDebt.click();
        return this;
    }

    @FindBy(id = "score-arrears")
    private WebElement scoreArrearsField;

    @FindBy(id = "arrears-sum")
    private WebElement sumArrearsField;

    @FindBy(id = "arrears-email")
    private WebElement emailArrearsField;

    @Step("Проверка текста в пустых плейсхолдерах")
    public void checkDebtPlaceholders() {
        assert scoreArrearsField.getAttribute("placeholder").equals("Номер счета на 2073");
        assert sumArrearsField.getAttribute("placeholder").equals("Сумма");
        assert emailArrearsField.getAttribute("placeholder").equals("E-mail для отправки чека");
    }

    //ссылка для проверки
    @FindBy(xpath = "//a[contains(@href, '/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/')]")
    private WebElement link;

    @Step("Переход по ссылке 'Подробнее о сервисе'")
    public MainPage clickLink() {
        link.click();
        return this;
    }

    //Локаторы в Окне оплаты
    //сумма в появившемся окне
    @FindBy(xpath = "//div[@class=\"pay-description__cost\"]//span[contains(text(), '10.00 BYN')]")
    private WebElement paymentSum;

    //сумма на кнопке Оплатить
    @FindBy(xpath = "//button[contains(text(), '10.00 BYN')]")
    private WebElement buttonPaymentSum;

    @Step("Проверка введенной суммы")
    public void checkPaymentSumInfo() {
        assert paymentSum.isDisplayed();
        assert "10.00 BYN".equals(paymentSum.getText().trim());

        assert buttonPaymentSum.isDisplayed();
        assert "Оплатить 10.00 BYN".equals(buttonPaymentSum.getText());
    }

    //Номер карты
    @FindBy(xpath = "//label[contains(text(), 'Номер карты')]")
    private WebElement cardNumberPlaceholder;

    //Поле Срок действия
    @FindBy(xpath = "//label[contains(text(), 'Срок действия')]")
    private WebElement validityPlaceholder;

    //Поле CVC
    @FindBy(xpath = "//label[contains(text(), 'CVC')]")
    private WebElement cvcPlaceholder;

    //Поле ФИО
    @FindBy(xpath = "//label[contains(text(), 'Имя и фамилия на карте')]")
    private WebElement userDataPlaceholder;

    @Step("Проверка текста в плейсхолдерах окна 'Оплата: Услуги связи'")
    public void checkPlaceholdersOnPayWindow() {
        //проверяю что локаторы верные
        assert cardNumberPlaceholder.isDisplayed();
        assert validityPlaceholder.isDisplayed();
        assert cvcPlaceholder.isDisplayed();
        assert userDataPlaceholder.isDisplayed();

        assert "Номер карты".equals(cardNumberPlaceholder.getText().trim());
        assert "Срок действия".equals(validityPlaceholder.getText().trim());
        assert "CVC".equals(cvcPlaceholder.getText().trim());
        assert "Имя и фамилия на карте".equals(userDataPlaceholder.getText().trim());
    }

    //Логотипы платежных систем в окне оплаты
    @FindBy(xpath = "//div[@class=\"icons-container ng-tns-c2312288139-1\"]")
    private WebElement payPartnerLogos;

    @Step("Проверка логотипов платежных систем окна 'Оплата: Услуги связи'")
    public void checkPayPartnerLogos() {
        assert payPartnerLogos.isDisplayed();
    }
}