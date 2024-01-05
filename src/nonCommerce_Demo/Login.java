package nonCommerce_Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Login {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Login login_form=new Login();
		login_form.Broswer_lunch();;
		login_form.register();
		login_form.log();

	}
	public void Broswer_lunch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pavan Kumar Nasana\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		
		driver.get("https://demo.nopcommerce.com/cart");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	public void log() {
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("pavankumar1234@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Pavan9988");
		
		driver.findElement(By.xpath("//*[@id=\"RememberMe\"]")).click();
		driver.findElement(By.xpath("(//*[text()=\"Log in\"])[2]")).click();
	}
	
	public void register() {
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//*[@id=\"gender-male\"]")).click();	
		driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("Pavan Kumar");
		driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("Nasana");
		
		//Select day
		WebElement web_day=driver.findElement(By.name("DateOfBirthDay"));
		Select day=new Select(web_day);
		day.selectByValue("6");
		
		//Select month
		WebElement web_month=driver.findElement(By.name("DateOfBirthMonth"));
		Select month=new Select(web_month);
		month.selectByVisibleText("June");
		
		//select year
		WebElement web_year=driver.findElement(By.name("DateOfBirthYear"));
		Select year=new Select(web_year);
		year.selectByVisibleText("1999");
		
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("pavankumar1234@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"Company\"]")).sendKeys("Papular Comapny");
		
		//Password
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Pavan9988");
		
		//Confirm password
		driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("Pavan9988");
			
		//Register button
		driver.findElement(By.xpath("//*[@id=\"register-button\"]")).click();
	}
	

}
