package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.Header;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;

public class MyAccountPage {
    public final SelenideElement usernameOrEmailField = $("#username");
    public final SelenideElement passwordField = $("#password");
    public final SelenideElement loginButton = $(".woocommerce-button.button.woocommerce-form-login__submit");
    public final SelenideElement errorBanner = $(".woocommerce-error");

    private final Header header = new Header();

    public void openMyAccountPage() {
        open(baseUrl);
        header.clickAccount();
    }

    public void setUsernameOrEmailField(String usernameOrEmail) {
        usernameOrEmailField.setValue(usernameOrEmail);
    }

    public void setPasswordField(String password) {
        passwordField.setValue(password);
    }

    public void clickLogin() {
        loginButton.click();
    }

    public void checkErrorBannerText(String expectedErrorText) {
        errorBanner.shouldBe(visible);
        errorBanner.shouldHave(text(expectedErrorText));
    }
}
