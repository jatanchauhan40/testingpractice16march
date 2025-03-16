package Pageclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import BaseLibrary.BaseLibrary;

public class CheckBoxPage extends BaseLibrary
{
	public CheckBoxPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='check box']")
	private WebElement checkbook;
	@FindBy(xpath = "//input[@id=\"myCheck\"]")
	private WebElement mobile;
	@FindBy(xpath = "//input[@id=\"mylaptop\"]")
	private WebElement laptop;
	@FindBy(xpath = "//input[@id=\"mydesktop\"]")
	private WebElement destop;
	// iframe xpath for enter xpath to perform click
	@FindBy(xpath = "//iframe[@src=\"Checkbox.html\"]")
	private WebElement iframeEnt;
	
	// For Validation 
	@FindBy(xpath = "//h6[@id=\"text\"]")
	private WebElement selectmobile;
	@FindBy(xpath = "//h6[@id=\"text1\"]")
	private WebElement selectlaptop;
	@FindBy(xpath = "//h6[@id=\"text2\"]")
	private WebElement selectdestop;	
	
	
	public void checkbox()
	{checkbook.click();}
	
	public void checkboxtick() throws InterruptedException 
	{
		Thread.sleep(3000);
//		driver.switchTo().frame(iframeEnt);   for enter the iframe handle syntax (Imp)
//		driver.switchTo().defaultContent();    for exit  the iframe
		driver.switchTo().frame(iframeEnt);
		mobile.click();
		laptop.click();
		destop.click();
		driver.switchTo().defaultContent();
  }	
//	public void validatecheckBox()  (For practice)
//	{
//		ArrayList<String> Expected = new ArrayList<String>();
//	    ArrayList<String> Actual = new 	ArrayList<String>();
//		for(int i=0; i<4; i++)
//		{
//			Expected.add(getdataNew(1, i, 0));
//			System.out.println(Expected);
//		}
//	    
//	    for(int i=1; i<ifrmaevali.size(); i++)
//		{
//			Actual.add(ifrmaevali.get(i).getText());
//		}
//	    System.out.println(Actual);
//	    driver.switchTo().defaultContent();
		
	public void validatecheckBoxMethod1() 
	{
	 driver.switchTo().frame(iframeEnt);
	 selectmobile.click();
	 SoftAssert softassert = new SoftAssert();
	 String expected = getproperties("mobile");
	 String actual = 	selectmobile.getText();
	 softassert.assertEquals(expected, actual);
	 softassert.assertAll();
	 System.out.println("Validation Comp CheckBoxTable");
//	 System.out.println(expected);
//	 System.out.println(actual);
	}
	
//	public void validatecheckBoxMethod2() (Not Working)
//	{
//		 driver.switchTo().frame(iframeEnt);
//		 selectmobile.click();
//	     String expected = getproperties("mobile");
//		 String actual = 	selectmobile.getText();
//     	 System.out.println("Validation Comp");
//		 Assert.assertEquals(expected, actual);  - 98 not working
//		 driver.switchTo().defaultContent();
//	}
	
	
	
	
	
}
