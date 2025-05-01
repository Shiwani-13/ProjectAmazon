package packageamazon.ProjectAmazon;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_02_AmazonLogin extends BaseClass{
	@Test
	public void login() throws InterruptedException
	{
		HomePage homepage = new HomePage(driver);
		homepage.accountandnlist(driver);
		homepage.signin();
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.uname("priyashiwani13@gmail.com");
		loginpage.continueButton();
		loginpage.pwd("Civa@13041995");
		loginpage.login();
		
		String expectedname = homepage.welcomeMessage.getText();
		System.out.println(expectedname);
		//SoftAssert s= new SoftAssert();
		Assert.assertTrue(expectedname.contains("Shiwani"));
		
	}	
	
	
		
}

