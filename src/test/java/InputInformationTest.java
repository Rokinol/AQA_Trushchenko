import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InputInformationTest extends BaseTest {

    @Test
    void inputInformationTest() {
        WebElement phoneInput = driver.findElement(By.xpath("//input[@id=\"connection-phone\"]"));
        phoneInput.click();
        phoneInput.clear();
        phoneInput.sendKeys("297777777");

        WebElement sumInput = driver.findElement(By.xpath("//input[@id=\"connection-sum\"]"));
        sumInput.click();
        sumInput.clear();
        sumInput.sendKeys("10");

        driver.findElement(By.xpath("//*[@id=\"pay-connection\"]/button")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));

        driver.findElement(By.xpath("//button[contains(text(), 'Оплатить')]")).isDisplayed();
    }
}