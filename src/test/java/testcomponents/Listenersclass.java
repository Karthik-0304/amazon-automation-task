package testcomponents;

import ExtendReports.ExtendReports;
import baseClass.BaseClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class Listenersclass extends BaseClass implements ITestListener
{
    ExtentReports reports = ExtendReports.ExtendReport();
    ThreadLocal<ExtentTest> thread = new ThreadLocal<>();

    @Override
    public void onTestStart(ITestResult result)
    {
        ExtentTest test = reports.createTest(result.getMethod().getMethodName());
        thread.set(test);
        // not implemented
    }

    @Override
    public void onTestFailure(ITestResult result)
    {
        //
        thread.get().log(Status.FAIL,result.getMethod().getMethodName());
        try {
            String ssPath = takeScreenShoot(result.getMethod().getMethodName());
            thread.get().addScreenCaptureFromPath(ssPath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onTestSuccess(ITestResult result)
    {
        //
        thread.get().log(Status.PASS,result.getMethod().getMethodName());

    }

    @Override
    public void onFinish(ITestContext context) {
        reports.flush();
        //
    }
}