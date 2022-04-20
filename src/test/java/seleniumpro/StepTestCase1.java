package seleniumpro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepTestCase1 {
	private static WebDriver driver = null;
	private static WebDriverWait wait = null;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		//getting to Step link
		driver.get("http://localhost:8080/#/root/plans/list");
		driver.manage().window().maximize();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		StepLogin();
		StepTabs();
		driver.close();
		driver.quit();

	}
	
	public static void StepLogin() throws InterruptedException{
		
		pagedefs.StepLogin loginn = new pagedefs.StepLogin(driver);
		//Logging in
		loginn.setUserName("admin");
		loginn.setpsswd("init");
		loginn.LoginClick();
		
	}
	
	public static void StepTabs() throws InterruptedException{
		pagedefs.StepTabs clk= new pagedefs.StepTabs(driver);
		
		//created Placeholder instead of creating different locations for all tabs
		
		clk.SelectTab("Keywords");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'No data')]")));
		clk.SelectTab("Parameters");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'No data')]")));
		clk.SelectTab("Executions");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'No data')]")));
		clk.SelectTab("Scheduler");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'No data')]")));
		clk.SelectTab("Grid");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'No data')]")));
		clk.SelectTab("Admin");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'dmin')]")));
	}

}
