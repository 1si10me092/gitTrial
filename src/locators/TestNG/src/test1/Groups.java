package test1;

import org.testng.annotations.Test;

@Test (groups="reg")
public class Groups {
	 public void beforeMethod() {
		  System.out.println("before method");
		  }
		  
		  @Test(priority = 1,groups ="login")
		  public void T1() {
			  System.out.println("test 1");
		  }
		 
		  @Test(priority = 2,groups ="login")
		  public void T2() {
			  System.out.println("test 2");
		  }

		  @Test(priority = 3,groups = {"logout","registration"})  // test case is part of multiple groups logout & registration
		  public void T3() {
			  System.out.println("test 3");
		  }
		  
		  @Test(enabled = false)
		  public void T6() {
			  System.out.println("test 3");
		  }
		  
		  @Test(priority = 4, groups ="logout")
		  public void T4() {
			  System.out.println("test 4");
		  }

}
