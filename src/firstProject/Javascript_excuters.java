package firstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_excuters {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//JavascriptExecutor js=driver;
		
		
		//First name - inputbox
		WebElement inputbox=driver.findElement(By.id("name"));
		js.executeScript("arguments[0].setAttribute('value','john')", inputbox);
		
		//JavascriptExecutor in Selenium to send text
		js.executeScript("return document.getElementById(\"email\").value='124hgjg@gmail.com'"); 


		
		
		//Radio button
		WebElement male_Rd=driver.findElement(By.id("male"));
		//male_Rd.click();  //ClickInterceptedException
		js.executeScript("arguments[0].click();",male_Rd);
		
		
		//Checkbox
		WebElement chkbox=driver.findElement(By.id("sunday"));
		js.executeScript("arguments[0].click();",chkbox);
		
		driver.switchTo().frame(0);
		//button
		WebElement button=driver.findElement(By.id("FSsubmit"));
		js.executeScript("arguments[0].click();",button);
		
		 //Fetching the Domain Name of the site. Tostring() change object to name.		
        String DomainName = js.executeScript("return document.domain;").toString();			
        System.out.println("Domain name of the site = "+DomainName);					
          		
        //Fetching the URL of the site. Tostring() change object to name		
        String url = js.executeScript("return document.URL;").toString();			
        System.out.println("URL of the site = "+url);					
          		
       //Method document.title fetch the Title name of the site. Tostring() change object to name		
       String TitleName = js.executeScript("return document.title;").toString();			
       System.out.println("Title of the page = "+TitleName);
	
		
//				//1) scroll down page by pixel
//				js.executeScript("window.scrollBy(0,3000)", "");
//				System.out.println(js.executeScript("return window.pageYOffset;"));  //3000		
//						
////				//2) scroll down the page till the element is present
////				WebElement flag=driver.findElement(By.xpath("//img[@alt='Flag of India']"));
////				js.executeScript("arguments[0].scrollIntoView();", flag);
////				System.out.println(js.executeScript("return window.pageYOffset;"));  //5077.40234375	
//				
//				//3) scroll down till end of the page/document
//				js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//				System.out.println(js.executeScript("return window.pageYOffset;"));
//				
//				Thread.sleep(3000);
//				
//				// go back to initial position
//				js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
//	
       
     //To generate Alert window using JavascriptExecutor. Display the alert message 			
       js.executeScript("alert('you can leave now');");   
       
       

        		
      //Navigate to new Page i.e to generate access page. (launch new url)		
     js.executeScript("window.location = 'https://demo.google.com/'");	
     
     //JavascriptExecutor in Selenium to refresh the browser window
     js.executeScript("location.reload()");
     
     
     js.executeScript("return document.location()", male_Rd);
		



	}

}