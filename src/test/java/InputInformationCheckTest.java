import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(BaseTest.TestWatcherExtension.class)
public class InputInformationCheckTest extends BaseTest {

    @Test
    @DisplayName
            ("Тест: Проверка корректности  отображения суммы, номера телефона, надписей в незаполненных полях для ввода, наличие иконок платежных систем")
    void inputAndCheckInformation() {
        MainPage mainPage = new MainPage();
        mainPage.enterPhone("297777777");
        mainPage.enterSum("10");
        mainPage.clickContinue();

        try {
            System.out.println("Остановка работы для переключения фрейма");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ChromeDriverManager.getDriver().switchTo().frame(1);
        mainPage.checkPaymentSumInfo();
        mainPage.checkPlaceholdersOnPayWindow();
        mainPage.checkPayPartnerLogos();
    }
}
