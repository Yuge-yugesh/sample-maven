package ExtentReport;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ToLearnExtentReports {
	@Test
	public void report() {
		
		ExtentSparkReporter spark=new ExtentSparkReporter("./HTMLReport/extentReport.html");
		
		ExtentReports extReport=new ExtentReports();
		
		extReport.attachReporter(spark);
		
		ExtentTest test = extReport.createTest("report");
		
		test.log(Status.PASS,"Log Message entered into extent Report");
		
		extReport.flush();
	}
}
