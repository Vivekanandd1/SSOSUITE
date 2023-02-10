package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Organisation {
	
WebDriver driver;
	
	public Organisation(WebDriver driver) {
		this.driver = driver;
	}
	
	public void orgnisation() throws InterruptedException {
		/*Adding a Organization */
       driver.findElement(By.xpath("//a[normalize-space()='Master Data']")).click();
       driver.findElement(By.xpath("//a[normalize-space()='Organizations']")).click();
       driver.findElement(By.xpath("(//button[normalize-space()='Add'])[1]")).click();
       driver.findElement(By.xpath("(//input[@id='name'])[2]")).sendKeys("AAATestorg");
       driver.findElement(By.id("code")).sendKeys("Org5");
       driver.findElement(By.xpath("(//input[@id='email'])[2]")).sendKeys("Test@Test.test");
       driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("1234567890");
       Select slct = new Select(driver.findElement(By.xpath("(//select[@id='status'])[2]")));
       slct.selectByValue("Inactive");
       driver.findElement(By.xpath("(//textarea[@id='address'])")).sendKeys("80, Jaora Compound, Indore, Madhya Pradesh 452001");
       driver.findElement(By.xpath("(//button[normalize-space()='Save'])[1]")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("(//button[normalize-space()='Close'])[1]")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("(//button[@title='Info'])[2]")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("(//button[@aria-label='Close'])[1]")).click();
       Thread.sleep(2000);
       
   	   /*Search functionality all*/
       driver.findElement(By.xpath("(//input[@id='name'])[1]")).sendKeys("AAATestorg");
       driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//input[@id='address']")).sendKeys("80, Jaora Compound, Indore, Madhya Pradesh 452001");
       driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("(//input[@id='email'])[1]")).sendKeys("Test@Test.test");
       driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
       Thread.sleep(2000);
       Select slct1 = new Select(driver.findElement(By.xpath("(//select[@id='status'])[1]")));
       slct1.selectByValue("Inactive");
       driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//button[normalize-space()='Reset']")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
       Thread.sleep(2000);
//       
       /*Search functionality single*/
       driver.findElement(By.xpath("(//input[@id='name'])[1]")).sendKeys("AAATestorg");
       driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//button[normalize-space()='Reset']")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//input[@id='address']")).sendKeys("80, Jaora Compound, Indore, Madhya Pradesh 452001");
       driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//button[normalize-space()='Reset']")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("(//input[@id='email'])[1]")).sendKeys("Test@Test.test");
       driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//button[normalize-space()='Reset']")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
       Thread.sleep(2000);
       Select slct11 = new Select(driver.findElement(By.xpath("(//select[@id='status'])[1]")));
       slct11.selectByValue("Inactive");
       driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//button[normalize-space()='Reset']")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
       Thread.sleep(2000);

       /*Application Assignment*/
       driver.findElement(By.xpath("(//button[@data-target='#assignApps'])[2]")).click();
       Thread.sleep(2000);
       Select slct2 = new Select(driver.findElement(By.xpath("//select[@id='appId']")));
       slct2.selectByValue("16");
       driver.findElement(By.xpath("(//button[normalize-space()='Add'])[2]")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("(//button[normalize-space()='Save'])[2]")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("(//button[normalize-space()='Close'])[2]")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("(//button[@data-target='#assignApps'])[2]")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("(//button[normalize-space()='Close'])[2]")).click();
       Thread.sleep(2000);
       
       /*Editing a Organization */
       driver.findElement(By.xpath("(//button[@title='Edit'])[2]")).click();
       driver.findElement(By.xpath("(//input[@id='name'])[2]")).clear();
       driver.findElement(By.xpath("(//input[@id='name'])[2]")).sendKeys("AAABBBTestorg");
       driver.findElement(By.id("code")).clear();
       driver.findElement(By.id("code")).sendKeys("Org5677");
       driver.findElement(By.xpath("(//input[@id='email'])[2]")).clear();
       driver.findElement(By.xpath("(//input[@id='email'])[2]")).sendKeys("Testrrrt@Test.test");
       driver.findElement(By.xpath("//input[@id='phone']")).clear();
       driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("1234509876");
       driver.findElement(By.xpath("(//textarea[@id='address'])")).clear();
       driver.findElement(By.xpath("(//textarea[@id='address'])")).sendKeys("1180, kaora rompound, Bhopal, Madhya Pradesh 452001");
       /*photo upload*/
//       WebElement photoup = driver.findElement(By.xpath("//*[@id=\"editModal\"]/div/div[2]/div/div[2]/form/div[5]/img"));
//       photoup.click();
//       photoup.sendKeys("C:\\Users\\Ncs.NET\\Desktop\\Images\\india.png");
//       
       driver.findElement(By.xpath("(//button[normalize-space()='Save'])[1]")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("(//button[normalize-space()='Close'])[1]")).click();
       Thread.sleep(2000);
   
       
          /*Orgnization delete*/
       driver.findElement(By.xpath("(//button[@title='Delete'])[2]")).click();
       Thread.sleep(2000);
       driver.switchTo().alert().accept();
        Thread.sleep(2000);
       
	}

}
