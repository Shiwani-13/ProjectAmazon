package packageamazon.ProjectAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {
	
	//step-1
	@FindBy(id="ap_email_login")
	WebElement username;
	
	@FindBy(id="continue")
	WebElement continuebutton;
	
	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(id="auth-signin-button")
	WebElement loginbutton;
	
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement name;
	
	
	   //step-2
			public void uname(String un)
			{
				username.sendKeys(un);
			}
			public void continueButton()
			{
				continuebutton.click();
			}
			
			public void pwd(String pw)
			{
				password.sendKeys(pw);
			}
			
			public void login() throws InterruptedException
			{
				loginbutton.click();
				Thread.sleep(3000);
				
				
			}
			
	
	//Step-3
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}



