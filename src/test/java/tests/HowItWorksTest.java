package tests;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.HowItWorksPage;
import pages.MainPage;

@Feature("How it works")
public class HowItWorksTest extends TestBase {
    private final MainPage mainPage = new MainPage();
    private final HowItWorksPage howItWorksPage = new HowItWorksPage();

    @Test
    @DisplayName("Open How It Works (Español) page")
    void openHowItWorksSpanishPage() {
        mainPage.openMainPage();
        mainPage.clickLearnHowItWorksButton();
        howItWorksPage.clickLeftMenuHowItWorksSpanishButton();
        howItWorksPage.checkHeadline("How It Works (Español )");
        howItWorksPage.checkVideo();
    }

    @Test
    @DisplayName("Open How LXE Works page")
    void openHowLXEWorksPage() {
        mainPage.openMainPage();
        mainPage.clickLearnHowItWorksButton();
        howItWorksPage.clickLeftMenuHowLXEGPSWorksButton();
        howItWorksPage.checkHeadline("How LXE Works ");
        howItWorksPage.checkVideo();
    }
}
