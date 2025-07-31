package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ExMultipleDropDown {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://livetech-40-pc/orangehrm-3.0.1/symfony/web/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Admin");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("menu_admin_Job")).click();
		driver.findElement(By.id("menu_admin_workShift")).click();
		driver.findElement(By.id("btnAdd")).click();
		Thread.sleep(3000);
		Select AvailableEmployees_dropdown=new Select(driver.findElement(By.id("workShift_availableEmp")));
		AvailableEmployees_dropdown.selectByVisibleText("Anupama Koplod");
		AvailableEmployees_dropdown.selectByValue("618");
		AvailableEmployees_dropdown.selectByIndex(5);

	}

}
