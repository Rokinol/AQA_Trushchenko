import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.List;

public class PayPartnersTest extends BaseTest {

    @Test
    void payPartnersTest() {

        String[] altTexts = {
                "Visa",
                "Verified By Visa",
                "MasterCard",
                "MasterCard Secure Code",
                "Белкарт",
                //"null" для проверки работы assert
        };

        for (String alt : altTexts) {
            List<WebElement> logos = driver.findElements(
                    By.xpath("//*[@id=\"pay-section\"]//img[@alt=\"" + alt + "\"]"));
            assertFalse(logos.isEmpty(), "Логотип '" + alt + "' не найден");
        }
    }
}