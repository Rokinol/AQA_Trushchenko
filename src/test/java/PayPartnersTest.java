import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(BaseTest.TestWatcherExtension.class)
public class PayPartnersTest extends BaseTest {
    @Test
    void payPartnersImg() {

        new MainPage()
                .areAllPartnersDisplayed();
    }
//Для конкретной картинки/логотипа
    @Test
    void payPartnerVisa() {
        new MainPage()
                .isPartnerDisplayed("Visa");
    }
}
