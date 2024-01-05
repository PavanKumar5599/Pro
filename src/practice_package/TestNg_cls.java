package practice_package;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg_cls {
  
@Test(priority=1)
  public void f1() {
	  System.out.println("1st test");
  }
  @BeforeMethod
  public void f2() {
	  System.out.println("before method");
  }
  @AfterClass
  public void f3() {
	  System.out.println("after method");
  }
  @Test(priority=2)
  public void f4() {
	  System.out.println("2nd test");
  }
  @BeforeClass
  public void f5() {
	  System.out.println("before class");
  }
  @AfterClass
  public void f6() {
	  System.out.println("after class");
  }
  @Test(priority=3)
  public void f7() {
	  System.out.println("3rd test");
  }
  @BeforeTest
  public void f8() {
	  System.out.println("Before test");
  }
  @AfterTest
  public void f9() {
	  System.out.println("after test");
  }@BeforeSuite
  public void f() {
	  System.out.println("before suite");
  }
  @AfterSuite
  public void f10() {
	  System.out.println("aftersuit");
  }
  @BeforeGroups
  public void f11() {
	  System.out.println("before groups");
  }
}
