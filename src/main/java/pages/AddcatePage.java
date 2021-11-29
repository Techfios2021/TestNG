package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddcatePage {
	
//	@FindBy(how=How.XPATH, using= "//input[@name='categorydata']") WebElement ENTER_CATEGORY;
	@FindBy(how=How.NAME, using="categorydata") WebElement ENTER_CATEGORY;
//	@FindBy(how=How.CSS, using ="#extra > input[type=submit]:nth-child(8)") WebElement ADD_CATEGORY;
	@FindBy (how=How.CSS, using="input[value='Add category']") WebElement ADD_CATEGORY_BUTTON_ELEMENT;
	

	public void entercategory() {
		ENTER_CATEGORY.sendKeys("Arunachala1");
	}
	
	public void clickonaddcategory() {
		ADD_CATEGORY_BUTTON_ELEMENT.click();
	}
	

}
