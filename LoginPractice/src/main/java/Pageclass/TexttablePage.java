package Pageclass;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import BaseLibrary.BaseLibrary;

public class TexttablePage extends BaseLibrary
{
	public TexttablePage()
	{
		PageFactory.initElements(driver,this);
	}
	
@FindBy(xpath=("//a[text()='text box']"))
private WebElement textbox;

@FindBy(xpath=("//input[@id=\"fullname1\"]"))
private WebElement fullname;

@FindBy(xpath=("//input[@id=\"fullemail1\"]"))
private WebElement email;

@FindBy(xpath=("//textarea[@id=\"fulladdresh1\"]"))
private WebElement cadd;
@FindBy(xpath=("//textarea[@id=\"paddresh1\"]"))
private WebElement padd;
@FindBy(xpath=("//input[@class=\"btn btn-success\"]"))
private WebElement submit;

@FindBy(xpath=("//div[@class='col-md-6 mt-5']//label"))
private List<WebElement> Actlist;
	
	public void textbox() throws InterruptedException
	{
		Thread.sleep(1500);
		textbox.click();
		fullname.sendKeys(getreaddata(1, 0, 0));
		email.sendKeys(getreaddata(1, 1, 0));
		cadd.sendKeys(getreaddata(1, 2, 0));
		padd.sendKeys(getreaddata(1, 3, 0));
		submit.click();
	}
	
//	public void validation()
//	{
//		ArrayList<String> expected = new  ArrayList<String>();
//        ArrayList<String> actual = new ArrayList<String>();
//        ArrayList<WebElement> actlist = new ArrayList<>(Actlist);
//        	
//        for (int i=0; i<4; i++)
//        {
//        	expected.add(getreaddata(1,i,0));
//        	   
//      	}
//   for(int i=1; i<Actlist.size(); i=i+2 ) 
//   {
//	   actual.add(actlist.get(i).getText());
//   }
//   for(int i=1; i<actual.size(); i++ ) 
//   {
//	
//   }
//   
//   System.out.println(expected); 
//   System.out.println(actual);
        
              
	public void validation()
	{
		
		// after comp syso exp & act use (78) for validate
		SoftAssert softAssert =  new SoftAssert(); 
		ArrayList<String> Expection =   new  ArrayList<String>();
        ArrayList<String>  Actual = new ArrayList<String>();
		
        for(int i=0; i<4; i++)
		{
        	Expection.add(getreaddata(1, i, 0));
		}
		for(int i=1; i<Actlist.size(); i=i+2)
		{
			Actual.add(Actlist.get(i).getText());  // Actlist  list of webelement 
		} 
		for(int i=0; i<Expection.size(); i++)
		{
		   softAssert.assertEquals(Expection.get(i), Actual.get(i));
		}
		softAssert.assertAll();
		System.out.println("Validation Completed TextBoxTable");
//		System.out.println(Expection);
//		System.out.println(Actual);    
		
    }
}