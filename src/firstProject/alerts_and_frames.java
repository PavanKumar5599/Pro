package firstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class alerts_and_frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pavan Kumar Nasana\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		//driver.get("https://www.facebook.com/signup");//it opens the url
		//driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
//		//swtich to frame
//		driver.switchTo().frame("iframeResult");
//		//try it button
//		driver.findElement(By.xpath("/html/body/button")).click();
//	
//		Thread.sleep(3000);
//		//switch to alert
//		
//		String text=driver.switchTo().alert().getText();
//		System.out.println(text);
//		driver.switchTo().alert().accept();
//		driver.findElement(By.xpath("//*[text()=\"Alert with OK \"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
//		driver.switchTo().alert().accept();
//		Thread.sleep(3000);
		
	/*	driver.findElement(By.xpath("//*[text()=\"Alert with OK & Cancel \"]")).click();
		driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
		driver.switchTo().alert().dismiss();
		//driver.switchTo().alert().accept();
		String string=driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
		System.out.println(string);
		String[] array=string.split(" ");
		String dismiss="Cancel";
		if (dismiss.equals(array[2])) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		*/
		
//		driver.findElement(By.xpath("//*[text()=\"Alert with Textbox \"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
//		driver.switchTo().alert().sendKeys("Pavan Kumar");
//		driver.switchTo().alert().accept();
//		
//		String st=driver.findElement(By.xpath("//*[@id=\"demo1\"]")).getText();
//		System.out.println(st);
//		String[] splitted_text=st.split(" ");//["welcome","pavankumar","how","are","you","today"]
//		System.out.println(splitted_text[1]);
//		String name_of_candidate=splitted_text[1];
//		String actual_name="pavanKumar";
//		if(actual_name.equals(name_of_candidate)){
//			System.out.println("Both names are matched");
//		}else {
//			System.out.println("Both names are not matched");
//		}
//		
		
		
	}
}


