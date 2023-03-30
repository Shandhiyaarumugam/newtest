package nexttest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test(enabled=true)
  public void first() {
	  System.out.println("FIRST");
  }
  @BeforeMethod
  public void second() {
	  System.out.println("SECOND");
  }

  @AfterMethod(enabled=false)
  public void third() {
	  System.out.println("THIRD");
  }

  @BeforeClass
  public void fourth() {
	  System.out.println("FOURTH");
  }

  @AfterClass
  public void fifth() {
	  System.out.println("fifth");
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("complete");
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
