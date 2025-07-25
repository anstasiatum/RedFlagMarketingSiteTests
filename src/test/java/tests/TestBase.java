package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

import static java.lang.String.format;

public class TestBase {
    @BeforeAll
    static void setupConfig() {
        String selenoidHostName = System.getProperty("selenoidHostName", "selenoid.autotests.cloud");
        String selenoidLogin = System.getProperty("selenoidLogin", "user1");
        String selenoidPassword = System.getProperty("selenoidPassword", "1234");
        String environmentLink = System.getProperty("environmentLink", "https://www.redflagseals.com/");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true
        ));

        Configuration.browserSize = System.getProperty("screenResolution", "1920x1080");
        //Configuration.remote = format("https://%s:%s@%s/wd/hub", selenoidLogin, selenoidPassword, selenoidHostName);
        Configuration.browser = System.getProperty("browser", "chrome");
        //Configuration.browserVersion = System.getProperty("browserVersion", "128.0");
        Configuration.browserCapabilities = capabilities;
        Configuration.baseUrl = environmentLink;
        Configuration.pageLoadStrategy = "eager";
    }

    @BeforeEach
    void listenerConfiguration() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
        Selenide.closeWebDriver();
    }
}

