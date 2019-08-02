package Glaucus.Glaucus;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	public static WebDriver driver;
	public static Properties prop;
	
	public BaseClass() {
		try {
		prop=new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\Glaucus\\src\\main\\java\\propertyFile\\file.properties");
		prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void init() {
	String browser=prop.getProperty("browser");
	
	if (browser.equalsIgnoreCase("chrome")) {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(prop.getProperty("url"));
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	}
	}
	
	public static void closeBrowser() throws InterruptedException {
	Thread.sleep(3000);
	driver.close();
	}

}
