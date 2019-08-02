package pageClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Glaucus.Glaucus.BaseClass;
import propertyFile.ConfigrationPropertyFile;

public class HomePage extends BaseClass{
	
	public HomePage() {
	PageFactory.initElements(driver, this);
	}
		
	@FindBy(xpath = ConfigrationPropertyFile.oms)
	WebElement oms;
	@FindBy(xpath = ConfigrationPropertyFile.omsFullname)
	WebElement omsfullTittle;
	public void omsClick() {
	oms.click();
	String omstittle=oms.getText();
	System.out.println("OMS tittle name-->"+omstittle);
	
	String omsFull=omsfullTittle.getText();
	System.out.println("OMSFullTittle-->"+omsFull);
	}
	
	@FindBy(xpath = ConfigrationPropertyFile.profileName)
	WebElement profileName;
	public void userProfile() {
	String name=profileName.getText();
	System.out.println("user profile name-->"+name);
	}
}
