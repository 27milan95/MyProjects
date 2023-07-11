package test.Hollister;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Hollister.BaseClass;
import page.Hollister.HollisterHomePage;

public class HollisterHomeTest extends BaseClass {
	
	HollisterHomePage home;
	
	
	public HollisterHomeTest() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	@BeforeMethod
	public void setup() {
		initialization();
	}
	
	
	
	//@Test(priority=1)
	public void TitleTest() throws Exception {
		home = new HollisterHomePage();
		String Title = "Clothing for Women & Men | Teen Clothing | Hollister Co.";
		assertEquals(home.Title(), Title);
		System.out.println("Test---1");
	}
	
	
	
	
	//@Test(priority=2)
	public void VerifySignInButton() throws Exception {
		home = new HollisterHomePage();	
	System.out.println(home.SignInButton());
		//Thread.sleep(2000);
		Assert.assertEquals(home.SignInButton(), 1, "Pass"); 
		//assertEquals(home.SignInButton(), 0, "Test Failed");
		System.out.println("test---2");
	}
	
	
	
	//@AfterMethod
	public void tearup() {
		driver.quit();
	}
	
	
	
	//@Test(priority=3)
	public void verifyLogo() throws Exception {
		home = new HollisterHomePage();
		Assert.assertEquals(home.logo(), true);
	}
  
	@Test
	public void SignInPopUp() throws Exception {
		home = new HollisterHomePage();
		
		Assert.assertEquals(home.PopUpSignIn(), true);
		
	}
	
}
