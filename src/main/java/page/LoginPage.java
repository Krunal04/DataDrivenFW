package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	By begin = By.xpath("//button[normalize-space()=\"Let's Begin\"]");
	By email = By.cssSelector("input[name='email']");
	By pwd = By.cssSelector("input[name='password1']");
	By dropdown = By.className("Dropdown-placeholder");
	By select = By.xpath("//div[normalize-space()='Self']");
	By radiobtn = By.xpath("//input[@id='gender_male']");
	By next = By.xpath("//button[@type='submit']");
	
	public LoginPage(WebDriver driver)
	{
	this.driver=driver;
	}
	
	public void profilecreate(String id , String password) throws InterruptedException {
	
	driver.findElement(begin).click();
	driver.findElement(email).sendKeys(id);
	driver.findElement(pwd).sendKeys(password);
	driver.findElement(dropdown).click();
	driver.findElement(select).click();
	driver.findElement(radiobtn).click();
	Thread.sleep(5000);
	driver.findElement(next).click();
	
	
		
	}
	
	
	
}
