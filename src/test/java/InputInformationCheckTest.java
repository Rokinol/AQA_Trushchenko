import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InputInformationCheckTest extends BaseTest {

    @Test
    @DisplayName
            ("Тест: Проверка корректности  отображения суммы, номера телефона, надписей в незаполненных полях для ввода, наличие иконок платежных систем")
    void inputAndCheckInformation() {
        MainPage mainPage = new MainPage();
        mainPage.enterPhone("297777777");
        mainPage.enterSum("10");
        mainPage.clickContinue();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));

        mainPage.checkPaymentSumInfo();
        mainPage.checkPlaceholdersOnPayWindow();
        mainPage.checkPayPartnerLogos();
    }
}
