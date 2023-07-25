package testfiles;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import globalfiles.globaldata;
import pageobject.journy;
import reusefiles.components;

public class availmortgage extends globaldata {

	@Test(dataProvider = "journydata_1")
	public void new_property_purchase_case_1(HashMap<String, String> input) throws InterruptedException {
		components component = new components(driver);
		journy journy = homepage.clickstartjourny();
		component.switchToWindow();
		journy.new_journy_selection_1(input.get("estimated_budget"),input.get("birthdate_data"),input.get("month_income"),
				input.get("credit_limit"), input.get("month_repayment"), input.get("name"), input.get("email_id"),input.get("phone_number"));
		System.out.println(journy.verify_succesmessgae());
		Assert.assertEquals(journy.verify_succesmessgae(),"Your application is successfull");
	

	}

	@DataProvider
	public Object[][] journydata_1() throws IOException {
		List<HashMap<String, String>> value = getjsondata(
				"E:\\Work_space\\mortgageWebsite\\src\\test\\java\\data\\journydata_1.json");
		return new Object[][] { { value.get(0) } };
	}
}