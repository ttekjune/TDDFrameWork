package ups.test.pack;

import org.testng.annotations.Test;

import ups.base.script.pack.UpsShippingBaseScript;

public class UpsShipingTest extends UpsShippingBaseScript {

	@Test
	public void upsShippingPage() {
		testLogin().shippingTabCLick();
		testLogin().createShipmentClick();
		System.out.println("Shipping test is done");
	}

}
