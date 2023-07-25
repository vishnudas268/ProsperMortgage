package calculatortestfiles;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import frontendpageobject.CalculatorHome;
import globalfiles.FrontendGlobaldata;

public class calculatordataadding extends FrontendGlobaldata  {
	
	@Test(dataProvider = "propertypricedatas")
	public void property_value_adding(String propertyvalues) throws InterruptedException
	{
		CalculatorHome calculatorhome=homepage.clickCalculator();
		calculatorhome.properetypricedatas(propertyvalues);
	}
	
	@Test
	public void property_down_payment_selection() throws InterruptedException
	{
		CalculatorHome calculatorhome=homepage.clickCalculator();
		calculatorhome.movedownpaymentsliders();
		Thread.sleep(10000);
	}
	
	@Test
	public void property_termyear_selection() throws InterruptedException
	{
		CalculatorHome calculatorhome=homepage.clickCalculator();
		calculatorhome.movetermyearsliders();
		Thread.sleep(10000);
	}
	
	@Test(dataProvider = "intrestratedata")
	public void intrest_rate_entering(String intrestvalue)
	{
		CalculatorHome calculatorhome=homepage.clickCalculator();
		calculatorhome.intrestrate(intrestvalue);
	}
	
	@DataProvider
	public Object[][] propertypricedatas() {
		return new Object[][] {{"780000"}};
	}
	
	@DataProvider
	public Object[][] intrestratedata()
	{
		return new Object[][] {{"5.5"}};
	}
}
