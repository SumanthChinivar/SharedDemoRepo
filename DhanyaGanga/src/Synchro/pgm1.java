package Synchro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pgm1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.woodenstreet.com/");
		WebElement xbutton = driver.findElement(By.id("loginclose1"));
		// driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// Thread.sleep(15000);
		WebDriverWait explit = new WebDriverWait(driver, 15);
		explit.until(ExpectedConditions.visibilityOf(xbutton)).click();

	}
}
