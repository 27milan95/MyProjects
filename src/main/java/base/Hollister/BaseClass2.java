package base.Hollister;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass2 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			//driver.manage().deleteAllCookies();
			
			driver.get("https://www.hollisterco.com/shop/ca");

	}

}
