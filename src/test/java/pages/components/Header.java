package pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Header {
    public final SelenideElement accountButton = $$(".avia-menu-text").findBy(text("Account"));
    public final SelenideElement buyNowButton = $$(".avia-menu-text").findBy(text("Buy now"));
    public final SelenideElement cartButton = $(".cart_dropdown_link");
    public final SelenideElement logo = $("img[alt='Red Flag Cargo Security Systems']");

    public void clickAccount() {
        accountButton.click();
    }

    public void clickBuyNow() {
        buyNowButton.click();
    }

    public void clickCart() {
        cartButton.click();
    }

    public void checkLogo() {
        logo.shouldBe(visible);
    }
}
