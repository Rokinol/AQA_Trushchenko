import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PayPartnersTest extends BaseTest {
    @Test
    @DisplayName("Тест: Проверка наличия логотипов платежных систем")
    void payPartnersImg() {

        new MainPage().areAllPaymentLogosDisplayed();
    }
}
