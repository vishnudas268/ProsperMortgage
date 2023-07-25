package adminsidetestfiles;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import adminsidepageobject.LoginPage;
import globalfiles.BackendGlobaldata;

public class VerifyMortgageProposel extends BackendGlobaldata {
	
	@Test(dataProvider ="logindata")
	public void mortgageproposelverification(HashMap<String, String>input) throws InterruptedException
	{
		LoginPage Loginpage=new LoginPage(driver);
		Loginpage.loging(input.get("email"),input.get("pass"));
	}
	
	@DataProvider
	public Object[][] logindata() throws IOException {
		List<HashMap<String, String>> value = getjsondata(
				"C:\\Users\\vishnudas\\git\\repository\\mortgageWebsite\\src\\test\\java\\data\\logindata.json");
		return new Object[][] { { value.get(0) } };
	}
}
