import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class LinkTextTest extends BaseTest {
    @Test
    @DisplayName("Тест: Проверка работы ссылки 'Подробнее о сервисе'")
    void linkText() {
        new MainPage()
                .clickLink();

        ChromeDriverManager.getDriver()
                .findElement(By.xpath("//h3[contains(text(), 'Оплата банковской картой')]"))
                .isDisplayed();
    }
}
