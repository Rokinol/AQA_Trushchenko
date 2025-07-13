import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(BaseTest.TestWatcherExtension.class)
public class PlaceholdersTest extends BaseTest {

    @Test
    void communicationServices() {
        new MainPage()
                .verifyAllPlaceholders();
    }


}
