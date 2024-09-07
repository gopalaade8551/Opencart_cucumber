package StepDefinition;

import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import PageObjects.Login_page;
import PageObjects.MyAccount;
import PageObjects.yourstore;
import Utilities.ReadConfig;

public class Basepage {
	
	
	public static  WebDriver driver;
	public static Login_page p;
	public static MyAccount myacc;
	public yourstore ys;
	public static Logger log;
	public  ReadConfig config;
	
}
