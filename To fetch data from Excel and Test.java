import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
public class Automation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			File src= new File("D:\\selenium\\selenium-java-3.5.2\\EX2.xlsx");
			FileInputStream fis=new FileInputStream(src);
			XSSFWorkbook wb= new XSSFWorkbook(fis);
			XSSFSheet sh1=wb.getSheetAt(0);
      
			for(int i=0;i<2;i++)
			{
				String data=sh1.getRow(i).getCell(0).getStringCellValue();
				System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32(4)\\chromedriver.exe");
				String[] actualtitle= new String[3];
        
				actualtitle[0]="selenium - Google Search";
				actualtitle[1]="testing - Google Search";
        
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.google.com");
        
				driver.findElement(By.id("lst-ib")).sendKeys(data);
				Thread.sleep(3000);
				driver.findElement(By.className("lsb")).click();
				Thread.sleep(3000);		
        
				String expectedtitle= driver.getTitle();
        
				if(actualtitle[i].contentEquals(expectedtitle))
				{
					System.out.println("Title Correct");
					System.out.println(expectedtitle);
				}
				else
				{
					System.out.println("Title Not Correct");
					System.out.println(expectedtitle);
				}
        
				driver.close();
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
