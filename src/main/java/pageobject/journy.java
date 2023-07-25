package pageobject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import reusefiles.components;

public class journy extends components{
	WebDriver driver;
	
	public journy(WebDriver driver)
	{
		super(driver);    
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//div[contains(@class,\"group h-full\")])[1]")
	WebElement new_property_purchase;  //New property purchase
	@FindBy(xpath ="//p[text()='I am still researching']")
	WebElement i_am_still_reasearching;  //I am still researching
	@FindBy(xpath = "//p[text()='Villa']")
	WebElement villa;  //villa
	@FindBy(xpath = "//p[text()='Completed properties']")
	WebElement completed_properties;  //Completed properties
	@FindBy(css = "input#first")
	WebElement est_bud;
	@FindBy(xpath = "//p[text()='Are you a UAE National?']")
	WebElement uae_national;  //UAE National
	@FindBy(css="input#birth-date")
	WebElement birth_date;
	@FindBy(xpath = "//p[text()='I am employed']")
	WebElement employed;  //I am employed
	@FindBy(xpath = "//p[text()='Single application']")
	WebElement single_application; //single application
	@FindBy(xpath = "(//input[contains(@class,\"p-4\")])[1]")
	WebElement monthly_income;
	@FindBy(xpath = "(//input[contains(@class,\"p-4\")])[2]")
	WebElement creditcard_limit;
	@FindBy(xpath = "(//input[contains(@class,\"p-4\")])[3]")
	WebElement monthly_repayment;
	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement fullname;
	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement email;
	@FindBy(xpath = "(//input[@type='text'])[3]")
	WebElement phone;
	@FindBy(xpath = "//h2")
	WebElement success_message;
	
	public void new_journy_selection_1(String estimated_budget,String birthdate_data,String month_income,String credit_limit,String month_repayment,String name,String email_id,String phone_number)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		new_property_purchase.click();
		i_am_still_reasearching.click();
		villa.click();
		completed_properties.click();
		est_bud.sendKeys(estimated_budget);
		next();
		uae_national.click();
		birth_date.click();
		next();
		employed.click();
		single_application.click();
		monthly_income.sendKeys(month_income);
		creditcard_limit.sendKeys(credit_limit);
		monthly_repayment.sendKeys(month_repayment);
		next();
		fullname.sendKeys(name);
		email.sendKeys(email_id);
		phone.sendKeys(phone_number);
		next();
		}
	
		public String verify_succesmessgae()
		{
			String success	=success_message.getText();
			return success;
			
		}
	
}
