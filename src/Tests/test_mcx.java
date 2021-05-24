package Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import POM.mainpage;
import oops.BaseClass;

public class test_mcx extends BaseClass {
mainpage m =null;


@BeforeClass
public void init_class(){
	mainpage mp = PageFactory.initElements(BaseClass.driver, mainpage.class);
	this.m=mp;
}

	@Test
	public void checkhomepage(){
		
		if(m.isFuturePresent()){
			m.isHome();
			System.out.println("It is on Home page");
		}
		else{
		System.out.println("Something is wrong");	
		}
		
	}
}
