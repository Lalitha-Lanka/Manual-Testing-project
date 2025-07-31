package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExWebTable {

	public static void main(String[] args) {
		
		int i=2;
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://livetech-40-pc/orangehrm-3.0.1/symfony/web/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Admin");
		driver.findElement(By.id("btnLogin")).click();
//		WebElement table=driver.findElement(By.id("resultTable"));
		List<WebElement> tableDetails=driver.findElements(By.xpath(".//*[@id='resultTable']/tbody/tr/td[2]"));
		int size=tableDetails.size();
		System.out.println(size);
		for(WebElement row:tableDetails)
		{
			System.out.println(row.getText());
		}
	}

}
