package nonCommerce_Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Computers extends Login{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login lg=new Login();
		lg.Broswer_lunch();;
		lg.register();;
		lg.log();
		
		driver.findElement(By.xpath("(//*[text()=\"Computers \"])[1]")).click();
		
		//open desktop
		driver.findElement(By.cssSelector("img[title=\"Show products in category Desktops\"]")).click();
		
		//Select Product
		driver.findElement(By.xpath("(//*[text()=\"Add to cart\"])[1]")).click();
		
		//Select Ram
		Select item_ram=new Select(driver.findElement(By.xpath("//*[@id=\"product_attribute_2\"]")));
		item_ram.selectByIndex(3);
		
		//check HDD
		driver.findElement(By.xpath("//*[@id=\"product_attribute_3_7\"]")).click();
		
		//check  os
		driver.findElement(By.xpath("//*[@id=\"product_attribute_4_9\"]")).click();
		
		//Check checkBox
			
		driver.findElement(By.xpath("//*[@id=\"product_attribute_5_11\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"product_attribute_5_12\"]")).click();
		
		//text box check
		driver.findElement(By.xpath("//*[@id=\"product_enteredQuantity_1\"]")).sendKeys("2");
		
		driver.findElement(By.xpath("//*[@id=\"product_enteredQuantity_1\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"product_enteredQuantity_1\"]")).sendKeys("1");
		
		//ADD Card
		
		//driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-1\"]")).click();
		driver.findElement(By.cssSelector("button.button-1[data-productid=\"1\"]")).click();
		
		//go back
		driver.navigate().back();
		driver.navigate().back();
		
		//  Open Notebooks   //
		//driver.findElement(By.xpath("(//*[text()=\"Notebooks \"])[3")).click();
		driver.findElement(By.cssSelector("img[title=\"Show products in category Notebooks\"]")).click();
		
		//cpu checkbox check
		
//		driver.findElement(By.xpath("//*[@id=\"attribute-option-6\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"attribute-option-7\"]")).click();
		
//		//memoey checkbox check
//		driver.findElement(By.xpath("//*[@id=\"attribute-option-8\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"attribute-option-9\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"attribute-option-10\"]")).click();
//		
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement explict; //declare the WebElement
		
		explict=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()=\"Apple MacBook Pro 13-inch\"]")));
		explict.click();
		
		//add wishlist
		driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-4\"]")).click();
		
		//back
		driver.navigate().back();
		
		//open software
		driver.findElement(By.xpath("(//*[text()=\"Software \"])[3]")).click();
		
		//select product
		driver.findElement(By.xpath("//*[text()=\"Windows 8 Pro\"]")).click();
		
		//add wishlist
		driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-11\"]")).click();

	}

}
