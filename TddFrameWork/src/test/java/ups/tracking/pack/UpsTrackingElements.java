package ups.tracking.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class UpsTrackingElements {
	WebDriver driver;

	public UpsTrackingElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='ups-menuLinks0']")
	WebElement trackingTab;

	public WebElement trackingTab() {
		return trackingTab;
	}

	@FindBy(xpath ="//*[@id='ups-menuPanel0']/div[1]/div[1]/ul/li[1]/a")
	WebElement tracking;

	public WebElement tracking() {
		return tracking;
	}

}
