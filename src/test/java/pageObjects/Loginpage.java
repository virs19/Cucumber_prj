package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Loginpage {
	WebDriver gcdriver;
	By emailadd=By.name("Email");
	By password=By.name("Password");
	By loginbutton=By.xpath("//button[text()='Log in']");
	By logoutbutton=By.xpath("//a[text()='Logout']");

	public Loginpage(WebDriver gcdriver) {
		
		 this.gcdriver=gcdriver;
	}
	
	 public void type_email(String email ) throws InterruptedException
	  {
		  gcdriver.findElement(emailadd).clear();
		  gcdriver.findElement(emailadd).sendKeys(email);
		  Thread.sleep(3000);
	  }
	  public void type_Password(String pwd) throws InterruptedException
	  {
		  gcdriver.findElement(password).clear();
		  gcdriver.findElement(password).sendKeys(pwd);
		  Thread.sleep(3000);
	  }
	  public void click_Login() throws InterruptedException 
	  {
		  gcdriver.findElement(loginbutton).click();
		  Thread.sleep(3000);
	  }
	  public void click_Logout() throws InterruptedException 
	  {
		  gcdriver.findElement(logoutbutton).click();
		  Thread.sleep(3000);
	  }

}
