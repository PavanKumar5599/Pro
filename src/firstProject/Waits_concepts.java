package firstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits_concepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pavan Kumar Nasana\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		//driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
		//Implicit wait command
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.findElement(By.name("firstname")).sendKeys("pavan kumar");
		//driver.findElement(By.name("lastname")).sendKeys("Nasana");
		//driver.findElement(By.name("reg_email__")).sendKeys("pavankumar1234@gmail.com");
		//driver.findElement(By.name("reg_email_confirmation__")).sendKeys("pavankumar1234@gmail.com");
		//driver.findElement(By.name("reg_passwd__")).sendKeys("Pavan7568");
		
		//Explicit wait method
		
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement explict; //declare the WebElement
		
		explict=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
		explict.sendKeys("Pavan Kumar");
		
		explict=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("lastname")));
		explict.sendKeys("Nasana");
		
		explict=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("reg_email__")));
		explict.sendKeys("pavankumar1234@gmail.com");
		
		explict=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("reg_email_confirmation__")));
		explict.sendKeys("pavankumar1234@gmail.com");
		
		explict=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("reg_passwd__")));
		explict.sendKeys("Pavan7568");
		
		
		//Select method
		
		Select se=new Select(driver.findElement(By.id("day")));
		se.selectByVisibleText("6");
				
		WebElement month=driver.findElement(By.id("month"));
		Select sr=new Select(month);	
		sr.selectByVisibleText("Jun");	
		
		WebElement year=driver.findElement(By.id("year"));
		Select ye=new Select(year);
		ye.selectByVisibleText("1999"); 
		//driver.findElement(By.cssSelector("input[value=\"2\"]")).click();
		
		
		//Explicit wait method
		
		//mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value=\"2\"]"))).click();
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value=\"2\"]"))).click();
		
		
	}

}
