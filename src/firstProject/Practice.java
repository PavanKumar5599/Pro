package firstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pavan Kumar Nasana\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		//driver.get("https://ssc.nic.in/registration/home");
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//*[text()=\"Alert\"]")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//*[text()=\"Confirm Box\"]")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//*[text()=\"Prompt\"]")).click();
		driver.switchTo().alert().sendKeys("PavanKumar");
		driver.switchTo().alert().accept();
		
		
		
		driver.findElement(By.xpath("//*[@id=\"field1\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"field1\"]")).sendKeys("pavankumar");
		Actions act=new Actions(driver);
		WebElement st=driver.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button"));
		act.doubleClick(st).perform();
		
		WebElement source=driver.findElement(By.xpath("//p[text()=\"Drag me to my target\"]"));
		WebElement target=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		act.dragAndDrop(source, target).perform();
		
//		driver.findElement(By.cssSelector("input#rbAadharYes")).click();
//		driver.findElement(By.cssSelector("input#AadharNumber")).sendKeys("736889861262");
//		driver.findElement(By.cssSelector("input#VerifyAadharNumber")).sendKeys("736889861262");	
//		driver.findElement(By.cssSelector("input#Name")).sendKeys("Pavan Kumar");
//		driver.findElement(By.cssSelector("input#VerifyName")).sendKeys("Pavan Kumar");
//		driver.findElement(By.cssSelector("input#FatherName")).sendKeys("Atchaiah");
//		driver.findElement(By.cssSelector("input#VerifyFatherName")).sendKeys("Atchaiah");
//		driver.findElement(By.cssSelector("input#MotherName")).sendKeys("Dhanalakshmi");
//		driver.findElement(By.cssSelector("input#VerifyMotherName")).sendKeys("Dhanalakshmi");
//		driver.findElement(By.cssSelector("input#DateOfBirth")).sendKeys("06/06/1999");
//		driver.findElement(By.cssSelector("input#VerifyDateOfBirth")).sendKeys("06/06/1999");
//		
//		Select se=new Select(driver.findElement(By.cssSelector("select#EducationBoard")));
//		se.selectByIndex(14);
//		Select se2=new Select(driver.findElement(By.cssSelector("select#ddlEducationBoard")));
//		se2.selectByIndex(14);
//		
//		driver.findElement(By.cssSelector("input.form-control[name=\"SecondaryRollNum\"]")).sendKeys("15141311211");
//		driver.findElement(By.cssSelector("input#VerifySecondaryRollNum")).sendKeys("15141311211");
//		
//		Select se3=new Select(driver.findElement(By.cssSelector("select#Yearofpassing")));
//		se3.selectByVisibleText("2015");
//		Select se4=new Select(driver.findElement(By.cssSelector("select#ddlYearofpassing")));
//		se4.selectByVisibleText("2015");
//		
//		driver.findElement(By.cssSelector("input#rbMale")).click();
//		driver.findElement(By.cssSelector("input#rbVerifyMale")).click();
//		
//		Select se5=new Select(driver.findElement(By.cssSelector("select#Levelofeducationqualification")));
//		se5.selectByIndex(4);
//		
//		driver.findElement(By.cssSelector("input#MobileNum")).sendKeys("9701696477");
//		driver.findElement(By.cssSelector("input#VerifyMobileNum")).sendKeys("9701696477");
//		
//		driver.findElement(By.cssSelector("input#EmailID")).sendKeys("pavankumar1324@gmail.com");
//		driver.findElement(By.cssSelector("input#VerifyEmailID")).sendKeys("pavankumar1324@gmail.com");
//		
//		Select state=new Select(driver.findElement(By.cssSelector("select#OriginState")));
//		state.selectByIndex(2);

	}

}
