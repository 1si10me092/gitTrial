package locators;

import org.openqa.selenium.WebDriver;

public class HMS_popup {

	public static WebDriver driver;
	
	//method 1
	public static void openURL() {
		System.setProperty("webdriver.chrome.driver", "E:\\library\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("http://google.com");
		  driver.manage().window().maximize();driver
	}
	
	//method 2
	public static void VerifyLogin() {
	}
	
	//method 3
	public static void VerifyRegistration() {
	}
	
	//method 4
	public static void VerifyPR() {
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
