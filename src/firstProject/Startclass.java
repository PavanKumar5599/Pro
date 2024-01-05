package firstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Startclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pavan Kumar Nasana\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		//GET COMMANDS
		//get(),getpagesource,gettitle,getcurrenturl
	driver.get("https://demoqa.com/automation-practice-form");//it opens the url
		driver.manage().window().maximize();
		String page_title=driver.getTitle();
		System.out.println("this is the title of the page: "+page_title);
		System.out.println(driver.getCurrentUrl());//it gets the current url
//		browser commands
//		driver.close();//it closes single window
		//driver.quit();//it close all opened windows
		//NAVIGATION COMMANDS
		//navigateto.forwward
		//navigate.back
		//navigate.refresh
//		navigate.to("url")
//		driver.navigate().to("https://www.youtube.com/watch?v=o19q-7-nIyA");
//		driver.navigate().back();
//		driver.navigate().to("https://www.youtube.com/watch?v=z9mrmlzob00");
//		driver.navigate().back();
//		driver.navigate().to("https://www.amazon.in/");
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
//		
		//locators;;;identifying the element in the webpage
/*
		1)Id
	2)class
	3)linktext
	4)name
	5)cssselector
	 a)tag & id//tagname#value
		b)tag and class
		c)tag and attribute
		d)tag and class and attribute
		e)innertext
	6)xpath
*/
		driver.findElement(By.id("firstName")).sendKeys("Pavan Kumar");
		driver.findElement(By.id("lastName")).sendKeys("Nasana");
		driver.findElement(By.id("userEmail")).sendKeys("Pavankumar8664k@gamil.com");
		driver.findElement(By.cssSelector("input#gender-radio-1")).click();
		driver.findElement(By.id("userNumber")).sendKeys("9701696472");
		//driver.findElement(By.xpath("")).sendKeys("maths");
		driver.findElement(By.id("currentAddress")).sendKeys("Hyderbad, kbhp metro");
		
	}

}
