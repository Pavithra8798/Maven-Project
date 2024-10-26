package week3.day1;

import seleniumSample.Browser;


public class Chrome extends Browser {
    public void openIncognito() {
        System.out.println("Opening Incognito mode");
    }

    public void clearCache() {
        System.out.println("Clearing cache");
    }

public static void main(String[] args) {
	Browser br=new Browser();
    br.openUrl();
    br.closeBrowser();
    br.navigateBack();
	// TODO Auto-generated method stub
	Chrome chromeBrowser = new Chrome();
    //chromeBrowser.openUrl("https://google.com");
    chromeBrowser.openIncognito();
    chromeBrowser.clearCache();
}
}

