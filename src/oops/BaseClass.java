package oops;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class BaseClass {

	public static WebDriver driver = null;
	@BeforeSuite
	public void setup() throws IOException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\TEJAS\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--headless");
		
		driver = new ChromeDriver(op);
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		 driver.get("https://www.mcxindia.com/#");
	}
	
//	@Test
//	public void test_method(){
//		Actions action = new Actions(getDriver());
//		
//		
//		WebElement market_data = getDriver().findElement(By.xpath("//*[@id='form1']/div[3]/div[1]/div[2]/div/div/div/div/ul/li[2]/a"));
//		
//		action.moveToElement(market_data).click().build().perform();
//		
//		WebElement equity = getDriver().findElement(By.xpath("//*[@id='form1']/div[3]/div[1]/div[2]/div/div/div/div/ul/li[2]/div/ul/li/div/div/ul/li[1]/a"));
//		equity.click();
//		
	//}
	
	
	@AfterSuite
	public void teardown(){
		driver.quit();
	}


	
	
}
