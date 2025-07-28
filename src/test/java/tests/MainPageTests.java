package tests;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.components.Header;
import steps.MainPageSteps;

@Feature("Main page")
public class MainPageTests extends TestBase {
    MainPageSteps mainPageSteps = new MainPageSteps();
    Header header = new Header();

    @Test
    @DisplayName("Open the main page and check the logo")
    void checkLogoOnMainPage() {
        mainPageSteps.openMainPageStep();
        header.checkLogo();
    }
}
