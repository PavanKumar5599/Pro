package nonCommerce_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Books extends Login{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login login_form=new Login();
		login_form.Broswer_lunch();
		login_form.register();
		login_form.log();
		
		//OPEN BOOKS
		driver.findElement(By.xpath("(//*[text()=\"Books \"])[1]")).click();
		
		//select sort by
		WebElement sortby=driver.findElement(By.xpath("//*[@id=\"products-orderby\"]"));
		Select sel_sortby=new Select(sortby);
		sel_sortby.selectByIndex(3);
		
		driver.navigate().refresh();
		//select product
		driver.findElement(By.xpath("//*[text()=\"First Prize Pies\"]")).click();
		
		//Shipping address
		driver.findElement(By.xpath("//*[text()=\"Please select the address you want to ship to\"]")).click();
		
		//details
		Select country=new Select(driver.findElement(By.xpath("//*[@id=\"CountryId\"]")));
		country.selectByVisibleText("India");
		
		driver.findElement(By.xpath("//*[@id=\"ZipPostalCode\"]")).sendKeys("563822");
		
		driver.findElement(By.xpath("//*[text()=\"Next Day Air\"]//following::label[1]")).click();
		driver.findElement(By.xpath("//*[text()=\"Apply\"]")).click();
		
		//add wish list
		driver.findElement(By.xpath("(//*[text()=\"Add to wishlist\"])[1]")).click();

	}

}
