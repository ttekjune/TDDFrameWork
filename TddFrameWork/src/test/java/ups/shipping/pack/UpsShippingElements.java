package ups.shipping.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpsShippingElements {
	WebDriver driver;

	public UpsShippingElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='ups-menuLinks1']")
	WebElement shippingTab;

	public WebElement shippingTab() {
		return shippingTab;
	}

	@FindBy(xpath = "//*[@id='ups-menuPanel1']/div[1]/div[1]/ul/li[1]/a")
	WebElement createShipment;

	public WebElement createShipment() {
		return createShipment;
	}

}
