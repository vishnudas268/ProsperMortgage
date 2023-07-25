package adminsidetestfiles;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import adminsidepageobject.Dashboard;
import adminsidepageobject.MortgageLeadList;
import globalfiles.BackendGlobaldata;

public class VerifyLeadUpload extends BackendGlobaldata{

	
	@Test(dataProvider = "loginData")
	public void uploadMortgageLead(HashMap<String, String>input) throws InterruptedException, IOException {
		Dashboard Dashboard=LoginPage.loging(input.get("email"),input.get("pass"));
		MortgageLeadList MortgageLeadList=Dashboard.openMortgageLeadList();
		MortgageLeadList.importLead();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("E:\\TestData\\UploadLead.exe");
	}
	
	@DataProvider
	public Object[][] loginData() throws IOException {
		List<HashMap<String, String>> value=getjsondata("E:\\Vk_Selenium\\Mortgage\\src\\test\\java\\data\\logindata.json");
		return new Object[][] {{value.get(0)}};
	}
}
