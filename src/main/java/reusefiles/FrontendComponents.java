package reusefiles;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrontendComponents {
	WebDriver driver;

	public FrontendComponents(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	WebElement next_click;

	// SwitchToWindow method
	public void switchToWindow() {
		String parent = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> I1 = s1.iterator();
		// String title = null;
		while (I1.hasNext()) {
			String child_window = I1.next();
			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);
			}
		}
	}

	public void switchToParentWindow() {
		String parentWindowHandle = driver.getWindowHandle(); // Get the window handle of the parent window
		driver.switchTo().window(parentWindowHandle); // Switch back to the parent window
	}

	public void waitforappear(By by) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	public void scrollIntoview(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public void next() {
		next_click.click();
	}
	
	public void selectFromDropDown(WebElement by,String string) {
		Select select=new Select(by);
		select.selectByVisibleText(string);
	}
}
