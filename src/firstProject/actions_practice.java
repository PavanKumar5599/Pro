package firstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.interactions.Actions;

public class actions_practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pavan Kumar Nasana\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		//driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		//double click Button
		
//		driver.switchTo().frame("iframeResult");
//		driver.findElement(By.xpath("//*[@value=\"Hello World!\"]")).clear();
//		driver.findElement(By.xpath("//*[@value=\"Hello World!\"]")).sendKeys("Pavan Kumar");
//		WebElement double_click_button=driver.findElement(By.xpath("//button[text()=\"Copy Text\"]"));
//		
		Actions cls=new Actions(driver);
//		cls.doubleClick(double_click_button).perform();
		
		
		//right click button
		//int num=driver.findElements(By.xpath("/html/body/ul//li")).size();
		WebElement right_click=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		for(int n=1;n<=5;n++) {
			cls.contextClick(right_click).perform();
			
			
			driver.findElement(By.xpath("/html/body/ul//li["+n+"]")).click();
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			Thread.sleep(2000);
			System.out.println("Action Succeful : "+n);
		
		}
	}

}
