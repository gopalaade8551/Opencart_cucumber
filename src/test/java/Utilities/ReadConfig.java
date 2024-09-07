package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	Properties p;
	String path=".\\config.properties";
	
	//Constructor
	public ReadConfig() throws IOException 
	{
	try 
   {
		p=new Properties();
		FileInputStream fi=new FileInputStream(path);
	
		p.load(fi);
	} 
	catch (FileNotFoundException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	
	}
	
	public String getbrowser()
	{
		return p.getProperty("Browser");
	}

}
