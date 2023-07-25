package pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reusefiles.components;

public class homepage extends components
{
	public WebDriver driver;
	
	
	public homepage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//button[text()='Get Pre-approved'])[1]")
	WebElement journystart;
	
	public void link()
	{ 
		driver.get("http://65.0.31.40/");
	}
	public journy  clickstartjourny()
	{	
		Scroll();
		journystart.click();
		journy journy= new journy(driver);
		return journy;
	}
	public void scrollIntoview(WebElement element)
	{
		JavascriptExecutor js =(JavascriptExecutor)  driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	public void Scroll()
	{
		JavascriptExecutor js =(JavascriptExecutor)  driver;
		js.executeScript("javascript:window.scrollBy(0,350)");
	}
}
