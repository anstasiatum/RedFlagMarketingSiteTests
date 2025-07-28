package steps;

import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import pages.MainPage;

public class MainPageSteps {
    private final MainPage mainPage = new MainPage();

    @Step
    @DisplayName("Open the main page")
    public void openMainPageStep() {
        mainPage.openMainPage();
    }

    @Step
    @DisplayName("Click Learn how it works button")
    public void clickLearnHowItWorksStep() {
        mainPage.clickLearnHowItWorksButton();
    }
}
