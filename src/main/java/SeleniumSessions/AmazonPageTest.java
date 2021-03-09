package SeleniumSessions;

public class AmazonPageTest {

	public static void main(String[] args) {
		
		String browserName="chrome";
		BrowserUtil br = new BrowserUtil();
		br.launchBrowser(browserName);
		br.launchUrl("http://www.amazon.com");
		
		String title=br.getPageTitle();
		if(title.contains("Online Shopping")) {
			System.out.println("Correct title");
		}
		else {
			System.out.println("incorrect url");
		}
		if(br.getPageUrl().contains("amazon")) {
			System.out.println("pointing to the right url");
		}
		
		
		br.quitBrowser();
		
	}

}
