/*package gov.gsa.sam.base;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import io.github.bonigarcia.wdm.ChromeDriverManager;

public class WebDriverManager {
	
	public static WebDriver getDriver(){
		
		String browserType = FileReaderManager.getInstance().getConfigFileReader().getBrowser();
		 System.out.println("browserType:"+ browserType );
		WebDriver driver;
		
		switch(browserType){
		   case "chrome":
			   

				System.out.println("...................Browser..........");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("disable-infobars");
				options.addArguments("start-maximized");
				options.addArguments("incognito");
				options.setExperimentalOption("useAutomationExtension", false); 
				ChromeDriverManager.getInstance().setup();
				driver = new ChromeDriver(options);
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			   break;
			   
		   case "ff":
			   System.setProperty("webdriver.gecko.driver", "C:\\Users\\Shanthi.Dutta\\geckodriver\\geckodriver.exe");
				driver = new FirefoxDriver(); 
			   break;
			   
		   default:	   
			    //DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
//capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
//capabilities.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
//capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
//capabilities.setCapability("allow-blocked-content", true);
//capabilities.setCapability("allowBlockedContent", true);
System.setProperty("webdriver.ie.driver", "src\\test\\resource\\IEDriverServer.exe");
			   driver = new InternetExplorerDriver(); 
			   break;
		}
			   
		if(FileReaderManager.getInstance().getConfigFileReader().isWindowMaximize()) driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigFileReader().getImplicitlyWait(), TimeUnit.SECONDS)	
			return driver;		
	}
		
	public static void setDriver(WebDriver driver) {
                    driver = driver;
	       }



}
*/