package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","F:\\selenium\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".sf-with-ul")).click(); //.class
		driver.findElement(By.cssSelector("#search_query_top")).sendKeys("dresses"); //#id
	    driver.findElement(By.cssSelector("[type=submit]")).click(); //[attribute=value]
	    driver.findElement(By.cssSelector("a.product-name")).click(); //tag.class
	    driver.findElement(By.cssSelector("a[title=\"Log in to your customer account\"]")).click(); //tag[attribute=value]
	    driver.findElement(By.cssSelector("input#email_create")).sendKeys("abcd12"); // tag#id
	    driver.findElement(By.cssSelector("input#email[name=email]")).sendKeys("123456789"); //tag#id[attribute=value]
	    driver.findElement(By.cssSelector("input[data-validate=isPasswd")).sendKeys("987654321"); //tag[attribute=value];
	    driver.findElement(By.cssSelector("input[value=\"Enter your e-mail\"]")).sendKeys("everything is ok");
	    
	    
	    

	}

}
