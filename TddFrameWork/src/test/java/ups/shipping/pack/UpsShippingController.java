package ups.shipping.pack;

import org.openqa.selenium.WebDriver;

public class UpsShippingController {

	UpsShippingElements shipping;

	public UpsShippingController(WebDriver driver) {
		this.shipping = new UpsShippingElements(driver);
	}
	
	public void shippingTabCLick(){
		shipping.shippingTab().click();
	}
	
	public void createShipmentClick(){
		shipping.createShipment().click();
	}

}
