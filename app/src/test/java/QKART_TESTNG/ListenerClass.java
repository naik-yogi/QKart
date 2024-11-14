package QKART_TESTNG;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener {
    RemoteWebDriver driver;
    public void onStart(ITestContext context) {
        System.out.println("onStart method started");
    }
    public void onFinish(ITestContext context) {
        System.out.println("onFinish method started");
    }
    public void onTestStart(ITestResult result) {
        System.out.println("New Test Started :" +result.getName());
        QKART_Tests.takeScreenshot(QKART_Tests.driver, "Start", result.getMethod().getMethodName());
    }
    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess Method :" +result.getName());
        QKART_Tests.takeScreenshot(QKART_Tests.driver, "Success", result.getMethod().getMethodName());
    }
    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure Method: " +result.getName());
        QKART_Tests.takeScreenshot(QKART_Tests.driver, "Failure", result.getMethod().getMethodName());
    }
    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped Method: " +result.getName());
    }
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("onTestFailedButWithinSuccessPercentage: " +result.getName());
    }
}