package steps;

import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import pages.MyAccountPage;

public class AccountSteps {
    private final MyAccountPage accountPage = new MyAccountPage();

    @Step
    @DisplayName("Fill in the Username or email field")
    public void setUsernameOrEmailStep(String usernameOrEmail) {
        accountPage.setUsernameOrEmailField(usernameOrEmail);
    }

    @Step
    @DisplayName("Fill in the Password field")
    public void setPasswordStep(String password) {
        accountPage.setPasswordField(password);
    }

    @Step
    @DisplayName("Click Login")
    public void clickLoginStep() {
        accountPage.clickLogin();
    }

    @Step
    @DisplayName("Check error banner text")
    public void checkErrorBannerTextStep(String expectedErrorText) {
        accountPage.checkErrorBannerText(expectedErrorText);
    }

    @Step
    @DisplayName("Open My Account page")
    public void openMyAccountPage() {
        accountPage.openMyAccountPage();
    }
}
