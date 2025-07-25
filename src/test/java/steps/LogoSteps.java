package steps;

import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import pages.components.Header;

public class LogoSteps {
    private final Header header = new Header();

    @Step
    @DisplayName("Check Red Flag logo")
    public void checkLogo() {
        header.checkLogo();
    }
}
