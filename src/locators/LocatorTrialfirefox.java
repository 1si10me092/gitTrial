package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorTrialfirefox {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","F:\\selenium\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.id("search_query_top")).sendKeys("women");
		driver.findElement(By.name("submit_search")).click();
		driver.findElement(By.linkText("Printed Chiffon Dress")).click();
		driver.findElement(By.partialLinkText("Summer Dresses")).click();
		driver.findElement(By.className("sf-with-ul")).click();
		
		
	}
}
