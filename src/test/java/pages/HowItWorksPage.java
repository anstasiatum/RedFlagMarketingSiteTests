package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class HowItWorksPage {
    private final SelenideElement leftMenuHowItWorksSpanishButton = $(".page_item.page-item-4507");
    private final SelenideElement leftMenuHowLXEGPSWorksButton = $(".page_item.page-item-4539");
    private final SelenideElement headline = $(".av-special-heading-tag");
    private final SelenideElement video = $(".mejs-overlay.mejs-layer.mejs-overlay-play");

    public void clickLeftMenuHowItWorksSpanishButton() {
        leftMenuHowItWorksSpanishButton.click();
    }

    public void clickLeftMenuHowLXEGPSWorksButton() {
        leftMenuHowLXEGPSWorksButton.click();
    }

    public void checkHeadline(String expectedHeadline) {
        headline.shouldHave(text(expectedHeadline));
    }

    public void checkVideo() {
        video.shouldBe(visible);
    }
}
