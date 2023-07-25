package verifylogin;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import adminsidepageobject.Dashboard;
import globalfiles.BackendGlobaldata;

public class UserLogin extends BackendGlobaldata{

	@Test(dataProvider = "validVariables")
	public void verify_Login(HashMap<String,String>input) throws InterruptedException {
		Dashboard Dashboard=LoginPage.loging(input.get("email"),input.get("pass"));
	}
	
	@DataProvider
	public Object[][] validVariables() throws IOException {
		List<HashMap<String, String>>value=getjsondata("D:\\Eclipse_Automation\\workspace\\mortgageWebsite\\src\\test\\java\\data\\logindata.json");
		return new Object[][] {{value.get(0)}};
	}
}
