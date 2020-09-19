package qaclickacademy.Mavenjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportTest {
	
	public static WebDriver driver;
	public static ExtentReports extent;
	
	
	@BeforeTest
	public void config()
	{
		String path = System.getProperty("user.dir")+"\\report\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web automation results");
		reporter.config().setDocumentTitle("Test results");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Soudhamini");
	}
	
	@Test
	public void initialization()
	{
		ExtentTest test= extent.createTest("initialization");
		System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/");
	    System.out.println(driver.getTitle());
	    driver.close();
		test.fail("Results donot match");
		extent.flush();
	
	}

}
