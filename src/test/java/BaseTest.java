import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;

public class BaseTest {

    @BeforeEach
    protected void setUp() {
        try {
            System.out.println("Начало работы теста");
            System.out.println("-------------------");
            ChromeDriverManager.getDriver();
            ChromeDriverManager.getDriver().get("https://www.mts.by/");
            ChromeDriverManager.getDriver().findElement(By.id("cookie-agree")).click();

        } catch (WebDriverException e) {
            handleError("Ошибка при инициализации теста", e);
            throw e;
        }
    }

    @AfterEach
    protected void tearDown() {
        try {
            ChromeDriverManager.quitDriver();
            System.out.println("Окончание работы теста");
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
        }

        @Override
        public void testSuccessful(ExtensionContext context) {
            String testName = context.getDisplayName();
            System.out.println("\n✓✓✓ Тест ПРОЙДЕН: " + testName + " ✓✓✓");
        }
    }
}