package frontendpageobject;

import java.util.ArrayList;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reusefiles.FrontendComponents;

public class CalculatorHome extends FrontendComponents {

	WebDriver driver;

	public CalculatorHome(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "input#property_price")
	WebElement propertyprice;
	@FindBy(xpath = "(//input[@type='range'])[1]")
	WebElement downpaymentslider;
	@FindBy(xpath = "(//input[@type='range'])[2]")
	WebElement termeyarslider;
	@FindBy(css = "input#interest_rate")
	WebElement intrest;
	@FindBy(xpath = "//p[contains(@class,\"text-3xl\")]")
	WebElement emivalue;
	@FindBy(xpath = "//input[@id='downpayment']")
	WebElement downpaymentvalue;
	@FindBy(xpath = "//input[@name='first'])[2]")
	WebElement termyearvalue;

	public int properetypricedatas(String propertyvalues) throws InterruptedException {
		propertyprice.clear();
		int price = Integer.parseInt(propertyvalues);
		if (price > 0) {
			propertyprice.sendKeys(propertyvalues);
		} else {
			System.out.println("Error: negative value not allowed");
			driver.close();
		}
		int priceint = Integer.parseInt(propertyvalues);
		return priceint;
	}

	public void movedownpaymentsliders() throws InterruptedException {
		int targetValue = 25;
		Dimension sliderSize = downpaymentslider.getSize();
		// System.out.println("Slider width: " + sliderSize.getWidth());
		int xOffset = (int) (sliderSize.width * ((double) targetValue / 100));
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(downpaymentslider, xOffset, 0).perform();
		
		
	}

	public int getdownpaymentvalue()
	{
		String entereddownpayment = downpaymentvalue.getText();
		int downpaymentint = Integer.parseInt(entereddownpayment);
		return downpaymentint;
	}
	
	public void movetermyearsliders() {
		int targetValue = 25;
		Dimension sliderSize = termeyarslider.getSize();
		// System.out.println("Slider width: " + sliderSize.getWidth());
		int xOffset = (int) (sliderSize.width * ((double) targetValue / 100));
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(termeyarslider, xOffset, 0).perform();
		
	}

	public int getteryearvalue()
	{
		String enteredtermyear = termyearvalue.getText();
		int termyearint = Integer.parseInt(enteredtermyear);
		return termyearint;
	}
	public void intrestrate(String intrestvalue) {
		intrest.clear();
		intrest.sendKeys(intrestvalue);
		
	}

	public int getintrestvalue()
	{
		String enteredintrest = intrest.getText();
		int intrestint = Integer.parseInt(enteredintrest);
		return intrestint;
	}
	public void getEmi() {
		String getemivalue = emivalue.getText();
		String[] price = getemivalue.split(" ");
		//System.out.println(price[1]);
	}

	public void verifyemi() {
		((ChromeDriver) driver).executeScript("window.open('about:blank','_blank');");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get("https://docs.google.com/spreadsheets/d/1dXYyiM77jrmc1-FPll4H01S7T9GB7F2A/edit#gid=2133061695");
		
	}
}
