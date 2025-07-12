import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class PayWrapperTest extends BaseTest {

    @Test
    void payWrapperTest() {

        try {
            System.out.println("Поиск элемента по XPath");
            ChromeDriverManager.getDriver()
                    .findElement(By.xpath("//h2[contains(text(), 'Онлайн пополнение')]"))
                    .isDisplayed();
            System.out.println("Элемент найден");

            //для проверки работы
            System.out.println("Поиск элемента по XPath");
            ChromeDriverManager.getDriver()
                    .findElement(By.xpath("//h2[contains(text(), 'Онлайн пополнение без комиссии')]"))
                    .isDisplayed();
            System.out.println("Элемент найден");

        } catch (NoSuchElementException e) {
            System.out.println("Элемент не найден: " + e.getMessage());
        }
    }
}
