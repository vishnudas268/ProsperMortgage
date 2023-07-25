package reusefiles;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class components {
	WebDriver driver;

	public components(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Next']")
	WebElement next_click;
	
	// SwitchToWindow method
	public void switchToWindow() 
	{
			String parent = driver.getWindowHandle();
			Set<String> s1 = driver.getWindowHandles();
			Iterator<String> I1 = s1.iterator();
			//String title = null;
			while (I1.hasNext()) {
				String child_window = I1.next();
				if (!parent.equals(child_window)) {
					driver.switchTo().window(child_window);
					//title = driver.switchTo().window(child_window).getTitle();
					//driver.close();
	}
			}
			//driver.switchTo().window(parent);
			//return title;
		}
	
	public void waitforappear(By by)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	
	public void next()
	{
		next_click.click();
	}

}
