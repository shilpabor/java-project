package for_loop;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fatching_excel {
	
	//public static void main(String []args) throws Exception
	//{
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\shilp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
          //WebDriver driver=new ChromeDriver();
        // driver.get("https://www.facebook.com/login.php");
           
          //String path="C:\\Users\\shilp\\OneDrive\\Desktop\\Book1.xlsx";
          //FileInputStream excel=new FileInputStream(path);
         // String data=WorkbookFactory.create(excel).getSheet("sheet1").getRow(2).getCell(0).getStringCellValue();
         // System.out.println(data);
         // String data1=WorkbookFactory.create(excel).getSheet("sheet1").getRow(2).getCell(1).getStringCellValue();
         // System.out.println(data1);
         //WebElement email= driver.findElement(By.xpath("//input[@name=\"email\"]"));
        //email.sendKeys(data);  
 
	public static void main(String []args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shilp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php");
		String path="C:\\Users\\shilp\\OneDrive\\Desktop\\Book1.xlsx";
		FileInputStream excel=new FileInputStream(path);
		String value=WorkbookFactory.create(excel).getSheet("sheet1").getRow(2).getCell(0).getStringCellValue();
		System.out.println(value);
		
	}
	}
		
		