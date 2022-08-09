package test1;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Assertion {
	WebDriver driver;
	
  @BeforeMethod
  public void beforeMethod() {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\SAGAR\\Desktop\\PROJECT\\Drivers\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  //driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS); has been deprecated in eclipse 4
	  //driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); has been deprecated in eclipse 4
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.google.com/");
  }

  @Test
  public void googleTitleTest() {
	  String title = driver.getTitle();
	  System.out.println(title);
	  Assert.assertEquals(title, "google", "title is not a match");  
  }
  @AfterMethod
  public void tearDown() {
	  driver.quit();
  }

}