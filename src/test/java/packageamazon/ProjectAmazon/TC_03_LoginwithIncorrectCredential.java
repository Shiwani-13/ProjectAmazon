package packageamazon.ProjectAmazon;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_03_LoginwithIncorrectCredential extends BaseClass{
	@Test
	public void login() throws InterruptedException
	{
		HomePage homepage = new HomePage(driver);
		homepage.accountandnlist(driver);
		homepage.signin();
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.uname("priyashiwani13@gmail.com");
		loginpage.continueButton();
		loginpage.pwd("123456");
		loginpage.login();
		
		String expectedname = homepage.welcomeMessage.getText();
		System.out.println(expectedname);
		Assert.assertTrue(expectedname.contains("Your password is incorrect"));
		
	}	

}
