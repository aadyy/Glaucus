package Glaucus.Glaucus;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageClass.HomePage;
import pageClass.LoginPage;

public class TestHomePage extends BaseClass {
	
	LoginPage lobj;
	HomePage hobj;
	public TestHomePage() {
	super();
	}
	
	@BeforeTest
	public void openBrowser() {
	init();
	hobj=new HomePage();
	}
	
	@Test(priority = 1, enabled = true, groups = "HomePage")
	public void Test_omsClick() {
	hobj.omsClick();
	}
	
	@Test(priority = 2, enabled = true, groups = "LoginPage")
	public void Test_userProfile() {
	hobj.userProfile();
	}
	
	@AfterTest
	public void closeTest() throws InterruptedException {
	closeBrowser();
	}
}
