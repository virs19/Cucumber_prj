package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.*;
import junit.framework.Assert;
import pageObjects.AddCustomers;
import pageObjects.Loginpage;


public class Loginsteps extends Baseclass{
	
	
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
	    gcdriver.manage().window().maximize();
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
	//Add new customer features steps
	
	@Then("User can view Dashboard")
	public void user_can_view_dashboard() throws InterruptedException {
	   addcust=new AddCustomers(gcdriver);
	   Assert.assertEquals("Dashboard / nopCommerce administration", addcust.getTitle());
	   Thread.sleep(4000);
	}

	@When("User click on customer menu")
	public void user_click_on_customer_menu() throws Exception {
		addcust.click_CustomerMenu();
		
	   
	}

	@When("select customermenu item")
	public void select_customermenu_item() throws Exception {
	    addcust.click_Customerlink();
	}

	@When("click on add new button")
	public void click_on_add_new_button() throws InterruptedException {
	  addcust.click_AddNewBtn();
	}

	@Then("Customer can view add new customer page")
	public void customer_can_view_add_new_customer_page() {
	  Assert.assertEquals("Add a new customer / nopCommerce administration",addcust.getTitle());
	}

	@When("user enter customer info")
	public void user_enter_customer_info() throws InterruptedException {
	  String eid=randomString() + "@gmail.com";
	  addcust.setEmail(eid);
	  addcust.setPassword("test321");
	  addcust.type_Firstname("Rose");
	  addcust.type_Lastname("Marry");
	  addcust.setGender("Female");
	  addcust.setDob("7/07/1995");
	  addcust.setCompanyName("Lopcop");
	 
	  addcust.setCustomerRoles("Forum Moderators");
	  addcust.setManageOfVendors("Vendor 1");
	  addcust.setAdminContent("testing account...");
	}

	@When("click on save button")
	public void click_on_save_button() throws InterruptedException {
	   addcust.clickSave();
	}

	@Then("User can view confirmation message {string}")
	public void user_can_view_confirmation_message(String msg) {

	Assert.assertTrue(gcdriver.findElement(By.tagName("body")).getText().contains("The new customer has been added successfully"));
	}
	



}
