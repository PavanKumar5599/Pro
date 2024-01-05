package practice_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Web_cls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pavan Kumar Nasana\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://testautomationpractice.blogspot.com/?m=1");
		driver.manage().window().maximize();
		
		WebElement table=driver.findElement(By.xpath("//table[@name=\"BookTable\"]"));
		
		
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		
		for(WebElement row:rows) {
			
			List<WebElement> cols=row.findElements(By.tagName("td"));
			
			for (WebElement col:cols) {
				
				System.out.print(col.getText()+"\t");
				
			}
			System.out.println();
		}

	}

}
