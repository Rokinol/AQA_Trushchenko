import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    protected WebDriver driver;

    @BeforeEach
    void setUp() {

        driver = ChromeDriverManager.getDriver();
        System.out.println("Начало работы теста");
        System.out.println("-------------------");
        driver.get("https://www.mts.by/");
        driver.findElement(By.id("cookie-agree")).click();
    }

    @AfterEach
    void tearDown() {
       ChromeDriverManager.quitDriver();
    }
}