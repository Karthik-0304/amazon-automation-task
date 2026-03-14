package ExtendReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendReports
{
    public static ExtentReports ExtendReport()
    {
        //ExtentSparkReporter
        String path = System.getProperty("user.dir")+"//reports/index.html";
        ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter(path);
        extentSparkReporter.config().setTheme(Theme.DARK);
        //ExtentReports
        ExtentReports extentReports = new ExtentReports();
        extentReports.setSystemInfo("Karthik S","Automation Tester");
        extentReports.attachReporter(extentSparkReporter);
        return extentReports;
    }
}
