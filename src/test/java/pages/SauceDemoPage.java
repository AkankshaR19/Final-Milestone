package pages;
import org.openqa.selenium.*;
public class SauceDemoPage {
	WebDriver driver;
	public SauceDemoPage(WebDriver driver) {
		this.driver=driver;
	}
	public void login() throws InterruptedException {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
	}
	public void placeOrder() throws InterruptedException {
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("shopping_cart_link")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("first-name")).sendKeys("Akanksha");
		driver.findElement(By.id("last-name")).sendKeys("Rath");
		driver.findElement(By.id("postal-code")).sendKeys("751024");
		Thread.sleep(2000);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("finish")).click();
		Thread.sleep(2000);
	}
	public String getMessage() {
		return
 driver.findElement(By.className("complete-header")).getText();
	}

}
