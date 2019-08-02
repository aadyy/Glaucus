package pageClass;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Glaucus.Glaucus.BaseClass;
import propertyFile.ConfigrationPropertyFile;

public class LoginPage extends BaseClass {
	
	public LoginPage() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = ConfigrationPropertyFile.logo)
	WebElement logo;
	public void companyLogoVerification() {
	logo.isDisplayed();
	} 
	
	public void tittleVerification() {
	String tittle=driver.getTitle();
	System.out.println("Browser Tittle --> "+tittle);
	assertEquals(tittle, "Maven by Glaucus");
	}
	
	public void urlVerification() {
	String url=driver.getCurrentUrl();
	System.out.println("Page URL --> "+url);
	assertEquals(url, "https://testfrontend.gscmaven.com/#/login");
	}
	
	
	@FindBy(xpath = ConfigrationPropertyFile.email)
	WebElement email;
	@FindBy(xpath = ConfigrationPropertyFile.pass)
	WebElement pass;
	@FindBy(xpath = ConfigrationPropertyFile.button)
	WebElement loginbutton;
	public void emailLoginButtonAndPassword(String em,String pas) throws InterruptedException  {
	email.sendKeys(em);
	pass.sendKeys(pas);
	Thread.sleep(4000);
	loginbutton.click();
	}
	
	
	
	
}
