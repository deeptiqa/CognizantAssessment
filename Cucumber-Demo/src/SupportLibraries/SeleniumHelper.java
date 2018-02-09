package SupportLibraries;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import PageObjects.GlobalVariables;

public class SeleniumHelper {
	
	/*
	 * Author: Deepti
	 * Date: 
	 * Description: This is class contains generic methods to lanuch the browser, close the browser, taking screen shots,..etc  
	 *  	
	 */
	
	public static WebDriver driver;

	public static void setup() throws Exception{
		Properties prop = new Properties();
		try {
            //load a properties file
			prop.load(new FileInputStream("Config.Properties"));
			String path = new File(".").getCanonicalPath();		
			String sGeckoDriverPath = path+"\\src\\SeleniumDrivers\\geckodriver.exe";
			String sChromeDriverPath = path+"\\src\\SeleniumDrivers\\chromedriver.exe";
			String sIEDriverPath = path+"\\src\\SeleniumDrivers\\IEDriverServer.exe";
			if(prop.getProperty("Browser").equals("Firefox")){
				System.setProperty("webdriver.gecko.driver", sGeckoDriverPath);
				driver = new FirefoxDriver();
			}else if(prop.getProperty("Browser").equals("GoogleChrome")){
				System.setProperty("webdriver.chrome.driver", sChromeDriverPath);
				driver = new ChromeDriver();
			}else if(prop.getProperty("Browser").equals("IE")){
				System.setProperty("webdriver.ie.driver", sIEDriverPath);
				driver = new InternetExplorerDriver();
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
		if(prop.getProperty("ENV").equals("QA")){
			driver.get(prop.getProperty("QA_URL"));
		}else if(prop.getProperty("ENV").equals("STG")){
			driver.get(prop.getProperty("STG_URL"));
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		GlobalVariables.sProject=prop.getProperty("Project");
		GlobalVariables.sReleaseName=prop.getProperty("Release");
		GlobalVariables.sEnvironment=prop.getProperty("ENV");
		GlobalVariables.sUser=prop.getProperty("User");
		
	}
	
	public static void teardown(){
		driver.quit();
	}
		
	public static void ValidateBrowserReady(){
		JavascriptExecutor objJS = ((JavascriptExecutor) driver);
		String status = objJS.executeScript("return document.readyState").toString();		
		while(!(status.equals("complete"))){
			try{
				Thread.sleep(1000);
			}catch(Exception e){				
			}
			status = objJS.executeScript("return document.readyState").toString();
		}
	}
}
