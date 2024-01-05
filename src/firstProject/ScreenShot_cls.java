package firstProject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScreenShot_cls {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pavan Kumar Nasana\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://demo.nopcommerce.com/cart");
		driver.manage().window().maximize();
		
		
		//take screen shots
		TakesScreenshot ts=(TakesScreenshot)driver;   //downcasting
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("C:\\Users\\Pavan Kumar Nasana\\OneDrive\\Pictures\\Screenshots\\screen  shots\\image.png");
		FileUtils.copyFile(src,trg);
		
		//Register 
		driver.findElement(By.linkText("Register")).click();
		
		//take particular container screen shots
		WebElement featuredproducts=driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div"));
		File src1=featuredproducts.getScreenshotAs(OutputType.FILE);
		File trg1=new File("C:\\Users\\Pavan Kumar Nasana\\OneDrive\\Pictures\\Screenshots\\screen  shots\\image2.png");
		FileUtils.copyFile(src1,trg1);

	}

}
