package testNGAssignment;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {
	static WebDriver driver;

	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
	}

	@Test(priority = 1)
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertTrue(title.contains("Human Resource"));

	}

	@Test(priority = 2)
	public void urlTest() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://www.orangehrm.com/orangehrm-30-day-trial/");

	}

	@Test(priority = 3)
	public void menuListTest() {
		By menuList = By.xpath("//a[@class='link']");
		int menuCount = driver.findElements(menuList).size();
		if (menuCount == 6) {
			System.out.println("Total Menu's avaialble : " + menuCount);
		}

	}

	@Test(priority = 4)
	public void registerFormTest() {
		By formfield = By.id("Form_submitForm");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(formfield));
		By FirstName = By.name("FirstName");
		By LastName = By.name("LastName");
		By email = By.name("Email");
		By joBTitle = By.name("JobTitle");
		By Comp = By.name("CompanyName");
		By phonenum = By.name("Contact");
		By numOfEmployee = By.name("NoOfEmployees");
		By country = By.name("Country");
		By Industry = By.name("Industry");
//		
		formField(FirstName, "nidhi");
		formField(LastName, "priya");
		formField(email, "nidhi@gmail.com");
		formField(joBTitle, "Manager");
		formField(Comp, "Google");
		formField(phonenum, "98786777");

		WebElement noEmployee = driver.findElement(numOfEmployee);
		WebElement Empcountry = driver.findElement(country);
		WebElement EmpIndustry = driver.findElement(Industry);

		Select select = new Select(noEmployee);
		select.selectByValue("16 - 20");
		Select select1 = new Select(Empcountry);
		select1.selectByIndex(2);
		Select select2 = new Select(EmpIndustry);
		select2.selectByVisibleText("Education");
	}

	public static String formField(By locator, String value) {
		driver.findElement(locator).sendKeys(value);
		return value;
	}

	@Test(priority = 5)
	public void verifyPrivacyPolicyLinkTest() {
		WebElement privacyLink = driver.findElement(By.linkText("Privacy Policy"));
		Assert.assertTrue(privacyLink.isDisplayed());

	}

	@Test(priority = 6)
	public void clickPrivacyPolicyLinkTest() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", driver.findElement(By.linkText("Privacy Policy")));

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
