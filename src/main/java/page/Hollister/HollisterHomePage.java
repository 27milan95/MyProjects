package page.Hollister;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Hollister.BaseClass;

public class HollisterHomePage extends BaseClass {
	
	@FindBy(xpath="//span[text()='Sign In or Create Account']")
	List<WebElement> SignInButton;
	
	@FindBy(xpath="//span[@aria-label='Top category for Hollister categories']")
	WebElement flag;
	
	@FindBy(xpath="//div[@class='signin-block']")
	WebElement Button;
	
	@FindBy(xpath="//button[(@type='button') and (@data-variant='secondary')]")
	WebElement SignIn;	
	
	@FindBy(id="email-sign-in")
	WebElement email;
	
	@FindBy(id="login-password-field-sign-in")
	WebElement password;
	
	@FindBy(xpath="//button[contains(text(),'button ds-override primary-button')]")
	WebElement UserSignIn;
	
	@FindBy(xpath="//span[text()='Hey, Milan')")
	WebElement MilanHomePage;
	
	public  HollisterHomePage() throws Exception {
		super();
		
		PageFactory.initElements(driver, this);
		
	}
	public String Title() {
		return driver.getTitle();
	}

	
	public int SignInButton() {
		return SignInButton.size();
	}
	
	public boolean logo() {
		 return flag.isDisplayed();
	}
	
	public boolean PopUpSignIn() throws Exception {
		Button.click();
		System.out.println("--------");
		Thread.sleep(2000);
		return SignIn.isDisplayed();
	}
	
	
}
