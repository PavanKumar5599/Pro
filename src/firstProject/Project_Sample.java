package firstProject;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Project_Sample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pavan Kumar Nasana\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://demo.nopcommerce.com/cart");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//Register 
		
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//*[@id=\"gender-male\"]")).click();	
		driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("Pavan Kumar");
		driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("Nasana");
		
		//Select day
		
		WebElement web_day=driver.findElement(By.name("DateOfBirthDay"));
		Select day=new Select(web_day);
		day.selectByValue("6");
		
		//Select month
		
		WebElement web_month=driver.findElement(By.name("DateOfBirthMonth"));
		Select month=new Select(web_month);
		month.selectByVisibleText("June");
		
		//select year
		
		WebElement web_year=driver.findElement(By.name("DateOfBirthYear"));
		Select year=new Select(web_year);
		year.selectByVisibleText("1999");
		
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("pavankumar1234@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"Company\"]")).sendKeys("Papular Comapny");
		
		//Password
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Pavan9988");
		
		//Confirm password
		driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("Pavan9988");
		
		//Register button
		driver.findElement(By.xpath("//*[@id=\"register-button\"]")).click();
		
		
		//take screen shots
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("C:\\Users\\Pavan Kumar Nasana\\OneDrive\\Pictures\\Screenshots\\screen  shots\\image.png");
		FileUtils.copyFile(src,trg);
		
		//Login  to  The Web site
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("pavankumar1234@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Pavan9988");
		
		driver.findElement(By.xpath("//*[@id=\"RememberMe\"]")).click();
		driver.findElement(By.xpath("(//*[text()=\"Log in\"])[2]")).click();
		
		
		//take screen shots
		//TakesScreenshot ts=(TakesScreenshot)driver;
		File src1=ts.getScreenshotAs(OutputType.FILE);
		File trg1=new File("C:\\Users\\Pavan Kumar Nasana\\OneDrive\\Pictures\\Screenshots\\screen  shots\\image1.png");
		FileUtils.copyFile(src1,trg1);
		
		
		//Open Computers
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
		
		
		//take screen shots
		//TakesScreenshot ts=(TakesScreenshot)driver;
		File src2=ts.getScreenshotAs(OutputType.FILE);
		File trg2=new File("C:\\Users\\Pavan Kumar Nasana\\OneDrive\\Pictures\\Screenshots\\screen  shots\\image2.png");
		FileUtils.copyFile(src2,trg2);
		
		//go back
		driver.navigate().back();
		driver.navigate().back();
		
		//  Open Notebooks   //
		
		//driver.findElement(By.xpath("(//*[text()=\"Notebooks \"])[3")).click();
		driver.findElement(By.cssSelector("img[title=\"Show products in category Notebooks\"]")).click();
		
		//cpu checkbox check
		
		driver.findElement(By.xpath("//*[@id=\"attribute-option-6\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"attribute-option-7\"]")).click();
		
		//memoey checkbox check
		driver.findElement(By.xpath("//*[@id=\"attribute-option-8\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"attribute-option-9\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"attribute-option-10\"]")).click();
		
		driver.navigate().refresh();
		
		//Explicity wait
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
		
		//back
		driver.navigate().back();
		
		//open Electronics

		driver.findElement(By.xpath("(//*[text()=\"Electronics \"])[1]")).click();
		//open camera
		driver.findElement(By.xpath("(//*[text()=\"Camera & photo \"])[3]")).click();
		
		//select product
		driver.findElement(By.xpath("//*[text()=\"Leica T Mirrorless Digital Camera\"]")).click();
		
		//add shipping address
//		driver.findElement(By.xpath("//div[@class=\"shipping-address\"]//span]")).click();
//		
//		Select country=new Select(driver.findElement(By.xpath("//*[@id=\"CountryId\"]")));
//		country.selectByVisibleText("India");
//		
//		driver.findElement(By.xpath("//*[@id=\"ZipPostalCode\"]")).sendKeys("563822");
//		
//		driver.findElement(By.xpath("//*[text()=\"Next Day Air\"]//following::label[1]")).click();
//		driver.findElement(By.xpath("//*[text()=\"Apply\"]")).click();

		
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
		
		//go back
		driver.navigate().back();
		
		//Open Apparel
		driver.findElement(By.xpath("//*[text()=\"Apparel \"]")).click();
		
		//open shoes
		driver.findElement(By.xpath("(//*[text()=\"Shoes \"])[3]")).click();
		
		//select product
		driver.findElement(By.xpath("//*[text()=\"adidas Consortium Campus 80s Running Shoes\"]")).click();
		
		//add card
		//select show size
		Select select_shoesize=new Select(driver.findElement(By.xpath("//*[@id=\"product_attribute_9\"]")));
		select_shoesize.selectByVisibleText("10");
			
		//select shoe color
		driver.findElement(By.xpath("//*[@id=\"color-squares-10\"]/li[3]/label/span/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-25\"]")).click();
		
		//back
		driver.navigate().back();
		
		//Open clothing
		driver.findElement(By.xpath("(//*[text()=\"Clothing \"])[3]")).click();
		
		//select product
		driver.findElement(By.xpath("//*[text()=\"Custom T-Shirt\"]")).click();
		
		//add text
		driver.findElement(By.xpath("//*[@id=\"product_attribute_12\"]")).sendKeys("pavan");
		
		//add wishlist
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
		
		
		////OPEN DIGITAL DOWNLOADS
		driver.findElement(By.xpath("(//*[text()=\"Digital downloads \"])[1]")).click();
			
		//select product
		driver.findElement(By.xpath("//*[text()=\"If You Wait (donation)\"]")).click();
		
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
		
		//go back
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		

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
		Select country4=new Select(driver.findElement(By.xpath("//*[@id=\"CountryId\"]")));
		country4.selectByVisibleText("India");
		
		driver.findElement(By.xpath("//*[@id=\"ZipPostalCode\"]")).sendKeys("563822");
		
		driver.findElement(By.xpath("//*[text()=\"Next Day Air\"]//following::label[1]")).click();
		driver.findElement(By.xpath("//*[text()=\"Apply\"]")).click();
		
		//add wish list
		driver.findElement(By.xpath("(//*[text()=\"Add to wishlist\"])[1]")).click();
		
		
		//OPEN JEWELRY
		driver.findElement(By.xpath("(//*[text()=\"Jewelry \"])[1]")).click();
		
		//select product
		driver.findElement(By.linkText("Elegant Gemstone Necklace (rental)")).click();
				
		//starting date 
		driver.findElement(By.xpath("//*[@id=\"rental_start_date_40\"]")).click();
		
		//store date of ordered product for rent
		String start_year="2023";
		String start_month="SEPTEMBER";
		String start_day="20";
		
		while(true) {
			//store the year
			String ye=driver.findElement(By.className("ui-datepicker-year")).getText();
			
			//store the month
			String mon=driver.findElement(By.className("ui-datepicker-month")).getText();
			
			//condition for year and month
			if(ye.equals(start_year)&&mon.equals(start_month)) {
				break;
			}
			//next button
			driver.findElement(By.className("ui-datepicker-next ui-corner-all")).click();
		}
		
		//store the all dates in list
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
			//store year
			String end_ye=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
			
			//store month
			String end_mon=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
			
			//condition for year and month
			if(end_ye.equals(end_year)&&end_mon.equals(end_month)) {
				break;
			}
			//next button
			driver.findElement(By.xpath("//*[@class=\"ui-datepicker-next ui-corner-all\"]")).click();
		}
		
		//store all dates
		List<WebElement> end_alldates=driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//td"));
		for(WebElement end_date:end_alldates) {
			if(end_date.getText().equals(end_day)) {
				end_date.click();
				break;
			}
		}
		
		//add wish list
		driver.findElement(By.xpath("(//*[text()=\"Add to wishlist\"])[1]")).click();
		
		//go back
		driver.navigate().back();
		
		//OPEN GIFT CARDS
		driver.findElement(By.xpath("(//*[text()=\"Gift Cards \"])[1]")).click();
		
		//select product
		driver.findElement(By.xpath("//*[text()=\"$25 Virtual Gift Card\"]")).click();
		
		//name
		driver.findElement(By.xpath("//*[@id=\"giftcard_43_RecipientName\"]")).sendKeys("toni");
		
		//email
		driver.findElement(By.xpath("//*[@id=\"giftcard_43_RecipientEmail\"]")).sendKeys("toni123456@gmail.com");
		
		//Massage
		driver.findElement(By.xpath("//*[@id=\"giftcard_43_Message\"]")).sendKeys("toni where are you");
		
		//add wish list
		driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-43\"]")).click();
		
		
		
		////OPEN WISHLIST
		driver.findElement(By.xpath("(//*[text()=\"Wishlist\"])[1]")).click();
		
		driver.navigate().refresh();
		
		//select macbookpro
		driver.findElement(By.xpath("//table[@class=\"cart\"]//tr[1]//td[1]//input")).click();
		
		//check quantity check box
		
		//clear the check box
		driver.findElement(By.xpath("//table[@class=\"cart\"]//tr[1]//td[6]//input")).clear();
		
		//click on check box
		//driver.findElement(By.cssSelector("input[name=\"itemquantity11224\"]")).click();
		
		//enter number 
		driver.findElement(By.xpath("//table[@class=\"cart\"]//tr[1]//td[6]//input")).sendKeys("2");
		
		
		//select Windows 8 pro
		driver.findElement(By.xpath("//table[@class=\"cart\"]//tr[2]//td[1]//input")).click();
		
		//clear the check box
		driver.findElement(By.xpath("//table[@class=\"cart\"]//tr[2]//td[6]//input")).clear();
									
		//enter number 
		driver.findElement(By.xpath("//table[@class=\"cart\"]//tr[2]//td[6]//input")).sendKeys("2");
	
		
		//select camera
		driver.findElement(By.xpath("//table[@class=\"cart\"]//tr[3]//td[1]//input")).click();
		
		//clear the check box
		driver.findElement(By.xpath("//table[@class=\"cart\"]//tr[3]//td[6]//input")).clear();
										
		//enter number 
		driver.findElement(By.xpath("//table[@class=\"cart\"]//tr[3]//td[6]//input")).sendKeys("2");
		
		//select BOOK
		driver.findElement(By.xpath("//table[@class=\"cart\"]//tr[8]//td[1]//input")).click();
		
		//clear the check box
		driver.findElement(By.xpath("//table[@class=\"cart\"]//tr[8]//td[6]//input")).clear();
									
		//enter number 
		driver.findElement(By.xpath("//table[@class=\"cart\"]//tr[8]//td[6]//input")).sendKeys("2");
		
		
		//select first pies
		driver.findElement(By.xpath("//table[@class=\"cart\"]//tr[9]//td[1]//input")).click();
		
		//clear the check box
		driver.findElement(By.xpath("//table[@class=\"cart\"]//tr[9]//td[6]//input")).clear();
									
		//enter number 
		driver.findElement(By.xpath("//table[@class=\"cart\"]//tr[9]//td[6]//input")).sendKeys("2");
		
		//select NECKLACE
		driver.findElement(By.xpath("//table[@class=\"cart\"]//tr[10]//td[1]//input")).click();
		
		//clear the check box
		driver.findElement(By.xpath("//table[@class=\"cart\"]//tr[10]//td[6]//input")).clear();
										
		//enter number 
		driver.findElement(By.xpath("//table[@class=\"cart\"]//tr[10]//td[6]//input")).sendKeys("2");
		
		
//		//take screen shots
//		//TakesScreenshot ts=(TakesScreenshot)driver;
//		File src3=ts.getScreenshotAs(OutputType.FILE);
//		File trg3=new File("C:\\Users\\Pavan Kumar Nasana\\OneDrive\\Pictures\\Screenshots\\screen  shots\\image3.png");
//		FileUtils.copyFile(src3,trg3);
		
		//select shoe
		//driver.findElement(By.xpath("//table[@class=\"cart\"]//tr[12]//td[1]//input")).click();
		
//		//click on edit
//		driver.findElement(By.xpath("//table[@class=\"cart\"]//tr[6]//td[4]//div[2]//a")).click();
//		
//		//edit the shoe color
//		driver.findElement(By.xpath("span[style=\"background-color:#363656\"]")).click();
//		
//		//update the wishlist
//		driver.findElement(By.xpath("//*[text()=\"Update\"]")).click();
		
//		//clear the check box
//		driver.findElement(By.xpath("//table[@class=\\\"cart\\\"]//tr[12]//td[6]//input")).clear();
//										
//		//enter number 
//		driver.findElement(By.xpath("//table[@class=\\\"cart\\\"]//tr[12]//td[6]//input")).sendKeys("2");
		
			
		////ADD CARD TO THE ITEMS
		driver.findElement(By.xpath("(//*[text()=\"Add to cart\"])[2]")).click();
		
		

		//take screen shots
		//TakesScreenshot ts=(TakesScreenshot)driver;
		File src3=ts.getScreenshotAs(OutputType.FILE);
		File trg3=new File("C:\\Users\\Pavan Kumar Nasana\\OneDrive\\Pictures\\Screenshots\\screen  shots\\image3.png");
		FileUtils.copyFile(src3,trg3);
				
		
		//select gift wrapping
		WebElement gift_wrapp_ele=driver.findElement(By.xpath("//*[@id=\"checkout_attribute_1\"]"));
		Select sel_gift_wrapp=new Select(gift_wrapp_ele);
		sel_gift_wrapp.selectByValue("2");
		
		//terms and conditions
		driver.findElement(By.xpath("//*[@id=\"termsofservice\"]")).click();
		
		//CHECKOUT BUTTON
		driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
		
		
		////Billing Address
		//select Country
		Select add=new Select(driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_CountryId\"]")));
		add.selectByVisibleText("India");
		
//		//select State
//		Select add_st=new Select(driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_StateProvinceId\"]")));
//		add_st.selectByValue("1");
		
		///CITY
		driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_City\"]")).sendKeys("vizag");
		
		//Address 1
		driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_Address1\"]")).sendKeys("beach road");
		
		//Address 2
		driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_Address2\"]")).sendKeys("vijayanagaram");
		
		//pincode
		driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_ZipPostalCode\"]")).sendKeys("654321");
		
		//phone number
		driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_PhoneNumber\"]")).sendKeys("9701696472");
		
		//fax number
		driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_FaxNumber\"]")).sendKeys("9876543210");
		
		//continue button
		driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/button[4]")).click();
		
		
		///SHIPPING METHOD
		driver.findElement(By.xpath("//*[@id=\"shippingoption_1\"]")).click();
		
		//continue button
		driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button")).click();
		
		
		///PAYMENT METHOD
		
		//CASH ON DELIVERY
		//continue button
		driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/button")).click();
		
		
		//PAYMENT INFORMATION
		//Continue Button
		driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/button")).click();
		
		
		///CONFIRM ORDER
		//Continue Button
		driver.findElement(By.xpath("//*[@id=\"confirm-order-buttons-container\"]/button")).click();
		
		
		//take screen shots
		//TakesScreenshot ts=(TakesScreenshot)driver;
		File src4=ts.getScreenshotAs(OutputType.FILE);
		File trg4=new File("C:\\Users\\Pavan Kumar Nasana\\OneDrive\\Pictures\\Screenshots\\screen  shots\\image4.png");
		FileUtils.copyFile(src4,trg4);
		
		//order details
		driver.findElement(By.linkText("Click here for order details.")).click();
		
		//go back
		driver.navigate().back();
		
		//back to home
		driver.findElement(By.xpath("//*[text()=\"Continue\"]")).click();
		
		
		
		// FOOTER SECTION
		 
		 // 1)OPEN INFORMATION LINKS
		 
		 String parent_win_id=driver.getWindowHandle();
		 int size_information=driver.findElements(By.xpath("(//*[@class=\"footer-upper\"]//ul)[1]//li")).size();
		 
		 String key_pre=Keys.chord(Keys.CONTROL,Keys.ENTER);
		 
		 // Open the all links in information section
		 
		 for (int i=1;i<=size_information;i++) {
			 
			 driver.findElement(By.xpath("(//*[@class=\"footer-upper\"]//ul)[1]//li["+i+"]//a")).sendKeys(key_pre);
		 }
		 
		 
		//take screen shots
		//TakesScreenshot ts=(TakesScreenshot)driver;
		File src5=ts.getScreenshotAs(OutputType.FILE);
		File trg5=new File("C:\\Users\\Pavan Kumar Nasana\\OneDrive\\Pictures\\Screenshots\\screen  shots\\image5.png");
		FileUtils.copyFile(src5,trg5);
		
		
		 
		 // Get the window id's of all opened windows
		 
		 Set<String> win_ids_1=driver.getWindowHandles();
		 
		 List<String> win_ids_li_1=new ArrayList<>(win_ids_1);
		 
		 // Switch every opened window and close it
		 
		 System.out.println("	  	__________________________________________________________			");
		 
		 for(String win_id_1:win_ids_li_1) {
			 
			 if (!win_id_1.equals(parent_win_id)) {
				 
				 driver.switchTo().window(win_id_1);
				 System.out.println(driver.getTitle());
				 driver.close();
				 
			 }
			 
			 
		 }
		 driver.switchTo().window(parent_win_id);
		 
		 // 2) CUSTOMER SERVICE PART
		 
		 int size_customerservice=driver.findElements(By.xpath("(//*[@class=\"footer-upper\"]//ul)[2]//li")).size();
		 
		 for (int i=1;i<=size_customerservice;i++) {
			 
			 driver.findElement(By.xpath("(//*[@class=\"footer-upper\"]//ul)[2]//li["+i+"]//a")).sendKeys(key_pre);
		 }
		 
		 
		//take screen shots
		//TakesScreenshot ts=(TakesScreenshot)driver;
		File src6=ts.getScreenshotAs(OutputType.FILE);
		File trg6=new File("C:\\Users\\Pavan Kumar Nasana\\OneDrive\\Pictures\\Screenshots\\screen  shots\\image6.png");
		FileUtils.copyFile(src6,trg6);
		 
		 // Get the window id's of all opened windows
		 
		 Set<String> win_ids_2=driver.getWindowHandles();
		 List<String> win_ids_li_2=new ArrayList<String>(win_ids_2);
		 
		 // Switch every opened window and print the titil of the window and close it
		 
		 System.out.println("    ______________________________________      ");
		 
		 for(String win_id_2:win_ids_li_2) {
			 
			 if (!win_id_2.equals(parent_win_id)) {
				 
				 driver.switchTo().window(win_id_2);
				 System.out.println(driver.getTitle());
				 driver.close();
				 
			 }
			 
			 
		 }
		 
		 driver.switchTo().window(parent_win_id);
		 
		 // 3) MY ACCOUNT PART
		 
		 int s_myaccount=driver.findElements(By.xpath("(//*[@class=\"footer-upper\"]//ul)[3]//li")).size();
		 
		 for (int i=1;i<=s_myaccount;i++) {
			 
			 driver.findElement(By.xpath("(//*[@class=\"footer-upper\"]//ul)[3]//li["+i+"]//a")).sendKeys(key_pre);
		 }
		 
		//take screen shots
		//TakesScreenshot ts=(TakesScreenshot)driver;
		File src7=ts.getScreenshotAs(OutputType.FILE);
		File trg7=new File("C:\\Users\\Pavan Kumar Nasana\\OneDrive\\Pictures\\Screenshots\\screen  shots\\image7.png");
		FileUtils.copyFile(src7,trg7);
		 
		 // Get the window id's of all opened windows
		 
		 Set<String> win_ids_3=driver.getWindowHandles();
		 List<String> win_ids_li_3=new ArrayList<String>(win_ids_3);
		 
		 // Switch every opened window and close it
		 
		 System.out.println("     ______________________________________     ");
		 
		 for(String win_id_3:win_ids_li_3) {
			 
			 if (win_id_3.equals(parent_win_id)) {
				 
				 driver.switchTo().window(win_id_3);
				 System.out.println(driver.getTitle());
				 
			 }else {
				 driver.switchTo().window(win_id_3);
				 System.out.println(driver.getTitle());
				 driver.close();
			 }
			 
			 
		 }
		 
		 driver.switchTo().window(parent_win_id);
		 
		 // 4) FOLLOW US PART
		 
		 int s_followus=driver.findElements(By.xpath("(//*[@class=\"footer-upper\"]//ul)[4]//li")).size();
		 
		 for (int i=1;i<=s_followus;i++) {
			 
			 driver.findElement(By.xpath("(//*[@class=\"footer-upper\"]//ul)[4]//li["+i+"]//a")).sendKeys(key_pre);
		 }
		 
		 
		//take screen shots
		//TakesScreenshot ts=(TakesScreenshot)driver;
		File src8=ts.getScreenshotAs(OutputType.FILE);
		File trg8=new File("C:\\Users\\Pavan Kumar Nasana\\OneDrive\\Pictures\\Screenshots\\screen  shots\\image8.png");
		FileUtils.copyFile(src8,trg8);
		 
		 // Get the window id's of all opened windows
		 
		 Set<String> win_ids_4=driver.getWindowHandles();
		 List<String> win_ids_li_4=new ArrayList<String>(win_ids_4);
		 
		 // Switch every opened window and close it
		 
		 System.out.println("     _______________________________________      ");
		 
		 for(String win_id_4:win_ids_li_4) {
			 
			 if (win_id_4.equals(parent_win_id)) {
				 
				 driver.switchTo().window(win_id_4);
				 System.out.println(driver.getTitle());
				 
			 }else {
				 driver.switchTo().window(win_id_4);
				 System.out.println(driver.getTitle());
				 driver.close();
			 }
			 
			 
		 }
		

		
		
		

	
	}

}
