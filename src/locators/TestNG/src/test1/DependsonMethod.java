package test1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class DependsonMethod {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
  }
  @BeforeMethod
  public void beforeMethod() {
  System.out.println("before method");
  }
  
  @Test
  public void T1() {
	  System.out.println("test 1");
  }
  
  // unless T1 is executed T2 does not executes
  // since i= 9/0 gives an exception and does not gets executed test case T2 will not be executed 
  @Test(dependsOnMethods = "T1")
  public void T2() {
	  System.out.println("test 2");
	  int i=9/0;
  }

//unless T2 is executed T3 does not executes
  // T3 is skipped as T2 is not executed
  @Test(dependsOnMethods = "T2")
  public void T3() {
	  System.out.println("test 3"); 
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method");
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("after suite");
  }

}

