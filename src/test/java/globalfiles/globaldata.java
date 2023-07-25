package globalfiles;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.homepage;

public class globaldata {
	public WebDriver driver;
	public homepage homepage;
	
	public WebDriver initalizedriver() throws IOException
	{
		Properties pro=new Properties();
		FileInputStream fis=new FileInputStream("E:\\Work_space\\mortgageWebsite\\src\\main\\java\\resourses\\globaldata.properties");
		pro.load(fis);
		String browsername=pro.getProperty("browser");
		if(browsername.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if (browsername.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}
	
	@BeforeMethod(alwaysRun = true)
	public homepage openlink() throws IOException
	{
		driver=initalizedriver();
		homepage= new homepage(driver);
		homepage.link();
		return homepage;
	}
	
	@AfterMethod(alwaysRun = true)
	public void closesite()
	{
		driver.quit();
	}
	
	public List<HashMap<String, String>> getjsondata(String filepath) throws IOException
	{
		String jsoncontent=FileUtils.readFileToString(new File(filepath),StandardCharsets.UTF_8);
		ObjectMapper map=new ObjectMapper();
		List<HashMap<String,String>> data=map.readValue(jsoncontent,new TypeReference<List<HashMap<String,String>>>() {
		});
		return data;
	}
	
	
}
	