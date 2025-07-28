package steps;

import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import pages.HowItWorksPage;

public class HowItWorksPageSteps {
    private final HowItWorksPage howItWorksPage = new HowItWorksPage();

    @Step
    @DisplayName("Click How it Works(Spanish) in the left menu")
    public void clickLeftMenuHowItWorksSpanishButtonStep() {
        howItWorksPage.clickLeftMenuHowItWorksSpanishButton();
    }

    @Step
    @DisplayName("Click How LXE GPS Works in the left menu")
    public void clickLeftMenuHowLXEGPSWorksButtonStep() {
        howItWorksPage.clickLeftMenuHowLXEGPSWorksButton();
    }

    @Step
    @DisplayName("Check headline")
    public void checkHeadlineStep(String expectedHeadline) {
        howItWorksPage.checkHeadline(expectedHeadline);
    }

    @Step
    @DisplayName("Check video")
    public void checkVideoStep() {
        howItWorksPage.checkVideo();
    }
}
