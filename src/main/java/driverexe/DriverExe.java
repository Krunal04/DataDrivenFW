package driverexe;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverExe {
	
public static Properties prop;
public static WebDriver driver;

public DriverExe () throws IOException {	
	prop = new Properties();
	FileInputStream i = new FileInputStream("C:\\Users\\pranaysb\\eclipse-workspace\\DataDrivenFW\\src\\main\\java\\configurationfile\\configuration.properties");
	prop.load(i);
}

@BeforeSuite

public void startbrowser () {
	
	String browsername = prop.getProperty("Driver");
	
	switch (browsername)
	{
	
	case "Chrome":
	
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Automation Lectures\\selenium\\selenium\\drivers\\driver\\chromedriver.exe");	
		driver = new ChromeDriver();
		break;	
	}
	
	case "Firefox":
		
	{
		System.setProperty("webdriver.gecko.driver", "F:\\Automation Lectures\\selenium\\selenium\\drivers\\driver\\geckodriver.exe");	
		driver = new FirefoxDriver();
		break;	
	}

	default:
	{
		System.out.println("Browser not available");
	}
		

	
	}
	
	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

	//driver.get(application);
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.manage().window().maximize();
	driver.get(prop.getProperty("URL"));
		
}

@AfterSuite
public void closebrowser() {
driver.quit();
}



	


	
	
	
	
	
	
}

