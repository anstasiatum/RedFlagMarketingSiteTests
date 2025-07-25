package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.Header;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CartPage {
    private final SelenideElement productName = $(".wc-block-components-product-name");
    private final SelenideElement productCost = $(".wc-block-cart-item__prices");
    private final SelenideElement productQuantity = $(".wc-block-components-product-details__value");
    private final SelenideElement totalPrice = $("div[class='wc-block-cart-item__total-price-and-sale-badge-wrapper'] span[class='wc-block-formatted-money-amount wc-block-components-formatted-money-amount wc-block-components-product-price__value']");
    private final SelenideElement removeLXRButton = $(".wc-block-cart-item__remove-link");
    private final SelenideElement cartEmptyMessage = $(".wp-block-heading.has-text-align-center.with-empty-cart-icon.wc-block-cart__empty-cart__title");
    private final SelenideElement cartTable = $(".wc-block-cart-items.wp-block-woocommerce-cart-line-items-block");

    private final Header header = new Header();
    public void openCartPage() {
        open(baseUrl);
        header.clickCart();
    }

    public void clickRemoveItem() {
        removeLXRButton.click();
    }

    public void checkCartIsEmpty(boolean isEmpty) {
        if (isEmpty) {
            cartTable.shouldNotBe(visible);
            cartEmptyMessage.shouldBe(visible);
        } else {
            cartTable.shouldBe(visible);
            cartEmptyMessage.shouldNotBe(visible);
        }
    }

    public void checkProductName(String expectedName) {
        productName.shouldHave(text(expectedName));
    }

    public void checkProductQuantity(String expectedQuantity) {
        productQuantity.shouldHave(text(expectedQuantity));
    }

    public void checkProductCost(String expectedCost) {
        productCost.shouldHave(text(expectedCost));
    }

    public void checkTotalPrice(String expectedTotalPrice) {
        totalPrice.shouldHave(text(expectedTotalPrice));
    }
}
