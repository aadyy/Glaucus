package Glaucus.Glaucus;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageClass.LoginPage;

public class TestLoginPage extends BaseClass
{
		LoginPage lobj;
		public TestLoginPage() {
		super();
		}
		
		@BeforeTest
		public void openBrowser() {
		init();
		lobj=new LoginPage();
		}
		
		@Test(priority = 1, enabled = true, groups = "LoginPage")
		public void Test_Logo() {
		lobj.companyLogoVerification();
		}
		
		@Test(priority = 2, enabled = true, groups = "LoginPage")
		public void Test_tittleVerification() {
		lobj.tittleVerification();
		}
		
		@Test(priority = 3, enabled = true, groups = "LoginPage")
		public void Test_Url() {
		lobj.urlVerification();
		}
		
		@Test(priority = 4, enabled = true, groups = "LoginPage")
		public void Test_emailLoginButtonAndPassword() throws InterruptedException  {
		lobj.emailLoginButtonAndPassword(prop.getProperty("email"),prop.getProperty("pass"));
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		@AfterTest
		public void closeTest() throws InterruptedException {
		closeBrowser();
		}
}
