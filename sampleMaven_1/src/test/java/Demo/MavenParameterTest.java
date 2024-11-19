package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MavenParameterTest {
	@Test
	public void launch() {
		String value = System.getProperty("url");
		String email = System.getProperty("email");
		String password = System.getProperty("password");
		
		WebDriver driver=new ChromeDriver();
		driver.get(value);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password); 
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop","Home page is not displayed");
		Reporter.log("Home page is displayed", true);
	}
}
