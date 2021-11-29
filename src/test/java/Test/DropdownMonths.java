package Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.DropdownPage;
import util.TestBase;

public class DropdownMonths extends TestBase {

	WebDriver driver;
	
	 @BeforeMethod
	 public void beforerun() {
			driver= init();
	}
	 
	 
	@Test
	public void months() {
		
		DropdownPage dropdown = PageFactory.initElements(driver, DropdownPage.class);
		dropdown.click_dropdown();
		dropdown.redingmonths();
	
	}
	
	@AfterMethod
	 public void close() {
		 teardown();
	 }
	
}
