package tests;

import com.github.javafaker.Faker;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.AccountSteps;

@Feature("Login")
public class LoginTest extends TestBase {
    Faker faker = new Faker();
    AccountSteps accountSteps = new AccountSteps();

    @Test
    @DisplayName("Unsuccessful login: password is missing")
    void unsuccessfulLogin_missingPassword() {
        accountSteps.openMyAccountPage();
        accountSteps.setUsernameOrEmailStep(faker.internet().emailAddress());
        accountSteps.clickLoginStep();
        accountSteps.checkErrorBannerTextStep("Error: The password field is empty.");
    }

    @Test
    @DisplayName("Unsuccessful login: username is missing")
    void unsuccessfulLogin_missingUsername() {
        accountSteps.openMyAccountPage();
        accountSteps.setPasswordStep(faker.internet().password());
        accountSteps.clickLoginStep();
        accountSteps.checkErrorBannerTextStep("Error: Username is required.");
    }

    @Test
    @DisplayName("Unsuccessful login: both username and password are missing")
    void unsuccessfulLogin_missingUsernameAndPassword() {
        accountSteps.openMyAccountPage();
        accountSteps.clickLoginStep();
        accountSteps.checkErrorBannerTextStep("Error: Username is required.");
    }
}

