import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class PayPartnersTest extends BaseTest {

    @Test
    void payPartnersTest() {

        String[] altTexts = {
                "Visa",
                "Verified By Visa",
                "MasterCard",
                "MasterCard Secure Code",
                "Белкарт",
                "null элемент" //для проверки работы try-catch
        };

        try {
            System.out.println("Поиск элементов по XPath");
            for (String alt : altTexts) {
                ChromeDriverManager.getDriver()
                        .findElement(By.xpath("//*[@id=\"pay-section\"]//img[@alt=\"" + alt + "\"]"))
                        .isDisplayed();
                System.out.println("Элемент найден");
            }
        } catch (NoSuchElementException e) {
            System.out.println("Элемент не найден " + e.getMessage());

        }
    }
}