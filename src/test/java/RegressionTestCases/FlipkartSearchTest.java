package RegressionTestCases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.smarte.qa.base.TestBase;
import com.smarte.qa.pages.HomePage;
import com.smarte.qa.utility.TestUtil;

public class FlipkartSearchTest extends TestBase{
	
	public FlipkartSearchTest ()
	
	{
		
		super();
	}
	
	HomePage HomePage;
	
	
	@BeforeMethod 
	
	public void setup () {
		
		initialization();
		HomePage = new HomePage();
	}
	
	@DataProvider
	public Iterator<Object[]> getTestdata() throws IOException {
		TestUtil Testutil = new TestUtil();
		ArrayList<Object[]> Mydata = Testutil.Readfromexcel();
		return Mydata.iterator();
		
	}
	
		@Test   (dataProvider="getTestdata")
	public void validateSearchFlipkart(String Product,String PriceRange,String ProcessorBrand) throws InterruptedException
	{
		HomePage.SearchonFlipkart("Samsung Mobile","10000","Snapdragon");
	}
	
	@AfterMethod
	public void Teardown (){
		
		//driver.quit();
	}
}
