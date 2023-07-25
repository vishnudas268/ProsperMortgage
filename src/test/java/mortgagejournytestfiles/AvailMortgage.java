package mortgagejournytestfiles;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import frontendpageobject.Journy;
import globalfiles.FrontendGlobaldata;
import lombok.Data;
import reusefiles.FrontendComponents;

public class AvailMortgage extends FrontendGlobaldata {

	@Test(dataProvider = "journydata_1")
	public void new_property_purchase_case_1(HashMap<String, String> input)
			throws InterruptedException, ParseException {
		homepage.Scroll();
		Journy journy = homepage.clickstartjourny();
		journy.new_journy_selection_1(input.get("estimated_budget"), input.get("birth_of_date"),
				input.get("month_income"), input.get("credit_limit"), input.get("month_repayment"), input.get("name"),
				input.get("email_id"), input.get("country"), input.get("phone_number"));
		Thread.sleep(5000);
		assertTrue(journy.verify_succesmessgae());
	}

	@Test(dataProvider = "journydata_2")
	public void new_property_purchase_case_2(HashMap<String, String> input) throws InterruptedException {
		homepage.Scroll();
		Journy journy = homepage.clickstartjourny();
		journy.new_journy_selection_2(input.get("estimated_budget"), input.get("birth_of_date"),
				input.get("month_income"), input.get("credit_limit"), input.get("month_repayment"), input.get("name"),
				input.get("email_id"), input.get("phone_number"));
		Thread.sleep(5000);
		assertTrue(journy.verify_succesmessgae());
	}

	@Test(dataProvider = "journydata_3")
	public void new_property_purchase_case_3(HashMap<String, String> input) throws InterruptedException {
		homepage.Scroll();
		Journy journy = homepage.clickstartjourny();
		journy.new_journy_selection_3(input.get("estimated_budget"), input.get("birth_of_date"),
				input.get("month_income"), input.get("credit_limit"), input.get("month_repayment"), input.get("name"),
				input.get("email_id"), input.get("phone_number"));
		Thread.sleep(5000);
		assertTrue(journy.verify_succesmessgae());
	}

	@Test(dataProvider = "journydata_4")
	public void new_property_purchase_case_4(HashMap<String, String> input) throws InterruptedException {
		homepage.Scroll();
		Journy journy = homepage.clickstartjourny();
		journy.new_journy_selection_4(input.get("estimated_budget"), input.get("birth_of_date"),
				input.get("month_income"), input.get("credit_limit"), input.get("month_repayment"), input.get("name"),
				input.get("email_id"), input.get("phone_number"));
		Thread.sleep(5000);
		assertTrue(journy.verify_succesmessgae());
	}

	@Test(dataProvider = "journydata_5")
	public void new_property_purchase_case_5(HashMap<String, String> input) throws InterruptedException {
		homepage.Scroll();
		Journy journy = homepage.clickstartjourny();
		journy.new_journy_selection_5(input.get("estimated_budget"), input.get("birth_of_date"),
				input.get("month_income"), input.get("credit_limit"), input.get("month_repayment"), input.get("name"),
				input.get("email_id"), input.get("phone_number"));
		Thread.sleep(5000);
		assertTrue(journy.verify_succesmessgae());
	}

	@Test(dataProvider = "journydata_1")
	public void new_property_purchase_case_6(HashMap<String, String> input) throws InterruptedException {
		homepage.Scroll();
		Journy journy = homepage.clickstartjourny();
		journy.new_journy_selection_6(input.get("estimated_budget"), input.get("birth_of_date"),
				input.get("month_income"), input.get("credit_limit"), input.get("month_repayment"), input.get("name"),
				input.get("email_id"), input.get("phone_number"));
		Thread.sleep(5000);
		assertTrue(journy.verify_succesmessgae());
	}

	@Test(dataProvider = "journydata_6")
	public void new_property_purchase_case_7(HashMap<String, String> input) throws InterruptedException {
		homepage.Scroll();
		Journy journy = homepage.clickstartjourny();
		journy.new_journy_selection_7(input.get("estimated_budget"), input.get("birth_of_date"),
				input.get("month_income"), input.get("credit_limit"), input.get("month_repayment"), input.get("name"),
				input.get("email_id"), input.get("phone_number"));
		Thread.sleep(5000);
		assertTrue(journy.verify_succesmessgae());
	}

	@Test(dataProvider = "journydata_7")
	public void new_property_purchase_case_8(HashMap<String, String> input) throws InterruptedException {
		homepage.Scroll();
		Journy journy = homepage.clickstartjourny();
		journy.new_journy_selection_8(input.get("estimated_budget"), input.get("birth_of_date"),
				input.get("month_income"), input.get("credit_limit"), input.get("month_repayment"), input.get("name"),
				input.get("email_id"), input.get("phone_number"));
		Thread.sleep(5000);
		assertTrue(journy.verify_succesmessgae());
	}

	@Test(dataProvider = "journydata_5")
	public void new_property_purchase_case_9(HashMap<String, String> input) throws InterruptedException {
		homepage.Scroll();
		Journy journy = homepage.clickstartjourny();
		journy.new_journy_selection_9(input.get("estimated_budget"), input.get("birth_of_date"),
				input.get("month_income"), input.get("credit_limit"), input.get("month_repayment"), input.get("name"),
				input.get("email_id"), input.get("phone_number"));
		Thread.sleep(5000);
		assertTrue(journy.verify_succesmessgae());
	}

	@Test(dataProvider = "journydata_8")
	public void new_property_purchase_journy_case_10(HashMap<String, String> input) throws InterruptedException {
		homepage.Scroll();
		Journy journy = homepage.clickstartjourny();
		journy.new_journy_selection_10(input.get("estimated_budget"), input.get("birth_of_date"),
				input.get("month_income"), input.get("credit_limit"), input.get("month_repayment"), input.get("name"),
				input.get("email_id"), input.get("phone_number"));
		Thread.sleep(5000);
		assertTrue(journy.verify_succesmessgae());
	}

	@Test(dataProvider = "journydata_1")
	public void new_property_purchase_journy_case_11(HashMap<String, String> input) throws InterruptedException {
		homepage.Scroll();
		Journy journy = homepage.clickstartjourny();
		journy.new_journy_selection_11(input.get("estimated_budget"), input.get("birth_of_date"),
				input.get("month_income"), input.get("credit_limit"), input.get("month_repayment"), input.get("name"),
				input.get("email_id"), input.get("phone_number"));
		Thread.sleep(5000);
		assertTrue(journy.verify_succesmessgae());
	}

	@Test(dataProvider = "journydata_2")
	public void new_property_purchase_journy_case_12(HashMap<String, String> input) throws InterruptedException {
		homepage.Scroll();
		Journy journy = homepage.clickstartjourny();
		journy.new_journy_selection_12(input.get("estimated_budget"), input.get("birth_of_date"),
				input.get("month_income"), input.get("credit_limit"), input.get("month_repayment"), input.get("name"),
				input.get("email_id"), input.get("phone_number"));
		Thread.sleep(5000);
		assertTrue(journy.verify_succesmessgae());
	}

	@Test(dataProvider = "journydata_1")
	public void new_property_purchase_journy_case_13(HashMap<String, String> input) throws InterruptedException {
		homepage.Scroll();
		Journy journy = homepage.clickstartjourny();
		journy.new_journy_selection_13(input.get("estimated_budget"), input.get("birth_of_date"),
				input.get("month_income"), input.get("credit_limit"), input.get("month_repayment"), input.get("name"),
				input.get("email_id"), input.get("phone_number"));
		Thread.sleep(5000);
		assertTrue(journy.verify_succesmessgae());
	}

	@Test(dataProvider = "journydata_3")
	public void new_property_purchase_journy_case_14(HashMap<String, String> input) throws InterruptedException {
		homepage.Scroll();
		Journy journy = homepage.clickstartjourny();
		journy.new_journy_selection_14(input.get("estimated_budget"), input.get("birth_of_date"),
				input.get("month_income"), input.get("credit_limit"), input.get("month_repayment"), input.get("name"),
				input.get("email_id"), input.get("phone_number"));
		Thread.sleep(3000);
		assertTrue(journy.verify_succesmessgae());
	}

	@Test(dataProvider = "journydata_4")
	public void new_property_purchase_journy_case_15(HashMap<String, String> input) throws InterruptedException {
		homepage.Scroll();
		Journy journy = homepage.clickstartjourny();
		journy.new_journy_selection_15(input.get("estimated_budget"), input.get("birth_of_date"),
				input.get("month_income"), input.get("credit_limit"), input.get("month_repayment"), input.get("name"),
				input.get("email_id"), input.get("phone_number"));
		Thread.sleep(3000);
		assertTrue(journy.verify_succesmessgae());
	}

	@Test(dataProvider = "journydata_4")
	public void new_property_purchase_journy_case_16(HashMap<String, String> input) throws InterruptedException {
		homepage.Scroll();
		Journy journy = homepage.clickstartjourny();
		journy.new_journy_selection_16(input.get("estimated_budget"), input.get("birth_of_date"),
				input.get("month_income"), input.get("credit_limit"), input.get("month_repayment"), input.get("name"),
				input.get("email_id"), input.get("phone_number"));
		Thread.sleep(3000);
		assertTrue(journy.verify_succesmessgae());
	}

	@Test(dataProvider = "journydata_9", groups = "")
	public void existing_mortgage_journy_case_1(HashMap<String, String> input) throws InterruptedException {
		homepage.Scroll();
		Journy journy = homepage.clickstartjourny();
		journy.existing_journy_selection_1(input.get("mortgage_provider"), input.get("property_value"),
				input.get("outstanding_amount"), input.get("mortgage_term"), input.get("monthly_installment_value"),
				input.get("birth_of_date"), input.get("month_income"), input.get("credit_limit"),
				input.get("month_repayment"), input.get("name"), input.get("email_id"), input.get("country"));
		Thread.sleep(3000);
		assertTrue(journy.verify_succesmessgae());
	}

	@Test(dataProvider = "journydata_10", groups = "")
	public void existing_mortgage_journy_case_2(HashMap<String, String> input) throws InterruptedException {
		homepage.Scroll();
		Journy journy = homepage.clickstartjourny();
		journy.existing_journy_selection_2(input.get("mortgage_provider"), input.get("property_value"),
				input.get("outstanding_amount"), input.get("mortgage_term"), input.get("monthly_installment_value"),
				input.get("birth_of_date"), input.get("country_name"), input.get("month_income"),
				input.get("credit_limit"), input.get("month_repayment"), input.get("name"), input.get("email_id"),
				input.get("country"));
		Thread.sleep(3000);
		assertTrue(journy.verify_succesmessgae());
	}

	@Test(dataProvider = "journydata_11", groups = "existing")
	public void existing_mortgage_journy_case_3(HashMap<String, String> input) throws InterruptedException {
		homepage.Scroll();
		Journy journy = homepage.clickstartjourny();
		journy.existing_journy_selection_3(input.get("mortgage_provider"), input.get("property_value"),
				input.get("outstanding_amount"), input.get("mortgage_term"), input.get("monthly_installment_value"),
				input.get("name"), input.get("email_id"), input.get("country"));
		Thread.sleep(3000);
		assertTrue(journy.verify_succesmessgae());
	}

	@DataProvider
	public Object[][] journydata_1() throws IOException {
		List<HashMap<String, String>> value = getjsondata(
				"D:\\Eclipse_Automation\\workspace\\mortgageWebsite\\src\\test\\java\\data\\journydata_1.json");
		return new Object[][] { { value.get(0) } };
	}

	@DataProvider
	public Object[][] journydata_2() throws IOException {
		List<HashMap<String, String>> value = getjsondata(
				"D:\\Eclipse_Automation\\workspace\\mortgageWebsite\\src\\test\\java\\data\\journydata_1.json");
		return new Object[][] { { value.get(1) } };
	}

	@DataProvider
	public Object[][] journydata_3() throws IOException {
		List<HashMap<String, String>> value = getjsondata(
				"D:\\Eclipse_Automation\\workspace\\mortgageWebsite\\src\\test\\java\\data\\journydata_1.json");
		return new Object[][] { { value.get(2) } };
	}

	@DataProvider
	public Object[][] journydata_4() throws IOException {
		List<HashMap<String, String>> value = getjsondata(
				"D:\\Eclipse_Automation\\workspace\\mortgageWebsite\\src\\test\\java\\data\\journydata_1.json");
		return new Object[][] { { value.get(3) } };
	}

	@DataProvider
	public Object[][] journydata_5() throws IOException {
		List<HashMap<String, String>> value = getjsondata(
				"D:\\Eclipse_Automation\\workspace\\mortgageWebsite\\src\\test\\java\\data\\journydata_1.json");
		return new Object[][] { { value.get(4) } };
	}

	@DataProvider
	public Object[][] journydata_6() throws IOException {
		List<HashMap<String, String>> value = getjsondata(
				"D:\\Eclipse_Automation\\workspace\\mortgageWebsite\\src\\test\\java\\data\\journydata_1.json");
		return new Object[][] { { value.get(5) } };
	}

	@DataProvider
	public Object[][] journydata_7() throws IOException {
		List<HashMap<String, String>> value = getjsondata(
				"D:\\Eclipse_Automation\\workspace\\mortgageWebsite\\src\\test\\java\\data\\journydata_1.json");
		return new Object[][] { { value.get(6) } };
	}

	@DataProvider()
	public Object[][] journydata_8() throws IOException {
		List<HashMap<String, String>> value = getjsondata(
				"D:\\Eclipse_Automation\\workspace\\mortgageWebsite\\src\\test\\java\\data\\journydata_1.json");
		return new Object[][] { { value.get(7) } };
	}

	@DataProvider
	public Object[][] journydata_9() throws IOException {
		List<HashMap<String, String>> value = getjsondata(
				"D:\\Eclipse_Automation\\workspace\\mortgageWebsite\\src\\test\\java\\data\\journydata_1.json");
		return new Object[][] { { value.get(10) } };
	}
	
	@DataProvider
	public Object[][] journydata_10() throws IOException {
		List<HashMap<String, String>> value = getjsondata(
				"D:\\Eclipse_Automation\\workspace\\mortgageWebsite\\src\\test\\java\\data\\journydata_1.json");
		return new Object[][] { { value.get(11) } };
	}
	
	@DataProvider
	public Object[][] journydata_11() throws IOException {
		List<HashMap<String, String>> value = getjsondata(
				"D:\\Eclipse_Automation\\workspace\\mortgageWebsite\\src\\test\\java\\data\\journydata_1.json");
		return new Object[][] { { value.get(12) } };
	}

}