package firstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class xpathclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pavan Kumar Nasana\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805955%7Cb%7Cfb%20sign%20up%7C&placement=&creative=550525805955&keyword=fb%20sign%20up&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-294779041346%26loc_physical_ms%3D1007740%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIgMKv9paVgAMVrZNmAh1A3gWCEAAYASAAEgL01vD_BwE");//it opens the url
		driver.manage().window().maximize();
//		xpath: gives the addres of an web element
//       1.absolute xpath: it gives full addres of an web element
//		/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/divm/div[1]/div[1]/input
//		syntax:/
//       2.relative xpath: it gives partial addres of an web element
		//*[@id="email"]
//		syntax:
//		a.//tagname[@attribute name="attribute Value"]
//		b.//*[@attribute name="attribute value"] ||it filter the tags(//*)
		/* xpath functions:
		 * 1.starts-with(): find a element start with a value
		 * syntax:
		   //*[starts-with(@attribute name,"value")]  ex://*[starts-with(@name,"ema")]
		 * 2.contains():    find a element its contains the value
		  syntax: 
		  //*[contains(@attribute name,"value")] 
		   3.text():   find a element with text
		   syntax;
		   //*[text()="given text"]   \\\  
		    *  also "find index"
		    syntax:
		    (//*text()="given text"])[given index]
		    */
		
	
		 
////		driver.findElement(By.xpath("//*[@name=\"firstname\"]")).sendKeys("Pavan Kumar");
////		driver.findElement(By.xpath("//*[@name=\"lastname\"]")).sendKeys("Nasana");
////		driver.findElement(By.xpath("(//*[starts-with(@name,\"reg\")])[2]")).sendKeys("pavan1234567@gmail.com");
////		driver.findElement(By.xpath("(//*[contains(@name,\"email\")])[2]")).sendKeys("pavan1234567@gmail.com");
////		driver.findElement(By.xpath("//*[contains(@name,\"pass\")]")).sendKeys("Pavan12@#");
////		driver.findElement(By.xpath("//*[@name=\"birthday_day\"]")).sendKeys("6");
////		driver.findElement(By.xpath("//*[@name=\"birthday_month\"]")).sendKeys("Jun");
////		driver.findElement(By.xpath("//select[@name=\"birthday_year\"]")).sendKeys("1999");
////		driver.findElement(By.cssSelector("input._8esa[value=\"2\"]")).click();
////		driver.findElement(By.xpath("(//*[text()=\"Sign Up\"])[1]")).click();
////		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Pavan Kumar");
////		driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("9701696472");
////		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("pavankumar13236@email.com");
////		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("pavan@#%gj");
////		driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("hyd123,charminar");
////		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/button")).click();
////		driver.findElement(By.xpath("//*[@id=\"male\"]")).click();
////		driver.findElement(By.xpath("//*[@id=\"monday\"]")).click();
////		driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/select")).sendKeys("Finland");
////		driver.findElement(By.xpath("//*[text()=\"1 year\"]")).click();
////		driver.findElement(By.xpath("//*[text()=\"Selenium Webdriver\"]")).click();
////		driver.findElement(By.xpath("//*[text()=\"TestNG\"]")).click();
			//driver.findElement(By.xpath("//*[text()=\"Testim\"]")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"rbAadharYes\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"AadharNumber\"]")).sendKeys("637889861262");
//		driver.findElement(By.xpath("//*[@id=\"VerifyAadharNumber\"]")).sendKeys("637889861262");
//		driver.findElement(By.xpath("//*[@id=\"Name\"]")).sendKeys("Pavan kumar");
//		driver.findElement(By.xpath("//*[@id=\"VerifyName\"]")).sendKeys("Pavan kumar");
//		driver.findElement(By.xpath("//*[@id=\"rbHaveEverChangedNameNo\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"FatherName\"]")).sendKeys("Atchaiah");
//		driver.findElement(By.xpath("//*[@id=\"VerifyFatherName\"]")).sendKeys("Atchaiah");
//		driver.findElement(By.xpath("//*[@id=\"MotherName\"]")).sendKeys("Dhanalashmi");
//		driver.findElement(By.xpath("//*[@id=\"VerifyMotherName\"]")).sendKeys("Dhanalashmi");
//		driver.findElement(By.xpath("//*[@id=\"DateOfBirth\"]")).sendKeys("06/06/1999");
//		driver.findElement(By.xpath("//*[@id=\"VerifyDateOfBirth\"]")).sendKeys("06/06/1999");
//		driver.findElement(By.xpath("//*[@id=\"EducationBoard\"]")).sendKeys("Board of Secondary Education Andhra Pradesh");
//		driver.findElement(By.xpath("//*[@id=\"ddlEducationBoard\"]")).sendKeys("Board of Secondary Education Andhra Pradesh");
//		driver.findElement(By.xpath("//*[@id=\"SecondaryRollNum\"]")).sendKeys("1514137654");
//		driver.findElement(By.xpath("//*[@id=\"VerifySecondaryRollNum\"]")).sendKeys("1514137654");
//		driver.findElement(By.xpath("//*[@id=\"Yearofpassing\"]")).sendKeys("2015");
//		driver.findElement(By.xpath("//*[@id=\"ddlYearofpassing\"]")).sendKeys("2015");
//		driver.findElement(By.xpath("//*[@id=\"rbMale\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"rbVerifyMale\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"Levelofeducationqualification\"]")).sendKeys("Graduation");
//		driver.findElement(By.xpath("//*[@id=\"MobileNum\"]")).sendKeys("9786428733");
//		driver.findElement(By.xpath("//*[@id=\"VerifyMobileNum\"]")).sendKeys("9786428733");
//		driver.findElement(By.xpath("//*[@id=\"EmailID\"]")).sendKeys("pavankumar123456@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"VerifyEmailID\"]")).sendKeys("pavankumar123456@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"OriginState\"]")).sendKeys("Andhra Pradesh");

	}

}
