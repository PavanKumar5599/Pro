package firstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class newClass {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pavan Kumar Nasana\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.globalsqa.com/samplepagetest/");//it opens the url
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"g2599-name\"]")).sendKeys("pavan kumar");
		driver.findElement(By.xpath("//*[@id=\"g2599-email\"]")).sendKeys("pavankumar123456@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"g2599-website\"]")).sendKeys("https://www.globalsqa.com/samplepagetest/");
		driver.findElement(By.xpath("//*[@id=\"g2599-experienceinyears\"]")).sendKeys("0-1");
		driver.findElement(By.xpath("//*[@id=\"contact-form-2599\"]/form/div[5]/label[3]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"contact-form-2599\"]/form/div[6]/label[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"contact-form-comment-g2599-comment\"]")).sendKeys("any comment you can write here");
		driver.findElement(By.xpath("//*[@id=\"contact-form-2599\"]/form/p[3]/button")).click();
		driver.navigate().refresh();
		
		
		

	}

}
