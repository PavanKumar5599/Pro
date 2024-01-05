package firstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Cssselector_locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pavan Kumar Nasana\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		//css selector
		//1.tag and id combination//taganame#idvalue
		//2.tag and class combination//tag.classvalue
		//3.tag and attribute//tagname[attribute="value"]
		//4.tag and class and attribute//tagname.classsvalue[attribute="value"]
	driver.get("https://www.facebook.com/login/");//it opens the url
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//*[@name=\"firstname\"]")).sendKeys("Pavan Kumar");
//		driver.findElement(By.xpath("//*[@name=\"lastname\"]")).sendKeys("Nasana");
//		driver.findElement(By.xpath("(//*[starts-with(@name,\"reg\")])[2]")).sendKeys("pavan1234567@gmail.com");
//		driver.findElement(By.xpath("(//*[contains(@name,\"email\")])[2]")).sendKeys("pavan1234567@gmail.com");
//		driver.findElement(By.xpath("//*[contains(@name,\"pass\")]")).sendKeys("Pavan12@#");
//		driver.findElement(By.xpath("//*[@name=\"birthday_day\"]")).sendKeys("6");
//		driver.findElement(By.xpath("//*[@name=\"birthday_month\"]")).sendKeys("Jun");
//		driver.findElement(By.xpath("//select[@name=\"birthday_year\"]")).sendKeys("1999");
//		driver.findElement(By.cssSelector("input._8esa[value=\"2\"]")).click();
//		driver.findElement(By.xpath("(//*[text()=\"Sign Up\"])[1]")).click();
//		driver.findElement(By.linkText("Forgotten account?")).click();
//		driver.findElement(By.linkText("Forgotten account?")).click();
//		driver.findElement(By.linkText("Sign up for Facebook")).click();
//		driver.findElement(By.partialLinkText("Forgot")).click();	
//		driver.findElement(By.partialLinkText("Forgot")).click();
		driver.findElement(By.cssSelector("input#email")).sendKeys("batch6.4 and 6.4.1");
		
	}

}
