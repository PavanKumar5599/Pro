package firstProject;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.interactions.Actions;

public class Drag_Drap_practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//		System.setProperty("webdriver.chrome.driver","\\chromedriver.exe");
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver();
		
		///driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		driver.manage().window().maximize();
		
		
		 
        // move to the element
        //Actions actions = new Actions(driver);
        //actions.moveToElement(webElement).perform();
		
		WebElement capital_copenhagan=driver.findElement(By.xpath("//*[@id=\"box4\"]"));
		WebElement country_denmark=driver.findElement(By.xpath("//*[@id=\"box104\"]"));
		Actions act=new Actions(driver);
		act.dragAndDrop(capital_copenhagan,country_denmark ).perform();
		
		WebElement capital_oslo=driver.findElement(By.xpath("//*[@id=\"box1\"]"));
		WebElement country_norway=driver.findElement(By.xpath("//*[@id=\"box101\"]"));
		act.dragAndDrop(capital_oslo,country_norway ).perform();
		
		WebElement capital_washington=driver.findElement(By.xpath("//*[@id=\"box3\"]"));
		WebElement country_usa=driver.findElement(By.xpath("//*[@id=\"box103\"]"));
		act.dragAndDrop(capital_washington,country_usa).perform();
		
		WebElement capital_seoul=driver.findElement(By.xpath("//*[@id=\"box5\"]"));
		WebElement country_southkorea=driver.findElement(By.xpath("//*[@id=\"box105\"]"));
		act.dragAndDrop(capital_seoul,country_southkorea).perform();
		
		WebElement capital_stockhole=driver.findElement(By.xpath("//*[@id=\"box2\"]"));
		WebElement country_sweden=driver.findElement(By.xpath("//*[@id=\"box102\"]"));
		act.dragAndDrop(capital_stockhole,country_sweden).perform();
		
		WebElement capital_rome=driver.findElement(By.xpath("//*[@id=\"box6\"]"));
		WebElement country_itely=driver.findElement(By.xpath("//*[@id=\"box106\"]"));
		act.dragAndDrop(capital_rome,country_itely).perform();
		
		WebElement capital_madrid=driver.findElement(By.xpath("//*[@id=\"box7\"]"));
		WebElement country_spain=driver.findElement(By.xpath("//*[@id=\"box107\"]"));
		act.dragAndDrop(capital_madrid,country_spain).perform();
		
	}
	

}
