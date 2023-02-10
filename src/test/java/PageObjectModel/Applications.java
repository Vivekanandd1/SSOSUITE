package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Applications {
	
WebDriver driver;
	
	public Applications(WebDriver driver) {
		this.driver = driver;
	}
	
	public void Application() throws InterruptedException {
		  Thread.sleep(1000);
		 driver.findElement(By.xpath("//a[normalize-space()='Master Data']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//a[@class='dropdown-item'])[1]")).click();
//	     driver.findElement(By.xpath("//a[normalize-space()='Applications']")).click();
	     /*Application Addition*/
	     driver.findElement(By.xpath("(//button[normalize-space()='Add'])[1]")).click();
	     driver.findElement(By.xpath("(//input[@name='name'])[2]")).sendKeys("AAAAAAAAAAAAA");
	     driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("AAA@AAA.AAA");
	     driver.findElement(By.xpath("(//input[@name='appUrl'])[1]")).sendKeys("www.AAAAAA.com");
	     driver.findElement(By.xpath("(//input[@name='phone'])[1]")).sendKeys("1234567890");
	     Select slct = new Select(driver.findElement(By.xpath("(//select[@id='status'])[1]")));
	     slct.selectByValue("Inactive");
	     driver.findElement(By.xpath("(//textarea[@id='address'])[1]")).sendKeys("Delhi");
	     driver.findElement(By.xpath("(//button[normalize-space()='Save'])[1]")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("(//button[normalize-space()='Close'])[1]")).click();
	     
	     /*Search functionality*/
	     driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys("AAAAAAAAAAAAA");
	     driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//button[normalize-space()='Reset']")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
	     Thread.sleep(1000);
	     String Skey = driver.findElement(By.xpath("//table/tbody/tr/td[4]")).getText();
	     System.out.println(Skey);
	     driver.findElement(By.xpath("//input[@id='applicationCode']")).sendKeys(Skey);
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//button[normalize-space()='Reset']")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
	     Thread.sleep(1000);
	     
	     /*info Button details*/
	     driver.findElement(By.xpath("(//button[@title='Info'])[1]")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("(//button[@aria-label='Close'])[1]")).click();
	     Thread.sleep(1000);
	     
	     /*Edit Functionality*/
	     driver.findElement(By.xpath("(//button[@title='Edit'])[1]")).click();
	     driver.findElement(By.xpath("(//input[@name='name'])[2]")).sendKeys("AAAAAAAAAAAAABBB");
	     driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("AAA@AAA.AABB");
	     driver.findElement(By.xpath("(//input[@name='appUrl'])[1]")).sendKeys("www.AABBAA.com");
	     driver.findElement(By.xpath("(//input[@name='phone'])[1]")).sendKeys("1122334455");
	     Select slct1 = new Select(driver.findElement(By.xpath("(//select[@id='status'])[1]")));
	     slct1.selectByValue("Active");
	     driver.findElement(By.xpath("(//textarea[@id='address'])[1]")).sendKeys("Chennai");
	     driver.findElement(By.xpath("(//button[normalize-space()='Save'])[1]")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("(//button[normalize-space()='Close'])[1]")).click();
	     
		}
	     
		
		
	}
	



