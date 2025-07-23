import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PaymentWindow extends BasePage {

    //Локаторы в Окне оплаты
    @FindBy(xpath = "//div[@class=\"app-wrapper__content\"]")
    private WebElement payWindow;

    //сумма в появившемся окне
    @FindBy(xpath = "//div[@class=\"pay-description__cost\"]//span[contains(text(), '10.00 BYN')]")
    private WebElement paymentSum;

    //сумма на кнопке Оплатить
    @FindBy(xpath = "//button[contains(text(), '10.00 BYN')]")
    private WebElement buttonPaymentSum;

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

    //Логотипы платежных систем в окне оплаты
    @FindBy(xpath = "//div[@class=\"icons-container ng-tns-c2312288139-1\"]")
    private WebElement payPartnerLogos;

    @Step("Проверка наличия окна Оплаты")
    public void checkPayWindow() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement visiblePayWindow = wait.until(ExpectedConditions.visibilityOf(payWindow));
                assertTrue(visiblePayWindow.isDisplayed(),"Кнопка оплаты не отображается");
    }

    @Step("Проверка введенной суммы")
    public void checkPaymentSumInfo() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement visiblePaymentSum = wait.until((ExpectedConditions.visibilityOf(paymentSum)));
        WebElement visibleButtonPaymentSum = wait.until((ExpectedConditions.visibilityOf(buttonPaymentSum)));
        assertAll(
                () -> assertTrue(visiblePaymentSum.isDisplayed(), "Поле суммы не отображается"),
                () -> assertEquals("10.00 BYN", visiblePaymentSum.getText().trim(),
                        "Неверная сумма платежа"),
                () -> assertTrue(visibleButtonPaymentSum.isDisplayed(),
                        "Кнопка оплаты не отображается"),
                () -> assertEquals("Оплатить 10.00 BYN", visibleButtonPaymentSum.getText().trim(),
                        "Неверный текст на кнопке оплаты")
        );
    }

    @Step("Проверка текста в плейсхолдерах окна 'Оплата: Услуги связи'")
    public void checkPlaceholdersOnPayWindow() {
        assertAll(
                () -> assertTrue(cardNumberPlaceholder.isDisplayed(),
                        "Поле номера карты не отображается"),
                () -> assertEquals("Номер карты", cardNumberPlaceholder.getText().trim(),
                        "Неверный текст для номера карты"),

                () -> assertTrue(validityPlaceholder.isDisplayed(),
                        "Поле срока действия не отображается"),
                () -> assertEquals("Срок действия", validityPlaceholder.getText().trim(),
                        "Неверный текст для срока действия"),

                () -> assertTrue(cvcPlaceholder.isDisplayed(),
                        "Поле CVC не отображается"),
                () -> assertEquals("CVC", cvcPlaceholder.getText().trim(),
                        "Неверный текст для CVC"),

                () -> assertTrue(userDataPlaceholder.isDisplayed(),
                        "Поле имени не отображается"),
                () -> assertEquals("Имя и фамилия на карте", userDataPlaceholder.getText().trim(),
                        "Неверный текст для имени на карте")
        );
    }

    @Step("Проверка логотипов платежных систем окна 'Оплата: Услуги связи'")
    public void checkPayPartnerLogos() {
        assertTrue(payPartnerLogos.isDisplayed(), "Логотипы партнеров оплаты не отображаются на странице");
    }
}