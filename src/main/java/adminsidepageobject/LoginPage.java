package adminsidepageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reusefiles.BackendComponents;

public class LoginPage extends BackendComponents {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type='email']")
	WebElement emailId;
	@FindBy(xpath = "//input[@type='password']")
	WebElement password;
	@FindBy(xpath = "//button[contains(@class,\"btn btn-primary\")]")
	WebElement submitButton;
	By waitForSubmit = By.xpath("//button[text()='Sign in']");

	public void adminlink() {
		driver.get("http://65.0.31.40:88/login");
	}

	public Dashboard loging(String email, String pass) throws InterruptedException {
		emailId.sendKeys(email);
		password.sendKeys(pass);
		//waitForAppearLocator(waitForSubmit);
		if(submitButton.isEnabled()) {
			submitButton.click();
		}
		else {
			System.out.println("we canot find the submit button");
		}
		Dashboard Dashboard = new Dashboard(driver);
		return Dashboard;
	}
}
