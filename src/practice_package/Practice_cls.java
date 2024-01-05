package practice_package;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Practice_cls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pavan Kumar Nasana\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://money.rediff.com/losers/bse/daily/groupall");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Store web table in data_table variable
		
		WebElement data_table=driver.findElement(By.xpath("//*[@class=\"dataTable\"]"));
		
		// Store all rows in table in table_rows variable in list.
		
		List<WebElement> table_rows=data_table.findElements(By.tagName("tr"));
		System.out.println(table_rows.size());
		
		// Remove 1st row from the above list because it is table heading row it contains th tags.
		
		table_rows.remove(0);
		
		// Itarate every row in the above rows list
		
		for(WebElement r:table_rows) {
			
			// Store all columns in the row r in columns variable in list form.
			
			List<WebElement> columns=r.findElements(By.tagName("td"));
			
			// Get the group name from 2nd index in columns list 
			
			String group=columns.get(1).getText();
			
			// Get the current price from 4th index in columns list
			
			String current_price_str=columns.get(3).getText();
			String new_current_price_str=current_price_str.replace(",", ""); // Replace , with empty
			
			double current_price=Double.valueOf(new_current_price_str); // type convartion of str to double
			
			// Get the change percentage from 5th index in the columns list
			
			String change=columns.get(4).getText();
			double change_percentage=Double.valueOf(change); // type convartion of str to double
			
			// Get the filter rows of particular condition
			
			if (group.equals("A") && current_price<50 && change_percentage>-10) {
				
				// Itarate every column in the columns list
				
				for(WebElement co:columns) {
					
					// Print the text in every column of a row in same line
					
					System.out.print(co.getText()+"  \t");
					
				}
				// Print next row in next line
				
				System.out.println();
				System.out.println("-------------------------------------------------------------------------------------");
				
			}
		}
		
		
		
		System.out.println("Gainers part-------------------------------------");
		// Gainers table
		
		driver.findElement(By.xpath("//*[text()=\"Gainers\"]//following-sibling::div[1]/a")).click();
		driver.navigate().refresh();
		
		// Store web table in data_table variable
		
				WebElement data_table2=driver.findElement(By.xpath("//*[@class=\"dataTable\"]"));
				
				// Store all rows in table in table_rows variable in list.
				
				List <WebElement> table_rows2=data_table2.findElements(By.tagName("tr"));
				System.out.println(table_rows2.size());
				
				// Remove 1st row from the above list because it is table heading row it contains th tags.
				
				table_rows2.remove(0);
				
				// Itarate every row in the above rows list
				
				for(WebElement r:table_rows2) {
					
					// Store all columns in the row r in columns variable in list form.
					
					List<WebElement> columns=r.findElements(By.tagName("td"));
					
					// Get the group name from 2nd index in columns list 
					
					String group=columns.get(1).getText();
					
					// Get the current price from 4th index in columns list
					
					String current_price_str=columns.get(3).getText();
					String new_current_price_str=current_price_str.replace(",", ""); // Replace , with empty
					double current_price=Double.valueOf(new_current_price_str); // type convartion of str to double
					
					// Get the change percentage from 5th index in the columns list
					
					String change=columns.get(4).getText();
					String change2=change.replace("+", "");
					double change_percentage=Double.valueOf(change2); // type convartion of str to double
					
					// Get the filter rows of particular condition
					
					if (group.equals("A") && current_price>100 && change_percentage>10) {
						
						// Itarate every column in the columns list
						
						for(WebElement co:columns) {
							
							// Print the text in every column of a row in same line
							
							System.out.print(co.getText()+"  \t");
							
						}
						// Print next row in next line
						
						System.out.println();
						System.out.println("-------------------------------------------------------------------------------------");
						

					}

				}
	}
}
