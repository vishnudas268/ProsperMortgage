package adminsidetestfiles;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import adminsidepageobject.Dashboard;
import adminsidepageobject.LeadShowPage;
import adminsidepageobject.MortgageLeadList;
import globalfiles.BackendGlobaldata;

public class MortgageApplicationEdit extends BackendGlobaldata  {

	@Test(dataProvider = "loginData")
	public void ExistingMortgage_Edit(HashMap<String, String>input) throws InterruptedException {
		Dashboard Dashboard=LoginPage.loging(input.get("email"),input.get("pass"));
		MortgageLeadList MortgageLeadList=Dashboard.openMortgageLeadList();
		LeadShowPage leadShowPage=MortgageLeadList.clickViewLead();
		leadShowPage.clickCreateApplication();
		Thread.sleep(3000);
		
	}
	
	@DataProvider
	public Object[][] loginData() throws IOException {
		List<HashMap<String, String>> value=getjsondata("D://Eclipse_Automation//workspace//mortgageWebsite//src//test//java//data//logindata.json");
		return new Object[][] {{value.get(0)}};
	}
}
