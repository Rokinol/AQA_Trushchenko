import io.qameta.allure.Step;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;

public class BaseTest {
    private static final String BORDER = "=========================================";

    @BeforeEach
    @Step("Начало работы теста. Включение драйвера. Открываем страницу для проверки")
    protected void setUp() {
        try {
            System.out.println("\n" + BORDER);
            System.out.println(" Начало теста ");
            System.out.println(BORDER + "\n");
            ChromeDriverManager.getDriver();
            ChromeDriverManager.getDriver().get("https://www.mts.by/");
            ChromeDriverManager.getDriver().findElement(By.id("cookie-agree")).click();

        } catch (WebDriverException e) {
            handleError("Ошибка при инициализации теста", e);
            throw e;
        }
    }

    @AfterEach
    @Step("Окончание работы теста. Выключение драйвера")
    protected void tearDown() {
        try {
            System.out.println("\n" + BORDER);
            System.out.println("Окончание теста");
            ChromeDriverManager.quitDriver();
        } catch (WebDriverException e) {
            handleError("Ошибка при завершении теста", e);
        }
    }

    protected void handleError(String message, Throwable e) {
        System.err.println(message + ": " + e.getMessage());
        e.printStackTrace();
    }

    public static class TestWatcherExtension implements TestWatcher {
        @Override
        public void testFailed(ExtensionContext context, Throwable cause) {
            String testName = context.getDisplayName();
            System.err.println("\nXXX Тест УПАЛ: " + testName + " XXX");
            cause.printStackTrace();
            System.out.println(BORDER + "\n");
        }

        @Override
        public void testSuccessful(ExtensionContext context) {
            String testName = context.getDisplayName();
            System.out.println("\n✓✓✓ Тест ПРОЙДЕН: " + testName + " ✓✓✓");
            System.out.println(BORDER + "\n");
        }
    }
}