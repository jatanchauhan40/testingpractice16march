package BaseLibrary;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import propertiesUtlities.PropertiesUtility;
import propertiesUtlities.PropertiesUtilityRadio;
import utility.ExcelUtility;
import utility.ExcelUtility2;

public class BaseLibrary implements ExcelUtility,ExcelUtility2,PropertiesUtility,PropertiesUtilityRadio
{
	public static WebDriver driver;
	
	public void launcher() throws InterruptedException
	{
		driver = new ChromeDriver();
		//driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.get("https://testingbaba.com/old/");
		driver.manage().window().maximize();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[text()='×']")).click();
		driver.findElement(By.xpath("//a[text()='Practice']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"btn btn-block p-0 text-left\"]")).click();
				
		Thread.sleep(2000);
		//WebElement product = driver.findElement(By.xpath("//button[@aria-label=\"Search for Products, Brands and More\"]"));
        //product.click();
	}
	@Override
	public String getreaddata(int row, int col, int sheet) 
	{    String val = "";
		//String path ="D:\\JAVA\\Backup\\LoginPractice\\TestData\\TestdataTextBox.xlsx";
		try
		{   FileInputStream fis = new FileInputStream("D:\\JAVA\\Backup\\LoginPractice\\TestData\\TestdataTextBox.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sht = wb.getSheetAt(sheet);
		    val = sht.getRow(row).getCell(col).getStringCellValue();
		}
		catch(Exception e)
		{
			System.out.println("Issue in get read data:" + e);
		}
		return val;
	}
	@Override
	public String getdataNew(int row, int col, int sheetn) 
	{
		String val="";
		String path = "D:\\JAVA\\Backup\\LoginPractice\\TestData\\CheckBoxData.xlsx";
		try
		{
	        FileInputStream fis = new FileInputStream(path);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sht = wb.getSheetAt(sheetn);
			sht.getRow(row).getCell(col).getStringCellValue();
		}
		catch (Exception e) 
		{
			System.out.println("Issue in get read data:" + e);
		}
		return val;
	}
	@Override
	public String getproperties(String key) 
	{
		String val="";
		String path= "D:\\JAVA\\Backup\\LoginPractice\\TestData\\config.properties";
		try 
		{
		  FileInputStream fis =  new FileInputStream(path);
		  Properties prop = new Properties();
		  prop.load(fis);
		  val =   prop.getProperty(key);
		}
		catch (Exception e) 
		{
			// TODO: handle exception
		}
		// TODO Auto-generated method stub
		return val;
	}
	@Override
	public String getpropertiesRadio(String key)
	{
		String val ="";
	    String path="D:\\JAVA\\Backup\\LoginPractice\\TestData\\config.propertiesRadio";
		try 
	   {
		FileInputStream fis = new FileInputStream(path);
	    Properties prop =  new  Properties();
		prop.load(fis);	
		val = prop.getProperty(key);
	 }
	catch (Exception e) 
	{
		// TODO: handle exception
	}	
		return val;
	}

	
	

	
	
	
	
	
}
