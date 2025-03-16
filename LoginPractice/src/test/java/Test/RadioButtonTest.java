package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLibrary.BaseLibrary;
import Pageclass.RadioButtonPage;

public class RadioButtonTest extends BaseLibrary
{

	RadioButtonPage ob;
	@BeforeTest
	public void launch() throws InterruptedException
	{
		launcher();
		ob = new RadioButtonPage();
	}
	
	@Test (priority =1,  enabled = true )
	public void ClickOnRadiobutton() throws InterruptedException
	{
		ob.ClickOnRadiobutton();
	}
	
//	@Test (priority =2,  enabled = false )
//	public void radiobutton() throws InterruptedException
//	{
//		ob.radiobuttonYes();
// }
	@Test(priority=2,enabled = true)
	public void ValidateRadioButtonYes()
	{ob.validateRadioYes();}
	
	@Test(priority = 3, enabled= true)
	private void ValidateRadioButtonImpressive() throws InterruptedException 
	{ob.RadioButtonImpressive();}
	
	
	@Test(priority = 4, enabled= true)
	private void ValidateRadioButtonNo() throws InterruptedException 
	{ob.RadioButtonNo();}
	
	
	
	
	
	
	
	
	
	
}
