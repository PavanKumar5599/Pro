package first_pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class first_cls {
	
	@Test
	public void a() {
		System.out.println("Pavan Kumar");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/org.testng/testng/7.9.0");
	}

}
