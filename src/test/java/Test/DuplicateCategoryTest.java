package Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.AddcatePage;
import util.TestBase;

public class DuplicateCategoryTest extends TestBase{

	WebDriver driver;
	 
	 
	 @BeforeMethod
	 public void runbefore() {
			driver = init();
	}
	
	 @Test
	public void addDuplicate() throws InterruptedException {
		 AddcatePage addcatPage = PageFactory.initElements(driver, AddcatePage.class);
		 Thread.sleep(3000);
		if (driver.getPageSource().contains("savitha")) {
			System.out.println("The category you want to add already exists: <duplicated category name>");
		}
		else {
			addcatPage.entercategory();
		}
		
	}
	 @AfterMethod
	 public void tear() {
		 teardown();
	 }
}
