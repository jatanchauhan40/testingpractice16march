package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLibrary.BaseLibrary;
import Pageclass.CheckBoxPage;

public class CheckBoxTest extends  BaseLibrary
{

	
	CheckBoxPage ob;
	
	@BeforeTest
	public void launch() throws InterruptedException
	{
		launcher();
		ob = new CheckBoxPage();
		
	}
	@Test(priority =1,  enabled = true )
	public void chbox()
	{
		ob.checkbox();
	}
	
	@Test(priority =2, enabled = true)
	public void checkboxmethod() throws InterruptedException 
	{
		ob.checkboxtick();
	}

	@Test (priority =3, enabled = true)
	public void validatecheckbox()
	{
		ob.validatecheckBoxMethod1();
	}
}
