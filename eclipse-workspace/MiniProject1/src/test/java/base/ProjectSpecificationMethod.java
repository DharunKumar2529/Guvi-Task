package base;

import utils.Utility;

public class ProjectSpecificationMethod extends Utility{
	
	public void browserLaunchAndUrlLoad() {
		
		launchBrowserAndloadUrl("Chrome", "https://www.demoblaze.com/");
	}
	
	public void closeBrowser() {
		browserClose();
	}
}
