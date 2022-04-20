package pagedefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StepTabs {
	
	WebDriver driver = null;
	
	public StepTabs(WebDriver driver) {
		this.driver = driver;
	}
	
	public void SelectTab(String text) {
		//created Placeholder instead of creating different locations for all tabs
		driver.findElement(By.xpath("//*[contains(text(),'" + text + "')]")).click();
				
	}
}


