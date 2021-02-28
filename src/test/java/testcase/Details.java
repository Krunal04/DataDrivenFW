package testcase;


import org.testng.annotations.Test;
import java.io.FileReader;
import java.io.IOException;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import driverexe.DriverExe;
import page.DetailsPage;


public class Details extends DriverExe {

	
	private CSVReader csvReader;
    String [] csvCell;
	
	
	

	public Details() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test (priority = 2)
	public void inputdata () throws InterruptedException, CsvValidationException, IOException {
	DetailsPage input = new DetailsPage(driver);
	String fn;
	String ln;
	csvReader = new CSVReader(new FileReader("C:\\Users\\pranaysb\\eclipse-workspace\\DataDrivenFW\\DATA.csv"));
	while ((csvCell = csvReader.readNext()) != null)
			
	{
		
		fn = csvCell[0];
		System.out.println(fn);
		ln = csvCell[1];
		System.out.println(ln);
		input.detailsdata(fn, ln);
				
				
	}
	
	
	 
	
	
	
	}
	
    
    
    
	
    }
	

