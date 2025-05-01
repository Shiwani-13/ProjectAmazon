package packageamazon.ProjectAmazon;

import org.testng.Assert;
import org.testng.annotations.Test;


@Test
public class TC_05_AmazonSearch extends BaseClass {
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
		
		homepage.search();
		SearchResultPage searchPage = new SearchResultPage(driver);
		int size =searchPage.shoeListSize();
		Assert.assertEquals(size>50, true);
	}
}
