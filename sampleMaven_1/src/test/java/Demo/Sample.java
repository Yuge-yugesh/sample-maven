package Demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample {
	@Test
	public void demo() {
		Reporter.log("SampleTest Class Executed", true);
	}
}
