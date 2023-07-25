package adminsidepageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadShowPage {
	WebDriver driver;						
	
	public LeadShowPage(WebDriver driver) {
		this.driver=driver;	
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//dt[@class='col-md-2'])[1]")
	WebElement showTheUser;
	@FindBy(xpath = "//span[text()='Create Application']")
	WebElement clickCreate;
	
	public String userShowPage() {
		String actualAssignedUser=showTheUser.getText();
		return actualAssignedUser;
	}
	
	public void clickCreateApplication() {
		clickCreate.click();
	}
}
