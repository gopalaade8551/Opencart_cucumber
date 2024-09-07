package StepDefinition;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.MyAccount;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Wish_list extends Basepage {
	
	WebDriver driver;
	
	
	
	@When("user click on {string} option on any product")
	public void user_click_on_option_on_any_product(String string) {
		
		log=LogManager.getLogger("Wish_list");
//		myacc=new MyAccount(driver);
//		driver=new ChromeDriver();
		log.info("user added item into his wishlist");
		myacc.wishlist_click();
		
	    
	}

	@Then("user should see the {string}  Message")
	public void user_should_see_the_message(String string) {
		System.out.println(myacc.sucmsg());
	    
	}

	@When("user click on {string} Link in the message")
	public void user_click_on_link_in_the_message(String string) {
		
		myacc.item_wishlist();
	    
	}

	@Then("user should see the product in the {string}")
	public void user_should_see_the_product_in_the(String string) {
		String act_text=myacc.listofitemsinwishlist();
		String exp_text="Product 14";
		Assert.assertEquals(act_text, exp_text);
		
	System.out.println(act_text);
	   
	}
	

}
