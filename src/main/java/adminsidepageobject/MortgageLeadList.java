package adminsidepageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MortgageLeadList {
	WebDriver driver;

	public MortgageLeadList(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@id='button-modal-import']")
	WebElement clickImport;
	@FindBy(css = "input#file")
	WebElement fileUpload;
	@FindBy(xpath = "//button[text()='Import']")
	WebElement clickSaveExcel;
	@FindBy(xpath = "//tr[1]//td//div//a[@title='Show']")
	WebElement topShowButon;
	@FindBy(xpath = "//tr[1]//td[4]")
	WebElement userAssignedInList;

	@FindBy(xpath = "//span[contains(@class,\"badge\")]")
	List<WebElement> statusBadges;
	@FindBy(xpath = "//a[@title='Show']")
	WebElement clickLeadView;

	public void importLead() throws InterruptedException {
		clickImport.click();
		fileUpload.click();
	}
	
	public void clickLead() {
		clickSaveExcel.click();
	}

	public String getAssignedUser() {
		String expectUser = userAssignedInList.getText();
		return expectUser;
	}

	public void showImportLead() {
		topShowButon.click();
		
	}

	public LeadShowPage clickViewLead() {
		int statusColumnCount = statusBadges.size();
		System.out.println(statusColumnCount);
		LeadShowPage LeadShowPage = new LeadShowPage(driver);
		return LeadShowPage;
		
	}
}
