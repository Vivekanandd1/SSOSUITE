package PageObjectModel;



import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	
	public void Search() throws InterruptedException {
		driver.findElement(By.xpath("(//input[@id='firstName'])[1]")).sendKeys("AAAAAAAA ");
		driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Reset']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
		Thread.sleep(2000);
		 driver.findElement(By.xpath("(//input[@id='lastName'])[1]")).sendKeys("BBBBBB");
		 driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Reset']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='loginId'])[1]")).sendKeys("cc@cc.cc");
		driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Reset']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
		Thread.sleep(2000);
		 Select OrgSelect = new Select(driver.findElement(By.xpath("(//select[@id='orgId'])[1]")));
		 OrgSelect.selectByVisibleText("NCS");
		 driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Reset']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
		Thread.sleep(2000);
		Select StatusSelect = new Select(driver.findElement(By.xpath("(//select[@id='status'])[1]")));
		 StatusSelect.selectByVisibleText("Active");
		 driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[normalize-space()='Reset']")).click();
			Thread.sleep(2000);
	   Select logstat = new Select(driver.findElement(By.xpath("(//select[@id='unsucessfullLoginAttempt'])[1]")));
	   logstat.selectByVisibleText("Lock");
	   driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Reset']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
		Thread.sleep(2000);
		 }
	
	public void UserEdit() throws InterruptedException, IOException {
		driver.findElement(By.xpath("(//button[@Title='Edit'])[1]")).click();
		Thread.sleep(2000);
		 driver.findElement(By.xpath("(//input[@id='firstName'])[2]")).sendKeys("xxxx");
		 driver.findElement(By.xpath("(//input[@id='lastName'])[2]")).sendKeys("dddd");
		 driver.findElement(By.xpath("(//input[@id='loginId'])[2]")).sendKeys("C");
		 driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys("5");
		 driver.findElement(By.xpath("(//input[@id='phone'])[1]")).clear();
		 driver.findElement(By.xpath("(//input[@id='phone'])[1]")).sendKeys("8109772505");
		 Select GenSelect = new Select(driver.findElement(By.xpath("(//select[@id='gender'])[1]")));
		 GenSelect.selectByVisibleText("Female");
		 WebElement photoup = driver.findElement(By.xpath("//img[@width='200px']"));
		 photoup.click();
		 Thread.sleep(2000);
	     Runtime.getRuntime().exec("C:\\Users\\Ncs.NET\\eclipse-workspace\\SSOSUITE\\OrgImage.exe");
	     Thread.sleep(3000);
		 driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//button[normalize-space()='Close'])[1]")).click();
		 Thread.sleep(2000);
	}
	
	public void UserAppRole() throws InterruptedException {
		driver.findElement(By.xpath("(//button[@data-target='#editRoleModal'])[1]")).click();
		Thread.sleep(2000);
		Select AppSelect = new Select(driver.findElement(By.xpath("//Select[@name='appId']")));
		AppSelect.selectByVisibleText("HRMS");
		Select RoleSelect = new  Select(driver.findElement(By.xpath("(//Select[@name='roleId'])[2]")));
		RoleSelect.selectByVisibleText("Admin");
		driver.findElement(By.xpath("(//button[normalize-space()='Add'])[2]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//button[normalize-space()='Close'])[2]")).click();
		 Thread.sleep(2000);
	}
	
	public void DeleteUser() throws InterruptedException {
		driver.findElement(By.xpath("(//button[@title='Delete'])[1]")).click();
		Thread.sleep(1000);
	     driver.switchTo().alert().accept();
	        Thread.sleep(2000);
	}
	

}
