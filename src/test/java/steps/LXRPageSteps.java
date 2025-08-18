package steps;

import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import pages.LXRPage;

public class LXRPageSteps {
    private final LXRPage lxrPage = new LXRPage();

    @Step
    @DisplayName("Add seals to cart and check the operation result message")
    public void addSealsToCartAndCheckMessageStep(String quantity, String expectedPrice) {
        lxrPage.selectQuantityOption(quantity);
        lxrPage.checkPrice(expectedPrice);
        lxrPage.clickAddToCartButton();

    }

    @Step
    @DisplayName("Check confirmation message")
    public void checkConfirmationMessageStep(String expectedMessage) {
        lxrPage.checkConfirmationMessage(expectedMessage);
    }

    @Step
    @DisplayName("Click View cart")
    public void clickViewCartStep() {
        lxrPage.clickViewCart();
    }
}
