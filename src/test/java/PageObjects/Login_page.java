package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page  {
	//extends Basepage
	
	public static WebDriver idriver;
	
	public Login_page(WebDriver rdriver)
	{
		//this.driver=driver;
		//super(driver);
		idriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	@FindBy(xpath="//input[@id='input-email']") WebElement email;
	@FindBy(xpath="//input[@id='input-password']") WebElement password;
	@FindBy(xpath="//input[@value='Login']") WebElement login_btn;
	
	//Action Methods
	public void email(String email_id)
	{
		email.sendKeys(email_id);
	}
	public void password(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void loginbtn()
	{
		login_btn.click();
	}
	

}
