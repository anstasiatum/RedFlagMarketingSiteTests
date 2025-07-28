package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "classpath:${env}.properties",
        "system:properties"
})

public interface WebDriverConfig extends Config {

    @Key("browser.name")
    String browser();

    @Key("browser.version")
    String browserVersion();

    @Key("browser.screenResolution")
    String screenResolution();

    @Key("environment")
    String environment();

    @Key("selenoid.hostName")
    @DefaultValue("selenoid.autotests.cloud")
    String selenoidHostName();

    @Key("selenoid.login")
    @DefaultValue("user1")
    String selenoidLogin();

    @Key("selenoid.password")
    @DefaultValue("1234")
    String selenoidPassword();
}