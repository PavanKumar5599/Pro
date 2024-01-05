package nonCommerce_Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Jewelry extends Login{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login login_form=new Login();
		login_form.Broswer_lunch();
		login_form.register();
		login_form.log();
		
		//Open Jewelry
		driver.findElement(By.xpath("(//*[text()=\"Jewelry \"])[1]")).click();
		
		//select product
		driver.findElement(By.linkText("Elegant Gemstone Necklace (rental)")).click();
				
		//starting date 
		driver.findElement(By.xpath("//*[@id=\"rental_start_date_40\"]")).click();
		
		String start_year="2023";
		String start_month="SEPTEMBER";
		String start_day="20";
		
		while(true) {
			String ye=driver.findElement(By.className("ui-datepicker-year")).getText();
			String mon=driver.findElement(By.className("ui-datepicker-month")).getText();
			
			if(ye.equals(start_year)&&mon.equals(start_month)) {
				break;
			}
			driver.findElement(By.className("ui-datepicker-next ui-corner-all")).click();
		}
		
		
		List<WebElement> alldates=driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//td"));
		for(WebElement start_date:alldates) {
			if(start_date.getText().equals(start_day)) {
				start_date.click();
				break;
			}
		}
		
		//end date
		driver.findElement(By.xpath("//*[@id=\"rental_end_date_40\"]")).click();
		String end_year="2023";
		String end_month="OCTOBER";
		String end_day="23";
		
		while(true) {
			String end_ye=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
			String end_mon=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
			
			if(end_ye.equals(end_year)&&end_mon.equals(end_month)) {
				break;
			}
			driver.findElement(By.xpath("//*[@class=\"ui-datepicker-next ui-corner-all\"]")).click();
		}
		
		
		List<WebElement> end_alldates=driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//td"));
		for(WebElement end_date:end_alldates) {
			if(end_date.getText().equals(end_day)) {
				end_date.click();
				break;
			}
		}
		
		//add wish list
		driver.findElement(By.xpath("(//*[text()=\"Add to wishlist\"])[1]")).click();

	}

}
