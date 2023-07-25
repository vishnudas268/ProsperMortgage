package adminsidepageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reusefiles.FrontendComponents;

public class Dashboard extends FrontendComponents {

	WebDriver driver;

	public Dashboard(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//i[@class='site-menu-icon wb-users']")
	WebElement mortgageleadClick;
	@FindBy(xpath = "(//span[text()='Mortgage Applications'])[2]")
	WebElement mortgageApplicationClick;
	
	public MortgageLeadList openMortgageLeadList() {
		mortgageleadClick.click();
		MortgageLeadList MortgageLeadList=new MortgageLeadList(driver);
		return MortgageLeadList;
	}
	public MortgageApplicationList OpenMortgageApplication() {
		mortgageApplicationClick.click();
		MortgageApplicationList MortgageApplicationList=new MortgageApplicationList(driver);
		return MortgageApplicationList;
	}
	
}
