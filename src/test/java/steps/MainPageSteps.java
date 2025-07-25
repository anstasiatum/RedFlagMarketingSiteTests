package steps;

import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import pages.MainPage;

public class MainPageSteps {
    private final MainPage mainPage = new MainPage();

    @Step
    @DisplayName("Open the main page")
    public void openMainPage() {
        mainPage.openMainPage();
    }
}
