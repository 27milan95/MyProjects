package base.Hollister;



import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseClass {
	
	public static WebDriver driver;


	
	public void initialization() {
	

	System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
	 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.hollisterco.com/shop/ca");
	}
	
	/*@Test
    public void Title() {
		
		String Title = driver.getTitle();
		String ExpectedTitle = "Clothing for Women & Men | Teen Clothing | Hollister Co.";
		assertEquals(ExpectedTitle, Title);
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	*/
	
}


