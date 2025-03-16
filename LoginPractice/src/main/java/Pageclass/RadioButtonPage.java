package Pageclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BaseLibrary.BaseLibrary;

public class RadioButtonPage extends BaseLibrary
{
public RadioButtonPage()
{
 PageFactory.initElements(driver, this);
}
	@FindBy(xpath = "//a[text()='radio buttons']")
	private WebElement radiobutton;
	@FindBy(xpath = "//input[@class=\"form-check-input\"]")
	private WebElement Yesclick;
	@FindBy(xpath = "//p[text()='You have selected yes']")
	private WebElement SelectedPathYes;
	@FindBy(xpath = "//input[@id=\"impressive\"]")
	private WebElement Impressive;
	@FindBy(xpath = "//p[text()='You have selected impressive']")
	private WebElement SelectPathImpressive;
	@FindBy(xpath = "//input[@id=\"no\"]")
	private WebElement SelectedPathNo;
	@FindBy(xpath = "//p[text()='You have selected no']")
	private WebElement No;
public void ClickOnRadiobutton() throws InterruptedException
{
	Thread.sleep(2000);
	radiobutton.click(); }

public void validateRadioYes() 
{   Yesclick.click();
	SoftAssert softAssert = new SoftAssert();
    String Expected =  getpropertiesRadio("yes");	
	String Actual  = SelectedPathYes.getText();
	softAssert.assertEquals(Expected, Actual);	
	softAssert.assertAll();
	System.out.println("Validation Completed RadioButtonYes");
}
public void RadioButtonImpressive() throws InterruptedException
{   Thread.sleep(1500);
	Impressive.click();
	SoftAssert softAssert = new SoftAssert();
	String Expected = getpropertiesRadio("impressive");
	String Actual =  SelectPathImpressive.getText();
	softAssert.assertEquals(Expected, Actual);
//  System.out.println(Expected);
//  System.out.println(Actual);
    softAssert.assertAll();
    System.out.println("Validation Completed RadioButtonImpressive");
}
public void RadioButtonNo() throws InterruptedException	
{   Thread.sleep(1500);
	SelectedPathNo.click();
	SoftAssert softAssert = new SoftAssert();
	String  Expected = getpropertiesRadio("no");
	String Actual = No.getText();
	softAssert.assertEquals(Expected, Actual);
	softAssert.assertAll();
	System.out.println("Validation Completed RadioButtonNo");
}
		
	
}
