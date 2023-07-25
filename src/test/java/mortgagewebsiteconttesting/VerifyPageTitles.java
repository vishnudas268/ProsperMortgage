package mortgagewebsiteconttesting;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class VerifyPageTitles {

	@Test
	public void verifyPageTitle() throws MalformedURLException {
		
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setCapability(CapabilityType.BROWSER_NAME,"MicrosoftEdge");
		//caps.setCapability(null, false);
		
		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.183:4444"),caps);
		driver.manage().window().maximize();
		driver.get("http://65.0.31.40/");
		driver.close();
	}
}
