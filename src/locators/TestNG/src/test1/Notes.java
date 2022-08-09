package test1;

import org.testng.annotations.Test;

public class Notes {

}


/* 
------------------------------------------------
how to run more classes or test cases
convert to TestNg / generating.xml file
1. right click on testNG class and select > TestNG > convert to TestNG > give xml name > finish
	a Xml file will be created under test-output
2. open the created Xml file
3. then in xml file under classes added all the classes which u want to be executed 
    syntax: <class name="package name.class name/>
            <class name="test1.Assertion/>
            <clas name="test1.Grouping/>
add all the classes needed to run 
then save
4.then right click the saved xml file and run as > testNGsuit

----------------------------------------------------
if u don't want any of the test case to be executed use
@Test(enabled = false)
(run as testNG test)

-----------------------------------------------------------
Include & Exclude a test case using XMl
create a  class and create a xml file using above steps

<test thread-count="5" name="Test">
    <classes>
      <class name="test1.IncludeExclude">             !/ denotes closing of class 0r method so remove it
      
      <methods>     
                                                      ! add <methods>
      <exclude name="T2"></exclude>                   ! exclude method/test case u don't want to execute
      <include name="T1"></include>                   ! include method/test case we want to execute
      <include name="T4"></include>  
          
      </methods>

      </class>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->


--------------------------------------------------------------------
for running group of test  case -normal java class
copy only the test cases no after or before methods is required
@Test(priority = 3,groups = {"logout","registration"})  // test case is part of multiple groups logout & registration

@Test(priority = 3,groups ="logout") // test case is part of single groups logout

run> run configuration > select groups > browse > select the groups to be run > click run





*/