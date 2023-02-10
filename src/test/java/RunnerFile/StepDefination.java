package RunnerFile;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import PageObjectModel.Applications;
import PageObjectModel.LogInLogOut;
import PageObjectModel.Organisation;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefination {

	WebDriver driver;
	LogInLogOut InOut;
	Organisation masterdataOrg;
	Applications masterdataApp;
	
	@BeforeTest
	public void setUp() throws Throwable{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	  	driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(100));
	  	driver.manage().deleteAllCookies();
	  	InOut = new LogInLogOut(driver);
	  	masterdataOrg = new Organisation(driver);
	  	masterdataApp = new Applications(driver);
	}
	
	@Test(priority = 0)
	public void Login() {
		InOut.login();
	}
	
	@Test(priority = 1)
	public void MasterData() throws InterruptedException {
		masterdataOrg.orgnisation();
		masterdataApp.Application();
	}
	
	
	@Test(priority = 2)
	public void LogOut() throws InterruptedException {
		InOut.Logout();
	}
}
