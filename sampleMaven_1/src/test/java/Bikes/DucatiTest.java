package Bikes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DucatiTest {
	@Test
	public void launched() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://www.zigwheels.com/ducati-bikes");
		Reporter.log("ducati-bikes launched successfully", true);
	}
}
