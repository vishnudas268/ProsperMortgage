package mortgageleadtestfiles;

import static org.testng.Assert.assertEquals;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import adminsidepageobject.Dashboard;
import adminsidepageobject.LeadShowPage;
import adminsidepageobject.MortgageLeadList;
import globalfiles.BackendGlobaldata;

public class LeadStatusChange extends BackendGlobaldata {

	@Test(dataProvider = "loginData")
	public void importLeadstatuschange(HashMap<String, String> input) throws InterruptedException {
		Dashboard Dashboard = LoginPage.loging(input.get("email"), input.get("pass"));
		MortgageLeadList MortgageLeadList = Dashboard.openMortgageLeadList();
		MortgageLeadList.importLead();
		Thread.sleep(3000);
		String expected = MortgageLeadList.getAssignedUser();
		//LeadShowPage LeadShowPage = MortgageLeadList.showImportLead();
		Thread.sleep(3000);
		//String actual = LeadShowPage.userShowPage();
		//assertEquals(actual, expected);
	}

	@DataProvider
	public Object[][] loginData() throws IOException {
		List<HashMap<String, String>> value = getjsondata(
				"D:\\Eclipse_Automation\\workspace\\mortgageWebsite\\src\\test\\java\\data\\logindata.json");
		return new Object[][] { { value.get(0) } };
	}

	@Test(dataProvider = "loginData")
	public void leadAssigneVerification(HashMap<String, String>input) throws InterruptedException {
		Dashboard Dashboard = LoginPage.loging(input.get("email"), input.get("pass"));
		MortgageLeadList MortgageLeadList = Dashboard.openMortgageLeadList();
		MortgageLeadList.importLead();
		Thread.sleep(3000);
	}
}
