<p align="center">
  <a href="https://redflagseals.com/" target="_blank">
    <img src="readmemedia/redflaglogo.webp" width="200" alt="Red Flag Logo">
  </a>
</p>

# Red Flag Marketing Site web site automated tests

## 📜 Summary
- [Stack](#-stack)
- [Automated test cases](#-automated-test-cases)
- [Build](#-build)
- [Jenkins](#-jenkins)
- [Allure report](#-allure-report)
- [Notifications](#-notifications)

  
## 💻 Stack

<div align="center">
  <table>
    <tr>
      <!-- First row -->
      <td align="center" width="110">
        <a href="https://www.java.com" target="_blank">
          <img src="readmemedia/java-original-wordmark.svg" width="48" height="48" alt="Java" />
        </a>
        <br>Java 21
      </td>
      <td align="center" width="110">
        <a href="https://junit.org/junit5/" target="_blank">
          <img src="readmemedia/junit-original.svg" width="48" height="48" alt="JUnit 5" />
        </a>
        <br>JUnit 5
      </td>
      <td align="center" width="110">
        <a href="https://gradle.org/" target="_blank">
          <img src="readmemedia/gradle-original.svg" width="48" height="48" alt="Gradle" />
        </a>
        <br>Gradle
      </td>
      <td align="center" width="110">
        <a href="https://selenide.org/" target="_blank">
          <img src="readmemedia\Selenide.svg" width="48" height="48" alt="Selenide" />
        </a>
        <br>Selenide
      </td>
    </tr>
    <tr>
      <!-- Second row -->
      </td>
      <td align="center" width="110">
        <a href="https://docs.qameta.io/allure/" target="_blank">
          <img src="readmemedia/Allure.svg" width="48" height="48" alt="Allure" />
        </a>
        <br>Allure
      </td>
      <td align="center" width="110">
        <a href="https://www.jenkins.io/" target="_blank">
          <img src="readmemedia/jenkins-original.svg" width="48" height="48" alt="Jenkins" />
        </a>
        <br>Jenkins
      <td align="center" width="110">
        <a href="https://web.telegram.org/" target="_blank">
          <img src="readmemedia/Telegram.svg" width="48" height="48" alt="Telegram" />
        </a>
        <br>Telegram
      </td>
    </tr>
  </table>
</div>

- Developed using **Java 21**, **JUnit**, and **Selenide**
- Built via **Gradle**
- Run using **Selenoid** containers
- Integrated build with **Jenkins**
- Sending notifications to **Telegram**

## ✅ Automated test cases
1. Checking the Red Flag logo
2. Unsuccessful Login
3. Verifying "How it works" page

## ▶️ Build

The build is parametrized. The tests can be run in different browsers, browser versions, resolutions as well as in different environments. These parameters can be set either in the `.properties` files, or via the VM options as shown in the script below. 

```bash
stmms_test
-Denv=${environment}
-Dbrowser.name=${Browser}
-Dbrowser.version=${BrowserVersion}
-Dbrowser.screenResolution=${Resolution}
```

## <img src="readmemedia/jenkins-original.svg" width="48" height="48" alt="Jenkins" /> [Jenkins](https://jenkins.autotests.cloud/job/RedFlagMarketingSiteTests/)

The project is integrated with Jenkins, where the parametrized tests can be run remotely within the QA GURU environment.

<img src="readmemedia/RFMSJenkins.png" alt="Jenkins Main Page">


## <img src="readmemedia/Allure.svg" width="48" height="48" alt="Allure" /> [Allure report](https://jenkins.autotests.cloud/job/KupsillaWebSite/6/allure/)

### Allure report page
<img src="readmemedia/AllureReportExample.png" alt="Allure Report">

### Each test in the report contains:
- User-friedly readable test steps
- Screenshot of the last step
- Page Source
- Video of the test run
  
<img src="readmemedia/TestRunVideoExample.gif" alt="Video of the test run">

## <img src="readmemedia/Telegram.svg" width="48" height="48" alt="Telegram" /> Notifications

After each run a notification is sent automatically to **Telegram** with a brief summary of the test results including the number of passed and failed tests, run duration, and report link. This functianlity is implemented using the [allure-notifications](https://github.com/qa-guru/allure-notifications) library which also allows sending notifications to Slack, Discord, and other messengers.

<img src="readmemedia/TgNotificationExample.png" alt="Telegram Notification">
