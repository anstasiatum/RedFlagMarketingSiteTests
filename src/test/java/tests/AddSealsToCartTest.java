package tests;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.CartSteps;
import steps.LXRPageSteps;
import steps.ShopSteps;

@Feature("Add products to cart")
public class AddSealsToCartTest extends TestBase {
    private final ShopSteps shopSteps = new ShopSteps();
    private final LXRPageSteps lxrPageSteps = new LXRPageSteps();
    private final CartSteps cartSteps = new CartSteps();

    @AfterEach
    void removeSealsFromCart() {
        cartSteps.openCartPageStep();
        cartSteps.removeItemFromCartStep();
    }

    @Test
    @DisplayName("Add 200 LXR seals to cart")
    void add200LXRSealsToCart() {
        String quantity = "200";
        String expectedPrice = "$1,100.00";

        shopSteps.openShopPageStep();
        shopSteps.clickSelectOptionForLXRStep();
        lxrPageSteps.addSealsToCartAndCheckMessageStep(quantity, expectedPrice);
        lxrPageSteps.checkConfirmationMessageStep("“LXR” has been added to your cart.");
        lxrPageSteps.clickViewCartStep();
        cartSteps.checkIfCartIsEmptyStep(false);
        cartSteps.checkProductInformationStep("LXR", quantity, expectedPrice, expectedPrice);
    }
}
