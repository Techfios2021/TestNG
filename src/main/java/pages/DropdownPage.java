package pages;



import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {
	
	
	@FindBy (how=How.NAME, using="due_month") WebElement DROPDOWN_MONTHS;
	
	public void click_dropdown() {
		DROPDOWN_MONTHS.click();
	}
	
	public void redingmonths() {
		
		Select month_tab = new Select(DROPDOWN_MONTHS);
		List<WebElement> months = month_tab.getOptions();
		
		int total_months = months.size();
		  System.out.println("total months count is :"+ total_months );
		  
		   
		for (WebElement mon: months) {
			String month_name = mon.getText();
			System.out.println("Months are:"+month_name);
		}
		
		
		
		}
	
	
	
	
	
	

}
