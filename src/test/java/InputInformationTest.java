import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;

@ExtendWith(BaseTest.TestWatcherExtension.class)
public class InputInformationTest extends BaseTest {

    @Test
    void inputInformation() {
        new MainPage()
                .enterPhone("297777777")
                .enterSum("10")
                .enterEmail("test@mail.com")
                .clickContinue();

        try {
            System.out.println("Остановка работы для переключения фрейма");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ChromeDriverManager.getDriver().switchTo().frame(1);
        ChromeDriverManager.getDriver().findElement(By.xpath("//button[contains(text(), 'Оплатить')]")).isDisplayed();
    }
}