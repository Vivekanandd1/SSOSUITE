package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class MenuScreen {

	WebDriver driver;
	public MenuScreen(WebDriver driver) {
		this.driver = driver;
	}
	
	public void AppMenu() throws InterruptedException {
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//a[normalize-space()='Master Data']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//a[@class='dropdown-item'])[1]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//a[@href='#/menulist/48']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//button[@data-target='#editModal'])[1]")).click();
		 Thread.sleep(1000);
		 Select slct = new Select(driver.findElement(By.xpath("//select[@id='submenuId']")));
		 slct.selectByVisibleText("Master Data");
		 driver.findElement(By.xpath("(//input[@name='label'])[2]")).sendKeys("TestData");
		 driver.findElement(By.xpath("//input[@name='url']")).sendKeys("testdata");
		 Select slct1 = new Select(driver.findElement(By.xpath("(//select[@id='status'])[2]")));
		 slct1.selectByVisibleText("Active");
		 driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		 Thread.sleep(2000);
	}
	
	public void Searchmenu() throws InterruptedException{
		driver.findElement(By.xpath("(//input[@id='label'])[1]")).sendKeys("TestData");
		driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='label'])[1]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='menuName'])[1]")).sendKeys("testData");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='menuName'])[1]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='submenuName'])[1]")).sendKeys("Master Data");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='submenuName'])[1]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
		Thread.sleep(3000);
		
	}
}
