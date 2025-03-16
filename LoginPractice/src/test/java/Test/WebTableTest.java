package Test;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLibrary.BaseLibrary;
import Pageclass.WebTablePage;

public class WebTableTest extends BaseLibrary
{

	WebTablePage ob;
	
	@BeforeTest
	public void launchch() throws InterruptedException
	{
		launcher();
		ob= new WebTablePage();
		
	}
	
	@Test(priority =1,enabled = true)
	public void ClickonWebTable()
	{
		ob.ClickOnWebTable();
	}
	
	
	
	
}
