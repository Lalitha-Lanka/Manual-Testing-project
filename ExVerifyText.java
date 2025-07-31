package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExVerifyText {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://livetech-40-pc/orangehrm-3.0.1/symfony/web/index.php/auth/login");
		WebElement footer=driver.findElement(By.id("spanCopyright"));
		String footerText=footer.getText();
		if(footerText.equals("OrangeHRM ver 3.0.1 © OrangeHRM Inc. 2005 - 2018 All rights reserved."))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}

	}
}