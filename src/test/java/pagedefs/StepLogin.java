package pagedefs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class StepLogin {
	
	WebDriver driver = null;
	By username_login = By.name("username");
	By psswd_login =  By.name("password");
	By login_click = By.xpath("//*[text()='Login']");
	
	public StepLogin(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setUserName(String text) {
		driver.findElement(username_login).clear();
		driver.findElement(username_login).sendKeys(text);
	}
	public void setpsswd(String text) {
		driver.findElement(psswd_login).clear();
		driver.findElement(psswd_login).sendKeys(text);
	}
	
	public void LoginClick() {
		driver.findElement(username_login).sendKeys(Keys.RETURN);
	}
	public void setclick(String text) {
		driver.findElement(By.xpath("//*[contains(text(),'" + text + "')]")).click();
}
	
}