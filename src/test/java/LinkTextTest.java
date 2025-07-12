import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class LinkTextTest extends BaseTest {

    @Test
    void linkTextTest() {

        try {
            System.out.println("Проверка работы ссылки 'Подробнее о сервисе'");
            WebElement link = ChromeDriverManager.getDriver()
                    .findElement(
                    By.xpath("//a[contains(@href, '/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/')]")
            );
            link.click();

            ChromeDriverManager.getDriver()
                    .findElement(By.xpath("//h3[contains(text(), 'Оплата банковской картой')]"))
                    .isDisplayed();
            System.out.println("Элемент 'Опалта банковской картой' при переходе по ссылке найден ");
        } catch (NoSuchElementException e) {
            System.out.println("Страница не найдена");
        }
    }
}
