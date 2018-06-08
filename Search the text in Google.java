import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
    
		System.setProperty("webdriver.chrome.driver","D:\\Hello\\chromedriver.exe");
		String expectedtitle="Selenium - Google Search";
		WebDriver driver=new ChromeDriver();
    
		driver.get("https://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("btnK")).click();
    
		System.out.println("Expected Title : "+expectedtitle);
		String actualtitle=driver.getTitle();
    
		if(expectedtitle.contentEquals(actualtitle))
		{
			System.out.println("Actual Title : "+actualtitle);
			System.out.println("Title Correct");
		}
		else
		{
			System.out.println("Actual Title : "+actualtitle);
			System.out.println("Title Incorrect");
		}
		driver.close();
	}
}
