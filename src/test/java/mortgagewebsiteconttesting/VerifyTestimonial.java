package mortgagewebsiteconttesting;

import org.testng.annotations.Test;

import globalfiles.FrontendGlobaldata;

public class VerifyTestimonial extends FrontendGlobaldata {
	
	@Test
	public void testimonialVerification_BALARAM_BALIARSINGH() throws InterruptedException {
		Thread.sleep(3000);
		homepage.verifyTestimonialContent();
	}

}
