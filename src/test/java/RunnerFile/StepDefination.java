package RunnerFile;

import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import PageObjectModel.Applications;
import PageObjectModel.LogInLogOut;
import PageObjectModel.MenuScreen;
import PageObjectModel.Organisation;
import PageObjectModel.User;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefination {

	WebDriver driver;
	ChromeOptions opt;
	LogInLogOut InOut;
	Organisation masterdataOrg;
	Applications masterdataApp;
	MenuScreen menuscreen;
	User users;
	
	@BeforeTest
	public void setUp() throws Throwable{
		WebDriverManager.chromedriver().setup();
		opt = new ChromeOptions();
		opt.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking","enable-automation"));
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
        opt.setExperimentalOption("prefs", prefs);
		driver = new ChromeDriver(opt);
		
		
		driver.manage().window().maximize();
	  	driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(100));
	  	driver.manage().deleteAllCookies();
	  	InOut = new LogInLogOut(driver);
	  	masterdataOrg = new Organisation(driver);
	  	masterdataApp = new Applications(driver);
	  	menuscreen = new MenuScreen(driver);
	  	users = new User(driver);
	}
	
	@Test(priority = 0)
	public void Login() {
		InOut.login();
	}
	
	@Test(priority = 1)
	public void MasterData() throws InterruptedException, IOException {
//		masterdataOrg.orgnisation();
//		masterdataApp.Application();
//		users.UserAddition("AAAAAAAA", "BBBBBB", "cc@cc.cc", "pass1243", "1234567890", "cc@cc.cc");
//		users.Search();
//		users.UserEdit();
//		users.UserAppRole();
//		users.DeleteUser();
		menuscreen.AppMenu();
		menuscreen.Searchmenu();
//		menuscreen.RoleMenuAssignement();
		menuscreen.MenuDeletion();
	}
	
	@AfterTest
	public void LogOut() throws InterruptedException {
		InOut.Logout();
	}
}
