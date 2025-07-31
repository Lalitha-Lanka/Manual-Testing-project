package webdriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "..\\OrangeHRM\\Resources\\IE8-WindowsVista-x86-ENU.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.get("http://livetech-40-pc/orangehrm-3.0.1/symfony/web/index.php/auth/login");
	}

}
