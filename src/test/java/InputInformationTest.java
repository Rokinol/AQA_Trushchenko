import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class InputInformationTest extends BaseTest {

    @Test
    void inputInformationTest() {

        try {
            System.out.println("Ввод информации");
            WebElement phoneInput = ChromeDriverManager.getDriver()
                    .findElement(By.xpath("//input[@id=\"connection-phone\"]"));
            phoneInput.click();
            phoneInput.clear();
            phoneInput.sendKeys("297777777");

            WebElement sumInput = ChromeDriverManager.getDriver()
                    .findElement(By.xpath("//input[@id=\"connection-sum\"]"));
            sumInput.click();
            sumInput.clear();
            sumInput.sendKeys("10");

            ChromeDriverManager.getDriver()
                    .findElement(By.xpath("//*[@id=\"pay-connection\"]/button")).click();
            System.out.println("Информация введена и нажата кнопка 'Продолжить'");
        } catch (NoSuchElementException e) {
            System.out.println("Введена неверная информация или не нажата кнопка 'Продолжить'");
        }

        //без паузы программы у меня не переключался фрейм
        try {
            System.out.println("Остановка работы для переключения фрейма");
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Переключение фрейма");
            ChromeDriverManager.getDriver().switchTo().frame(1);
            ChromeDriverManager.getDriver().findElement(By.xpath("//button[contains(text(), 'Оплатить')]")).isDisplayed();
            System.out.println("Элемент найден");
        } catch (NoSuchElementException e) {
            System.out.println("Элемен не найден");
        }
    }
}