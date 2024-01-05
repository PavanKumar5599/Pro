package demopage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class democls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pavan Kumar Nasana\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		
		//  create an account
		driver.findElement(By.xpath("(//*[text()=\"Create an Account\"])[1]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Pavan Kumar");
		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("nasana");
		driver.findElement(By.xpath("//*[@id=\"email_address\"]")).sendKeys("pavan12345@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Kumar435@");
		driver.findElement(By.xpath("//*[@id=\"password-confirmation\"]")).sendKeys("Kumar435@");
		
		driver.findElement(By.xpath("(//*[text()=\"Create an Account\"])[3]")).click();
		
		//log in
		driver.findElement(By.xpath("//*[@class=\"header links\"]//li[2]//a")).click();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("pavan12345@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Kumar435@");
		driver.findElement(By.xpath("(//*[text()=\"Sign In\"])[1]")).click();
		
		
		//open watts new
		driver.findElement(By.xpath("(//*[text()=\"What's New\"])")).click();
		
		// select woman hoodie
		driver.findElement(By.linkText("Hoodies & Sweatshirts")).click();
		
		driver.findElement(By.xpath("//*[@alt=\"Circe Hooded Ice Fleece\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"option-label-size-143-item-168\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"option-label-color-93-item-53\"]")).click();
		
		//add card
		driver.findElement(By.xpath("//*[text()=\"Add to Cart\"]")).click();
		
		//go back
		driver.navigate().back();
		driver.navigate().back();
		
		//jackets
		driver.findElement(By.linkText("Jackets")).click();
		driver.findElement(By.xpath("//*[@alt=\"Juno Jacket\"]")).click();
		
		//select size
		driver.findElement(By.xpath("//*[@id=\"option-label-size-143-item-168\"]")).click();
		
		//select color
		driver.findElement(By.xpath("//*[@id=\"option-label-color-93-item-53\"]")).click();
		
		//add card
		driver.findElement(By.xpath("//*[text()=\"Add to Cart\"]")).click();
		
		//go back
		driver.navigate().back();
		driver.navigate().back();
		
		//tees
		driver.findElement(By.linkText("Tees")).click();
		driver.findElement(By.xpath("//*[@alt=\"Gwyn Endurance Tee\"]")).click();
		
		//select size
		driver.findElement(By.xpath("//*[@id=\"option-label-size-143-item-168\"]")).click();
		
		//select color
		driver.findElement(By.xpath("//*[@id=\"option-label-color-93-item-60\"]")).click();
		
		//add card
		driver.findElement(By.xpath("//*[text()=\"Add to Cart\"]")).click();
		
		//go back
		driver.navigate().back();
		driver.navigate().back();
		
		//pants
		driver.findElement(By.linkText("Pants")).click();
		
		driver.findElement(By.xpath("//*[@alt=\"Carina Basic Capri\"]")).click();
		
		//select size
		driver.findElement(By.xpath("//*[@id=\"option-label-size-143-item-171\"]")).click();
		
		//select color
		driver.findElement(By.xpath("//*[@id=\"option-label-color-93-item-50\"]")).click();
		
		//add card
		driver.findElement(By.xpath("//*[text()=\"Add to Cart\"]")).click();
		
		//go back
		driver.navigate().back();
		driver.navigate().back();
		
		//shorts
		driver.findElement(By.linkText("Shorts")).click();
		
		driver.findElement(By.xpath("//*[@alt=\"Ana Running Short\"]")).click();
		
		//select size
		driver.findElement(By.xpath("//*[@id=\"option-label-size-143-item-171\"]")).click();
		
		//select color
		driver.findElement(By.xpath("//*[@id=\"option-label-color-93-item-56\"]")).click();
		
		//add card
		driver.findElement(By.xpath("//*[text()=\"Add to Cart\"]")).click();
		
	
		

	}

}
