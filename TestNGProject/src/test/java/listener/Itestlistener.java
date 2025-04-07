package listener;
import java.util.List;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.xml.XmlSuite;

public class Itestlistener implements ITestListener, ISuiteListener, IReporter{

	public void onStart(ITestContext context) {
        System.out.println("Test Suite Started: " + context.getName());
    }

    
    public void onTestStart(ITestResult result) {
        System.out.println("Test Started: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Passed: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failed: " + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test Skipped: " + result.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Test Suite Finished: " + context.getName());
    }
    @Override
    public void onStart(ISuite suite) {
        System.out.println("Suite Started: " + suite.getName());
    }

    @Override
    public void onFinish(ISuite suite) {
        System.out.println("Suite Finished: " + suite.getName());
    }
    @Override
    public void generateReport(List<XmlSuite> xmlSuites, List<org.testng.ISuite> suites, String outputDirectory) {
        System.out.println("Generating Custom Report...");
    }
}
