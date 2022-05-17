
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Accessorize_pom
{
	//url
	public void url(WebDriver driver)
	{
		driver.get("https://www.accessorize.com/row/login");
	}
	//sign in
	public void signin(WebDriver driver)
	{
		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div[1]/div/label/span[1]")).click();
	}
	//user name/email
	public void username(WebDriver driver, String usn)
	{
		driver.findElement(By.xpath("//*[@id=\"dwfrm_login_email\"]")).sendKeys(usn);
	}
	//password
	public void password(WebDriver driver, String pwd)
	{
		driver.findElement(By.xpath("//*[@id=\"dwfrm_login_password\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"dwfrm_login_password\"]")).sendKeys(pwd);
	}
	//login
	public void loginbutton(WebDriver driver)
	{
		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div[1]/div/div/div/form/button")).click();
	}
	//Account
	public void account(WebDriver driver)
	{
		driver.findElement(By.xpath("//*[@id=\"js-page\"]/header/div[2]/section/div/div/div[5]/div/div[1]/a")).click();
	}
	//sign out
		public void logout(WebDriver driver)
		{
			driver.findElement(By.xpath("//*[@id=\"js-page\"]/header/div[2]/section/div/div/div[5]/div/div[1]/div/div/div[2]/li[2]/a")).click();
		}
	}