package Pageclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Flipkart 
{
	public  static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	//*[@id=\"container\"]/div/div[3]/div/div[2]/div[4]/div/div/div/a/div[1]/div[1]/div/div/"
	
	{
	
	    driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	   /* WebElement close =	driver.findElement(By.xpath("//div[@class=\"JFPqaw\"]//span[text()='✕']"));
		Thread.sleep(1500);
	    close.click();
	    driver.findElement(By.xpath("//div[@class=\"_38VF5e\"]//span[text()='Login']")).click();
	    driver.findElement(By.linkText("//span[text()='Login']")).click();*/
        driver.findElement(By.xpath("//input[@title=\"Search for Products, Brands and More\"]")).sendKeys("cargo for men");
        WebElement product = driver.findElement(By.xpath("//button[@aria-label=\"Search for Products, Brands and More\"]"));
        product.click();
        driver.findElement(By.linkText("//img[@ src=\"//static-assets-web.flixcart.com/fk-p-linchpin-web/fk-cp-zion/img/flipkart-plus_8d85f4.png\" ]")).click();
		//driver.findElement(By.xpath("//button[@class=\"QqFHMw vslbG+ _3Yl67G _7Pd1Fp\"]")).click();
		
	}
		
		
		
	   public void addtocart() {
	   WebElement cart = driver.findElement(By.xpath("//button[contains( text(),'GO TO CART')]"));
		
	     cart.click();
	}
		
		
		
		
		
	}
	
	
	
	

