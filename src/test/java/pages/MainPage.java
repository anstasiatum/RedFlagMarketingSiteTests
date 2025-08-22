package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.Header;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {
    private final SelenideElement learnHowItWorksButton = $(".avia-slideshow-button.avia-button.avia-color-light");
    private final Header header = new Header();

    public void openMainPage() {
        open(baseUrl);
    }

    public void clickLearnHowItWorksButton() {
        learnHowItWorksButton.shouldBe(visible);
        learnHowItWorksButton.click();
    }

    public void checkLogo() {
        header.checkLogo();
    }
}
