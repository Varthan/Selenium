package Test;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestSuite {
	WebDriver driver;
	@BeforeTest
	  public void beforeTest() {
		  

System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32(4)\\chromedriver.exe";
			driver = new ChromeDriver();
			driver.get("http:\\www.google.com");
	  }
@Test
 public void one() throws InterruptedException {
	  String actualname= "Google";
	  Thread.sleep(5000);
	  String expectedname= driver.getTitle();
	  AssertJUnit.assertEquals(expectedname,actualname);
  }
@Test
  public void two() throws InterruptedException {
	  driver.navigate().to("http:\\www.gmail.com");
	  

driver.findElement(By.name("identifier")).sendKeys("mypiree");
	  

driver.findElement(By.className("CwaK9")).click();
	  Thread.sleep(5000);
	  

driver.findElement(By.name("password")).sendKeys("");
	  Thread.sleep(5000);
	  

driver.findElement(By.className("CwaK9")).click();
	  Thread.sleep(8000);
	  System.out.println("test");
	  Thread.sleep(5000);
	  String name = driver.getTitle();
	  System.out.println(name);
	 
	  Thread.sleep(10000);
	 

driver.findElement(By.xpath("//*[@id=\":iw\"]/div/div")).click();
	 Thread.sleep(10000);
	 System.out.println("test1");
	 

driver.findElement(By.id(":oc")).sendKeys("peeree@kongu.ac.in");
	 Thread.sleep(10000);
	 System.out.println("test");
	
	  

driver.findElement(By.xpath("//*[@id=\":nv\"]")).sendKeys("selenium trail");
	  Thread.sleep(5000);
	  

driver.findElement(By.xpath("//*[@id=\":ow\"]")).sendKeys("Hi, This is an auto testing message sent through selenium");
	  

driver.findElement(By.xpath("//*[@id=\":nl\"]")).click();
	  Thread.sleep(5000);
	  

driver.findElement(By.xpath("//*[@id=\"link_vsm\"]"));
	  

driver.findElement(By.xpath("//*[@id=\"gb\"]/div[1]/div[1]/div[2]/div[5]/div[1]/a")).click();
driver.findElement(By.xpath("//*[@id=\"gb_71\"]")).click();
}
  
  @AfterTest
  public void afterTest() {
	 //driver.close();
  }

}

