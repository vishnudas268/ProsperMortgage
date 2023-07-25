package mortgagejournytestfiles;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import frontendpageobject.Journy;
import globalfiles.FrontendGlobaldata;

public class JournyAlertMessages extends FrontendGlobaldata {

	@Test(groups = "ApproximateBudgetAlertVerification")
	public void approximateBudgetAlert_1() throws InterruptedException {
		homepage.Scroll();
		Journy journy = homepage.clickstartjourny();
		journy.getApproximateBudgetAlert_1();
		journy.verifyApproximateAlertText();
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println(methodName);
	}

	@Test(groups = "ApproximateBudgetAlertVerification")
	public void approximateBudgetAlert_2() throws InterruptedException {
		homepage.Scroll();
		Journy journy = homepage.clickstartjourny();
		journy.getApproximateBudgetAlert_2();
		journy.verifyApproximateAlertText();
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println(methodName);
	}

	@Test(groups = "ApproximateBudgetAlertVerification")
	public void approximateBudgetAlert_3() throws InterruptedException {
		homepage.Scroll();
		Journy journy = homepage.clickstartjourny();
		journy.getApproximateBudgetAlert_3();
		journy.verifyApproximateAlertText();
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println(methodName);
	}

	@Test(groups = "ApproximateBudgetAlertVerification")
	public void approximateBudgetAlert_4() throws InterruptedException {
		homepage.Scroll();
		Journy journy = homepage.clickstartjourny();
		journy.getApproximateBudgetAlert_4();
		journy.verifyApproximateAlertText();
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println(methodName);
	}

	@Test(groups = "ApproximateBudgetAlertVerification")
	public void approximateBudgetAlert_5() throws InterruptedException {
		homepage.Scroll();
		Journy journy = homepage.clickstartjourny();
		journy.getApproximateBudgetAlert_5();
		journy.verifyApproximateAlertText();
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println(methodName);
	}

	@Test(groups = "ApproximateBudgetAlertVerification")
	public void approximateBudgetAlert_6() throws InterruptedException {
		homepage.Scroll();
		Journy journy = homepage.clickstartjourny();
		journy.getApproximateBudgetAlert_6();
		journy.verifyApproximateAlertText();
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println(methodName);
	}

	/*
	 * @Test(groups = "ApproximateBudgetAlertVerification") public void
	 * approximateBudgetAlert_7() throws InterruptedException { homepage.Scroll();
	 * Journy journy = homepage.clickstartjourny();
	 * journy.getApproximateBudgetAlert_7(); journy.verifyApproximateAlertText(); }
	 * 
	 * @Test(groups = "ApproximateBudgetAlertVerification") public void
	 * approximateBudgetAlert_8() throws InterruptedException { homepage.Scroll();
	 * Journy journy = homepage.clickstartjourny();
	 * journy.getApproximateBudgetAlert_8(); journy.verifyApproximateAlertText(); }
	 * 
	 * @Test(groups = "ApproximateBudgetAlertVerification") public void
	 * approximateBudgetAlert_9() throws InterruptedException { homepage.Scroll();
	 * Journy journy = homepage.clickstartjourny();
	 * journy.getApproximateBudgetAlert_9(); journy.verifyApproximateAlertText(); }
	 */

	@Test(groups = "ApproximateBudgetAlertVerification")
	public void approximateBudgetAlert_10() throws InterruptedException {
		homepage.Scroll();
		Journy journy = homepage.clickstartjourny();
		journy.getApproximateBudgetAlert_10();
		journy.verifyApproximateAlertText();
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println(methodName);
	}

	@Test(groups = "ApproximateBudgetAlertVerification")
	public void approximateBudgetAlert_11() throws InterruptedException {
		homepage.Scroll();
		Journy journy = homepage.clickstartjourny();
		journy.getApproximateBudgetAlert_11();
		journy.verifyApproximateAlertText();
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println(methodName);
	}

	@Test(groups = "ApproximateBudgetAlertVerification")
	public void approximateBudgetAlert_12() throws InterruptedException {
		homepage.Scroll();
		Journy journy = homepage.clickstartjourny();
		journy.getApproximateBudgetAlert_12();
		journy.verifyApproximateAlertText();
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println(methodName);
	}

	@Test(groups = "ApproximateBudgetAlertVerification")
	public void approximateBudgetAlert_13() throws InterruptedException {
		homepage.Scroll();
		Journy journy = homepage.clickstartjourny();
		journy.getApproximateBudgetAlert_13();
		journy.verifyApproximateAlertText();
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println(methodName);
	}

	@Test(groups = "ApproximateBudgetAlertVerification")
	public void approximateBudgetAlert_14() throws InterruptedException {
		homepage.Scroll();
		Journy journy = homepage.clickstartjourny();
		journy.getApproximateBudgetAlert_14();
		journy.verifyApproximateAlertText();
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println(methodName);
	}

	@Test(groups = "ApproximateBudgetAlertVerification")
	public void approximateBudgetAlert_15() throws InterruptedException {
		homepage.Scroll();
		Journy journy = homepage.clickstartjourny();
		journy.getApproximateBudgetAlert_15();
		journy.verifyApproximateAlertText();
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println(methodName);
	}

	@Test(groups = "DOB_Alert_Message", dataProvider = "journydata_1")
	public void dateOfBirthAlert_1(HashMap<String, String> input) throws InterruptedException {
		homepage.Scroll();
		Journy journy = homepage.clickstartjourny();
		journy.getDobAlert_1(input.get("estimated_budget"));
		journy.verifyDOBAlertMessage();
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println(methodName);
	}

	@Test(groups = "DOB_Alert_Message", dataProvider = "journydata_1")
	public void dateOfBirthAlert_2(HashMap<String, String> input) throws InterruptedException {
		homepage.Scroll();
		Journy journy = homepage.clickstartjourny();
		journy.getDobAlert_2(input.get("estimated_budget"));
		journy.verifyDOBAlertMessage();
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println(methodName);
	}

	@Test(groups = "DOB_Alert_Message", dataProvider = "journydata_10")
	public void dateOfBirthAlert_3(HashMap<String, String> input) throws InterruptedException {
		homepage.Scroll();
		Journy journy = homepage.clickstartjourny();
		journy.getDobAlert_3(input.get("property_value"));
		journy.verifyDOBAlertMessage();
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println(methodName);
	}

	@Test(groups = "DOB_Alert_Message", dataProvider = "journydata_1")
	public void dateOfBirthAlert_4(HashMap<String, String> input) throws InterruptedException {
		homepage.Scroll();
		Journy journy = homepage.clickstartjourny();
		journy.getDobAlert_4(input.get("estimated_budget"));
		journy.verifyDOBAlertMessage();
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println(methodName);
	}

	@Test(groups = "DOB_Alert_Message", dataProvider = "journydata_1")
	public void dateOfBirthAlert_5(HashMap<String, String> input) throws InterruptedException {
		homepage.Scroll();
		Journy journy = homepage.clickstartjourny();
		journy.getDobAlert_5(input.get("estimated_budget"));
		journy.verifyDOBAlertMessage();
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println(methodName);
	}

	@Test(groups = "DOB_Alert_Message", dataProvider = "journydata_10")
	public void dateOfBirthAlert_6(HashMap<String, String> input) throws InterruptedException {
		homepage.Scroll();
		Journy journy = homepage.clickstartjourny();
		journy.getDobAlert_6(input.get("property_value"));
		journy.verifyDOBAlertMessage();
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println(methodName);
	}

	@Test(groups = "DOB_Alert_Message")
	public void dateOfBirthAlert_7() throws InterruptedException {
		homepage.Scroll();
		Journy journy = homepage.clickstartjourny();
		journy.getDobAlert_7();
		journy.verifyDOBAlertMessage();
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println(methodName);
	}

	@Test(groups = "DOB_Alert_Message")
	public void dateOfBirthAlert_8() throws InterruptedException {
		homepage.Scroll();
		Journy journy = homepage.clickstartjourny();
		journy.getDobAlert_8();
		journy.verifyDOBAlertMessage();
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println(methodName);
	}

	@Test(groups = "DOB_Alert_Message")
	public void dateOfBirthAlert_9() throws InterruptedException {
		homepage.Scroll();
		Journy journy = homepage.clickstartjourny();
		journy.getDobAlert_9();
		journy.verifyDOBAlertMessage();
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println(methodName);
	}

	@Test(groups = "DOB_Alert_Message", dataProvider = "journydata_1")
	public void dateOfBirthAlert_10(HashMap<String, String> input) throws InterruptedException {
		homepage.Scroll();
		Journy journy = homepage.clickstartjourny();
		journy.getDobAlert_10(input.get("estimated_budget"));
		journy.verifyDOBAlertMessage();
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println(methodName);
	}

	@Test(groups = "DOB_Alert_Message", dataProvider = "journydata_1")
	public void dateOfBirthAlert_11(HashMap<String, String> input) throws InterruptedException {
		homepage.Scroll();
		Journy journy = homepage.clickstartjourny();
		journy.getDobAlert_11(input.get("estimated_budget"));
		journy.verifyDOBAlertMessage();
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println(methodName);
	}

	@Test(groups = "DOB_Alert_Message", dataProvider = "journydata_10")
	public void dateOfBirthAlert_12(HashMap<String, String> input) throws InterruptedException {
		homepage.Scroll();
		Journy journy = homepage.clickstartjourny();
		journy.getDobAlert_12(input.get("property_value"));
		journy.verifyDOBAlertMessage();
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println(methodName);
	}

	@Test(groups = "DOB_Alert_Message", dataProvider = "journydata_1")
	public void dateOfBirthAlert_13(HashMap<String, String> input) throws InterruptedException {
		homepage.Scroll();
		Journy journy = homepage.clickstartjourny();
		journy.getDobAlert_13(input.get("estimated_budget"));
		journy.verifyDOBAlertMessage();
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println(methodName);
	}

	@Test(groups = "DOB_Alert_Message", dataProvider = "journydata_1")
	public void dateOfBirthAlert_14(HashMap<String, String> input) throws InterruptedException {
		homepage.Scroll();
		Journy journy = homepage.clickstartjourny();
		journy.getDobAlert_14(input.get("estimated_budget"));
		journy.verifyDOBAlertMessage();
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println(methodName);
	}

	@Test(groups = "DOB_Alert_Message", dataProvider = "journydata_10")
	public void dateOfBirthAlert_15(HashMap<String, String> input) throws InterruptedException {
		homepage.Scroll();
		Journy journy = homepage.clickstartjourny();
		journy.getDobAlert_15(input.get("property_value"));
		journy.verifyDOBAlertMessage();
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println(methodName);
	}

	@Test(groups = "DOB_Alert_Message",dataProvider = "journydata_11")
	public void dateOfBirthAlert_16(HashMap<String, String> input) throws InterruptedException {
		homepage.Scroll();
		Journy journy = homepage.clickstartjourny();
		journy.getDobAlert_16(input.get("mortgage_provider"), input.get("property_value"),
				input.get("outstanding_amount"), input.get("mortgage_term"), input.get("monthly_installment_value"));
		journy.verifyDOBAlertMessage();
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println(methodName);
	}
	
	@Test(groups = "DOB_Alert_Message")
	public void dateOfBirthAlert_17() throws InterruptedException {
		homepage.Scroll();
		Journy journy = homepage.clickstartjourny();
		journy.getDobAlert_17();
		journy.verifyDOBAlertMessage();
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println(methodName);
	}
	
	@Test(groups = "DOB_Alert_Message")
	public void dateOfBirthAlert_18() throws InterruptedException {
		homepage.Scroll();
		Journy journy = homepage.clickstartjourny();
		journy.getDobAlert_18();
		journy.verifyDOBAlertMessage();
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println(methodName);
	}
	
	@Test(groups = "DOB_Alert_Message")
	public void dateOfBirthAlert_19() throws InterruptedException {
		homepage.Scroll();
		Journy journy = homepage.clickstartjourny();
		journy.getDobAlert_19();
		journy.verifyDOBAlertMessage();
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println(methodName);
	}
	
	@Test(groups = "DOB_Alert_Message",dataProvider = "journydata_11")
	public void dateOfBirthAlert_20(HashMap<String,String>input) throws InterruptedException {
		homepage.Scroll();
		Journy journy = homepage.clickstartjourny();
		journy.getDobAlert_20(input.get("mortgage_provider"), input.get("property_value"),
				input.get("outstanding_amount"), input.get("mortgage_term"), input.get("monthly_installment_value"));
		journy.verifyDOBAlertMessage();
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println(methodName);
	}
	
	@Test(groups = "Outstanding_loanAmount_Alert",dataProvider = "journydata_11")
	public void outstandingloanAlert_1(HashMap<String,String>input) throws InterruptedException {
		homepage.Scroll();
		Journy journy = homepage.clickstartjourny();
		journy.getOutStandingAlert_1(input.get("mortgage_provider"),input.get("property_value"));
		journy.verifyOustandingLoanAlertText();
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println(methodName);
	}
	
	@DataProvider
	public Object[][] journydata_1() throws IOException {
		List<HashMap<String, String>> value = getjsondata(
				"D:\\Eclipse_Automation\\workspace\\mortgageWebsite\\src\\test\\java\\data\\journydata_1.json");
		return new Object[][] { { value.get(0) } };
	}

	@DataProvider
	public Object[][] journydata_10() throws IOException {
		List<HashMap<String, String>> value = getjsondata(
				"D:\\Eclipse_Automation\\workspace\\mortgageWebsite\\src\\test\\java\\data\\journydata_1.json");
		return new Object[][] { { value.get(9) } };
	}
	
	@DataProvider
	public Object[][] journydata_11() throws IOException {
		List<HashMap<String, String>> value = getjsondata(
				"D:\\Eclipse_Automation\\workspace\\mortgageWebsite\\src\\test\\java\\data\\journydata_1.json");
		return new Object[][] { { value.get(9) } };
	}
}
