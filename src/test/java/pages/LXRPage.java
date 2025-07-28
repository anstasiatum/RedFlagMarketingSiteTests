package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LXRPage {
    private final SelenideElement quantityDropDown = $("#quantity");
    private final SelenideElement addToCartButton = $(".single_add_to_cart_button.button.alt");
    private final SelenideElement priceText = $("form[class='variations_form cart'] bdi:nth-child(1)");
    private final SelenideElement productsAddedConfirmationMessage = $(".woocommerce-message");
    private final SelenideElement productsNotAddedMessage = $(".woocommerce-error");
    private final SelenideElement viewCartButton = $(".button.wc-forward");

    public void selectQuantityOption(String option) {
        quantityDropDown.shouldBe(visible);
        quantityDropDown.selectOption(option);
    }

    public void clickAddToCartButton() {
        addToCartButton.shouldBe(visible);
        addToCartButton.click();
    }

    public void checkPrice(String expectedPrice) {
        priceText.shouldBe(visible);
        priceText.shouldHave(text(expectedPrice));
    }

    public void checkConfirmationMessage(String expectedText) {
        productsAddedConfirmationMessage.shouldBe(visible);
        productsAddedConfirmationMessage.shouldHave(text(expectedText));
    }

    public void checkErrorMessage(String expectedText) {
        productsNotAddedMessage.shouldBe(visible);
        productsNotAddedMessage.shouldHave(text(expectedText));
    }

    public void clickViewCart() {
        viewCartButton.shouldBe(visible);
        viewCartButton.click();
    }
}
