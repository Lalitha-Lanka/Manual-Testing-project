package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRMUserManagement {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://livetech-40-pc/orangehrm-3.0.1/symfony/web/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Admin");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("btnAdd")).click();
		new Select(driver.findElement(By.id("systemUser_userType"))).selectByVisibleText("Admin");;
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("Lalitha Puppala");
		driver.findElement(By.id("systemUser_userName")).sendKeys("Lalitha");
		
		WebElement status_dropdown=driver.findElement(By.id("systemUser_status"));
		Select status=new Select(status_dropdown);
		status.selectByVisibleText("Enabled");
//		Select status=new Select(driver.findElement(By.id("systemUser_status"));
//		status.selectByVisibleText("Enabled");
		
		WebElement password=driver.findElement(By.id("systemUser_password"));
		password.sendKeys("Lalitha");
		
		WebElement conformpassword=driver.findElement(By.id("systemUser_confirmPassword"));
		conformpassword.sendKeys("Lalitha");
		
		driver.findElement(By.id("btnSave")).click();
	}
	

}
