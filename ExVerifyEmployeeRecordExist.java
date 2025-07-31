package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExVerifyEmployeeRecordExist {
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://livetech-40-pc/orangehrm-3.0.1/symfony/web/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Admin");
		
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		driver.findElement(By.id("firstName")).sendKeys("web");
		driver.findElement(By.id("lastName")).sendKeys("table");
		String empId=driver.findElement(By.id("employeeId")).getAttribute("value");
		System.out.println("emp Id is "+empId);
		driver.findElement(By.id("btnSave")).click();
		
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		
		
		List<WebElement> idCells=driver.findElements(By.xpath(".//*[@id='resultTable']/tbody/tr/td[1]"));
		Boolean status=false;
		for(WebElement cell:idCells)
		{
			if(empId.equals(cell))
			{
				System.out.println(cell);
				status=true;
			}
		}
		if(status)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
}
