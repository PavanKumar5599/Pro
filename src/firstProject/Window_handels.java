package firstProject;

import java.time.Duration;
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
import org.openqa.selenium.support.ui.Select;

public class Window_handels {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pavan Kumar Nasana\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);

		// driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


				driver.findElement(By.xpath("//*[@value=\"radio2\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"autocomplete\"]")).sendKeys("India");
				
				WebElement s=driver.findElement(By.xpath("//*[@id=\"dropdown-class-example\"]"));
				Select r=new Select(s);
				r.selectByValue("option2");
				
				driver.findElement(By.xpath("//*[@id=\"checkBoxOption2\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"checkBoxOption3\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"openwindow\"]")).click();
				
				String parentHandle=driver.getWindowHandle();
				
				
				driver.findElement(By.xpath("//*[@id=\"openwindow\"]")).click();
				Set<String> chaildHandle=driver.getWindowHandles();
				for(String handle:chaildHandle) {
					//System.out.println(handle);
						if(!handle.equals(parentHandle)) {
							String title=driver.switchTo().window(handle).getTitle();
							System.out.println(title);
							
							
				}
			}
				Thread.sleep(3000);
				driver.switchTo().window(parentHandle);
				driver.findElement(By.xpath("//*[@id=\"opentab\"]")).click();
				Set<String> chaildHandle1=driver.getWindowHandles();
				for(String handle:chaildHandle1) {
					//System.out.println(handle);
						if(!handle.equals(parentHandle)) {
							String title=driver.switchTo().window(handle).getTitle();
							System.out.println(title);
							
							
				}
			}
				Thread.sleep(3000);
				driver.switchTo().window(parentHandle);
				driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Pavan Kumar");			
				driver.findElement(By.xpath("//*[@id=\"alertbtn\"]")).click();
				Thread.sleep(2000);
				driver.switchTo().alert().accept();
				
				

				driver.findElement(By.xpath("//*[@id=\"confirmbtn\"]")).click();
				driver.switchTo().alert().accept();
				
				//WEB TABLES
				
				//1) find the total number of rows
				int total_rows= driver.findElements(By.xpath("//*[@name=\"courses\"]//tr")).size();
				System.out.println("Total no of rows :"+total_rows);
				
				//2) find the total number of columns
				int total_columns= driver.findElements(By.xpath("//*[@name=\"courses\"]//th")).size();
				System.out.println("Total no of rows :"+total_columns);
				
				//3) Read specific row & column data
				String value=driver.findElement(By.xpath("//*[@name=\"courses\"]//tr[5]//td[2]")).getText();
				System.out.println(value);
				
				//4) Read data from all the rows & columns
				
				System.out.println("Instructor"+"	"+"Course"+"	"+"Price");
				
				for(int i=2;i<=total_rows;i++) {
					for (int j=1;j<=total_columns;j++) {
						String data=driver.findElement(By.xpath("//*[@name=\"courses\"]//tr["+i+"]//td["+j+"]")).getText();
						System.out.print(data+"\t");
						
					}
					System.out.println();
					
					
				}
				//5) Read specific value related data
				
				System.out.println("\t"+"\t"+"Price");
				System.out.println("\t"+"   ");
				
				for(int r2=2;r2<=total_rows;r2++) {
					String sp_value=driver.findElement(By.xpath("//*[@name=\"courses\"]//tr["+r2+"]//td[3]")).getText();
					System.out.println("\t"+"\t"+sp_value);
				}
				
				//6) total amount of price
				int total_amount_price=0;
				for(int r1=2;r1<=total_rows;r1++) {
					String sp_value=driver.findElement(By.xpath("//*[@name=\"courses\"]//tr["+r1+"]//td[3]")).getText();
					int price=Integer.parseInt(sp_value);
					total_amount_price +=price;
				}
				System.out.println("\t"+"    ");
				System.out.println("Total Price:"+"\t"+total_amount_price);
				System.out.println("\t"+"    ");
				
				
				
				//Element Display
				driver.findElement(By.xpath("//*[@id=\"displayed-text\"]")).sendKeys("Srikanth");
				driver.findElement(By.xpath("//*[@id=\"hide-textbox\"]")).click();//Hide Element
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"show-textbox\"]")).click();//display Element
				
				//Mouse Hover
				WebElement mouse_hover=driver.findElement(By.xpath("//*[@id=\"mousehover\"]"));
				Actions act=new Actions(driver);
				act.moveToElement(mouse_hover).perform();	
				
				WebElement mouse_hover1=driver.findElement(By.xpath("//*[text()=\"Top\"]"));
				
				act.moveToElement(mouse_hover1).click().perform();	
				
			

				// 3-
				WebElement coloumndriver = driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul"));
				int s1=coloumndriver.findElements(By.tagName("a")).size();

				// 4- click on each link in the coloumn and check if the pages are opening-
				for (int i = 1; i < coloumndriver.findElements(By.tagName("a")).size(); i++) {

					String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);

					coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
					Thread.sleep(5000);

				} // opens all the tabs
				Set<String> abc = driver.getWindowHandles();// 4
				List<String> win_id_list=new ArrayList<>(abc);
				for(int i=0;i<s1;i++)
				{
					driver.switchTo().window(win_id_list.get(i));
					System.out.println(driver.getTitle());
					System.out.println("");
					
					}

				

			}
				
			}
			
		
		
		
		
		
		
		
		
		
		// 3-
	/*	WebElement coloumndriver = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		List<WebElement> total_links = coloumndriver.findElements(By.tagName("a"));
		int size_of_links = total_links.size();
		System.out.println(total_links);

		// 4- click on each link in the coloumn and check if the pages are opening-
		for (int i = 1; i < size_of_links; i++) {

			String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);

			total_links.get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000);

		} // opens all the tabs
		Set<String> abc = driver.getWindowHandles();// 4
		
//		Iterator<String> it = abc.iterator();
//		while (it.hasNext()) {
//
//			driver.switchTo().window(it.next());
//			System.out.println(driver.getTitle());
		
//		}
		
		//for using for loop
		List<String> windowids_li=new ArrayList(abc);
		
		for (int j=0;j<size_of_links;j++) {
			String windowid=windowids_li.get(j);
			driver.switchTo().window(windowid);
			System.out.println(driver.getTitle());
		}													*/
			
//			//to  Everyone
//			//STORING WINDOWS ID'S
//					Set<String> windowIds=driver.getWindowHandles();
//					//APPROACH--1
//					
//					for(String winId:windowIds) {
//						String title=driver.switchTo().window(winId).getTitle();
////						if(second_tab_title.equals(title)) {
////							driver.findElement(By.xpath("//*[@id=\"Form_submitForm_EmailHomePage\"]")).sendKeys("Admin");
////						}
//						
//					}
//					
//					
//					  String PT = driver.getWindowHandle();
//				   Set<String> CT=driver.getWindowHandles();
//				   
//				   
//				   Iterator<String> I1=CT.iterator();
//				   
//				   while(I1.hasNext())
//				   {
//					   String ct=I1.next();
//					   if(!PT.equals(ct))
//					   {
//						   driver.switchTo().window(ct);
//						 WebElement ele = driver.findElement(By.xpath("(//span[contains(text(),\"Apple iPhone 14 (128 GB) - Blue\")])[1]"));
//					   
//					   System.out.println("text is" +ele.getText());
//					   }
//				   }
//			//APPROACH---2 
//					//CONVERTING SET TO LIST TO ITERATION
//					
//					List<String> win_id_list=new ArrayList<String>(windowIds);
//					String parentWindowID=win_id_list.get(0);
//					String childWindowID=win_id_list.get(1);
//					driver.switchTo().window(childWindowID);
//					driver.findElement(By.xpath("//*[@id=\"Form_submitForm_EmailHomePage\"]")).sendKeys("Admin");
//					driver.switchTo().window(parentWindowID).findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("aDMIN");
//					driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("Admin@123");
//				
////					//CLOSING A PARTICULAR TAB
////					for(String close_Window:windowIds) {
////						String titles=driver.switchTo().window(close_Window).getTitle();
////						if( titles.equals("x") || titles.equals("y") || titles.equals("z")){}
////						if(second_tab_title.equals(titles)) {
////							driver.close();
////						}
////
////					driver.findElement(By.xpath("//input[@name=\"email\"]"));
////					}
////				}
////
////		}
////			

		
		
	

