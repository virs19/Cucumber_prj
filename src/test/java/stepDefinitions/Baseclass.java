package stepDefinitions;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import pageObjects.AddCustomers;
import pageObjects.Loginpage;

public class Baseclass {
	public WebDriver gcdriver;
	public Loginpage lp;
	AddCustomers addcust;
	
	public static String randomString()
	{
		String generatedString1= RandomStringUtils.randomAlphabetic(5);
		return (generatedString1);
	}

}
