package firstProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Calender_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pavan Kumar Nasana\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://ssc.nic.in/registration/home");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"DateOfBirth\"]")).click();
		driver.findElement(By.xpath("(//table[@class=\"table-condensed\"])//tr[2]//th[2]")).click();
		
		String year="2000";
	
		
		
		while(true)
			{
				//current month
				String yr=driver.findElement(By.xpath("/html/body/div[2]/div[2]/table/thead/tr[2]/th[2]")).getText();////span[@class="ui-datepicker-month"]
				//current year
				
				//String yr=driver.findElement(By.className("ui-datepicker-year")).getText();////span[@class="ui-datepicker-year"]
				//checking the condition with the given data
				
				if(yr.equals(year)) //2023.equals(2025)
				{
					
					break;
				}
				//back button
				driver.findElement(By.xpath("/html/body/div[2]/div[2]/table/thead/tr[2]/th[1]")).click();////span[@class="ui-icon ui-icon-circle-triangle-e"]
				
			}
		//driver.findElement(By.xpath("/html/body/div[2]/div[2]/table/tbody/tr/td/span[6]")).click();
		List<WebElement> mon_li=driver.findElements(By.xpath("/html/body/div[2]/div[2]/table/tbody/tr/td//span"));
		for (WebElement month:mon_li) {
			if (month.getText().equals("Jun")) {
				month.click();
				break;
			}
		}
		
		//driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[2]/td[1]")).click();
		
		List<WebElement> day_li=driver.findElements(By.xpath("(/html/body/div[2]/div[1]/table/tbody/tr/td)"));
		
		for (WebElement day:day_li) {
			if (day.getText().equals("6")) {
				day.click();
				break;
			}
		}
		
					
		driver.findElement(By.xpath("//*[@id=\"VerifyDateOfBirth\"]")).click();
		driver.findElement(By.xpath("(//table[@class=\"table-condensed\"])//tr[2]//th[2]")).click();
		
		while(true)
		{
			//current month
			String yr=driver.findElement(By.xpath("/html/body/div[2]/div[2]/table/thead/tr[2]/th[2]")).getText();////span[@class="ui-datepicker-month"]
			//current year
			
			//String yr=driver.findElement(By.className("ui-datepicker-year")).getText();////span[@class="ui-datepicker-year"]
			//checking the condition with the given data
			
			if(yr.equals(year)) //2023.equals(2025)
			{
				
				break;
			}
			//next button
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/table/thead/tr[2]/th[1]")).click();////span[@class="ui-icon ui-icon-circle-triangle-e"]
			
		}
	//driver.findElement(By.xpath("/html/body/div[2]/div[2]/table/tbody/tr/td/span[6]")).click();
	List<WebElement> mon_li2=driver.findElements(By.xpath("/html/body/div[2]/div[2]/table/tbody/tr/td//span"));
	for (WebElement month:mon_li2) {
		if (month.getText().equals("Jun")) {
			month.click();
			break;
		}
	}
	
	//driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[2]/td[1]")).click();
	
	List<WebElement> day_li2=driver.findElements(By.xpath("(/html/body/div[2]/div[1]/table/tbody/tr/td)"));
	
	for (WebElement day:day_li2) {
		if (day.getText().equals("6")) {
			day.click();
			break;
		}
	}
	
		
		
		
		
//			//selecting day
//			List<WebElement> alldates=driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//td"));////table[@class="ui-datepicker-calendar"]//td
//			for(WebElement dt:alldates) {
//				if(dt.getText().equals(day)) {
//					dt.click();
//					break;
//				}
//			}
		//select month and year
//				while(true)
//				{
//					//current month
//					String Mnth=driver.findElement(By.className("ui-datepicker-month")).getText();////span[@class="ui-datepicker-month"]
//					//current year
//					System.out.println(Mnth);
//					String yr=driver.findElement(By.className("ui-datepicker-year")).getText();////span[@class="ui-datepicker-year"]
//					//checking the condition with the given data
//					System.out.println(yr);
//					if(yr.equals(year) && Mnth.equals(month)) //2023.equals(2025) && may.equals(april)
//					{
//						
//						break;
//					}
//					//next button
//					driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-w\"]")).click();////span[@class="ui-icon ui-icon-circle-triangle-e"]
//					
//				}
//				//selecting day
//				List<WebElement> alldates=driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//td"));////table[@class="ui-datepicker-calendar"]//td
//				for(WebElement dt:alldates) {
//					if(dt.getText().equals(day)) {
//						dt.click();
//						break;
//					}
//				}
		
	}

}
