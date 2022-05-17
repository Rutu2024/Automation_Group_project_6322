import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Accessorize 
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
		//url 
		driver.get("https://www.accessorize.com/row/");
		Thread.sleep(2000);
		//add
		driver.findElement(By.xpath("//*[@id=\"globale_popup\"]/div/div/div/div[2]/div/div[2]/input")).click();
		Thread.sleep(2000); 
		//account
		driver.findElement(By.xpath("//*[@id=\"js-page\"]/header/div[2]/section/div/div/div[5]/div/div[1]/a")).click();
		Thread.sleep(2000); 
		//cookies
		driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
		Thread.sleep(2000); 
		//sign in option
		driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/section/div/div/div[5]/div/div[1]/div/div/a")).click();
		Thread.sleep(2000); 
		//readio option
		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div[1]/div/label/span[1]")).click();
		Thread.sleep(2000); 
		//emailid
		driver.findElement(By.xpath("//*[@id=\"dwfrm_login_email\"]")).sendKeys("annapatil@gmail.com");
		//password
		driver.findElement(By.xpath("//*[@id=\"dwfrm_login_password\"]")).sendKeys("Palash@123");
		Thread.sleep(2000); 
		//signin button
		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div[1]/div/div/div/form/button")).click();
		Thread.sleep(2000); 
	}
//  @Test 
//  public void sign_up() throws InterruptedException 
//  {
//		//Add button
//		driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/section/div/div/div[5]/div/div[1]/a/span[1]")).click();
//		Thread.sleep(2000);
//		
//	  // register
//		driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/section/div/div/div[5]/div/div[1]/div/div/div[2]/span/a")).click();
//		Thread.sleep(3000);
//		
//		//cretat button
//		 driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div[2]/div/div[2]/div/label/span[1]")).click();
//		 Thread.sleep(2000);
//		//Submit Button
//		 driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div[2]/div/div[2]/div/div/div/form/div[1]/div[1]/div[1]/div/div[1]/span[1]")).click();
//		 Thread.sleep(2000);
//		 driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div[2]/div/div[2]/div/div/div/form/div[1]/div[1]/div[1]/div/div[2]/div[2]/div[4]")).click();
//		 Thread.sleep(2000);
//		//Billing address
//		 driver.findElement(By.xpath("//*[@id=\"dwfrm_profile_customer_firstname\"]")).sendKeys("palash");
//		 Thread.sleep(2000); 
//		 driver.findElement(By.xpath("//*[@id=\"dwfrm_profile_customer_lastname\"]")).sendKeys("sable");
//		 Thread.sleep(2000);  
//		
//	 	//Email
//		 driver.findElement(By.xpath("//*[@id=\"dwfrm_profile_customer_phone\"]")).sendKeys("9923917099");
//		 Thread.sleep(2000);
//	
//	     //Adress
//		 driver.findElement(By.xpath("//*[@id=\"dwfrm_profile_customer_email\"]")).sendKeys("hyundaimalegaon@gmail.com");
//		 Thread.sleep(5000);
//		 
//	    //Mobile
//		 driver.findElement(By.xpath("//*[@id=\"dwfrm_profile_login_password\"]")).sendKeys("Palash#123");
//		 Thread.sleep(2000); 
//		 
//		 driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div[2]/div/div[2]/div/div/div/form/div[12]/div/label")).click();
//		 Thread.sleep(2000);
//		 driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div[2]/div/div[2]/div/div/div/form/div[13]/div[1]")).click();
//		 Thread.sleep(2000);
//		 driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div[2]/div/div[2]/div/div/div/form/button")).click();
//	    
//		 
//  }
	
  @Test (priority = 1)
public void smoketesting () throws InterruptedException 
{
	  // step:1 Create Object Of Actions class
		Actions a= new Actions(driver);
		
		//Step :2 Create Object of list with Webelment
		List<WebElement> ls=driver.findElements(By.xpath("/html/body/div[1]/header/div[2]/section/div/div/div[3]/nav/ul/li"));
   			
      
    //  Step:3 Store Size of List
		int listSize=ls.size();
		System.out.println("No Of Modules:"+listSize);
		
	//	Step:4 Foor loop
		for(int i=1; i<=listSize; i++)
	{
		//	Wait
	Thread.sleep(1000);
			//Display Module'Name
			System.out.println(driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/section/div/div/div[3]/nav/ul/li["+i+"]")).getText());
			
			//Performance Mouse Hover
			a.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/section/div/div/div[3]/nav/ul/li["+i+"]"))).click().perform();
		}
  }

  @Test (priority = 2)
  public void module1 () throws InterruptedException 
  {
	//Add Customer
		
		driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/section/div/div/div[3]/nav/ul/li[1]/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div[3]/nav/div/div[1]/div/div[2]/div[2]/div[1]/div/div[1]/a/picture/img")).click();
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("/html/body/div[1]/main/div[4]/div[2]/div[3]/div[2]/div/div/div[1]/div/div/div/div[2]/div[1]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/main/div[4]/div[2]/div[3]/div[6]/div/div[2]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/main/div[4]/div[2]/div[3]/div[6]/div/div[3]/div[1]")).click();
		Thread.sleep(2000);
	
  }
  @Test (priority = 3)
  public void module2 () throws InterruptedException 
  {
	
	    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/section/div/div/div[4]/div/a/span[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"input-search\"]")).sendKeys("handbag");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"js-page\"]/header/div[2]/section/div/div/div[4]/div/div/div/form/div/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div[3]/nav/div/div[1]/div/div[1]/div[2]/div/div[1]/div/div/div[2]/div/div[1]/div[1]/div")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div[3]/nav/div/div[1]/div/div[1]/div[2]/div/div[1]/div/div/div[2]/div/div[1]/div[2]/ul/li[8]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div[3]/nav/div/div[1]/div/div[1]/div[2]/div/div[1]/div/div[1]/div[2]/div/div[2]/div[1]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div[3]/nav/div/div[1]/div/div[1]/div[2]/div/div[1]/div/div[1]/div[2]/div/div[2]/div[2]/div/div/button")).click();
		 driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div[3]/nav/div/div[1]/div/div[1]/div[2]/div/div[1]/div/div[1]/div[2]/div/div[3]/div[1]/div")).click();
		Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div[3]/nav/div/div[1]/div/div[1]/div[2]/div/div[1]/div/div[1]/div[2]/div/div[4]/div[1]/div")).click();
			Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div[3]/nav/div/div[1]/div/div[1]/div[2]/div/div[1]/div/div[1]/div[2]/div/div[4]/div[2]/ul/li[2]/button")).click();
			Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div[3]/nav/div/div[1]/div/div[2]/div[2]/div[1]/div/div[1]/a/picture/img")).click();
			Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[1]/main/div[4]/div[2]/div[3]/div[4]/div[1]/div[2]/div/button")).click();
  }
  @Test (priority = 4)
  public void module3 () throws InterruptedException 
  {
	  driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/section/div/div/div[3]/nav/ul/li[6]/a")).click();
	Thread.sleep(2000); 
	 driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/section/div/div/div[3]/nav/ul/li[6]/div/div/div/div[1]/div/div[1]/div/div/div/ul/li[6]/a")).click();
	Thread.sleep(2000); 
	driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div[3]/nav/div/div[1]/div/div[1]/div[2]/div/div[2]/div/div[2]/div")).click();
	Thread.sleep(2000); 
	 driver.findElement(By.xpath("	/html/body/div[1]/main/div[2]/div[3]/nav/div/div[1]/div/div[1]/div[2]/div/div[2]/div/div[3]/div[2]/div[3]/button[2]")).click();
	Thread.sleep(2000); 
	  driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div[3]/nav/div/div[1]/div/div[2]/div[2]/div[1]/div/div[1]/a/picture/img")).click();
	Thread.sleep(2000); 
	driver.findElement(By.xpath("/html/body/div[1]/main/div[4]/div[2]/div[3]/div[2]/div/div/div[1]/div[2]/div/div/div[2]/div[3]/button")).click();
	Thread.sleep(2000); 
	driver.findElement(By.xpath("/html/body/div[1]/main/div[4]/div[2]/div[3]/div[4]/div[1]/div[2]/div/button")).click();
	Thread.sleep(2000); 
  }
  @Test (priority = 5)
  public void module4 () throws InterruptedException 
  {
	  driver.findElement(By.xpath("//*[@id=\"js-page\"]/header/div[2]/section/div/div/div[3]/nav/ul/li[5]/a")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"product-search-results\"]/div/div[1]/div[2]/div/div[2]/div/div[2]/div")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"product-search-results\"]/div/div[1]/div[2]/div/div[2]/div/div[3]/div[2]/div[3]/button[3]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"product-search-results\"]/div/div[2]/div[2]/div[2]/div/div[1]/a/picture/img")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[4]/div[2]/div[3]/div[2]/div/div/div[1]/div[2]/div/div/div[2]/div[1]/button")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[4]/div[2]/div[3]/div[4]/div[1]/div[2]/div/button")).click();
	  Thread.sleep(2000);
  }
  
  @Test (priority = 7)
  public void module5 () throws InterruptedException 
  {
	   driver.findElement(By.xpath("//*[@id=\"js-page\"]/header/div[2]/section/div/div/div[5]/div/div[3]/div/a")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@id=\"js-page\"]/header/div[2]/section/div/div/div[5]/div/div[3]/div/div/div[2]/a")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div[3]/div/div[1]/div[2]/div/div[2]/div/div[3]/div[1]/a")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@id=\"modalOk\"]")).click();
       Thread.sleep(2000);
  }
  @Test (priority = 8)
  public void module6 () throws InterruptedException 
  {
	  driver.findElement(By.xpath("//*[@id=\"js-page\"]/header/div[2]/section/div/div/div[5]/div/div[1]/a")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//*[@id=\"js-page\"]/header/div[2]/section/div/div/div[5]/div/div[1]/div/div/div[2]/li[2]/a")).click();
      Thread.sleep(2000);
  }
  
  @AfterTest
  public void afterTest() 
  {
	  driver.close();
  }

}