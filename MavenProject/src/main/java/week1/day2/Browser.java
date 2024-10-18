package week1.day2;

public class Browser {
	
	public void launchBrowser(String browserName) {
		System.out.println(browserName+" Browser Launched Successfully");
	}
	public void loadUrl() {
		System.out.println("Application Url loaded successfully");
	}


	public static void main(String[] args) {
		Browser browser = new Browser();
		String browserName="Chrome";
		browser.launchBrowser(browserName);
		browser.loadUrl();		

	}

}

