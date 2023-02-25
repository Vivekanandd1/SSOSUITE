package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LogInLogOut {
	
	WebDriver driver;

	
	public LogInLogOut(WebDriver driver) {
		this.driver = driver;
	}

	public void login() {
		driver.get("http://85.25.93.180:8080/NCSSSO/#/login");
		driver.findElement(By.id("loginid")).sendKeys("vivekanand.deshmukh@nenosystems.in");
		driver.findElement(By.id("password")).sendKeys("pass1234");
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		
		
	}
	
	public void Logout() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@id='navbarDropdownMenuLink'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@routerlink='login/logout']")).click();
		Thread.sleep(2000);
		driver.quit();
    }
}
