package firstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class web_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pavan Kumar Nasana\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://testautomationpractice.blogspot.com/?m=1");
		driver.manage().window().maximize();
		// 1) Find total number of rows 
		
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size(); //7  preferred
		//int rows=driver.findElements(By.tagName("tr")).size(); //8   prefered only if you have one single table
		System.out.println("Number of rows:"+ rows); //7
		
		
		//2) Find total number of columns
		
		int cols=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		//int cols=driver.findElements(By.tagName("th")).size(); // dont prefer if you have multiple tables
		
		System.out.println("Number of columns:"+ cols); //4
		
		
		//3) Read specific row & column data
		String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]//td[1]")).getText();
		System.out.println(value); //Master In JS
		
		
		//read specific column
		int total_amount=0;
		for (int i=2;i<=rows;i++) {
			String price_col=driver.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table//tr["+i+"]//td[4]")).getText();
			int integer=Integer.parseInt(price_col);
			total_amount+=integer;
			System.out.println(integer);
		}
		//total amount
		System.out.println("total_amount :"+total_amount);
		//4) Read data from all the rows & columns
		
		System.out.println("Book Name"+"     "+"Author"+"    "+"Subject"+"       "+"Price");
		
		
		for(int r=2;r<=rows;r++)
		{
//			4 elements in the row so thats why inside for loop will run for 4 times
			for(int c=1;c<=cols;c++)
			{
				String value1=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(value1+"\t"); 
			}
			System.out.println();
		}
		
//		//Pagination table
//		//1.number of rows in pagination table
//		int pagination_rows=driver.findElements(By.xpath("//*[@id=\"productTable\"]//tr")).size();
//		System.out.println("No of rows:"+pagination_rows);
//		
//		//2. number of columns in pagination table
//		int pagination_cols=driver.findElements(By.xpath("//*[@id=\"productTable\"]//th")).size();
//		System.out.println("No of cols:"+pagination_cols);
//		
//		//3.specific value
//		String pagination_value=driver.findElement(By.xpath("//*[@id=\"productTable\"]//tr[3]//td[3]")).getText();
//		System.out.println("Specific value :"+pagination_value);
//		
//		
//		
//		//Print total table of pagination
//		System.out.println("ID"+"       "+"Name"+"          "+"Price"+"         "+"Select");
//		
//		
//		for(int r=1;r<pagination_rows;r++)
//		{
//
//			for(int c=1;c<=pagination_cols;c++)
//			{
//				String pagination_value1=driver.findElement(By.xpath("//*[@id=\"productTable\"]//tr["+r+"]//td["+c+"]")).getText();
//				System.out.print(pagination_value1+"\t"); 			
//				
//			}
//			System.out.println();
//		}
//		
//		//checkBox code
//		for(int j=1;j<pagination_rows;j++) {
//			String price_col=driver.findElement(By.xpath("//*[@id=\"productTable\"]//tr["+j+"]//td[3]")).getText();
//			float num=Float.parseFloat(price_col.substring(1));
//			System.out.println(num);
//			if(num>=10) {
//				driver.findElement(By.xpath("//*[@id=\"productTable\"]//tr["+j+"]//td[4]//input")).click();
//			}
//		}
		

	}

}
