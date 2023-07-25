package adminsidepageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MortgageApplicationList {

	WebDriver driver;

	public MortgageApplicationList(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//tr//td[4]")
	List<WebElement> listOfType;
	@FindBy(xpath = "//a[@title='edit']")
	WebElement clickEdit;
	
	/*public ApplicationEditPage clickEditOnNewMortgageType() {
		for(WebElement type :listOfType)
		{
			String typeGet=type.getText();
			if(typeGet.contains("New"))
			{
				clickEdit.click();
				break;
			}
		}
		return new ApplicationEditPage(driver);
	}*/

	
	
}
