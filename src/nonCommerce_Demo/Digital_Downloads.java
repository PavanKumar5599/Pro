package nonCommerce_Demo;

import org.openqa.selenium.By;

public class Digital_Downloads extends Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login login_form=new Login();
		login_form.Broswer_lunch();
		login_form.register();
		login_form.log();
		
		//OPEN DIGITAL DOWNLOADS
		driver.findElement(By.xpath("(//*[text()=\"Digital downloads \"])[1]")).click();
			
		//select product
		driver.findElement(By.xpath("(//*[text()=\"If You Wait (donation)\"])[1]")).click();
		
		//text box check
		driver.findElement(By.xpath("//*[@id=\"addtocart_35_CustomerEnteredPrice\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"addtocart_35_CustomerEnteredPrice\"]")).sendKeys("2");
		
		//text box check
		
		driver.findElement(By.xpath("//*[@id=\"product_enteredQuantity_35\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"product_enteredQuantity_35\"]")).sendKeys("2");
		
		//add wishlist
		driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-35\"]")).click();
			
		//add email
		driver.findElement(By.xpath("//*[text()=\"Email a friend\"]")).click();
		
		//email details
		driver.findElement(By.xpath("//*[@id=\"FriendEmail\"]")).sendKeys("pavan13246@gmail.com");
		//driver.findElement(By.xpath("//*[@id=\"YourEmailAddress\"]")).sendKeys("pavankumar1234@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"PersonalMessage\"]")).sendKeys("hi , how are you this is your friend");
		
		//send email
		driver.findElement(By.xpath("//*[text()=\"Send email\"]")).click();
		

	}

}
