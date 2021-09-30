package com.HRMS;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Language {
	
		WebDriver driver;
		JavascriptExecutor js;   //= (JavascriptExecutor) driver;
	/*	@BeforeTest
		@Parameters("browser")
		public void LaunchBrowser(String browser) throws Exception {

			if(browser.equalsIgnoreCase("firefox")){
			    WebDriverManager.firefoxdriver().setup();
			    driver = new FirefoxDriver();
			    driver.get("https://hrms.vinsys.live");
		        driver.manage().window().maximize();
			}
			else if(browser.equalsIgnoreCase("chrome")){
			    WebDriverManager.chromedriver().setup();
			    
			    driver = new ChromeDriver();
			    driver.get("https://hrms.vinsys.live");
		        driver.manage().window().maximize();
			}
			else if(browser.equalsIgnoreCase("edge")){
			    WebDriverManager.edgedriver().setup();
			    driver = new EdgeDriver();driver.get("https://hrms.vinsys.live");
		        driver.manage().window().maximize();
			}
			else if(browser.equalsIgnoreCase("ie")){
			    WebDriverManager.iedriver().setup();
			    driver = new InternetExplorerDriver();
			    driver.get("https://hrms.vinsys.live");
		        driver.manage().window().maximize();
			}
			else{
				//If no browser passed throw exception
				throw new Exception("Browser is not correct");
			}
		
		}*/

	    @BeforeTest
	    public void LaunchBrowser()
	    {
	    	WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
	        driver.get("https://hrms.vinsys.live");
	        driver.manage().window().maximize();
		}
	    @Test(priority=1)
	    public void Login()
	    {
	        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("dummydev.testing@vinsys.com");
	        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Test@123");
	        driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
	        
	    }

	    
	    @Test(priority=2)
	    public void mySelfLink() throws InterruptedException {
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/app-root/div/aside/app-sidebar/section/ul/li[2]/a")).click();
        }
	    
	    @Test(priority=3)
	    public void myDetails() throws InterruptedException {
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/app-root/div/aside/app-sidebar/section/ul/li[2]/ul/li[1]/a")).click();
	    } 
	    
	    @Test(priority=4)
	    public void languageLink() throws InterruptedException {
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"HRWorkspace\"]/div/form/div/div[1]/div/div/div/div/div/ul/li[5]/a")).click();
	   
	    }    
	   
	    @Test(priority=5)
	    public void AddInvalidLanguage() throws InterruptedException {
	    Thread.sleep(3000);
	     driver.findElement(By.xpath("//*[@id=\"Language\"]/div/form/div/div[1]/div/button[1]")).click();
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//*[@id=\"CAND_LANG_LANGUAGE_NAME_ID\"]")).sendKeys("Spanish");
	     driver.findElement(By.xpath("//*[@id=\"modal-default-addlanguage\"]/div/div/div[3]/button[1]")).click();
	    }    
	    
	  //  WebElement speak = driver.findElement(By.xpath("//input[@name='wcanAdd_speak']"));
	  //  WebElement read  = driver.findElement(By.xpath("//input[@name='wcanAdd_Read']"));
	   // WebElement write = driver.findElement(By.xpath("//input[@name='wcanAdd_write']1"));
	   // WebElement mothyerTounge = driver.findElement(By.id("vfb-7-1"));
	    
	    
	    
	    
	    
	    
}