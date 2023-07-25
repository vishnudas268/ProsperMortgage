package mortgageleadtestfiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MortgageLeadView {
	WebDriver driver;
	
	public MortgageLeadView(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
