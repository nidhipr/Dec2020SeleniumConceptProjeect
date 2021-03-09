package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonProductTechDetails {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(
				"https://www.amazon.in/Oppo-Fantasy-Storage-Additional-Exchange/dp/B08444SXZ6/ref=br_msw_pdt-1?_encoding=UTF8&smid=A14CZOWI0VEHLG&pf_rd_m=A1VBAL9TL5WCBF&pf_rd_s=&pf_rd_r=XNK0DV1DZJYRBW8XW81W&pf_rd_t=36701&pf_rd_p=5c669f94-aee5-4b22-81f8-1d301ca2c6a3&pf_rd_i=desktop");

		By rowData = By.xpath("//table[@id='productDetails_techSpec_section_1']//tr");

		By rowValue = By.xpath("//table[@id='productDetails_techSpec_section_1']//tr/th/following-sibling::td");

		int rowCount = driver.findElements(rowData).size();
		System.out.println(rowCount);

		By rowXpath = By.xpath("//table[@id='productDetails_techSpec_section_1']//tr/th");
		
		List<WebElement> headerList = driver.findElements(rowXpath);
		
		List<WebElement> dataValue = driver.findElements(rowValue);
		
		if (headerList.size() == dataValue.size()) {
			for (WebElement e : headerList) {
				System.out.println(e.getText());
			}

			for (WebElement e1 : dataValue) {
				System.out.println(e1.getText());
			}
		} else {
			System.out.println("Data is mismatched");
		}
	}

}
