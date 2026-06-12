package tests;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.*;
import factory.DriverFactory;
import pages.SauceDemoPage;
import com.aventstack.extentreports.*;
import reports.ExtentManager;
public class SauceDemoTest {
	WebDriver driver;
	SauceDemoPage page;
	ExtentReports extent;
	ExtentTest test;
	@Parameters("browser")
	@BeforeMethod
	public void setup(String browser) {
		extent = ExtentManager.getReport();
		test = extent.createTest("SauceDemo Order Test");
		driver=DriverFactory.getDriver(browser);
		driver.get("https://www.saucedemo.com/");
		page=new SauceDemoPage(driver);
	}
	@Test
	public void orderTest() throws InterruptedException {
		page.login();
		Thread.sleep(2000);
	
		test.pass("Login Successful");
		
		page.placeOrder();
		Thread.sleep(2000);
		test.pass("Order Placed");

		Assert.assertEquals(page.getMessage(), "Thank you for your order!");
		Thread.sleep(2000);
		test.pass("Order Confirmation");
	}
	@AfterMethod
	public void tearDown() {
		extent.flush();
		DriverFactory.quitDriver();
	}

}
