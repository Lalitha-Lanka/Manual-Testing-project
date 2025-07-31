package webdriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("http://livetech-40-pc/orangehrm-3.0.1/symfony/web/index.php/auth/login");
		String Title=driver.getTitle();
		System.out.println("Title is :"+Title);
		String URL=driver.getCurrentUrl();
		System.out.println("URL is :"+URL);
		String html=driver.getPageSource();
		System.out.println("Page source is :"+html);
		Thread.sleep(5000);
		driver.navigate().refresh();
		driver.close();
		

	}

}
