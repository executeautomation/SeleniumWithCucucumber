$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/Login.feature");
formatter.feature({
  "name": "LoginFeature",
  "description": "  This feature deals with the login functionality of the application",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login with correct username and password",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStep.iNavigateToTheLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "I enter the following for Login",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "admin",
        "adminpassword"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.iEnterTheFollowingForLogin(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "I click login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.iClickLoginButton()"
});
formatter.result({
  "error_message": "org.openqa.selenium.StaleElementReferenceException: stale element reference: element is not attached to the page document\n  (Session info: chrome\u003d76.0.3809.132)\n  (Driver info: chromedriver\u003d2.40.565386 (45a059dc425e08165f9a10324bd1380cc13ca363),platform\u003dMac OS X 10.14.6 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/stale_element_reference.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027karthiks-MBP\u0027, ip: \u0027fe80:0:0:0:1cb1:e0a8:72dd:7cee%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14.6\u0027, java.version: \u002710.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.40.565386 (45a059dc425e08..., userDataDir: /var/folders/qc/v5bq615178s...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 76.0.3809.132, webStorageEnabled: true}\nSession ID: 7a9e8229dc82717f9f0567c3a356468d\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:488)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\n\tat org.openqa.selenium.remote.RemoteWebElement.submit(RemoteWebElement.java:88)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:564)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\n\tat com.sun.proxy.$Proxy23.submit(Unknown Source)\n\tat pages.LoginPage.ClickLogin(LoginPage.java:35)\n\tat steps.LoginStep.iClickLoginButton(LoginStep.java:46)\n\tat ✽.I click login button(file:src/test/java/features/Login.feature:9)\n",
  "status": "failed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "I should see the userform page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.iShouldSeeTheUserformPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.afterstep({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with correct username and password to fail",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStep.iNavigateToTheLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "I enter the following for Login",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "admin",
        "adminpassword"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.iEnterTheFollowingForLogin(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "I click login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.iClickLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "I should see the userform page wrongly",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.iShouldSeeTheUserformPageWrongly()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});