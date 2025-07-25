package steps;

import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import pages.CartPage;

public class CartSteps {
    private final CartPage cartPage = new CartPage();

    @Step
    @DisplayName("Open cart page")
    public void openCartPageStep() {
        cartPage.openCartPage();
    }

    @Step
    @DisplayName("Check the product information in the table")
    public void checkProductInformationStep(String expectedProductName, String expectedProductQuantity, String expectedProductCost, String expectedTotalPrice) {
        cartPage.checkProductName(expectedProductName);
        cartPage.checkProductQuantity(expectedProductQuantity);
        cartPage.checkProductCost(expectedProductCost);
        cartPage.checkTotalPrice(expectedTotalPrice);
    }

    @Step
    @DisplayName("Remove Product From Cart")
    public void removeItemFromCartStep() {
        cartPage.clickRemoveItem();
    }

    @Step
    @DisplayName("Check if the cart is empty")
    public void checkIfCartIsEmptyStep(boolean isEmpty) {
        cartPage.checkCartIsEmpty(isEmpty);
    }
}
