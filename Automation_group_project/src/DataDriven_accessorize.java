
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
public class DataDriven_accessorize 
{
	WebDriver driver;
	@BeforeTest
	public void beforeTest() throws InterruptedException 
	{
		   //Launch chrome brosure
				System.setProperty("webdriver.chrome.driver", "D:\\TEATING THINGS\\automation testins\\brosure extention\\chromedriver.exe");
				driver= new ChromeDriver();
				Thread.sleep(2000);
				//maximize window
				driver.manage().window().maximize();	
				Thread.sleep(2000);
	}
	
  @Test(dataProvider = "dp1")
  public void signin(String  username, String password) throws Exception
  {
	  Accessorize_pom I= new Accessorize_pom();
		I.url(driver);
		Thread.sleep(3000);
		I.signin(driver);
		Thread.sleep(2000);
		I.username(driver,username);
		Thread.sleep(2000);
		I.password(driver, password);
		Thread.sleep(2000);
		I.loginbutton(driver);
		Thread.sleep(2000);
		I.account(driver);
		Thread.sleep(2000);
		I.logout(driver);
  }
  @DataProvider
  public Object[][] dp1()
  {
      return new Object[][] 
  		{
    	  new Object[] { "annapatil@gmail.com", "Palash@123" },
          new Object[] { "Demo@gmail.com", "Demo1rt@4s" },
          new Object[] { "annapatil@gmail.com", "Palash@123" },
          new Object[] { "rutujadatir2@gmail.com", "Whatever24@" },
    };
  }
  @AfterTest
  public void afterTest() 
  {
	  driver.close();
  }
}