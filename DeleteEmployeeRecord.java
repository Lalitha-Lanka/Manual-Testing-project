package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DeleteEmployeeRecord  
{
	public static void main(String[] args) throws InterruptedException 
	{
		
	String actualFirstName="";
	int count=0;
		
		
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("http://livetech-40-pc/orangehrm-3.0.1/symfony/web/index.php/auth/login");
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("Admin");
	
	driver.findElement(By.id("btnLogin")).click();
	Thread.sleep(2000);
	
	List<WebElement> firstNames=driver.findElements(By.xpath(".//*[@id='resultTable']/tbody/tr/td[3]"));
	for(int i=1;i<firstNames.size();i++)
	{
	
		String name=firstNames.get(i).getText();
		if(name.equals("rani"))
		{
			i=i+1;
			WebElement samChckbox=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr["+i+"]/td[1]/input"));
			samChckbox.click();
	
			
			WebElement Delete=driver.findElement(By.id("btnDelete"));
			
			if(Delete.isEnabled())
			{
				Delete.click();
				driver.findElement(By.id("dialogDeleteBtn")).click();
				
				Thread.sleep(3000);
				
				List<WebElement> afterDeletefirstNames=driver.findElements(By.xpath(".//*[@id='resultTable']/tbody/tr/td[3]"));
				for(WebElement afterDeletefirstName:afterDeletefirstNames)
					{
						
						
						if(afterDeletefirstName.getText().equals("rani"))
						{
							count++;
							
						}
							
			}
				if(count==0)
				{
					System.out.println("record is deleted");
				}
				else
				{
					System.out.println("record is not deleted");
				}
		}
	}
		
	}
	
	driver.close();
}
}
	