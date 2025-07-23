import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InputInformationTest extends BaseTest {

    @Test
    @DisplayName("Тест: Заполнение полей и проверка работы кнопки 'Продолжить'")
    void inputInformation() {
        MainPage mainPage = new MainPage();
        mainPage.enterPhone("297777777");
        mainPage.enterSum("10");
        mainPage.enterEmail("test@mail.com");
        mainPage.clickContinue();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));

        PaymentWindow paymentWindow = new PaymentWindow();
        paymentWindow.checkPayWindow();
    }
}