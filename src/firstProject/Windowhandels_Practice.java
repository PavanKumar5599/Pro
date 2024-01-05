package firstProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Windowhandels_Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pavan Kumar Nasana\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		//driver.get("https://www.amazon.in/");
		//driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		//driver.get("https://www.facebook.com/login.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@onclick=\"promptFunction()\"]")).click();
		driver.switchTo().alert().sendKeys("PavanKumar");
		driver.switchTo().alert().accept();
		
		String st=driver.findElement(By.xpath("//*[@id=\"output\"]")).getText();
		System.out.println(st);
		String[] ar=st.split(" ");
		if(ar[3].equals("PavanKumar")) {
			System.out.println("matching");
		}else {
			System.out.println("No Matching");
		}
		
//		String target=Keys.chord(Keys.CONTROL,Keys.ENTER);
//		driver.findElement(By.linkText("Forgotten account?")).sendKeys(target);
//		//Actions act=new Actions(driver);
//		Set<String> window_id=driver.getWindowHandles();
//		List<String> win_li=new ArrayList<String>(window_id);
//		String child_win=win_li.get(1);
//		driver.switchTo().window(child_win);
//		System.out.println(driver.getTitle());
//		
//		driver.findElement(By.xpath("//*[@id=\"identify_email\"]")).sendKeys("pavankumar1324@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"did_submit\"]")).click();
		
////	/*driver.findElement(By.xpath("//*[@id=\"newTabsBtn\"]")).click();
////		String parent=driver.getWindowHandle();
////		Set<String> win=driver.getWindowHandles();
////		List<String> win_li=new ArrayList<String>(win);
////		
////		for (String winodw_id:win_li) {
////			driver.switchTo().window(winodw_id);
////			String title=driver.getTitle();
////			System.out.println(title);
////			
////			if (title.equalsIgnoreCase("AlertsDemo - H Y R Tutorials")) {
////				driver.findElement(By.id("alertBox")).click();
////				driver.switchTo().alert().accept();
////				Thread.sleep(3000);
////				
////				driver.findElement(By.id("confirmBox")).click();
////				driver.switchTo().alert().dismiss();
////				Thread.sleep(3000); */
//				
//				driver.findElement(By.xpath("//*[@id=\"promptBox\"]")).click();
//				driver.switchTo().alert().sendKeys("Pavan Kumar");
//				driver.switchTo().alert().accept();
//				WebElement str=driver.findElement(By.xpath("//*[text()=\"You entered text Pavan Kumar in propmt popup\"]"));
//				System.out.println(str);
//				driver.switchTo().window(parent);
//				
//			}else if (title.equals("Basic Controls - H Y R Tutorials")) {
//				driver.findElement(By.id("firstName")).sendKeys("Pavan Kumar");
//				driver.findElement(By.id("lastName")).sendKeys("Nasana");
//				driver.findElement(By.xpath("//*[@id=\"englishchbx\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("pavankumar123@gmail.com");
//				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Pavan12345");
//				driver.findElement(By.xpath("//*[@id=\"registerbtn\"]")).click();
//				Thread.sleep(3000);
//				
//				driver.switchTo().window(parent);
			}
			
	//	}														

		
		
		
		
//		System.out.println(driver.getTitle());
//		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iphone 14 pro max");
//		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
//		driver.findElement(By.xpath("(//img[@class=\"s-image\"])[1]")).click();
//		
//		Set<String> window_ids=driver.getWindowHandles();
//		Iterator<String> it=window_ids.iterator();
//		
//		List<String> window_id_list=new ArrayList<String>(window_ids);j
//		String parentWindowID=window_id_list.get(0);
//		String childWindowID=window_id_list.get(1);
//		
//		driver.switchTo().window(childWindowID);
//		System.out.println(driver.getTitle());
//		
//	
//		driver.switchTo().window(parentWindowID);
//		driver.findElement(By.xpath("(//img[@class=\"s-image\"])[4]")).click();
//		Set<String> window_ids2=driver.getWindowHandles();
//		List<String> window_id_list2=new ArrayList<String>(window_ids2);
//		String childWindowID2=window_id_list2.get(2);
//		driver.switchTo().window(childWindowID2);
//		System.out.println(driver.getTitle());
//		
//		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("apple labtabs");
//		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();	
//		driver.findElement(By.xpath("(//img[@class=\"s-image\"])[9]")).click();
//		
//		Set<String> window_ids3=driver.getWindowHandles();
//		List<String> window_id_list3=new ArrayList<String>(window_ids3);
//		String childWindowID3=window_id_list3.get(3);
//		driver.switchTo().window(childWindowID3);
//		System.out.println(driver.getTitle());
//		
//		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("apple watch series 8");
//		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
//		driver.findElement(By.xpath("(//img[@class=\"s-image\"])[1]")).click();
//		
//		Set<String> window_ids4=driver.getWindowHandles();
//		List<String> window_id_list4=new ArrayList<String>(window_ids4);
//		String childWindowID4=window_id_list4.get(4);
//		driver.switchTo().window(childWindowID4);
//		System.out.println(driver.getTitle());
//		
//		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("samsung s23 ultra 5g");
//		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
//		driver.findElement(By.xpath("(//img[@class=\"s-image\"])[1]")).click();
//		
//		Set<String> window_ids5=driver.getWindowHandles();
//		List<String> window_id_list5=new ArrayList<String>(window_ids5);
//		String childWindowID5=window_id_list5.get(5);
//		driver.switchTo().window(childWindowID5);
//		System.out.println(driver.getTitle());
//		
//		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("realme narzo 60 pro 5g");
//		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
//		driver.findElement(By.xpath("(//img[@class=\"s-image\"])[2]")).click();
//		
//		Set<String> window_ids6=driver.getWindowHandles();
//		List<String> window_id_list6=new ArrayList<String>(window_ids6);
//		String childWindowID6=window_id_list6.get(6);
//		driver.switchTo().window(childWindowID6);
//		System.out.println(driver.getTitle());
	}


