package practice_package;


import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Date_im {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pavan Kumar Nasana\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//	
		
//		
		
		Date d1=new Date();
		
		System.out.println(d1);
		String s=d1.toString();
		String[] arr=s.split(" ");
		String month=arr[1];
		String year=arr[5];
		String day=arr[2];
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
		
		while(true) {
			String yr=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
			String mon=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
			
			if(yr.equals(year) && mon.contains(month)) 
			{
				
				break;
			}
			driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();
		}
		List<WebElement> date_li=driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//td"));
		for (WebElement date:date_li) {
			if (date.getText().equals(day)) {
				date.click();
				break;
			}
		}
		
	
	
	}
	

	

}
