package demopage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Drop_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pavan Kumar Nasana\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver();
	
//		driver.get("https://www.vivino.com/");
//		
//		driver.manage().window().maximize();
//		
//	
//		
//		driver.findElement(By.xpath("//span[text()=\"Language\"]")).click();
//		List<WebElement> li=driver.findElements(By.xpath("//ul[contains(@class,\"languageDropdown\")]//li"));
//		
//		String language="Italiano";
//		
//		for(WebElement i: li) {
//			if(i.getText().equals(language)) {
//				i.click();
//				break;
//			}
//		}
		
//		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
//		driver.manage().window().maximize();
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		driver.findElement(By.xpath("//select[@id=\"first\"]")).click();
//		 List<WebElement> allOptions = driver.findElements(By.xpath("//select[@id=\"first\"]//option"));
//	        System.out.println(allOptions.size());
//	                  
//	        for(WebElement select:allOptions) {
//	             
//	             
//	            if(select.getText().equals("Yahoo")) {
//	                 
//	               select.click();
//	                break;
//	                 
//	            }
//	        }
//		
		
//		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
//		WebElement bt=driver.findElement(By.id("country-list"));
//		Select sev=new Select(bt);
//		sev.selectByVisibleText("India");
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement ts=driver.findElement(By.xpath("//*[@id=\"state-list\"]"));
//		Select set=new Select(ts);
//		set.selectByValue("22");

		driver.get("https://in.bookmyshow.com/explore/home/national-capital-region-ncr");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("common-header-region")).click();
		
		List<WebElement> li=driver.findElements(By.xpath("//*[text()=\"Popular Cities\"]//following::ul//li"));
		System.out.println("total list of citys = "+li.size());
		for (WebElement sel:li) {
		
			if (sel.getText().equals("Pune")) {
				System.out.println(" selected city = "+sel.getText());
				sel.click();
				break;
			}
		}
		
		
		

	}

}
