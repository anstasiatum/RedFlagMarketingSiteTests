package steps;

import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import pages.ShopPage;

public class ShopSteps {
    private final ShopPage shopPage = new ShopPage();

    @Step
    @DisplayName("Open Shop page")
    public void openShopPage() {
        shopPage.openShopPage();
    }

    @Step
    @DisplayName("Click Select option for LXR")
    public void clickSelectOptionForLXR() {
        shopPage.clickSelectOptionLXR();
    }
}
