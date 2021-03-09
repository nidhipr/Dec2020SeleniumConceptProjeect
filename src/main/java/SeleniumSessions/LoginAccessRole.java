package SeleniumSessions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginAccessRole {
static WebDriver driver;
	public static void main(String[] args) {
		// admin,seller,supplier,distributor,vendors ,customer,category manager,partners
		//user interface will remain same
		//RBAC->Role based access control---Permission
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		
		doLogin("seller");
		doLogin("partner");

	}
	
	public static void doLogin(String role) {
		String creds[] = getCredentialMap(role).split(":");
		System.out.println(creds[0] + ": "+creds[1]);
		By email =By.id("input-email");
		By password = By.id("input-password");
		By loginBtn=By.xpath("//input[@type='submit']");
		
		driver.findElement(email).clear();
		driver.findElement(email).sendKeys(creds[0]);

		driver.findElement(password).clear();
		driver.findElement(password).sendKeys(creds[1]);
		driver.findElement(loginBtn).click();
		
		
	}
	
	public static String getCredentialMap(String role) {
		Map<String,String> credMap = new HashMap<String,String>();
		credMap.put("admin", "admin@gmail.com:admin123");
		credMap.put("seller", "seller@gmail.com:seller123");
		credMap.put("suplier", "supplie@gmail.com:supplier123");
		credMap.put("distributor", "distributor@gmail.com:distributor123");
		credMap.put("vendor", "vendor@gmail.com:vendor123");
		credMap.put("customer", "customer@gmail.com:customer123");
		credMap.put("partner", "partner@gmail.com:partner123");
		
		if(credMap.containsKey(role)) {
			return credMap.get(role);
		}
		
		return null;
		
	}

}
