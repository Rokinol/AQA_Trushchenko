import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class PayWrapperTest extends BaseTest {

    @Test
    void payWrapperTest() {

            driver.findElement(By.xpath("//h2[contains(text(), 'Онлайн пополнение')]")).isDisplayed();
    }
}
