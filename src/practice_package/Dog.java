package practice_package;

import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Dog {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pavan Kumar Nasana\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		//driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.get("https://demoqa.com/date-picker");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		Date d1=new Date();
//		
//		System.out.println(d1);
//		String s=d1.toString();
//		String[] arr=s.split(" ");
//		String month=arr[1];
//		String year=arr[5];
//		String day=arr[2];
		
		
		///dropdown calendar
//		
//		driver.findElement(By.xpath("//*[@id=\"datepicker2\"]")).click();
//		
//		
//		
//		Select year_se=new Select(driver.findElement(By.xpath("(//select[@class=\"datepick-month-year\"])[2]")));
//		year_se.selectByVisibleText(year);
//		
//		
//		
//		
//		Select month_se=new Select(driver.findElement(By.xpath("//select[@title=\"Change the month\"]")));
//		month_se.selectByVisibleText("October");
//		
//		List<WebElement> da_li=driver.findElements(By.xpath("//table//td"));
//		for(WebElement date:da_li) {
//			if(date.getText().equals(day)) {
//				date.click();
//				break;
//			}
//		}
//		
		
		driver.get("https://demoqa.com/date-picker");
		
		// Click on date and time input box
		
		driver.findElement(By.id("dateAndTimePickerInput")).click();
		
		// Store expected date and time
		
		String exp_year="2023";
		String exp_month="October";
		String exp_day="23";
		String exp_time="12:15";
		
		// Get current month and year frome calendar
		
		
		
		
		// Year and month
		
		while(true) {
			String cur_month_year=driver.findElement(By.xpath("//*[contains(@class,\"current-mont\")]")).getText();
			System.out.println(cur_month_year);
			String[] cur_month_year_arr=cur_month_year.split(" ");
			String cur_month=cur_month_year_arr[0];
			String cur_year=cur_month_year_arr[1];
			
			if (exp_year.equals(cur_year) && exp_month.equals(cur_month)) {
				break;
			}
			
			driver.findElement(By.xpath("//button[text()=\"Next Month\"]")).click();
			
		}
		
		// day 
		
		List<WebElement> day_li=driver.findElements(By.xpath("//*[@class=\"react-datepicker__month\"]//div"));
		
		for(WebElement day:day_li) {
			if (day.getText().equals(exp_day)) {
				day.click();
				break;
			}
		}
		
		// Time
		
		List<WebElement> time_li=driver.findElements(By.xpath("//ul[contains(@class,\"time-list\")]//li"));
		
		for(WebElement time:time_li) {
			
			if(time.getText().equals(exp_time)) {
				time.click();
				break;
			}
		}

		
		
		

	}
	

}
