import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;

@ExtendWith(BaseTest.TestWatcherExtension.class)
public class LinkTextTest extends BaseTest {
    @Test
    void linkText() {
        new MainPage()
                .clickLink();

        ChromeDriverManager.getDriver()
                .findElement(By.xpath("//h3[contains(text(), 'Оплата банковской картой')]"))
                .isDisplayed();
    }
}
