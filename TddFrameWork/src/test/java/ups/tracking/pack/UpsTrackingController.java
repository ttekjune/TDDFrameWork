package ups.tracking.pack;

import org.openqa.selenium.WebDriver;

public class UpsTrackingController {
	UpsTrackingElements track;

	public UpsTrackingController(WebDriver driver) {
		this.track = new UpsTrackingElements(driver);
	}
	
		
	public void trackingTabCLick(){
		track.trackingTab().click();
	}
	
	public void trackHostory(){
		track.tracking().click();
	}
}
