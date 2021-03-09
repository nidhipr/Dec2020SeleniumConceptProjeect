package Assignments;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListWithStreams {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		List<WebElement> imageList = driver.findElements(By.tagName("img"));
		System.out.println(imageList.size());
		
		//Sequence Stream
	//	imageList.stream().forEach(ele -> System.out.println(ele.getAttribute("src")));
		
		//parallel Stream
		//imageList.parallelStream().forEach(ele->System.out.println(ele.getAttribute("src")));
		
		List<String> amazonImageList =imageList.stream()
		.filter(ele -> ele.getAttribute("alt").contains("home"))
        .map(ele-> ele.getAttribute("alt"))
        .collect(Collectors.toList());
		
		long stTime=System.currentTimeMillis();
		amazonImageList.stream().forEach(ele -> System.out.println(ele));
		long endTime=System.currentTimeMillis();
		System.out.println("total Time Taken in SequenceStream:  " +(endTime-stTime));
		
		long stTime1=System.currentTimeMillis();
		amazonImageList.parallelStream().forEach(ele -> System.out.println(ele));
		long endTime1=System.currentTimeMillis();
		System.out.println("total Time Taken  in ParallelStraem" +(endTime1-stTime1));
	}

}
