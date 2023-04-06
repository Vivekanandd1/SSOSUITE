package PageObjectModel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Value;


public class LogInLogOut {
	
	WebDriver driver;

	
	public LogInLogOut(WebDriver driver) {
		this.driver = driver;
	}
    
//	@Value("$Url")
//	public String url;
	
	public void login() throws IOException {
		String FilePath = "C:\\Users\\Ncs.NET\\eclipse-workspace\\SSOSUITE\\src\\test\\resources\\Credentials.properties";
		FileInputStream fis = new FileInputStream(FilePath);
		Properties p = new Properties();
		p.load(fis);
		String url = p.getProperty("Url");
		String username = p.getProperty("UserName");
		String password = p.getProperty("Password");
		driver.get(url);
        driver.findElement(By.id("loginid")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
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
