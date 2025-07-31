package webdriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ExVerifyAddEmployeeFields {
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://livetech-40-pc/orangehrm-3.0.1/symfony/web/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Admin");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys("ram");
		driver.findElement(By.id("lastName")).sendKeys("lanka");
		WebElement chckBoxCreateLoginDetails=driver.findElement(By.id("chkLogin"));
		chckBoxCreateLoginDetails.click();
		if(chckBoxCreateLoginDetails.isSelected())
		{
			System.out.println("check box is selected--->Test pass");
			WebElement userNameElement=driver.findElement(By.id("user_name"));
			if(userNameElement.isDisplayed())
			{
				System.out.println("user ame textbox displayed"+userNameElement+"----->test pass");
				userNameElement.sendKeys("ram lanka");
				WebElement password=driver.findElement(By.id("user_password"));
				if(password.isDisplayed())
				{
					System.out.println("password textbox displayed----->test pass");
					password.sendKeys("ram lanka");
					WebElement ConfirmPassword=driver.findElement(By.id("re_password"));
					if(ConfirmPassword.isDisplayed())
					{
						System.out.println("Confirmpassword textbox displayed----->test pass");
						ConfirmPassword.sendKeys("ram lanka");
						WebElement dropDown=driver.findElement(By.id("status"));
						if(dropDown.isDisplayed())
						{
							System.out.println("status drodown displayed----->test pass");
							Select statusDropDown=new Select(dropDown);
							
							statusDropDown.selectByVisibleText("Enabled");
							WebElement saveButton=driver.findElement(By.id("btnSave"));
							if(saveButton.isDisplayed())
							{
								System.out.println("save button displayed----->test pass");
								saveButton.click();
						
							}
							else
						{
							System.out.println("save button not displayed----->test fail");
						}
						}
							else
							{
								System.out.println("status drodown not displayed----->test fail");
							}

					
					}
					else
					{
						System.out.println("confirmpassword displayed"+ConfirmPassword+"----->test fail");
					}
					
				
				}
				else
				{
					System.out.println("password displayed"+userNameElement+"----->test fail");
				}
			}
			else
			{
				System.out.println("user name textbox not displayed"+userNameElement+"----->test fail");
			}
		}
		else
		{
			System.out.println("check box not selected--->Test fail");
		}
		
}
}