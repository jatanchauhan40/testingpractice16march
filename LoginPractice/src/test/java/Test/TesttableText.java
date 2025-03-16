package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLibrary.BaseLibrary;

import Pageclass.TexttablePage;

public class TesttableText extends BaseLibrary
{
	//BabaloginPage ob1;  (we can also two or three class page )
	TexttablePage ob2;
	
	@BeforeTest
	public void launchch() throws InterruptedException
	{
		launcher();
		//ob1 = new BabaloginPage();
		ob2 = new TexttablePage();
	}
	
	/*@Test(priority=1,enabled=true)
	public void clickonclose() throws InterruptedException
	{
		ob1.clickonclose();
	}
	
	@Test(priority=2,enabled=true)
	public void clickonelement()
	{
		ob1.clickonpracticeToelement();
	}
	
	*/
	@Test(priority=3,enabled=true)
	public void text() throws InterruptedException
	{
		ob2.textbox();
	}
	
	@Test(priority=4,enabled=true)
	public void validation() throws InterruptedException
	{
		ob2.validation();
	}

}
