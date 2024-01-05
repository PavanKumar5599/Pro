package nonCommerce_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Electronics extends Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login login_form=new Login();
		login_form.Broswer_lunch();
		login_form.register();
		login_form.log();
		
		//open Electronics
		
		driver.findElement(By.xpath("(//*[text()=\"Electronics \"])[1]")).click();
		//open camera
		driver.findElement(By.xpath("(//*[text()=\"Camera & photo \"])[3]")).click();
		
		//select product
		driver.findElement(By.xpath("//*[text()=\"Leica T Mirrorless Digital Camera\"]")).click();
		
		//add shipping address
		driver.findElement(By.xpath("//*[text()=\"Please select the address you want to ship to\"]")).click();
		
		Select country=new Select(driver.findElement(By.xpath("//*[@id=\"CountryId\"]")));
		country.selectByVisibleText("India");
		
		driver.findElement(By.xpath("//*[@id=\"ZipPostalCode\"]")).sendKeys("563822");
		
		driver.findElement(By.xpath("//*[text()=\"Next Day Air\"]//following::label[1]")).click();
		driver.findElement(By.xpath("//*[text()=\"Apply\"]")).click();

		
		//add wishlist
		driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-16\"]")).click();
		
		//back
		driver.navigate().back();
		
		//open cellphones
		driver.findElement(By.xpath("(//*[text()=\"Cell phones \"])[3]")).click();
		
		//select product
		driver.findElement(By.xpath("//*[text()=\"HTC One Mini Blue\"]")).click();
		
		//add shipping address
		driver.findElement(By.xpath("//*[text()=\"Please select the address you want to ship to\"]")).click();
		
		Select country1=new Select(driver.findElement(By.xpath("//*[@id=\"CountryId\"]")));
		country1.selectByVisibleText("India");
		
		driver.findElement(By.xpath("//*[@id=\"ZipPostalCode\"]")).sendKeys("563822");
		
		driver.findElement(By.xpath("//*[text()=\"Next Day Air\"]//following::label[1]")).click();
		driver.findElement(By.xpath("//*[text()=\"Apply\"]")).click();
		
		//add wishlist
		driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-19\"]")).click();
		
		driver.navigate().back();
		
		//open Others
		driver.findElement(By.xpath("(//*[text()=\"Others \"])[3]")).click();
		//select product
		driver.findElement(By.xpath("//*[text()=\"Universal 7-8 Inch Tablet Cover\"]")).click();
		
		//add shipping address
		driver.findElement(By.xpath("//*[text()=\"Please select the address you want to ship to\"]")).click();
		
		Select country2=new Select(driver.findElement(By.xpath("//*[@id=\"CountryId\"]")));
		country2.selectByVisibleText("India");
		
		driver.findElement(By.xpath("//*[@id=\"ZipPostalCode\"]")).sendKeys("563822");
		
		driver.findElement(By.xpath("//*[text()=\"Next Day Air\"]//following::label[1]")).click();
		driver.findElement(By.xpath("//*[text()=\"Apply\"]")).click();
		
		//add wishlist
		driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-22\"]")).click();
		

	}

}
