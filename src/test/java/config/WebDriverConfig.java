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
    String selenoidHostName();

    @Key("selenoid.login")
    String selenoidLogin();

    @Key("selenoid.password")
    String selenoidPassword();
}