package factory;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.*;
public class DriverFactory {
	static WebDriver driver;
	public static WebDriver getDriver(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver =  new EdgeDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}
	public static void quitDriver() {
		if(driver != null) {
			driver.quit();
			driver=null;
		}
	}
}
