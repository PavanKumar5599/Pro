package testng_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice2 {
	WebDriver driver = new ChromeDriver();

	@BeforeMethod
	public void f() {
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Test(priority = 1)
	public void registration() {
		// create an account
		driver.findElement(By.xpath("(//*[text()=\"Create an Account\"])[1]")).click();

		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Pavan Kumar");
		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("nasana");
		driver.findElement(By.xpath("//*[@id=\"email_address\"]")).sendKeys("pavan12345@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Kumar435@");
		driver.findElement(By.xpath("//*[@id=\"password-confirmation\"]")).sendKeys("Kumar435@");
		driver.findElement(By.xpath("(//*[text()=\"Create an Account\"])[3]")).click();

	}

	// log in
	@Test(priority = 2)
	public void login() {
		driver.findElement(By.xpath("//*[@class=\"header links\"]//li[2]//a")).click();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("pavan12345@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Kumar435@");
		driver.findElement(By.xpath("(//*[text()=\"Sign In\"])[1]")).click();
	}

	@Test(priority = 3)
	public void hoodie_title_verified() {
		driver.findElement(By.xpath("(//*[text()=\"What's New\"])")).click();

		// select woman hoodie
		driver.findElement(By.linkText("Hoodies & Sweatshirts")).click();

		String expected_TITLE = "Hoodies & Sweatshirts - Tops - Women";
		String actual_title = driver.getTitle();
		if (expected_TITLE.equals(actual_title)) {
			System.out.println("TITLE verified");
		} else {
			System.out.println("Not verified");
		}

//			driver.findElement(By.xpath("//*[@alt=\"Circe Hooded Ice Fleece\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"option-label-size-143-item-168\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"option-label-color-93-item-53\"]")).click();
//			
//			//add card
//			driver.findElement(By.xpath("//*[text()=\"Add to Cart\"]")).click();
	}

	@Test(priority = 4)
	public void jacket_add_card() {
		driver.findElement(By.xpath("(//*[text()=\"What's New\"])")).click();

		// jacket
		driver.findElement(By.linkText("Jackets")).click();

		String Jackets_expected_TITLE = "Jackets - Tops - Women";
		String Jackets_actual_title = driver.getTitle();
		if (Jackets_expected_TITLE.equals(Jackets_actual_title)) {
			System.out.println("Women Jackets TITLE verified");
		} else {
			System.out.println("Not verified");
		}
//			driver.findElement(By.xpath("//*[@alt=\"Juno Jacket\"]")).click();

//			//select size
//			driver.findElement(By.xpath("//*[@id=\"option-label-size-143-item-168\"]")).click();
//			
//			//select color
//			driver.findElement(By.xpath("//*[@id=\"option-label-color-93-item-53\"]")).click();
//			
//			//add card
//			driver.findElement(By.xpath("//*[text()=\"Add to Cart\"]")).click();
	}

	@Test(priority = 5)
	public void tees_add_card() {
		driver.findElement(By.xpath("(//*[text()=\"What's New\"])")).click();

		// tees
		driver.findElement(By.linkText("Tees")).click();

		String tees_expected_TITLE = "Tees - Tops - Women";
		String tees_actual_title = driver.getTitle();
		if (tees_expected_TITLE.equals(tees_actual_title)) {
			System.out.println("Women Tees TITLE verified");
		} else {
			System.out.println("Not verified");
		}
//			driver.findElement(By.xpath("(//*[@alt=\"Gwyn Endurance Tee\"])[2]")).click();
//			
//			//select size
//			driver.findElement(By.xpath("//*[@id=\"option-label-size-143-item-168\"]")).click();
//			
//			//select color
//			driver.findElement(By.xpath("//*[@id=\"option-label-color-93-item-60\"]")).click();
//			
//			//add card
//			driver.findElement(By.xpath("//*[text()=\"Add to Cart\"]")).click();
	}

	@Test(priority = 6)
	public void pants_add_card() {
		driver.findElement(By.xpath("(//*[text()=\"What's New\"])")).click();

		// pants
		driver.findElement(By.linkText("Pants")).click();

		String pants_expected_TITLE = "Pants - Bottoms - Women";
		String pants_actual_title = driver.getTitle();
		if (pants_expected_TITLE.equals(pants_actual_title)) {
			System.out.println("Women Pants TITLE verified");
		} else {
			System.out.println("Not verified");
		}

//			driver.findElement(By.xpath("//*[@alt=\"Carina Basic Capri\"]")).click();
//			
//			//select size
//			driver.findElement(By.xpath("//*[@id=\"option-label-size-143-item-171\"]")).click();
//			
//			//select color
//			driver.findElement(By.xpath("//*[@id=\"option-label-color-93-item-50\"]")).click();
//			
//			//add card
//			driver.findElement(By.xpath("//*[text()=\"Add to Cart\"]")).click();
	}

	@Test(priority = 7)
	public void shorts_add_card() {
		driver.findElement(By.xpath("(//*[text()=\"What's New\"])")).click();

		// shorts
		driver.findElement(By.linkText("Shorts")).click();

		driver.findElement(By.xpath("//*[@alt=\"Ana Running Short\"]")).click();

		// select size
		driver.findElement(By.xpath("//*[@id=\"option-label-size-143-item-171\"]")).click();

		// select color
		driver.findElement(By.xpath("//*[@id=\"option-label-color-93-item-56\"]")).click();

		// add card
		driver.findElement(By.xpath("//*[text()=\"Add to Cart\"]")).click();
	}

	// mens section
	@Test(priority = 8)
	public void hoodie_title() {
		driver.findElement(By.xpath("(//*[text()=\"What's New\"])")).click();

		driver.findElement(By.xpath("(//*[text()=\"Hoodies & Sweatshirts\"])[4]")).click();

		String expected_Title = "Hoodies & Sweatshirts - Tops - Men";
		String actual_Title = driver.getTitle();
		if (expected_Title.equals(actual_Title)) {
			System.out.println("Mens Hoodie Title Verified");
		} else {
			System.out.println("Not verified");
		}

	}

	@Test(priority = 9)
	public void jacket_title() {
		driver.findElement(By.xpath("(//*[text()=\"What's New\"])")).click();

		driver.findElement(By.xpath("(//*[text()=\"Jackets\"])[4]")).click();

		String jacket_expected_Title = "Jackets - Tops - Men";
		String jacket_actual_Title = driver.getTitle();
		if (jacket_expected_Title.equals(jacket_actual_Title)) {
			System.out.println("Mens jocket Title Verified");
		} else {
			System.out.println("Not verified");
		}

	}

	@Test(priority = 10)
	public void tees_title() {
		driver.findElement(By.xpath("(//*[text()=\"What's New\"])")).click();

		driver.findElement(By.xpath("(//*[text()=\"Tees\"])[4]")).click();

		String tees_expected_Title = "Tees - Tops - Men";
		String tees_actual_Title = driver.getTitle();
		if (tees_expected_Title.equals(tees_actual_Title)) {
			System.out.println("Mens Tees Title Verified");
		} else {
			System.out.println("Not verified");
		}

	}

	@Test(priority = 11)
	public void tanks_title() {
		driver.findElement(By.xpath("(//*[text()=\"What's New\"])")).click();

		driver.findElement(By.xpath("(//*[text()=\"Tanks\"])[2]")).click();

		String tanks_expected_Title = "Tanks - Tops - Men";
		String tanks_actual_Title = driver.getTitle();
		if (tanks_expected_Title.equals(tanks_actual_Title)) {
			System.out.println("Mens Tanks Title Verified");
		} else {
			System.out.println("Not verified");
		}

	}

	@Test(priority = 12)
	public void pants_title() {
		driver.findElement(By.xpath("(//*[text()=\"What's New\"])")).click();

		driver.findElement(By.xpath("(//*[text()=\"Pants\"])[4]")).click();

		String pants_expected_Title = "Pants - Bottoms - Men";
		String pants_actual_Title = driver.getTitle();
		if (pants_expected_Title.equals(pants_actual_Title)) {
			System.out.println("Mens pants Title Verified");
		} else {
			System.out.println("Not verified");
		}

	}

	@Test(priority = 13)
	public void shorts_title() {
		driver.findElement(By.xpath("(//*[text()=\"What's New\"])")).click();

		driver.findElement(By.xpath("(//*[text()=\"Shorts\"])[4]")).click();

		String shorts_expected_Title = "Shorts - Bottoms - Men";
		String shorts_actual_Title = driver.getTitle();
		if (shorts_expected_Title.equals(shorts_actual_Title)) {
			System.out.println("Mens shorts Title Verified");
		} else {
			System.out.println("Not verified");
		}

	}

//		@Test(priority=14)
//		public void shoping_card() throws InterruptedException {
//			driver.findElement(By.xpath("//*[@class=\"action showcart\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"top-cart-btn-checkout\"]")).click();
//			
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//			Thread.sleep(10);
//			driver.findElement(By.xpath("//*[@id=\"MGD71OD\"]")).sendKeys("kolcot");
//			driver.findElement(By.xpath("//*[@id=\"X88R1QN\"]")).sendKeys("million");
//			
//			Select state=new Select(driver.findElement(By.xpath("//*[@id=\"IGY8VLM\"]")));
//			state.selectByIndex(5);
//			
//			driver.findElement(By.xpath("//*[@id=\"YOLHJ06\"]")).sendKeys("567894");
//			
//			Select country=new Select(driver.findElement(By.xpath("//*[@id=\"WQNHM92\"]")));
//			country.selectByIndex(5);
//			
//			driver.findElement(By.xpath("//*[@id=\"U6FAK3V\"]")).sendKeys("9876543210");
//		}

}
