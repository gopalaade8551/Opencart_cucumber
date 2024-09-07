package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class yourstore   {
	
	WebDriver idriver;
	public yourstore(WebDriver rdriver)
	{
		//super(driver);
		idriver=rdriver;
		idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//span[normalize-space()='My Account']") WebElement MyAccount;
	
	@FindBy(xpath="//a[normalize-space()='Login']") WebElement Login;
	@FindBy(xpath="//a[normalize-space()='Register']") WebElement Register;
	
	//Action methods
	public void click_myacc()
	{
		MyAccount.click();
	}
	public void Click_login()
	{
		Login.click();
	}
	public void Click_Register()
	{
		Register.click();
	}
	
	

}
