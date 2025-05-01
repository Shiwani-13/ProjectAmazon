package packageamazon.ProjectAmazon;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class SearchResultPage {
	//Step-1
		@FindBy(xpath="//span[text()='₹1,200 - ₹1,500']")
	    //@FindBy(xpath="//div[@id ='brandsRefinements']/child::ul//li//span[contains(@class,'a-size-base') and text() = 'Puma']\";")
		WebElement pricerangeFilter;
		
		@FindBy(xpath="//span[@class='a-price-whole']")
		List<WebElement> priceValue;
		
		
		@FindBy(xpath="//div[@class='a-section aok-relative s-image-tall-aspect']")
		List<WebElement> shoeList;

		//step-2
		
		
		public void applyFilter() throws InterruptedException
		{
			pricerangeFilter.click();
			Thread.sleep(4000);
			String text= pricerangeFilter.getText();
			System.out.println(text);
		}
		
		public int shoeListSize()
		{
			//int size =shoeList.size();
	        return shoeList.size();
			}
		
		public int getPrice()
		{
			//int size =shoeList.size();
	        return priceValue.size();
			}


		//Step-3
		
			public SearchResultPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

		
		
				
	
}

