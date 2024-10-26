package seleniumSample;

public class Browser {
	String browseName="Chrome";
	Float BrowserVersion=13.4f;
	public void openUrl() {
		System.out.println("Opening Url");
	}
	public void closeBrowser() {
		System.out.println("Closing browser");
	}
	 public void navigateBack() {
	        // Implement browser back navigation logic here
	        System.out.println("Navigating back");
	    }
}
