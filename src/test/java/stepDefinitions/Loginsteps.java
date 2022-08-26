package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.*;
import junit.framework.Assert;
import pageObjects.Loginpage;

public class Loginsteps {
	
	public WebDriver gcdriver;
	public Loginpage lp;
	
	@Given("Launch chrome browser")
	public void launch_chrome_browser() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		gcdriver=new ChromeDriver();
		lp=new Loginpage(gcdriver);	
	}

	@When("open Url {string}")
	public void open_url(String url)
	{
		
	    gcdriver.get(url);
	}

	@Then("enter email address {string} and enter password {string}")
	public void enter_email_address_and_enter_password(String email, String pswd) throws InterruptedException {
	   lp.type_email(email);
	   lp.type_Password(pswd);
	}

	@Then("click on Login button")
	public void click_on_login_button() throws InterruptedException {
	   lp.click_Login();
	}

	@Then("verify home page title")
	public void verify_home_page_title() {
	    String exptitle="Dashboard / nopCommerce administration";
	    String act_title=gcdriver.getTitle();
	    Assert.assertEquals(exptitle, act_title);
	}

	@When("click on Logout button")
	public void click_on_logout_button() throws InterruptedException {
		lp.click_Logout();
	}

	@Then("verify title page after log out")
	public void verify_title_page_after_log_out() throws InterruptedException {
	String title="Your store. Login";
	String title1=gcdriver.getTitle();
	Assert.assertEquals(title, title1);
	}

	@Then("close browser")
	public void close_browser() {
	    gcdriver.close();
	}


}
