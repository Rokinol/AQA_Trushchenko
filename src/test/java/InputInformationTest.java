import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InputInformationTest extends BaseTest {

    @Test
    @DisplayName("Тест: Заполнение полей и проверка работы кнопки 'Продолжить'")
    void inputInformation() {
        new MainPage()
                .enterPhone("297777777")
                .enterSum("10")
                .enterEmail("test@mail.com")
                .clickContinue();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));

        driver.findElement(By.xpath("//button[contains(text(), 'Оплатить')]")).isDisplayed();
    }
}