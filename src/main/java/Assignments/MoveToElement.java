package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElement {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		By mainMenu = By.id("ctl00_HyperLinkLogin");
		By subMenu = By.linkText("SpiceClub Members");
		By memberLogin = By.linkText("Member Login");
		// doMoveToElement(mainMenu,subMenu,memberLogin);
		doMoveToElement(mainMenu, subMenu);
		doClick(memberLogin);
		// doMoveToElement(mainMenu);
		// doMoveToElement(subMenu);
		// doClick(memberLogin);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doMoveToElement(By locator1, By locator2) {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(locator1)).perform();
		act.moveToElement(getElement(locator2)).perform();
	}

	public static void doClick(By locator) {
		getElement(locator).click();
	}

	public static void doMoveToElement(By locator1, By locator2, By locator3) {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(locator1)).perform();
		act.moveToElement(getElement(locator2)).perform();
		doClick(locator3);
	}
}
