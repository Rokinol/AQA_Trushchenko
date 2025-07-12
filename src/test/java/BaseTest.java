import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class BaseTest {

    @BeforeEach
    void setUp() {
        try {
            System.out.println("Начало работы теста");
            System.out.println("-------------------");
            ChromeDriverManager.getDriver();
            ChromeDriverManager.getDriver().get("https://www.mts.by/");
            ChromeDriverManager.getDriver().findElement(By.id("cookie-agree")).click();
        } catch (NoSuchElementException e) {
            System.out.println("Ошибка при поиске элементов" + e.getMessage());
        }
    }

    @AfterEach
    void tearDown() {
        ChromeDriverManager.quitDriver();
    }
}