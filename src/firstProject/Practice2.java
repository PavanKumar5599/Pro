package firstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Practice2 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pavan Kumar Nasana\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		//driver.get("https://ssc.nic.in/registration/home");
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//bank manager login
		driver.findElement(By.xpath("//*[text()=\"Bank Manager Login\"]")).click();
		
		//Add Customer
		driver.findElement(By.cssSelector("button[ng-click=\"addCust()\"]")).click();
		driver.findElement(By.xpath("//*[@placeholder=\"First Name\"]")).sendKeys("PavanKumar");
		driver.findElement(By.xpath("//*[@placeholder=\"Last Name\"]")).sendKeys("Nasana");
		driver.findElement(By.cssSelector("input[placeholder=\"Post Code\"]")).sendKeys("654368");
		driver.findElement(By.xpath("//*[text()=\"Add Customer\"]")).click();
		
		//Handle Alert
		driver.switchTo().alert().accept();
		
		//Open Account
		driver.findElement(By.cssSelector("button[ng-click=\"openAccount()\"]")).click();
		
		Select customer=new Select(driver.findElement(By.id("userSelect")));
		customer.selectByValue("6");
		
		Select currency=new Select(driver.findElement(By.name("currency")));
		currency.selectByIndex(3);
		driver.findElement(By.xpath("//*[text()=\"Process\"]")).click();
		//Handle Alert
		driver.switchTo().alert().accept();
		
		//Customers Data
		driver.findElement(By.cssSelector("button[ng-click=\"showCust()\"]")).click();
		
		int rows=driver.findElements(By.xpath("//table[@class=\"table table-bordered table-striped\"]//tr")).size();
		System.out.println(rows);
		
		//Customer validation
		for(int i=1;i<rows;i++) {
			String st=driver.findElement(By.xpath("//table[@class=\"table table-bordered table-striped\"]//tr["+i+"]")).getText();
			//System.out.println(st);
			String[] array=st.split(" ");
			if(array[0].equals("PavanKumar")) {
				System.out.println("Customer Add Succefully");
			}
		}
		
		//back to Home
		driver.findElement(By.cssSelector("button[ng-click=\"home()\"]")).click();
		
		//Customer Login
		driver.findElement(By.xpath("//*[text()=\"Customer Login\"]")).click();
		
		Select name=new Select(driver.findElement(By.name("userSelect")));
		name.selectByIndex(6);
		
		driver.findElement(By.xpath("//*[text()=\"Login\"]")).click();
		
		//Deposit Amount
		driver.findElement(By.cssSelector("button[ng-click=\"deposit()\"]")).click();
	
		driver.findElement(By.xpath("//*[@placeholder=\"amount\"]")).sendKeys("4000");
		driver.findElement(By.xpath("//*[text()=\"Deposit\"]")).click();
		
		driver.findElement(By.xpath("//*[@placeholder=\"amount\"]")).sendKeys("5000");
		driver.findElement(By.xpath("//*[text()=\"Deposit\"]")).click();
		
		driver.findElement(By.xpath("//*[@placeholder=\"amount\"]")).sendKeys("6000");
		driver.findElement(By.xpath("//*[text()=\"Deposit\"]")).click();
		
		driver.findElement(By.xpath("//*[@placeholder=\"amount\"]")).sendKeys("10000");
		driver.findElement(By.xpath("//*[text()=\"Deposit\"]")).click();
		
		//Withdraw Amount
		driver.findElement(By.cssSelector("button[ng-click=\"withdrawl()\"]")).click();
			
		driver.findElement(By.xpath("//*[text()=\"Amount to be Withdrawn :\"]//following::input")).sendKeys("2000");
		driver.findElement(By.xpath("//*[text()=\"Withdraw\"]")).click();
		driver.findElement(By.xpath("//*[text()=\"Amount to be Withdrawn :\"]//following::input")).sendKeys("1500");
		driver.findElement(By.xpath("//*[text()=\"Withdraw\"]")).click();
		
		driver.findElement(By.xpath("//*[text()=\"Amount to be Withdrawn :\"]//following::input")).sendKeys("5900");
		driver.findElement(By.xpath("//*[text()=\"Withdraw\"]")).click();
		driver.findElement(By.xpath("//*[text()=\"Amount to be Withdrawn :\"]//following::input")).sendKeys("5000");
		driver.findElement(By.xpath("//*[text()=\"Withdraw\"]")).click();
		
		//Transaction history
		driver.findElement(By.cssSelector("button[ng-click=\"transactions()\"]")).click();
		
		//Number of rows
		int r=driver.findElements(By.xpath("//*[contains(@class,\"table\")]//tbody//tr")).size();
		System.out.println("Number of Rows "+r);
		
		//Number of columns
		int col=driver.findElements(By.xpath("//*[contains(@class,\"table\")]//thead//td")).size();
		System.out.println("Number of columns "+col);
		
		//Transaction table
//		for(int a=1;a<r;a++) {
//			String tansaction_table=driver.findElement(By.xpath("//table[@class=\"table table-bordered table-striped\"]//tr["+a+"]")).getText();
//			System.out.println(tansaction_table+"			");
//		}
		
		System.out.println("Date-Time"+"                   "+"Amount    "+"Trasaction type");
		
		for(int a=2;a<=r;a++) {
			for(int b=1;b<=col;b++) {
				String tansaction_table=driver.findElement(By.xpath("//table[@class=\"table table-bordered table-striped\"]//tbody//tr["+a+"]//td["+b+"]")).getText();
				System.out.print(tansaction_table+"     ");
			}
			System.out.println();
		
//			System.out.println();
		}

	}

}
