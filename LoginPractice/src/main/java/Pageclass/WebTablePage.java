package Pageclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLibrary.BaseLibrary;

public class WebTablePage extends BaseLibrary
{
	public WebTablePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='web tables']")
	private WebElement webTable;
	
	public void ClickOnWebTable()
	{
		webTable.click();
	}
	
	
	
	
	
	
}
