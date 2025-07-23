import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.junit.jupiter.api.Assertions.*;

public class LinkTextTest extends BaseTest {

    @Test
    void linkTextTest() {

        WebElement link = driver.findElement(
                By.xpath("//a[contains(@href, '/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/')]")
        );
        link.click();

        WebElement text = driver.findElement(By.xpath("//h3[contains(text(), 'Оплата банковской картой')]"));
        assertAll(
                () -> assertTrue(text.isDisplayed()," Заголовок не отображается"),
                () -> assertEquals("Оплата банковской картой", text.getText(), "Текст не совпадает")
        );
    }
}
