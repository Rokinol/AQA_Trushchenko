import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.*;

public class PayWrapperTest extends BaseTest {

    @Test
    void payWrapperTest() {

        WebElement element = driver.findElement(By.xpath("//h2[contains(text(), 'Онлайн пополнение')]"));
        assertAll(
                () -> assertTrue(element.isDisplayed(), "Элемент не отображается на странице"),
                () -> assertEquals("Онлайн пополнение\nбез комиссии", element.getText().trim(), "Текст элемента не совпадает")
        );
    }
}
