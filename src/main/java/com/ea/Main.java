//package com.ea;
//
//import com.google.common.collect.ImmutableList;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WindowType;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.devtools.Console;
//import org.openqa.selenium.devtools.DevTools;
//import org.openqa.selenium.devtools.inspector.Inspector;
//import org.openqa.selenium.devtools.network.Network;
//import org.openqa.selenium.devtools.network.model.BlockedReason;
//import org.openqa.selenium.devtools.network.model.ConnectionType;
//import org.openqa.selenium.devtools.network.model.ResourceType;
//import org.openqa.selenium.devtools.target.Target;
//import org.openqa.selenium.devtools.target.model.TargetInfo;
//
//import java.util.Optional;
//import java.util.Set;
//
//import static org.junit.Assert.assertEquals;
//import static org.openqa.selenium.devtools.inspector.Inspector.detached;
//import static org.openqa.selenium.devtools.network.Network.emulateNetworkConditions;
//import static org.openqa.selenium.devtools.network.Network.loadingFailed;
//import static org.openqa.selenium.devtools.target.Target.attachToTarget;
//import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        //Selenium 4
//        System.setProperty("webdriver.chrome.driver", "/Users/karthikkk/ChromeDriver/chromedriver");
//        var chromeDriver = new ChromeDriver();
//
//        var chromeDevTools = chromeDriver.getDevTools();
//        //Session of ChromeDevTool
//        chromeDevTools.createSession();
//
//        //Enable Network offline
//        enableNetworkOffline(chromeDevTools);
//
//        //Enable Network Online
//        enableNetworkOnline(chromeDevTools);
//
//        //Network Interception
//        interceptNetwork(chromeDevTools);
//
//        //Inspect Detached network
//        inspectDetached(chromeDevTools);
//
//        //Console Log
//        String message = "From ExecuteAutomation";
//        consoleLogs(chromeDevTools, message);
//        chromeDriver.executeScript("console.log('" + message + "');");
//
//
//        chromeDriver.get("https://amazon.in");
//
//    }
//
//
//    /**
//     * Enable Network Offline
//     * @param devTools
//     */
//    private static void enableNetworkOffline(DevTools devTools) {
//        devTools.send(Network.enable(Optional.of(100000000), Optional.empty(), Optional.empty()));
//
//        devTools.send(emulateNetworkConditions(true, 100, 1000, 2000,
//                Optional.of(ConnectionType.cellular3g)));
//
//        devTools.addListener(loadingFailed(), loadingFailed -> assertEquals(loadingFailed.getErrorText(), "net::ERR_INTERNET_DISCONNECTED"));
//    }
//
//    /**
//     * Enable Network Online
//     * @param devTools
//     */
//    private static void enableNetworkOnline(DevTools devTools) {
//        devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
//
//        devTools.send(emulateNetworkConditions(false, 100, 5000, 2000,
//                Optional.of(ConnectionType.cellular4g)));
//
//    }
//
//
//    /**
//     * Intercept Network
//     * @param chromeDevTools
//     */
//    private static void interceptNetwork(DevTools chromeDevTools) {
//        chromeDevTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
//
//        //set blocked URL patterns
//        chromeDevTools.send(Network.setBlockedURLs(ImmutableList.of("*.css", "*.jpg")));
//
//        //add event listener to verify that css and png are blocked
//        chromeDevTools.addListener(loadingFailed(), loadingFailed -> {
//
//            if (loadingFailed.getResourceType().equals(ResourceType.Stylesheet)) {
//                assertEquals(loadingFailed.getBlockedReason(), BlockedReason.inspector);
//            }
//
//            else if (loadingFailed.getResourceType().equals(ResourceType.Image)) {
//                assertEquals(loadingFailed.getBlockedReason(), BlockedReason.mixedContent);
//            }
//
//        });
//    }
//
//    /**
//     * Inspect Detached Network
//     * @param devTools
//     */
//    private static void inspectDetached(DevTools devTools) {
//        devTools.addListener(detached(), Assert::assertNotNull);
//        devTools.send(Inspector.enable());
//        Set<TargetInfo> targetInfos = devTools.send(Target.getTargets());
//        targetInfos.forEach(
//                targetInfo -> {
//                    var sessionId = devTools.send(attachToTarget(targetInfo.getTargetId(), Optional.of(false)));
//                    devTools.send(
//                            Target.sendMessageToTarget(
//                                    "{\"method\":\"Page.crash\"}",
//                                    Optional.of(sessionId),
//                                    Optional.of(targetInfo.getTargetId())));
//                });
//        devTools.send(Inspector.disable());
//    }
//
//
//    /**
//     * Get Console Logs
//     * @param chromeDevTools
//     * @param message
//     */
//    private static void consoleLogs(DevTools chromeDevTools, String message) {
//
//        chromeDevTools.send(Console.enable());
//
//        //add listener to verify the console message
//        chromeDevTools.addListener(Console.messageAdded(), consoleMessageFromDevTools ->
//                assertEquals(true, consoleMessageFromDevTools.getText().equals(message)));
//
//    }
//
//    /**
//     * Selenium Misc features
//     * @param chromeDriver
//     */
//    private static void Selenium4MiscFetures(ChromeDriver chromeDriver){
//
//        // New Tab
//        var newTab = chromeDriver.switchTo().newWindow(WindowType.TAB);
//        newTab.get("http://executeautomation.com/demosite/Login.html");
//
//        //login
//        newTab.findElement(By.name("UserName")).sendKeys("admin");
//        newTab.findElement(By.name("Password")).sendKeys("admin");
//        newTab.findElement(By.name("Login")).submit();
//
//        var checkbox = chromeDriver.findElement(withTagName("input").below(By.name("Male")).toLeftOf(By.name("Hindi")));
//        checkbox.click();
//        System.out.println(checkbox.getAttribute("name"));
//
//
//        var txtIntial = chromeDriver.findElement(withTagName("input")
//                .below(By.id("TitleId"))
//                .above(By.id("FirstName")));
//
//        txtIntial.sendKeys("KK");
//
//        //list of elements
//        var lstElements = chromeDriver.findElements(withTagName("input")
//                .below(By.xpath("//h2[text()=' User Form ']"))
//                .above(By.name("Save")));
//
//        var elements = lstElements
//                .stream()
//                .map(x -> x.getAttribute("input"));
//
//        //should be 7
//        System.out.println(elements.count());
//    }
//}
