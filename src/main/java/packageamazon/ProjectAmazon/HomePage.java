package packageamazon.ProjectAmazon;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//step-1
		@FindBy(xpath="//span[@class='nav-line-2 ']")
		WebElement accountnlist;
		
		@FindBy(xpath="//span[@class='nav-action-inner']")
		WebElement signinbutton;
		
		@FindBy(id="twotabsearchtextbox")
		WebElement searchbutton;
		
		@FindBy(id="nav-link-accountList-nav-line-1")
		WebElement welcomeMessage;
		
		

		//step-2
		public void accountandnlist(WebDriver driver)
		{
			Actions action =new Actions(driver);
			action.moveToElement(accountnlist).perform();
		}
		
		public void signin()
		{
			signinbutton.click();
		}
		
		public void search() throws InterruptedException
		{
			searchbutton.sendKeys("Shoe" + Keys.ENTER);
			Thread.sleep(3000);
		}
		
		
		//Step-3
		public HomePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

}
