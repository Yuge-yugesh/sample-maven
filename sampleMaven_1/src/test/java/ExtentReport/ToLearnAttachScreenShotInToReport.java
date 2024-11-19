package ExtentReport;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ToLearnAttachScreenShotInToReport {
	@Test
	public void screenShot() {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		TakesScreenshot ts=(TakesScreenshot) driver;
		String photo = ts.getScreenshotAs(OutputType.BASE64);
		
		
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		ExtentSparkReporter spark=new ExtentSparkReporter("./HTMLReport/Screenshot"+timestamp+".html");
		ExtentReports extreport=new ExtentReports();
		extreport.attachReporter(spark);
		ExtentTest test = extreport.createTest("screenShot");
		test.log(Status.PASS, "Adding ScreenShot Report");
		test.addScreenCaptureFromBase64String(photo);
		extreport.flush();
		
	}
}
