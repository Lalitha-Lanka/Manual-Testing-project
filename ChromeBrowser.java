package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "..\\OrangeHRM\\Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://livetech-40-pc/orangehrm-3.0.1/symfony/web/index.php/auth/login");

	}

}
