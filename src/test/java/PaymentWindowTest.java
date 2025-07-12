import org.junit.jupiter.api.Test;
import org.openqa.selenium.NoSuchElementException;

public class PaymentWindowTest extends BaseTest{
    @Test
    public void isDisplayedWindow() {
        try {
            System.out.println("Окно 'Онлайн пополнение без комиссии' найдено");
            new MainPage()
                    .isMainWindowDisplayed();
        } catch (NoSuchElementException e) {
            System.out.println("Элемент не найден: " + e.getMessage());
        }
    }
}
