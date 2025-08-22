package tests;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.HowItWorksSteps;
import steps.MainPageSteps;

@Feature("How it works")
public class HowItWorksTest extends TestBase {
    private final MainPageSteps mainPageSteps = new MainPageSteps();
    private final HowItWorksSteps howItWorksPage = new HowItWorksSteps();

    @Test
    @DisplayName("Open How It Works (Español) page")
    void openHowItWorksSpanishPage() {
        mainPageSteps.openMainPageStep();
        mainPageSteps.clickLearnHowItWorksStep();
        howItWorksPage.clickLeftMenuHowItWorksSpanishButtonStep();
        howItWorksPage.checkHeadlineStep("How It Works (Español )");
        howItWorksPage.checkVideoStep();
    }

    @Test
    @DisplayName("Open How LXE Works page")
    void openHowLXEWorksPage() {
        mainPageSteps.openMainPageStep();
        mainPageSteps.clickLearnHowItWorksStep();
        howItWorksPage.clickLeftMenuHowLXEGPSWorksButtonStep();
        howItWorksPage.checkHeadlineStep("How LXE Works ");
        howItWorksPage.checkVideoStep();
    }
}
