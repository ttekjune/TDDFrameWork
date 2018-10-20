package ups.base.script.pack;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import ups.shipping.pack.UpsShippingController;

public class UpsShippingBaseScript {

	protected WebDriver driver;
	public static final String URL = "https://www.ups.com/us/en/Home.page";

	public UpsShippingBaseScript() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		this.driver = new ChromeDriver();
	}

	@BeforeClass
	public void beforeClass() {
		this.driver.get(URL);
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public UpsShippingController testLogin() {
		return new UpsShippingController(this.driver);
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
}
