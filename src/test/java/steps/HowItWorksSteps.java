package steps;

import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import pages.HowItWorksPage;

public class HowItWorksSteps {
    private final HowItWorksPage howItWorksPage = new HowItWorksPage();

    @Step
    @DisplayName("Click How it works Spanish in the left menu")
    public void clickLeftMenuHowItWorksSpanishButtonStep() {
        howItWorksPage.clickLeftMenuHowItWorksSpanishButton();
    }

    @Step
    @DisplayName("Click How LXE works Spanish in the left menu")
    public void clickLeftMenuHowLXEGPSWorksButtonStep() {
        howItWorksPage.clickLeftMenuHowLXEGPSWorksButton();
    }

    @Step
    @DisplayName("Check headline")
    public void checkHeadlineStep(String expectedHeadline) {
        howItWorksPage.checkHeadline(expectedHeadline);
    }

    @Step
    @DisplayName("Check headline")
    public void checkVideoStep() {
        howItWorksPage.checkVideo();
    }
}
