package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import oops.BaseClass;

public class mainpage extends BaseClass{

	WebDriver driver;
	public mainpage(WebDriver driver){
		this.driver = driver;
	}
	
//	@FindBy(css=".primary_nav > li:nth-child(1) > a:nth-child(1)")
//	WebElement home;
//	
//	@FindBy(css=".selectDropdown-4 > div:nth-child(1) > span") 
//	WebElement future;	
//	
	
	
	
	
	public String  isHome(){
		return driver.getTitle();
	}
	
	public boolean isFuturePresent(){
		boolean flag=false;
		
		boolean valid = driver.findElement(By.cssSelector(".selectDropdown-4 > div:nth-child(1) > span")).isEnabled();
		if(valid){
			flag = true;
		}
		return flag;
	}
	
	
}
