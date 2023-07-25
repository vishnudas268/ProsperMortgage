package frontendpageobject;

import java.text.ParseException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import javax.sql.rowset.Joinable;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reusefiles.FrontendComponents;

public class Journy extends FrontendComponents {
	WebDriver driver;
	HomePage HomePage;

	public Journy(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@value='NEW']")
	WebElement new_property_purchase; // New property purchase
	@FindBy(xpath = "//button[@value='EXISTING']")
	WebElement mortgage_refinance; // Mortgage_Refinance
	@FindBy(xpath = "//button[@value='RESEARCHING']")
	WebElement just_browsing_the_market; // Just_browsing_the_market
	@FindBy(xpath = "//button[@value='VIEWING_PERSON']")
	WebElement i_ve_looking_started_around; // i_ve_looking_started_around
	@FindBy(xpath = "//button[@value='ALREADY_MADE']")
	WebElement I_ve_found_my_dream_home; // I_ve_found_my_dream_home
	@FindBy(xpath = "//button[@value='NOT_DECIDED']")
	WebElement havent_decided_yet; // Haven't_Decided_Yet
	@FindBy(xpath = "//button[@value='VILLA']")
	WebElement villa; // villa
	@FindBy(xpath = "//button[@value='APARTMENT']")
	WebElement apartment; // Apartment
	@FindBy(xpath = "//button[@value='COMPLETED']")
	WebElement completed_properties; // Completed_Properties
	@FindBy(xpath = "//button[@value='UNDER_CONSTRUCTION']")
	WebElement under_construction; // Under_Construction
	@FindBy(css = "input#estimated_budget")
	WebElement est_bud; // Estimated_Budget
	@FindBy(css = "input#property_current_value")
	WebElement current_property_value;
	@FindBy(xpath = "//button[@value='YES']")
	WebElement uae_national; // UAE_National
	@FindBy(xpath = "//button[@value='NO']")
	WebElement non_uae_national;
	@FindBy(xpath = "//input[@type='date']")
	WebElement birth_date;
	@FindBy(xpath = "//button[@value='EMPLOYED']")
	WebElement employed; // I_am_employed
	@FindBy(xpath = "//button[@value='SELF_EMPLOYED']")
	WebElement self_Employed;
	@FindBy(xpath = "//button[@value='DIFFERENT_SOURCE']")
	WebElement other_Source_of_income;
	@FindBy(xpath = "//span[text()='Single application']")
	WebElement single_application; // single application
	@FindBy(xpath = "(//input[contains(@class,\"p-4\")])[1]")
	WebElement monthly_income;
	@FindBy(xpath = "(//input[contains(@class,\"p-4\")])[2]")
	WebElement creditcard_limit;
	@FindBy(xpath = "(//input[contains(@class,\"p-4\")])[3]")
	WebElement monthly_repayment;
	@FindBy(css = "input#customer_name")
	WebElement fullname;
	@FindBy(css = "input#customer_email")
	WebElement email;
	@FindBy(xpath = "//input[@class='form-control ']")
	WebElement phone;
	@FindBy(xpath = "//p[@class='py-5 text-lg']")
	WebElement success_message;
	By displayPhonenumberField = By.xpath("//input[@class='form-control ']");
	@FindBy(xpath = "//small")
	WebElement est_bud_alert_text;
	@FindBy(xpath = "(//small)[1]")
	WebElement dob_Alert_text;
	@FindBy(xpath = "//select[@id='mortgageprovider']")
	WebElement selectBankProvider;
	@FindBy(css = "input#existing_mortgage_balance_amount")
	WebElement outstanding_loan_amount;
	@FindBy(xpath = "//select[@id='existing_mortgage_remaining_term']")
	WebElement remaining_term;
	@FindBy(css = "input#emiamount")
	WebElement monthly_installment;
	@FindBy(xpath = "(//small)[2]")
	WebElement oustanding_loan_alert_text;
	@FindBy(xpath = "(//div[contains(@class,\"mx-4\")])[1]")
	WebElement i_am_expact_living_dubai;
	@FindBy(xpath = "//select[@id='country']")
	WebElement country_picker;
	@FindBy(xpath = "//span[.='No, I do not live in the UAE']")
	WebElement not_uae;

	public void new_journy_selection_1(String estimated_budget, String birth_of_date, String month_income,
			String credit_limit, String month_repayment, String name, String email_id, String country,
			String phone_number) throws InterruptedException, ParseException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		new_property_purchase.click();
		just_browsing_the_market.click();
		villa.click();
		completed_properties.click();
		est_bud.sendKeys(estimated_budget);
		next();
		uae_national.click();
		birth_date.sendKeys(birth_of_date);
		String datevalue = birth_date.getAttribute("value");
		DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate dateOfBirth = LocalDate.parse(datevalue, inputFormatter);
		LocalDate currentDate = LocalDate.now();

		Period ageDifference = Period.between(dateOfBirth, currentDate);
		int years = ageDifference.getYears();

		if (years >= 21) {
			next();
		} else {
			System.out.println("User age is not valid for continuing journey");
			driver.close();
		}
		employed.click();
		single_application.click();
		monthly_income.sendKeys(month_income);
		creditcard_limit.sendKeys(credit_limit);
		monthly_repayment.sendKeys(month_repayment);
		next();
		fullname.sendKeys(name);
		email.sendKeys(email_id);
		waitforappear(displayPhonenumberField);
		String backspace = Keys.chord(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);
		phone.sendKeys(backspace);
		phone.sendKeys(country);
		next();
	}

	public void new_journy_selection_2(String estimated_budget, String birth_of_date, String month_income,
			String credit_limit, String month_repayment, String name, String email_id, String country) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		new_property_purchase.click();
		i_ve_looking_started_around.click();
		villa.click();
		completed_properties.click();
		est_bud.sendKeys(estimated_budget);
		next();
		uae_national.click();
		birth_date.sendKeys(birth_of_date);
		String datevalue = birth_date.getAttribute("value");
		DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate dateOfBirth = LocalDate.parse(datevalue, inputFormatter);
		LocalDate currentDate = LocalDate.now();

		Period ageDifference = Period.between(dateOfBirth, currentDate);
		int years = ageDifference.getYears();

		if (years >= 21) {
			next();
		} else {
			System.out.println("User age is not valid for continuing journey");
			driver.close();
		}
		employed.click();
		single_application.click();
		monthly_income.sendKeys(month_income);
		creditcard_limit.sendKeys(credit_limit);
		monthly_repayment.sendKeys(month_repayment);
		next();
		fullname.sendKeys(name);
		email.sendKeys(email_id);
		waitforappear(displayPhonenumberField);
		String backspace = Keys.chord(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);
		phone.sendKeys(backspace);
		phone.sendKeys(country);
		next();

	}

	public void new_journy_selection_3(String estimated_budget, String birth_of_date, String month_income,
			String credit_limit, String month_repayment, String name, String email_id, String country) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		new_property_purchase.click();
		I_ve_found_my_dream_home.click();
		villa.click();
		completed_properties.click();
		current_property_value.sendKeys(estimated_budget);
		next();
		uae_national.click();
		birth_date.sendKeys(birth_of_date);
		String datevalue = birth_date.getAttribute("value");
		DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate dateOfBirth = LocalDate.parse(datevalue, inputFormatter);
		LocalDate currentDate = LocalDate.now();

		Period ageDifference = Period.between(dateOfBirth, currentDate);
		int years = ageDifference.getYears();

		if (years >= 21) {
			next();
		} else {
			System.out.println("User age is not valid for continuing journey");
			driver.close();
		}
		employed.click();
		single_application.click();
		monthly_income.sendKeys(month_income);
		creditcard_limit.sendKeys(credit_limit);
		monthly_repayment.sendKeys(month_repayment);
		next();
		fullname.sendKeys(name);
		email.sendKeys(email_id);
		waitforappear(displayPhonenumberField);
		String backspace = Keys.chord(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);
		phone.sendKeys(backspace);
		phone.sendKeys(country);
		next();
	}

	public void new_journy_selection_4(String estimated_budget, String birth_of_date, String month_income,
			String credit_limit, String month_repayment, String name, String email_id, String country) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		new_property_purchase.click();
		just_browsing_the_market.click();
		apartment.click();
		completed_properties.click();
		est_bud.sendKeys(estimated_budget);
		next();
		uae_national.click();
		birth_date.sendKeys(birth_of_date);
		String datevalue = birth_date.getAttribute("value");
		DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate dateOfBirth = LocalDate.parse(datevalue, inputFormatter);
		LocalDate currentDate = LocalDate.now();

		Period ageDifference = Period.between(dateOfBirth, currentDate);
		int years = ageDifference.getYears();

		if (years >= 21) {
			next();
		} else {
			System.out.println("User age is not valid for continuing journey");
			driver.close();
		}
		employed.click();
		single_application.click();
		monthly_income.sendKeys(month_income);
		creditcard_limit.sendKeys(credit_limit);
		monthly_repayment.sendKeys(month_repayment);
		next();
		fullname.sendKeys(name);
		email.sendKeys(email_id);
		waitforappear(displayPhonenumberField);
		String backspace = Keys.chord(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);
		phone.sendKeys(backspace);
		phone.sendKeys(country);
		next();
	}

	public void new_journy_selection_5(String estimated_budget, String birth_of_date, String month_income,
			String credit_limit, String month_repayment, String name, String email_id, String country) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		new_property_purchase.click();
		i_ve_looking_started_around.click();
		apartment.click();
		completed_properties.click();
		est_bud.sendKeys(estimated_budget);
		next();
		uae_national.click();
		birth_date.sendKeys(birth_of_date);
		String datevalue = birth_date.getAttribute("value");
		DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate dateOfBirth = LocalDate.parse(datevalue, inputFormatter);
		LocalDate currentDate = LocalDate.now();

		Period ageDifference = Period.between(dateOfBirth, currentDate);
		int years = ageDifference.getYears();

		if (years >= 21) {
			next();
		} else {
			System.out.println("User age is not valid for continuing journey");
			driver.close();
		}
		employed.click();
		single_application.click();
		monthly_income.sendKeys(month_income);
		creditcard_limit.sendKeys(credit_limit);
		monthly_repayment.sendKeys(month_repayment);
		next();
		fullname.sendKeys(name);
		email.sendKeys(email_id);
		waitforappear(displayPhonenumberField);
		String backspace = Keys.chord(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);
		phone.sendKeys(backspace);
		phone.sendKeys(country);
		next();
	}

	public void new_journy_selection_6(String estimated_budget, String birth_of_date, String month_income,
			String credit_limit, String month_repayment, String name, String email_id, String phone_number) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		new_property_purchase.click();
		i_ve_looking_started_around.click();
		havent_decided_yet.click();
		// completed_properties.click();
		// est_bud.sendKeys(estimated_budget);
		// next();
		uae_national.click();
		birth_date.sendKeys(birth_of_date);
		String datevalue = birth_date.getAttribute("value");
		DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate dateOfBirth = LocalDate.parse(datevalue, inputFormatter);
		LocalDate currentDate = LocalDate.now();

		Period ageDifference = Period.between(dateOfBirth, currentDate);
		int years = ageDifference.getYears();

		if (years >= 21) {
			next();
		} else {
			System.out.println("User age is not valid for continuing journey");
			driver.close();
		}
		employed.click();
		single_application.click();
		monthly_income.sendKeys(month_income);
		creditcard_limit.sendKeys(credit_limit);
		monthly_repayment.sendKeys(month_repayment);
		next();
		fullname.sendKeys(name);
		email.sendKeys(email_id);
		waitforappear(displayPhonenumberField);
		String backspace = Keys.chord(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);
		phone.sendKeys(backspace);
		phone.sendKeys(phone_number);
		next();
	}

	public void new_journy_selection_7(String estimated_budget, String birth_of_date, String month_income,
			String credit_limit, String month_repayment, String name, String email_id, String country) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		new_property_purchase.click();
		I_ve_found_my_dream_home.click();
		villa.click();
		completed_properties.click();
		current_property_value.sendKeys(estimated_budget);
		next();
		uae_national.click();
		birth_date.sendKeys(birth_of_date);
		String datevalue = birth_date.getAttribute("value");
		DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate dateOfBirth = LocalDate.parse(datevalue, inputFormatter);
		LocalDate currentDate = LocalDate.now();

		Period ageDifference = Period.between(dateOfBirth, currentDate);
		int years = ageDifference.getYears();

		if (years >= 21) {
			next();
		} else {
			System.out.println("User age is not valid for continuing journey");
			driver.close();
		}
		employed.click();
		single_application.click();
		monthly_income.sendKeys(month_income);
		creditcard_limit.sendKeys(credit_limit);
		monthly_repayment.sendKeys(month_repayment);
		next();
		fullname.sendKeys(name);
		email.sendKeys(email_id);
		waitforappear(displayPhonenumberField);
		String backspace = Keys.chord(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);
		phone.sendKeys(backspace);
		phone.sendKeys(country);
		next();
	}

	public void new_journy_selection_8(String estimated_budget, String birth_of_date, String month_income,
			String credit_limit, String month_repayment, String name, String email_id, String country) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		new_property_purchase.click();
		I_ve_found_my_dream_home.click();
		apartment.click();
		completed_properties.click();
		current_property_value.sendKeys(estimated_budget);
		next();
		uae_national.click();
		birth_date.sendKeys(birth_of_date);
		String datevalue = birth_date.getAttribute("value");
		DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate dateOfBirth = LocalDate.parse(datevalue, inputFormatter);
		LocalDate currentDate = LocalDate.now();

		Period ageDifference = Period.between(dateOfBirth, currentDate);
		int years = ageDifference.getYears();

		if (years >= 21) {
			next();
		} else {
			System.out.println("User age is not valid for continuing journey");
			driver.close();
		}
		employed.click();
		single_application.click();
		monthly_income.sendKeys(month_income);
		creditcard_limit.sendKeys(credit_limit);
		monthly_repayment.sendKeys(month_repayment);
		next();
		fullname.sendKeys(name);
		email.sendKeys(email_id);
		waitforappear(displayPhonenumberField);
		String backspace = Keys.chord(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);
		phone.sendKeys(backspace);
		phone.sendKeys(country);
		next();
	}

	public void new_journy_selection_9(String estimated_budget, String birth_of_date, String month_income,
			String credit_limit, String month_repayment, String name, String email_id, String phone_number) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		new_property_purchase.click();
		I_ve_found_my_dream_home.click();
		havent_decided_yet.click();
		// villa.click();
		// completed_properties.click();
		// est_bud.sendKeys(estimated_budget);
		// next();
		uae_national.click();
		birth_date.sendKeys(birth_of_date);
		String datevalue = birth_date.getAttribute("value");
		DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate dateOfBirth = LocalDate.parse(datevalue, inputFormatter);
		LocalDate currentDate = LocalDate.now();

		Period ageDifference = Period.between(dateOfBirth, currentDate);
		int years = ageDifference.getYears();

		if (years >= 21) {
			next();
		} else {
			System.out.println("User age is not valid for continuing journey");
			driver.close();
		}
		employed.click();
		single_application.click();
		monthly_income.sendKeys(month_income);
		creditcard_limit.sendKeys(credit_limit);
		monthly_repayment.sendKeys(month_repayment);
		next();
		fullname.sendKeys(name);
		email.sendKeys(email_id);
		waitforappear(displayPhonenumberField);
		String backspace = Keys.chord(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);
		phone.sendKeys(backspace);
		phone.sendKeys(phone_number);
		next();
	}

	public void new_journy_selection_10(String estimated_budget, String birth_of_date, String month_income,
			String credit_limit, String month_repayment, String name, String email_id, String country) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		new_property_purchase.click();
		just_browsing_the_market.click();
		villa.click();
		under_construction.click();
		est_bud.sendKeys(estimated_budget);
		next();
		uae_national.click();
		birth_date.sendKeys(birth_of_date);
		String datevalue = birth_date.getAttribute("value");
		DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate dateOfBirth = LocalDate.parse(datevalue, inputFormatter);
		LocalDate currentDate = LocalDate.now();

		Period ageDifference = Period.between(dateOfBirth, currentDate);
		int years = ageDifference.getYears();

		if (years >= 21) {
			next();
		} else {
			System.out.println("User age is not valid for continuing journey");
			driver.close();
		}
		employed.click();
		single_application.click();
		monthly_income.sendKeys(month_income);
		creditcard_limit.sendKeys(credit_limit);
		monthly_repayment.sendKeys(month_repayment);
		next();
		fullname.sendKeys(name);
		email.sendKeys(email_id);
		waitforappear(displayPhonenumberField);
		String backspace = Keys.chord(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);
		phone.sendKeys(backspace);
		phone.sendKeys(country);
		next();
	}

	public void new_journy_selection_11(String estimated_budget, String birth_of_date, String month_income,
			String credit_limit, String month_repayment, String name, String email_id, String country) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		new_property_purchase.click();
		just_browsing_the_market.click();
		apartment.click();
		under_construction.click();
		est_bud.sendKeys(estimated_budget);
		next();
		uae_national.click();
		birth_date.sendKeys(birth_of_date);
		String datevalue = birth_date.getAttribute("value");
		DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate dateOfBirth = LocalDate.parse(datevalue, inputFormatter);
		LocalDate currentDate = LocalDate.now();

		Period ageDifference = Period.between(dateOfBirth, currentDate);
		int years = ageDifference.getYears();

		if (years >= 21) {
			next();
		} else {
			System.out.println("User age is not valid for continuing journey");
			driver.close();
		}
		employed.click();
		single_application.click();
		monthly_income.sendKeys(month_income);
		creditcard_limit.sendKeys(credit_limit);
		monthly_repayment.sendKeys(month_repayment);
		next();
		fullname.sendKeys(name);
		email.sendKeys(email_id);
		waitforappear(displayPhonenumberField);
		String backspace = Keys.chord(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);
		phone.sendKeys(backspace);
		phone.sendKeys(country);
		next();
	}

	public void new_journy_selection_12(String estimated_budget, String birth_of_date, String month_income,
			String credit_limit, String month_repayment, String name, String email_id, String country) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		new_property_purchase.click();
		just_browsing_the_market.click();
		havent_decided_yet.click();
		// under_construction.click();
		// est_bud.sendKeys(estimated_budget);
		// next();
		uae_national.click();
		birth_date.sendKeys(birth_of_date);
		String datevalue = birth_date.getAttribute("value");
		DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate dateOfBirth = LocalDate.parse(datevalue, inputFormatter);
		LocalDate currentDate = LocalDate.now();

		Period ageDifference = Period.between(dateOfBirth, currentDate);
		int years = ageDifference.getYears();

		if (years >= 21) {
			next();
		} else {
			System.out.println("User age is not valid for continuing journey");
			driver.close();
		}
		employed.click();
		single_application.click();
		monthly_income.sendKeys(month_income);
		creditcard_limit.sendKeys(credit_limit);
		monthly_repayment.sendKeys(month_repayment);
		next();
		fullname.sendKeys(name);
		email.sendKeys(email_id);
		waitforappear(displayPhonenumberField);
		String backspace = Keys.chord(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);
		phone.sendKeys(backspace);
		phone.sendKeys(country);
		next();
	}

	public void new_journy_selection_13(String estimated_budget, String birth_of_date, String month_income,
			String credit_limit, String month_repayment, String name, String email_id, String country) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		new_property_purchase.click();
		i_ve_looking_started_around.click();
		villa.click();
		under_construction.click();
		est_bud.sendKeys(estimated_budget);
		next();
		uae_national.click();
		birth_date.sendKeys(birth_of_date);
		String datevalue = birth_date.getAttribute("value");
		DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate dateOfBirth = LocalDate.parse(datevalue, inputFormatter);
		LocalDate currentDate = LocalDate.now();

		Period ageDifference = Period.between(dateOfBirth, currentDate);
		int years = ageDifference.getYears();

		if (years >= 21) {
			next();
		} else {
			System.out.println("User age is not valid for continuing journey");
			driver.close();
		}
		employed.click();
		single_application.click();
		monthly_income.sendKeys(month_income);
		creditcard_limit.sendKeys(credit_limit);
		monthly_repayment.sendKeys(month_repayment);
		next();
		fullname.sendKeys(name);
		email.sendKeys(email_id);
		waitforappear(displayPhonenumberField);
		String backspace = Keys.chord(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);
		phone.sendKeys(backspace);
		phone.sendKeys(country);
		next();
	}

	public void new_journy_selection_14(String estimated_budget, String birth_of_date, String month_income,
			String credit_limit, String month_repayment, String name, String email_id, String phone_number) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		new_property_purchase.click();
		i_ve_looking_started_around.click();
		apartment.click();
		under_construction.click();
		est_bud.sendKeys(estimated_budget);
		next();
		uae_national.click();
		birth_date.sendKeys(birth_of_date);
		String datevalue = birth_date.getAttribute("value");
		DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate dateOfBirth = LocalDate.parse(datevalue, inputFormatter);
		LocalDate currentDate = LocalDate.now();

		Period ageDifference = Period.between(dateOfBirth, currentDate);
		int years = ageDifference.getYears();

		if (years >= 21) {
			next();
		} else {
			System.out.println("User age is not valid for continuing journey");
			driver.close();
		}
		employed.click();
		single_application.click();
		monthly_income.sendKeys(month_income);
		creditcard_limit.sendKeys(credit_limit);
		monthly_repayment.sendKeys(month_repayment);
		next();
		fullname.sendKeys(name);
		email.sendKeys(email_id);
		waitforappear(displayPhonenumberField);
		String backspace = Keys.chord(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);
		phone.sendKeys(backspace);
		phone.sendKeys(phone_number);
		next();
	}

	public void new_journy_selection_15(String estimated_budget, String birth_of_date, String month_income,
			String credit_limit, String month_repayment, String name, String email_id, String country) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		new_property_purchase.click();
		i_ve_looking_started_around.click();
		havent_decided_yet.click();
		// under_construction.click();
		// est_bud.sendKeys(estimated_budget);
		// next();
		uae_national.click();
		birth_date.sendKeys(birth_of_date);
		String datevalue = birth_date.getAttribute("value");
		DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate dateOfBirth = LocalDate.parse(datevalue, inputFormatter);
		LocalDate currentDate = LocalDate.now();

		Period ageDifference = Period.between(dateOfBirth, currentDate);
		int years = ageDifference.getYears();

		if (years >= 21) {
			next();
		} else {
			System.out.println("User age is not valid for continuing journey");
			driver.close();
		}
		employed.click();
		single_application.click();
		monthly_income.sendKeys(month_income);
		creditcard_limit.sendKeys(credit_limit);
		monthly_repayment.sendKeys(month_repayment);
		next();
		fullname.sendKeys(name);
		email.sendKeys(email_id);
		waitforappear(displayPhonenumberField);
		String backspace = Keys.chord(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);
		phone.sendKeys(backspace);
		phone.sendKeys(country);
		next();
	}

	public void new_journy_selection_16(String estimated_budget, String birth_of_date, String month_income,
			String credit_limit, String month_repayment, String name, String email_id, String country) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		new_property_purchase.click();
		I_ve_found_my_dream_home.click();
		villa.click();
		under_construction.click();
		current_property_value.sendKeys(estimated_budget);
		next();
		uae_national.click();
		birth_date.sendKeys(birth_of_date);
		String datevalue = birth_date.getAttribute("value");
		DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate dateOfBirth = LocalDate.parse(datevalue, inputFormatter);
		LocalDate currentDate = LocalDate.now();

		Period ageDifference = Period.between(dateOfBirth, currentDate);
		int years = ageDifference.getYears();

		if (years >= 21) {
			next();
		} else {
			System.out.println("User age is not valid for continuing journey");
			driver.close();
		}
		employed.click();
		single_application.click();
		monthly_income.sendKeys(month_income);
		creditcard_limit.sendKeys(credit_limit);
		monthly_repayment.sendKeys(month_repayment);
		next();
		fullname.sendKeys(name);
		email.sendKeys(email_id);
		waitforappear(displayPhonenumberField);
		String backspace = Keys.chord(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);
		phone.sendKeys(backspace);
		phone.sendKeys(country);
		next();
	}

	public void existing_journy_selection_1(String mortgage_provider, String property_value, String outstanding_amount,
			String mortgage_term, String monthly_installment_value, String birth_of_date, String month_income,
			String credit_limit, String month_repayment, String name, String email_id, String country) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		mortgage_refinance.click();
		selectFromDropDown(selectBankProvider, mortgage_provider);
		next();
		current_property_value.sendKeys(property_value);
		outstanding_loan_amount.sendKeys(outstanding_amount);
		next();
		selectFromDropDown(remaining_term, mortgage_term);
		next();
		monthly_installment.sendKeys(monthly_installment_value);
		next();
		uae_national.click();
		birth_date.sendKeys(birth_of_date);
		String datevalue = birth_date.getAttribute("value");
		DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate dateOfBirth = LocalDate.parse(datevalue, inputFormatter);
		LocalDate currentDate = LocalDate.now();

		Period ageDifference = Period.between(dateOfBirth, currentDate);
		int years = ageDifference.getYears();

		if (years >= 21) {
			next();
		} else {
			System.out.println("User age is not valid for continuing journey");
			driver.close();
		}
		employed.click();
		single_application.click();
		monthly_income.sendKeys(month_income);
		creditcard_limit.sendKeys(credit_limit);
		monthly_repayment.sendKeys(month_repayment);
		next();
		fullname.sendKeys(name);
		email.sendKeys(email_id);
		waitforappear(displayPhonenumberField);
		String backspace = Keys.chord(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);
		phone.sendKeys(backspace);
		phone.sendKeys(country);
		next();
	}
	
	public void existing_journy_selection_2(String mortgage_provider, String property_value, String outstanding_amount,
			String mortgage_term, String monthly_installment_value,String birth_of_date,String country_name,String month_income,
			String credit_limit, String month_repayment, String name, String email_id, String country) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		mortgage_refinance.click();
		selectFromDropDown(selectBankProvider, mortgage_provider);
		next();
		current_property_value.sendKeys(property_value);
		outstanding_loan_amount.sendKeys(outstanding_amount);
		next();
		selectFromDropDown(remaining_term, mortgage_term);
		next();
		monthly_installment.sendKeys(monthly_installment_value);
		next();
		non_uae_national.click();
		i_am_expact_living_dubai.click();
		birth_date.sendKeys(birth_of_date);
		String datevalue = birth_date.getAttribute("value");
		DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate dateOfBirth = LocalDate.parse(datevalue, inputFormatter);
		LocalDate currentDate = LocalDate.now();

		Period ageDifference = Period.between(dateOfBirth, currentDate);
		int years = ageDifference.getYears();

		if (years >= 21) {
			selectFromDropDown(country_picker,country_name);
			next();
		} else {
			System.out.println("User age is not valid for continuing journey");
			driver.close();
		}
		employed.click();
		single_application.click();
		monthly_income.sendKeys(month_income);
		creditcard_limit.sendKeys(credit_limit);
		monthly_repayment.sendKeys(month_repayment);
		next();
		fullname.sendKeys(name);
		email.sendKeys(email_id);
		waitforappear(displayPhonenumberField);
		String backspace = Keys.chord(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);
		phone.sendKeys(backspace);
		phone.sendKeys(country);
		next();
	}
	
	public void existing_journy_selection_3(String mortgage_provider, String property_value, String outstanding_amount,
			String mortgage_term, String monthly_installment_value,String name, String email_id, String country)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		mortgage_refinance.click();
		selectFromDropDown(selectBankProvider, mortgage_provider);
		next();
		current_property_value.sendKeys(property_value);
		outstanding_loan_amount.sendKeys(outstanding_amount);
		next();
		selectFromDropDown(remaining_term, mortgage_term);
		next();
		monthly_installment.sendKeys(monthly_installment_value);
		next();
		non_uae_national.click();
		not_uae.click();
		fullname.sendKeys(name);
		email.sendKeys(email_id);
		waitforappear(displayPhonenumberField);
		String backspace = Keys.chord(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);
		phone.sendKeys(backspace);
		phone.sendKeys(country);
		next();
	}

	public boolean verify_succesmessgae() {
		boolean verify_successmessage = success_message.getText()
				.equalsIgnoreCase("Your enquiry has been submitted successfully and our team will be in touch shortly");
		return verify_successmessage;
	}

	public void verifyApproximateAlertText() {
		String actual_est_bud_alert = est_bud_alert_text.getText();
		// System.out.println(actual_est_bud_alert);
		String expected_est_bud_alert = "Please enter your aproximate budget";
		if (actual_est_bud_alert.equalsIgnoreCase(expected_est_bud_alert)) {
			System.out.println("Message is displayed and matches the expected message.");
		} else {
			System.out.println("Message is displayed but does not match the expected message.");
		}
	}

	public void verifyDOBAlertMessage() {
		String actual_dob_Alert = dob_Alert_text.getText();
		String expected_dob_Alert = "Please select your date of birth";
		if (actual_dob_Alert.equalsIgnoreCase(expected_dob_Alert)) {
			System.out.println("Message is displayed and matches the expected message.");
		} else {
			System.out.println("Message is displayed but does not match the expected message.");
		}
	}

	public void verifyOustandingLoanAlertText() {
		String expected_outstanding_alert_text = oustanding_loan_alert_text.getText();
		String actual_outstanding_alert_text = "Please enter outstanding loan amount?";
		if (actual_outstanding_alert_text.equalsIgnoreCase(expected_outstanding_alert_text)) {
			System.out.println("Message is displayed and matches the expected message.");
		} else {
			System.out.println("Message is displayed but does not match the expected message.");
		}
	}

	public void getApproximateBudgetAlert_1() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		new_property_purchase.click();
		just_browsing_the_market.click();
		villa.click();
		completed_properties.click();
		Thread.sleep(2000);
		next();
	}

	public void getApproximateBudgetAlert_2() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		new_property_purchase.click();
		i_ve_looking_started_around.click();
		villa.click();
		completed_properties.click();
		Thread.sleep(2000);
		next();
	}

	public void getApproximateBudgetAlert_3() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		new_property_purchase.click();
		I_ve_found_my_dream_home.click();
		villa.click();
		completed_properties.click();
		Thread.sleep(2000);
		next();
	}

	public void getApproximateBudgetAlert_4() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		new_property_purchase.click();
		just_browsing_the_market.click();
		apartment.click();
		completed_properties.click();
		Thread.sleep(2000);
		next();
	}

	public void getApproximateBudgetAlert_5() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		new_property_purchase.click();
		i_ve_looking_started_around.click();
		apartment.click();
		completed_properties.click();
		Thread.sleep(2000);
		next();
	}

	public void getApproximateBudgetAlert_6() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		new_property_purchase.click();
		I_ve_found_my_dream_home.click();
		apartment.click();
		completed_properties.click();
		Thread.sleep(2000);
		next();
	}

	/*
	 * public void getApproximateBudgetAlert_7() throws InterruptedException {
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	 * new_property_purchase.click(); just_browsing_the_market.click();
	 * havent_decided_yet.click(); completed_properties.click(); Thread.sleep(2000);
	 * next(); }
	 * 
	 * public void getApproximateBudgetAlert_8() throws InterruptedException {
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	 * new_property_purchase.click(); i_ve_looking_started_around.click();
	 * havent_decided_yet.click(); completed_properties.click(); Thread.sleep(2000);
	 * next(); }
	 * 
	 * public void getApproximateBudgetAlert_9() throws InterruptedException {
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	 * new_property_purchase.click(); I_ve_found_my_dream_home.click();
	 * havent_decided_yet.click(); completed_properties.click(); Thread.sleep(2000);
	 * next(); }
	 */

	public void getApproximateBudgetAlert_10() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		new_property_purchase.click();
		just_browsing_the_market.click();
		villa.click();
		under_construction.click();
		Thread.sleep(2000);
		next();
	}

	public void getApproximateBudgetAlert_11() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		new_property_purchase.click();
		i_ve_looking_started_around.click();
		villa.click();
		under_construction.click();
		Thread.sleep(2000);
		next();
	}

	public void getApproximateBudgetAlert_12() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		new_property_purchase.click();
		I_ve_found_my_dream_home.click();
		villa.click();
		under_construction.click();
		Thread.sleep(2000);
		next();
	}

	public void getApproximateBudgetAlert_13() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		new_property_purchase.click();
		just_browsing_the_market.click();
		apartment.click();
		under_construction.click();
		Thread.sleep(2000);
		next();
	}

	public void getApproximateBudgetAlert_14() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		new_property_purchase.click();
		i_ve_looking_started_around.click();
		apartment.click();
		under_construction.click();
		Thread.sleep(2000);
		next();
	}

	public void getApproximateBudgetAlert_15() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		new_property_purchase.click();
		I_ve_found_my_dream_home.click();
		apartment.click();
		under_construction.click();
		Thread.sleep(2000);
		next();
	}

	public void getDobAlert_1(String estimated_budget) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		new_property_purchase.click();
		just_browsing_the_market.click();
		villa.click();
		completed_properties.click();
		est_bud.sendKeys(estimated_budget);
		next();
		uae_national.click();
		Thread.sleep(2000);
		next();
	}

	public void getDobAlert_2(String estimated_budget) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		new_property_purchase.click();
		i_ve_looking_started_around.click();
		villa.click();
		completed_properties.click();
		est_bud.sendKeys(estimated_budget);
		next();
		uae_national.click();
		Thread.sleep(2000);
		next();
	}

	public void getDobAlert_3(String property_value) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		new_property_purchase.click();
		I_ve_found_my_dream_home.click();
		villa.click();
		completed_properties.click();
		current_property_value.sendKeys(property_value);
		next();
		uae_national.click();
		Thread.sleep(2000);
		next();
	}

	public void getDobAlert_4(String estimated_budget) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		new_property_purchase.click();
		just_browsing_the_market.click();
		apartment.click();
		completed_properties.click();
		est_bud.sendKeys(estimated_budget);
		next();
		uae_national.click();
		Thread.sleep(2000);
		next();
	}

	public void getDobAlert_5(String estimated_budget) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		new_property_purchase.click();
		i_ve_looking_started_around.click();
		apartment.click();
		completed_properties.click();
		est_bud.sendKeys(estimated_budget);
		next();
		uae_national.click();
		Thread.sleep(2000);
		next();
	}

	public void getDobAlert_6(String property_value) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		new_property_purchase.click();
		I_ve_found_my_dream_home.click();
		apartment.click();
		completed_properties.click();
		current_property_value.sendKeys(property_value);
		next();
		uae_national.click();
		Thread.sleep(2000);
		next();
	}

	public void getDobAlert_7() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		new_property_purchase.click();
		just_browsing_the_market.click();
		havent_decided_yet.click();
		uae_national.click();
		Thread.sleep(2000);
		next();
	}

	public void getDobAlert_8() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		new_property_purchase.click();
		i_ve_looking_started_around.click();
		havent_decided_yet.click();
		uae_national.click();
		Thread.sleep(2000);
		next();
	}

	public void getDobAlert_9() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		new_property_purchase.click();
		I_ve_found_my_dream_home.click();
		havent_decided_yet.click();
		uae_national.click();
		Thread.sleep(2000);
		next();
	}

	public void getDobAlert_10(String estimated_budget) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		new_property_purchase.click();
		just_browsing_the_market.click();
		villa.click();
		under_construction.click();
		est_bud.sendKeys(estimated_budget);
		next();
		uae_national.click();
		Thread.sleep(2000);
		next();
	}

	public void getDobAlert_11(String estimated_budget) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		new_property_purchase.click();
		i_ve_looking_started_around.click();
		villa.click();
		under_construction.click();
		est_bud.sendKeys(estimated_budget);
		next();
		uae_national.click();
		Thread.sleep(2000);
		next();
	}

	public void getDobAlert_12(String property_value) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		new_property_purchase.click();
		I_ve_found_my_dream_home.click();
		villa.click();
		under_construction.click();
		current_property_value.sendKeys(property_value);
		next();
		uae_national.click();
		Thread.sleep(2000);
		next();
	}

	public void getDobAlert_13(String estimated_budget) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		new_property_purchase.click();
		just_browsing_the_market.click();
		apartment.click();
		under_construction.click();
		est_bud.sendKeys(estimated_budget);
		next();
		uae_national.click();
		Thread.sleep(2000);
		next();
	}

	public void getDobAlert_14(String estimated_budget) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		new_property_purchase.click();
		i_ve_looking_started_around.click();
		apartment.click();
		under_construction.click();
		est_bud.sendKeys(estimated_budget);
		next();
		uae_national.click();
		Thread.sleep(2000);
		next();
	}

	public void getDobAlert_15(String property_value) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		new_property_purchase.click();
		I_ve_found_my_dream_home.click();
		apartment.click();
		under_construction.click();
		current_property_value.sendKeys(property_value);
		next();
		uae_national.click();
		Thread.sleep(2000);
		next();
	}

	public void getDobAlert_16(String mortgage_provider, String property_value, String outstanding_amount,
			String mortgage_term, String monthly_installment_value) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		mortgage_refinance.click();
		selectFromDropDown(selectBankProvider, mortgage_provider);
		next();
		current_property_value.sendKeys(property_value);
		outstanding_loan_amount.sendKeys(outstanding_amount);
		next();
		selectFromDropDown(remaining_term, mortgage_term);
		next();
		monthly_installment.sendKeys(monthly_installment_value);
		next();
		uae_national.click();
		Thread.sleep(2000);
		next();
	}

	public void getDobAlert_20(String mortgage_provider, String property_value, String outstanding_amount,
			String mortgage_term, String monthly_installment_value) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		mortgage_refinance.click();
		selectFromDropDown(selectBankProvider, mortgage_provider);
		next();
		current_property_value.sendKeys(property_value);
		outstanding_loan_amount.sendKeys(outstanding_amount);
		next();
		selectFromDropDown(remaining_term, mortgage_term);
		next();
		monthly_installment.sendKeys(monthly_installment_value);
		next();
		non_uae_national.click();
		i_am_expact_living_dubai.click();
		next();
	}

	public void getDobAlert_17() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		new_property_purchase.click();
		just_browsing_the_market.click();
		havent_decided_yet.click();
		non_uae_national.click();
		i_am_expact_living_dubai.click();
		Thread.sleep(2000);
		next();
	}

	public void getDobAlert_18() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		new_property_purchase.click();
		i_ve_looking_started_around.click();
		havent_decided_yet.click();
		non_uae_national.click();
		i_am_expact_living_dubai.click();
		Thread.sleep(2000);
		next();
	}

	public void getDobAlert_19() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		new_property_purchase.click();
		I_ve_found_my_dream_home.click();
		havent_decided_yet.click();
		non_uae_national.click();
		i_am_expact_living_dubai.click();
		Thread.sleep(2000);
		next();
	}

	public void getOutStandingAlert_1(String mortgage_provider, String property_value) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		mortgage_refinance.click();
		selectFromDropDown(selectBankProvider, mortgage_provider);
		next();
		current_property_value.sendKeys(property_value);
		Thread.sleep(2000);
		next();
	}
}
