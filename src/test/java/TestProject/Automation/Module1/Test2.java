package TestProject.Automation.Module1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void SC02Test01() {
		System.out.println("Running the scripts for Sc02test1");
		System.out.println("Script execution complete for Sc02test1");
	}

	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Running the code for before method ");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Running the code for after method");

	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Running the code for before class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Running the code for after class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Running the code for before test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Running the code for after test");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Running the code for before suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("Running the code for after suite");
	}
}
