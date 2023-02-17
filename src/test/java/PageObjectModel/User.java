package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class User {
	
	WebDriver driver;
	public User(WebDriver driver) {
		this.driver = driver;
	}
	
	public void UserAddition(String Fname,String LName,String LoginId,String Passkey,String Phone,String Email) throws InterruptedException {
		driver.findElement(By.xpath("//a[normalize-space()='Master Data']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//a[normalize-space()='Users']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//button[normalize-space()='Add'])[1]")).click();
		 driver.findElement(By.xpath("(//input[@id='firstName'])[2]")).sendKeys(Fname);
		 driver.findElement(By.xpath("(//input[@id='lastName'])[2]")).sendKeys(LName);
		 driver.findElement(By.xpath("(//input[@id='loginId'])[2]")).sendKeys(LoginId);
		 driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys(Passkey);
		 driver.findElement(By.xpath("(//input[@id='phone'])[1]")).sendKeys(Phone);
		 driver.findElement(By.xpath("(//input[@id='email'])[1]")).sendKeys(Email);
		 Select GenSelect = new Select(driver.findElement(By.xpath("(//select[@id='gender'])[1]")));
		 GenSelect.selectByVisibleText("Male");
		 Select StatusSelect = new Select(driver.findElement(By.xpath("(//select[@id='status'])[2]")));
		 StatusSelect.selectByVisibleText("Active");
		 Select OrgSelect = new Select(driver.findElement(By.xpath("(//select[@id='orgId'])[2]")));
		 OrgSelect.selectByVisibleText("NCS");
		 driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//button[normalize-space()='Close'])[1]")).click();
		 Thread.sleep(2000);
	}

}
