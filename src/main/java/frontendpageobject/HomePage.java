package frontendpageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import reusefiles.FrontendComponents;

public class HomePage extends FrontendComponents {
	public WebDriver driver;

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[.='GET STARTED']")
	WebElement journystart;
	@FindBy(xpath = "//a[text()='Calculator']")
	WebElement Opencalculator;
	@FindBy(xpath = "//a[.='GET STARTED']")
	WebElement scrollToGetApproved;
	@FindBy(xpath = "//p[text()='Testimonials']")
	WebElement getTestimonial;
	@FindBy(css=".swiper-slide-active .py-8")
	WebElement testimonialtext;
	//

	public void link() {
		driver.get("http://65.0.31.40/");
	}

	public Journy clickstartjourny() throws InterruptedException {
		journystart.click();
		switchToWindow();
		Journy journy = new Journy(driver);
		return journy;
	}

	public void Scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(0,350)");
	}

	public CalculatorHome clickCalculator() {
		Opencalculator.click();
		CalculatorHome calculatorhome = new CalculatorHome(driver);
		return calculatorhome;
	}

	public void verifyTestimonialContent() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getTestimonial);
		String Actualtext = testimonialtext.getText();
	}
}
