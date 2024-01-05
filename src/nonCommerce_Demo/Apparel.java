package nonCommerce_Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Apparel extends Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Login login_form=new Login();
		login_form.Broswer_lunch();
		login_form.register();
		login_form.log();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Open Apparel
		driver.findElement(By.xpath("//*[text()=\"Apparel \"]")).click();
		
		//open shoes
		driver.findElement(By.xpath("(//*[text()=\"Shoes \"])[3]")).click();
		
		//select product
		driver.findElement(By.xpath("//*[text()=\"adidas Consortium Campus 80s Running Shoes\"]")).click();
		
		//add card
		Select select_shoesize=new Select(driver.findElement(By.xpath("//*[@id=\"product_attribute_9\"]")));
		select_shoesize.selectByVisibleText("10");
			
		driver.findElement(By.xpath("//*[@id=\"color-squares-10\"]/li[3]/label/span/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-25\"]")).click();
		
		//back
		driver.navigate().back();
		
		//Open clothing
		driver.findElement(By.xpath("(//*[text()=\"Clothing \"])[3]")).click();
		
		//select product
		driver.findElement(By.xpath("//*[text()=\"Custom T-Shirt\"]")).click();
		
		//add card
		driver.findElement(By.xpath("//*[@id=\"product_attribute_12\"]")).sendKeys("pavan");
		driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-29\"]")).click();
		
		//back
		driver.navigate().back();
		
		//Open Accessories
		driver.findElement(By.xpath("(//*[text()=\"Accessories \"])[3]")).click();
		//select product
		driver.findElement(By.xpath("//*[text()=\"Obey Propaganda Hat\"]")).click();
		
		//select sze
		Select hat_select=new Select(driver.findElement(By.xpath("//*[@id=\"product_attribute_13\"]")));
		hat_select.selectByIndex(2);
		
		//add wishlist
		driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-31\"]")).click();

	}

}
