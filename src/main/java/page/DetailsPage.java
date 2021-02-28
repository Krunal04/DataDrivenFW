package page;


import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.opencsv.exceptions.CsvValidationException;


public class DetailsPage {

	private WebDriver driver;

	public DetailsPage(WebDriver driver)
	{
	this.driver=driver;
	}
    
	By fname = By.xpath("//input[@placeholder='First Name']");
	By lname = By.xpath("//input[@placeholder='Last Name']");
	By day = By.xpath("//div[contains(text(),'Day')]");
	By d1 = By.xpath("//div[normalize-space()='04']");
	By month = By.xpath("//div[contains(text(),'Month')]");
	By m1 = By.xpath("//div[@role='option'][normalize-space()='Apr']");
	By year = By.xpath("//div[contains(text(),'Year')]");
	By y1 = By.xpath("//div[normalize-space()='1994']");
	By religion = By.xpath("//div[@class='Dropdown-control community_selector']");
	By r1 = By.xpath("//div[normalize-space()='Hindu']");
	By community = By.xpath("//div[contains(text(),'Marathi')]");
	
	
	public void detailsdata (String firstname , String lastname) throws InterruptedException, CsvValidationException, IOException
	{
		
		
		driver.findElement(fname).sendKeys(firstname);
		driver.findElement(lname).sendKeys(lastname);
		Thread.sleep(5000);
		driver.findElement(day).click();
		driver.findElement(d1).click();
		driver.findElement(month).click();
		driver.findElement(m1).click();
		driver.findElement(year).click();
		driver.findElement(y1).click();
		driver.findElement(religion).click();
		driver.findElement(r1).click();
		String language = driver.findElement(community).getAttribute("innerHTML");
		System.out.println(language);
		
		
		if (language.equals("Marathi"))
			
		{
			System.out.println("Website is of Marathi Shaadi.com");
			
		}
		
		else {
			
			System.out.println("Wrong Website");
		}
		
		
		}
		
	
	}
	
