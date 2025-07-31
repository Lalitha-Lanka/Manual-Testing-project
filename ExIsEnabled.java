package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExIsEnabled {
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://livetech-40-pc/orangehrm-3.0.1/symfony/web/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Admin");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		WebElement DeleteButton=driver.findElement(By.id("btnDelete"));
		Boolean status=DeleteButton.isEnabled();
		if(!status)
		{
			System.out.println("not enabled---->test pass");
		}
		else
		{
			System.out.println(" enabled--->test fail");
		}
}
}