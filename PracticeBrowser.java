package webdriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeBrowser {
	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("www.google.com");
	}
}
