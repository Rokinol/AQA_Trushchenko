import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(BaseTest.TestWatcherExtension.class)
public class PayPartnersTest extends BaseTest {
    @Test
    @DisplayName("Тест: Проверка наличия логотипов платежных систем")
    void payPartnersImg() {

        new MainPage().areAllPaymentLogosDisplayed();
    }
}
