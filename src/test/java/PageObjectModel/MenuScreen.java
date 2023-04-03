package PageObjectModel;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		 driver.findElement(By.xpath("//a[@href='#/menulist/57']")).click();
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
	
	public void RoleMenuAssignement() throws InterruptedException {
		driver.findElement(By.xpath("//a[@href='#/menuassignment/57']")).click();
		Thread.sleep(1000);
		Select slct = new Select(driver.findElement(By.xpath("(//select[@id='roleId'])[2]")));
		slct.selectByVisibleText("Admin");
		driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
		Thread.sleep(1000);
		/*Assigning a menu for a role*/
		List<WebElement> menuitem1 = driver.findElements(By.xpath("//td/table/tbody[1]/tr/td[3]"));
		List<WebElement> checkbox1 = driver.findElements(By.xpath("//td/table/tbody[1]/tr/td/input"));
		for (int i=0;i<=menuitem1.size();i++) {
//		    System.out.println(menuitem.get(i).getText());
		    if(menuitem1.get(i).getText().equalsIgnoreCase("TestData")) {
		    	checkbox1.get(i).click();
		    	break;
			}
			else {
				System.out.println(".");
			}	
		}
		Thread.sleep(1000);	
		driver.findElement(By.xpath("//body//app-root//table//button[1]")).click();	
		/*Unassigns a menu from a role*/
		Thread.sleep(2000);	
		List<WebElement> menuitem = driver.findElements(By.xpath("//td/table/tbody[1]/tr/td[3]"));
		List<WebElement> checkbox = driver.findElements(By.xpath("//td/table/tbody[1]/tr/td/input"));
		for (int i=0;i<=menuitem.size();i++) {
//		    System.out.println(menuitem.get(i).getText());
		    if(menuitem.get(i).getText().equalsIgnoreCase("TestData")) {
		    	checkbox.get(i).click();
//		    	System.out.println("finally");
		    	break;
			}
			else {
				System.out.println("Menu not present");
			}		    
		}					
		Thread.sleep(1000);	
		driver.findElement(By.xpath("//body//app-root//table//button[2]")).click();	
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//a[normalize-space()='Menu Items']")).click();
	}
	
	public void MenuDeletion() throws InterruptedException{
		Thread.sleep(3000);
		List<WebElement> menulist = driver.findElements(By.xpath("//table/tbody/tr/td[5]"));
		List<WebElement> DeleteBtn =driver.findElements(By.xpath("//button[@title='Delete']"));
		for (int i=0;i<=menulist.size();i++) {
		    if(menulist.get(i).getText().equalsIgnoreCase("testdata")) {
		    	DeleteBtn.get(i).click();
		    	driver.switchTo().alert().accept();
		    	break;
		    	   
			}
			else {
				System.out.println("Menu not present");
			}		    
		  
		     Thread.sleep(1000);
		  
		        Thread.sleep(2000);
		
	}
}
}
