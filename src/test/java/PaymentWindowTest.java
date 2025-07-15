import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(BaseTest.TestWatcherExtension.class)
public class PaymentWindowTest extends BaseTest {
    @Test
    @DisplayName("Тест: Проверка названия указанного блока 'Онлайн пополнение без комисcии'")
    void isDisplayedWindow() {
        new MainPage()
                .isMainWindowDisplayed();
    }
}
