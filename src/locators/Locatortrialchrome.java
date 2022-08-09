package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatortrialchrome {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver","F:\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.id("search_query_top")).sendKeys("women");
		driver.findElement(By.name("submit_search")).click();
		driver.findElement(By.linkText("Printed Chiffon Dress")).click();
		driver.findElement(By.partialLinkText("Summer Dresses")).click();
		//driver.findElement(By.linkText("Casual Dresses")).click();
	}
}

