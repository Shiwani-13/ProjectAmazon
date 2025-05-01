package packageamazon.ProjectAmazon;

import org.testng.annotations.Test;

public class TC_04_SearchProductWithFilter extends BaseClass{

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
		
		homepage.search();
		
		SearchResultPage search = new SearchResultPage(driver);
		search.applyFilter();
	}
}

