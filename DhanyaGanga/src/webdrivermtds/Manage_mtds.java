package webdrivermtds;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage_mtds {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.woodenstreet.com/");
		// driver.manage().window().maximize();// to max browser
		// driver.manage().window().fullscreen();// to achieve full screen mode
		Dimension d = driver.manage().window().getSize();
		System.out.println(d.height);
		System.out.println(d.width);
		driver.manage().window().setSize(new Dimension(250, 500));
		Dimension g = driver.manage().window().getSize();
		System.out.println(g);
		Point ps = driver.manage().window().getPosition();
		System.out.println(ps);
		driver.manage().window().setPosition(new Point(200, 200));
		Point gg = driver.manage().window().getPosition();
		System.out.println(gg);

	}

}
