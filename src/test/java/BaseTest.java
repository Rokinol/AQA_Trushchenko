import io.qameta.allure.Step;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class BaseTest {

    protected WebDriver driver;
    private static final String BORDER = "=========================================";

    @BeforeEach
    @Step("Начало работы теста. Включение драйвера. Открываем страницу для проверки")
    protected void setUp() {

        driver = ChromeDriverManager.getDriver();
        System.out.println("\n" + BORDER);
        System.out.println(" Начало теста ");
        System.out.println(BORDER + "\n");
        driver.get("https://www.mts.by/");
        driver.findElement(By.id("cookie-agree")).click();

    }

    @AfterEach
    @Step("Окончание работы теста. Выключение драйвера")
    protected void tearDown() {

        System.out.println("\n" + BORDER);
        System.out.println("Окончание теста");
        ChromeDriverManager.quitDriver();
    }
}