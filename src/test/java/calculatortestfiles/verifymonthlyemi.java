package calculatortestfiles;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import frontendpageobject.CalculatorHome;
import globalfiles.FrontendGlobaldata;

public class verifymonthlyemi extends FrontendGlobaldata {

	@Test(dataProvider = "enteredCalculationData")
	public void verifyCalculatedEmi(String propertyvalues,String intrestvalue) throws InterruptedException
	{
		CalculatorHome calculatorhome=homepage.clickCalculator();
		calculatorhome.properetypricedatas(propertyvalues);
		calculatorhome.movedownpaymentsliders();
		calculatorhome.movetermyearsliders();
		calculatorhome.intrestrate(intrestvalue);
		calculatorhome.verifyemi();
	}
	
	@DataProvider
	public Object[][] enteredCalculationData()
	{
		return new Object[][] {{"405000","6.5"}};
	}
}
