package ups.test.pack;

import org.testng.annotations.Test;

import ups.base.script.pack.UpsTrackingBaseScript;

public class UpsTrackingTest extends UpsTrackingBaseScript{
	
	@Test
	public void upsTrackingPage() {
		testTracking().trackingTabCLick();
		testTracking().trackHostory();
		System.out.println("Tracking test is done");
	}
}
