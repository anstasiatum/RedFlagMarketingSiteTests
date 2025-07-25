package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.Header;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ShopPage {
    private final Header header = new Header();

    public final SelenideElement selectOptionLXR = $("a[aria-label='Select options for “LXR”']");

    public void openShopPage() {
        open(baseUrl);
        header.clickBuyNow();
    }

    public void clickSelectOptionLXR() {
        selectOptionLXR.click();
    }
}
