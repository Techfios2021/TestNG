package Test;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import pages.AddcatePage;
import util.TestBase;


public class AddCategoryTest extends TestBase  {
	
	WebDriver driver;
//	 AddcatePage addcategoryPage;
	 
	 @BeforeMethod
	 public void beforerun() {
			driver= init();
	}
	 
	 
	 @Test
	 public void addcat() throws InterruptedException {
		 
		 AddcatePage addcategoryPage = PageFactory.initElements(driver, AddcatePage.class);
		 Thread.sleep(2000);
		 addcategoryPage.entercategory();
		 Thread.sleep(2000);
		 addcategoryPage.clickonaddcategory();
		 
		if (driver.getPageSource().contains("Arunachala1")) {
			System.out.println("Category given exist");
		}
		else {
			System.out.println("No such category");
		}
	 }

	 @AfterMethod
	 public void close() {
		 teardown();
	 }
}
