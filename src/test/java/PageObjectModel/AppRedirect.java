package PageObjectModel;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppRedirect {
  
	WebDriver driver;
	WebDriverWait wait;
	public AppRedirect(WebDriver driver) {
		this.driver=driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
	}
	
	public void Redirect() throws InterruptedException {
		driver.findElement(By.xpath("(//a[@id='navbarDropdownMenuLink'])[1]")).click();
		Thread.sleep(2000);
		List<WebElement> Apps = driver.findElements(By.xpath("//div/a[@class='dropdown-item']"));
		for(int i=0;i<Apps.size();i++) {
			if (Apps.get(i).getText().equals("NCSDOC")) {
//			System.out.println(Apps.get(i).getText());
				Apps.get(i).click();
		}
			}
		
		 wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	    	Set<String> handles = driver.getWindowHandles();
			Iterator<String> it = handles.iterator();
			String ParentWindow = it.next();
			String ChildWindow = it.next();
			Thread.sleep(4000);
			driver.switchTo().window(ParentWindow);
			
	}
}
