import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PaymentWindowTest extends BaseTest {
    @Test
    @DisplayName("Тест: Проверка названия указанного блока 'Онлайн пополнение без комиссии'")
    void isDisplayedWindow() {
        new MainPage()
                .isMainWindowDisplayed();
    }
}
