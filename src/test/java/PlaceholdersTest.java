import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(BaseTest.TestWatcherExtension.class)
public class PlaceholdersTest extends BaseTest {

    @Test
    @DisplayName("Тест: Проверка надписей в незаполненных полях каждого варианта оплаты услуг")
    void checkAllPlaceholders() {
        MainPage mainPage = new MainPage();
        mainPage.checkFirstPlaceholders();
        mainPage.clickDropDown()
                .clickDropDownInternet()
                .checkHomeInternetPlaceholders();
        mainPage.clickDropDown()
                .clickDropDownInternet()
                .checkHomeInternetPlaceholders();
        mainPage.clickDropDown()
                .clickDropDownInstalment()
                .checkInstalmentPlaceholders();
        mainPage.clickDropDown()
                .clickDropDownDebt()
                .checkDebtPlaceholders();

    }

    /*
    //Отдельные тесты для каждой вкладки
    @Test
    void homeInternet() {
        new MainPage()
                .clickDropDown()
                .clickDropDownInternet()
                .checkHomeInternetPlaceholders();
    }

    @Test
    void instalment() {
        new MainPage()
                .clickDropDown()
                .clickDropDownInstalment()
                .checkInstalmentPlaceholders();
    }

    @Test
    void debt() {
        new MainPage()
                .clickDropDown()
                .clickDropDownDebt()
                .checkDebtPlaceholders();
    }
     */
}
