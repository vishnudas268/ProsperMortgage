package globalfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import adminsidepageobject.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BackendGlobaldata {

	
	public WebDriver driver;
	public LoginPage LoginPage;

	public WebDriver initalizedriver() throws IOException {
		Properties pro = new Properties();
		FileInputStream fis = new FileInputStream(
				"E:\\Vk_Selenium\\Mortgage\\src\\main\\java\\resourses\\globaldata.properties");
		pro.load(fis);
		String browserName = pro.getProperty("browser");
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}

	@BeforeTest(alwaysRun = true)
	public LoginPage openLink() throws IOException {
		driver = initalizedriver();
		LoginPage = new LoginPage(driver);
		LoginPage.adminlink();
		return LoginPage;
	}

	@AfterMethod(alwaysRun = true)
	public void closesite() {
		driver.close();
	}

	public List<HashMap<String, String>> getjsondata(String filepath) throws IOException {
		String jsoncontent = FileUtils.readFileToString(new File(filepath), StandardCharsets.UTF_8);
		ObjectMapper map = new ObjectMapper();
		List<HashMap<String, String>> data = map.readValue(jsoncontent,
				new TypeReference<List<HashMap<String, String>>>() {
				});
		return data;
	}

	public void importExcel() throws IOException {
		FileInputStream fis=new FileInputStream("D:\\Eclipse_Automation\\test files\\testData.xlsx");
		Workbook workbook=new XSSFWorkbook(fis);
		int sheet=workbook.getNumberOfSheets();
		for (int i=0;i<=sheet;i++) {
			if(workbook.getSheetName(i).equalsIgnoreCase("login"))
			{
				
			}
			
		}
		
	}
}
