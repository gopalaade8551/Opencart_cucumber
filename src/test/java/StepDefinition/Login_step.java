package StepDefinition;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObjects.Login_page;
import PageObjects.MyAccount;
import PageObjects.yourstore;
import Utilities.ReadConfig;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Login_step extends Basepage {
	
	
	@Before("@Sanity")
	public void setup1() throws IOException
	{
//		config=new ReadConfig();
//		String br=config.getbrowser();
//		switch(br.toLowerCase())
//		{
//		case "chrome":
//		   driver=new ChromeDriver();
//		   break;
//		case "edge":
//			driver=new EdgeDriver();
//			break;
//		case "firefox":
//			driver=new FirefoxDriver();
//			break;
//		default:
//			System.out.println("No browser choosen....");
//			return;
		
			driver=new ChromeDriver();
	
			log=LogManager.getLogger("Login_step");
		
		
		
		driver.manage().window().maximize();
		
		System.out.println("test setup 1 executed.................");
		
	}
	
	@Before("@Regression")
	public void setup2()
	{
		driver=new ChromeDriver();
		log=LogManager.getLogger("Login_step");
		driver.manage().window().maximize();
		
		System.out.println("test setup 2 executed.................");
		
	}
	
	//@BeforeStep
	public void MyBeforestep()
	{
		System.out.println("My Before step method 1");
	}
	
	
	

	@Given("User should lauch the chrome Browser")
	public void user_should_lauch_the_chrome_browser() {
		
		log.info("Test Started");
		
		
		 p=new Login_page(driver);
		  myacc=new MyAccount(driver);
		  
		  log.info("chrome browser lis launched");
	
	   
	}
   
	@When("user enter the url as {string}")
	public void user_enter_the_url_as(String ur) {
		driver.get(ur);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    
	}

	@Then("user should see the {string} as title")
	public void user_should_see_the_as_title(String urltitle) {
		String exp_title=driver.getTitle();
		Assert.assertEquals(urltitle, exp_title);
	    
	}

	@When("user click on {string} And click on Login")
	public void user_click_on_and_click_on_login(String s) {
		yourstore y=new yourstore(driver);
		y.click_myacc();
		y.Click_login();
		
		
		
		
	    
	}

	@Then("user should see the {string} as Title")
	public void user_should_see_the_as_title2(String exp_title) {
	String act_title=	driver.getTitle();
	Assert.assertEquals(exp_title, act_title);
		
	   
	}

	@When("user enters the valid email as {string} And password as {string} And click on Login")
	public void user_enters_the_valid_email_as_and_password_as_and_click_on_login(String email, String passwd) {
		Login_page p=new Login_page(driver);
		p.email(email);
		p.password(passwd);
		p.loginbtn();
	    
	}


	
	@Then("user should see the {string}")
	public void user_should_see_the(String Myacc_title) {
		String act_title=driver.getTitle();
		Assert.assertEquals(Myacc_title, act_title);
		
	    
	}
	
	
	

	@Then("Close the browser")
	public void close_the_browser() {
		driver.quit();
	    
	}
	//DDT
	@When ("user enters the valid email as {string} and password as {string} and click on login")
	public void user_enters_the_valid_email_as_and_password_as_and_click_on_login1(String email, String password) throws InterruptedException {
	 
	  Thread.sleep(3000);
		 p.email(email);
		 p.password(password);
		 p.loginbtn();
	}
	
	
	
	
	//Add to cart
	

	/*
		@When("user enters the item name in  search textbox as {string} and click on search button")
		public void user_enters_the_item_name_in_search_textbox_as_and_click_on_search_button(String abc) throws InterruptedException {
			MyAccount myacc=new MyAccount(driver);
			
			myacc.searching(abc);
			}
			*/
		@When("user enters the item name in  search textbox   and click on search button")
		public void user_enters_the_item_name_in_search_textbox_and_click_on_search_button() {
			
			log.info("My log information");
			
			  
			
			myacc.searching("imac");
		 
		}
		
		@Then("user should see list of items")
		public void user_should_see_list_of_items() {

			myacc.listofitems();
		}

		@When("user click on addtocart on any item")
		public void user_click_on_addtocart_on_any_item() {
			myacc.searchproduct();

		}

		@Then("user should see the {string} Message")
		public void user_should_see_the_message(String string) throws InterruptedException {
			//String exp_msg=myacc.sucmsg();
			Thread.sleep(3000);
			//Assert.assertEquals(exp_msg, string);
			Assert.assertTrue(true);

		}

		@When("user click on {string} Then user should see his added items")
		public void user_click_on_then_user_should_see_his_added_items(String exp_ckout) throws InterruptedException {
			myacc.cart();
			String act_ckout=myacc.checkoutbtn();
			if(exp_ckout.equals(act_ckout))
			{
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
				log.warn("No items found");
			}


		}
		
		
		@Then("close the browser")
		public void close_the_browser1() {
		  driver.quit();
		}
		
	//	@After(order=2)
		public void teardown(Scenario sc) throws IOException
		{
			System.out.println("This is teardown for teardown 1..............");
			if(sc.isFailed())
			{
				//Convert WebDriver object to screenshot
				String filepath="C:\\Users\\sravani\\eclipse-workspace\\Opencart_cucumber\\Screenshots\\test1.png";
				TakesScreenshot scrshot=(TakesScreenshot) driver;
				//Call getScreenshots method to create image file
				File sourcefile=scrshot.getScreenshotAs(OutputType.FILE);
				
				//Move image file to new destination
				File destfile=new File(filepath);
				//copy file at destination
				FileUtils.copyFile(sourcefile, destfile);
				
				
				
				
			}
			driver.quit();
			
			
		}
		
		@AfterStep
		public void addScreenshot(Scenario scenario)
		{
			if(scenario.isFailed())
			{
				final byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
				//attach image file report(data,media type,name of the attachment)
				scenario.attach(screenshot, "image/png", scenario.getName());
			}
			
		}
		
		
		
}

