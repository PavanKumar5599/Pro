package firstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pavan Kumar Nasana\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		//driver.get("https://www.facebook.com/signup");//it opens the url
		driver.get("https://chercher.tech/practice/dropdowns");
		driver.manage().window().maximize();
		
	/*	driver.findElement(By.name("firstname")).sendKeys("Pavan Kumar");
		driver.findElement(By.name("lastname")).sendKeys("Nasana");
		driver.findElement(By.name("reg_email__")).sendKeys("pavan123456@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("pavan123456@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("pavanPP123@");
		
		//WebElement date=driver.findElement(By.id("day"));
		Select se=new Select(driver.findElement(By.id("day")));
		se.selectByVisibleText("6");
		
		WebElement month=driver.findElement(By.id("month"));
		Select sr=new Select(month);	
		sr.selectByVisibleText("Jun");
		
		WebElement year=driver.findElement(By.id("year"));
		Select ye=new Select(year);
		ye.selectByVisibleText("1999");
		driver.findElement(By.cssSelector("input[value=\"2\"]")).click();*/	
		
		WebElement p=driver.findElement(By.cssSelector("select#first"));
		Select product=new Select(p);
		product.selectByIndex(1);
		
		Select animal=new Select(driver.findElement(By.id("animals")));
		animal.selectByValue("babycat");
		
		Select d_product=new Select(driver.findElement(By.id("order-same")));
		d_product.selectByVisibleText("Iphone");

		Select dummy_product=new Select(driver.findElement(By.id("order-changed")));
		dummy_product.selectByVisibleText("Bing");

		Select food=new Select(driver.findElement(By.cssSelector("select#second")));
		food.selectByVisibleText("Pizza");
		food.selectByIndex(1);
		food.selectByValue("burger");
		food.selectByIndex(3);
		
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("PavanKumar");
		driver.findElement(By.xpath("//*[@id=\"checkme\"]")).click();
		
		Thread.sleep(5000);
		Select fo=new Select(driver.findElement(By.cssSelector("select#second")));
		fo.deselectAll();
		
		
	}

}
