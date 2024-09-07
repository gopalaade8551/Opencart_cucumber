package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import StepDefinition.Login_step;

public class MyAccount  {
	//extends Basepage
	
	WebDriver idriver;
	String item;
	
	public MyAccount(WebDriver rdriver)
	{
		//super(driver);
		//this.driver=driver;
		idriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath="//input[@name='search']") WebElement search_txt;
	@FindBy(xpath="//i[@class='fa fa-search']") WebElement search_btn;
	@FindBy(xpath="//h4//a") List<WebElement> result;
	@FindBy(xpath="//button[@type='button']//span[@class='hidden-xs hidden-sm hidden-md']") List<WebElement> Addtocart;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement succ_msg;
	@FindBy(xpath="//a[@title='Shopping Cart']//i[@class='fa fa-shopping-cart']") WebElement shoppingcart;
	@FindBy(xpath="//a[@class='btn btn-primary']") WebElement checkout;
	@FindBy(xpath="//tfoot//tr[4]//td[2][@class='text-end']") WebElement totalprice;
	
	//wish list
	@FindBy(xpath="//button[@type='button']//i[@class='fa fa-heart']") List<WebElement> wishlist;
	@FindBy(xpath="//i[@class='fa fa-check-circle']") WebElement succmsg;
	@FindBy(xpath="//a[@id='wishlist-total']") WebElement wishlist_cart;
	
	@FindBy(xpath="//td[normalize-space()='Product 14']") WebElement iteminwishlist;
	
	
	//Action methods
	
	public void searching(String item)
	{
		search_txt.sendKeys(item);
	
	
	
		search_btn.click();
	}
	
	public void listofitems()
	{
		for (WebElement webElement : result) {
			System.out.println(webElement.getText()+" ");
			
		}
	}
	public void searchproduct()
	{
		for (int i=0;i<result.size();i++) {
			
			String prod_name=result.get(i).getText();
			if(prod_name.equals("iMac"))
			{
				Addtocart.get(i).click();
				
			}
			
			
			
		}
		
	
	}
	
	public void cart() throws InterruptedException 
	{
		
		shoppingcart.click();
		Thread.sleep(3000);
	}

	public String checkoutbtn()
	{
//		WebDriverWait wait=new WebDriverWait(idriver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOf(checkout));
	
		return checkout.getText();
		
	} 
	
	public void wishlist_click()
	{
for (int i=0;i<result.size();i++)
    {
			
			String prod_name=result.get(i).getText();
			if(prod_name.equals("iMac"))
			{
				wishlist.get(i).click();
				
			}
			
			
			
    }
	}

   public String sucmsg()
         {
	return succmsg.getText();
         }


	
	public void item_wishlist()
	{
		wishlist_cart.click();
		
	}
	
	public String listofitemsinwishlist()
	{
		return iteminwishlist.getText();
	}
	
	
	
		

}
