package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.Select;

public class AddCustomers {
	WebDriver gcdriver;
	

	public AddCustomers(WebDriver gcdriver) {
		
		 this.gcdriver=gcdriver;
	}
	By linkcustomermenu=By.xpath("//body/div[3]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[4]/a[1]/p[1]");
	By linkcustomer=By.xpath("//body[1]/div[3]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[4]/ul[1]/li[1]/a[1]/p[1]");
	By btnadd=By.xpath("//a[@class='btn btn-primary']");
	
	By txtemail=By.xpath("//input[@id='Email']");
	By txtpassword=By.xpath("//input[@id='Password']");
	
	By txtcustomerroles=By.xpath("//div[@class='k-widget k-multiselect k-multiselect-clearable']//ul//li");
	By listadmin=By.xpath("//li[contains(text(),'Administrators')]");
	By listforum=By.xpath("//li[contains(text(),'Forum Moderators')]");
	By listguest=By.xpath("//li[contains(text(),'Guests')]");
	By listreg=By.xpath("//li[text()='Registered']");
	By listvendor=By.xpath("//li[text()='Vendors']");
	
	By drpvendor=By.xpath("//select[@id='VendorId']");
	By rdmale=By.xpath("//input[@id='Gender_Male']");
	By rdfemale=By.xpath("//input[@id='Gender_Female']");

	
	By txtfirstname=By.xpath("//input[@id='FirstName']");
	By txtlastname=By.xpath("//input[@id='LastName']");
	By txtdob=By.xpath("//input[@id='DateOfBirth']");

	By txtcompanyname=By.xpath("//input[@id='Company']");
	
	By txtadmincmnt=By.xpath("//div[@class='col-md-9']//textarea[@id='AdminComment']");
	
	By btnsave=By.xpath("//button[@name='save']");
	
	//action method
	
	public String getTitle() {
		return gcdriver.getTitle();
		
		
	}
	
	public void click_CustomerMenu() throws InterruptedException
	{
		gcdriver.findElement(linkcustomermenu).click();
		Thread.sleep(3000);
	  
	}
	public void click_Customerlink() throws InterruptedException
	{
		gcdriver.findElement(linkcustomer).click();
		Thread.sleep(3000);
	  
	}
	public void click_AddNewBtn() throws InterruptedException
	{
		gcdriver.findElement(btnadd).click();
		Thread.sleep(3000);
		
	}
	public void setEmail(String emailid ) throws InterruptedException
	  {
		 
		  gcdriver.findElement(txtemail).sendKeys(emailid);
		  Thread.sleep(3000);
	  }
	  public void setPassword(String pswd) throws InterruptedException
	  {
		
		  gcdriver.findElement(txtpassword).sendKeys(pswd);
		  Thread.sleep(3000);
	  }
	  public void type_Firstname(String fname) throws InterruptedException
	  {
		  gcdriver.findElement(txtfirstname).sendKeys(fname);
		  Thread.sleep(3000);
	  }
	  public void type_Lastname(String lname) throws InterruptedException
	  {
		  gcdriver.findElement(txtlastname).sendKeys(lname);
		  Thread.sleep(3000);
	  }
	  public void setCustomerRoles(String role) throws InterruptedException
	  {
		 
		  
		gcdriver.findElement(txtcustomerroles).click();
		 Thread.sleep(3000);
	     
	  }
	  public void setManageOfVendors(String value) throws InterruptedException
	  {
		  Select drp=new Select(gcdriver.findElement(drpvendor));
		  drp.selectByVisibleText(value);
		  Thread.sleep(3000);
	  }
	  
	  public void setGender(String gender) throws InterruptedException
	  {
		  if(gender.equals("Male"))
		  {
			  gcdriver.findElement(rdmale).click();
		  }
		  else
		  {
			  gcdriver.findElement(rdfemale).click();
		  }
		  Thread.sleep(3000);
	  }
	  public void setDob(String dob) throws InterruptedException
	  {
		  gcdriver.findElement(txtdob).sendKeys(dob);
		  Thread.sleep(3000);
		 
	  }
	  
	  public void setCompanyName(String comname) throws InterruptedException
	  {
		  gcdriver.findElement(txtcompanyname).sendKeys(comname);
		  Thread.sleep(3000);
		
	  }
	  
	  public void setAdminContent(String content) throws InterruptedException
	  {
		  gcdriver.findElement(txtcompanyname).sendKeys(content);
		  Thread.sleep(3000);
	  }
	  public void clickSave() throws InterruptedException
	  {
		  gcdriver.findElement(btnsave).click();
		  Thread.sleep(3000);
	  }
	  
	  
}
