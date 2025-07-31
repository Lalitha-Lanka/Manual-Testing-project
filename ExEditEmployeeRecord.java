package webdriver;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExEditEmployeeRecord {

	public static void main(String[] args) throws InterruptedException {
		
		String actualFirstName="";
		String updatedLastName="";
		String updatedTableValue="";
		int count=0;
		String finalLastName="";
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://livetech-40-pc/orangehrm-3.0.1/symfony/web/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Admin");
		
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
		List<WebElement> firstNames=driver.findElements(By.xpath(".//*[@id='resultTable']/tbody/tr/td[3]"));
		
		for(WebElement firstName:firstNames)
		{
			actualFirstName=firstName.getText();
			if(actualFirstName.equals("lalitha"))
			{
				
				driver.findElement(By.linkText(actualFirstName)).click();
				
				Thread.sleep(5000);
				driver.findElement(By.cssSelector("input[value=Edit]")).click();
				driver.findElement(By.id("personal_txtEmpLastName")).sendKeys("P");
				driver.findElement(By.cssSelector("input[value=Save]")).click();
				Thread.sleep(3000);
				updatedLastName=driver.findElement(By.id("personal_txtEmpLastName")).getAttribute("value");
				
				driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
				Thread.sleep(2000);
				
				List<WebElement> TableLastNames=driver.findElements(By.xpath(".//*[@id='resultTable']/tbody/tr/td[4]"));
				
				for(WebElement TableLastName:TableLastNames)
				{
					updatedTableValue=TableLastName.getText();
					
					if(updatedLastName.equals(updatedTableValue))
					{
						
						count++;
						finalLastName=updatedTableValue;
						
					}
					
				}
				
				if(count>0)
				{
					System.out.println("updated last name is "+finalLastName);
					System.out.println();
					
					System.out.println("updated value "+updatedLastName+" is same as value in table "+finalLastName+"------>test pass");
					System.out.println();
				}
			
				else
				{
					System.out.println("updated value "+updatedLastName+" is not same as value in table "+finalLastName+"------>test fail");
				}	
				
			}
		}
	
		driver.close();
	}

}

//confirmationMessage=driver.findElement(By.id("frmEmpPersonalDetails")).getText();

//if(confirmationMessage.equals("Successfully saved"))
//{
//	System.out.println("record is updated successfully--->test pass");
//}
//else
//	
//{
//	System.out.println("record is not updated successfully--->test fail");
//}



