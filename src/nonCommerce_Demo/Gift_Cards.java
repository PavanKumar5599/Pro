package nonCommerce_Demo;

import org.openqa.selenium.By;

public class Gift_Cards extends Login{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login login_form=new Login();
		login_form.Broswer_lunch();
		login_form.register();
		login_form.log();
		
		//OPEN GIFT CARDS
		driver.findElement(By.xpath("(//*[text()=\"Gift Cards \"])[1]")).click();
		
		//select product
		driver.findElement(By.xpath("//*[text()=\"$25 Virtual Gift Card\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"giftcard_43_RecipientName\"]")).sendKeys("toni");
		driver.findElement(By.xpath("//*[@id=\"giftcard_43_RecipientEmail\"]")).sendKeys("toni123456@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"giftcard_43_Message\"]")).sendKeys("toni where are you");
		
		//add wish list
		driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-43\"]")).click();
		
		

		

	}

}
