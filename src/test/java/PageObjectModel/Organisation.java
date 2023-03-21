package PageObjectModel;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Organisation {

	WebDriver driver;
	String OrgnizationName = "AllOrgnisation";
	WebDriverWait wait;

	public Organisation(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
	}

	public void orgnisation() throws InterruptedException, IOException {
		/* Adding a Organization */
		driver.findElement(By.xpath("//a[normalize-space()='Master Data']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Organizations']")).click();
		driver.findElement(By.xpath("(//button[normalize-space()='Add'])[1]")).click();
		driver.findElement(By.xpath("(//input[@id='name'])[2]")).sendKeys(OrgnizationName);
		driver.findElement(By.id("code")).sendKeys("Org5");
		driver.findElement(By.xpath("(//input[@id='email'])[2]")).sendKeys("Test@Test.test");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("1234567890");
		Select slct = new Select(driver.findElement(By.xpath("(//select[@id='status'])[2]")));
		slct.selectByValue("Inactive");
		driver.findElement(By.xpath("(//textarea[@id='address'])"))
		.sendKeys("80, Jaora Compound, Indore, Madhya Pradesh 452001");
		driver.findElement(By.xpath("(//button[normalize-space()='Save'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[normalize-space()='Close'])[1]")).click();
		Thread.sleep(2000);
		//		driver.findElement(By.xpath("(//button[@title='Info'])[2]")).click();
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath("(//button[@aria-label='Close'])[1]")).click();
		//		Thread.sleep(2000);

		//       
		/*
		 * Search functionality single
		 * driver.findElement(By.xpath("(//input[@id='name'])[1]")).sendKeys(
		 * OrgnizationName);
		 * driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("//button[normalize-space()='Reset']")).click();
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
		 * Thread.sleep(2000); driver.findElement(By.xpath("//input[@id='address']")).
		 * sendKeys("80, Jaora Compound, Indore, Madhya Pradesh 452001");
		 * driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("//button[normalize-space()='Reset']")).click();
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("(//input[@id='email'])[1]")).sendKeys(
		 * "Test@Test.test");
		 * driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("//button[normalize-space()='Reset']")).click();
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
		 * Thread.sleep(2000); Select slct11 = new
		 * Select(driver.findElement(By.xpath("(//select[@id='status'])[1]")));
		 * slct11.selectByValue("Inactive");
		 * driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("//button[normalize-space()='Reset']")).click();
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
		 */
		Thread.sleep(2000);

		/* Application Assignment */
		List<WebElement> OrgName = driver.findElements(By.xpath("//div/table/tbody/tr/td[3]"));
		List<WebElement> AppAssignment = driver
				.findElements(By.xpath("//div/table/tbody/tr/td[11]/div/button[@data-target='#assignApps']"));
		for (int i = 0; i < OrgName.size(); i++) {
			if (OrgName.get(i).getText().equals(OrgnizationName)) {
				AppAssignment.get(i).click();
				Select slct2 = new Select(driver.findElement(By.xpath("//select[@id='appId']")));
				slct2.selectByValue("16");
				driver.findElement(By.xpath("(//button[normalize-space()='Add'])[2]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//button[normalize-space()='Save'])[2]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//button[normalize-space()='Close'])[2]")).click();
				Thread.sleep(2000);
			}
		} 
		/* InfoBTN */
		List<WebElement> InfoBtn = driver.findElements(By.xpath("//div/table/tbody/tr/td[10]/app-info-button/div/button[@title='Info']"));
		for (int i = 0; i < OrgName.size(); i++) {
			if (OrgName.get(i).getText().equals(OrgnizationName)) {
				InfoBtn.get(i).click();
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div/button[@aria-label='Close'])[1]")).click();
		Thread.sleep(2000);
		
		/* Orgnization delete */
		try {
			List<WebElement> Orgdeletion = driver.findElements(By.xpath("//div/table/tbody/tr/td[11]/div/button[@title='Delete']"));
			for (int i = 0; i < OrgName.size(); i++) {
				if (OrgName.get(i).getText().equals(OrgnizationName)) {
					Orgdeletion.get(i).click();
					Thread.sleep(2000);
					driver.switchTo().alert().accept();
				}
			}
		}
		catch (StaleElementReferenceException e) {
			System.out.println("second Exception handeled");
		}

	}
}

