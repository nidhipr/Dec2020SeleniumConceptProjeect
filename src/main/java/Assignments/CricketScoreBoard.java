package Assignments;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricketScoreBoard {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(
				"https://www.espncricinfo.com/series/england-tour-of-india-2020-21-1243364/india-vs-england-1st-test-1243384/full-scorecard");
	
By wicketName = By.xpath
("//h5[text()='England 1st INNINGS ']/parent::div/parent::div/parent::div/parent::span/following-sibling::div//i");
String wickettakerName=driver.findElement(wicketName);	
System.out.println(wickettakerName);
//for(WebElement e: wickettakerName) {
//			String name=e.getText();
//			System.out.println(name);
//		}
	}
//		System.out.println("ENGLAND 1ST INNINGS SCORECARD ");
//	System.out.println(getTeamInnings("England 1st INNINGS"));
	

			//+": " +getWicketTakerName("England 1st INNINGS",1));
		
		
	//	System.out.println(getScoreCard(engName));
	//	System.out.println(getWicketTakerName(engName,1));
		
//				+" : "+getWicketTakerName(engName,1) +" : "+getScoreCard(engName));
		
//		System.out.println(getBatsmenName("Rory Burns") + "   :    " + getWicketTakerName("Rory Burns", 1) + "    :    "
//				+ getScoreCard("Rory Burns"));
//		System.out.println(getBatsmenName("Dom Sibley") + "   :    " + getWicketTakerName("Dom Sibley", 1)
//				+ "    :     " + getScoreCard("Dom Sibley"));
//		System.out.println(getBatsmenName("Dan Lawrence") + " :   " + getWicketTakerName("Dan Lawrence", 1)
//				+ "   :     " + getScoreCard("Dan Lawrence"));
//		System.out.println(getBatsmenName("Joe Root") + "     :    " + getWicketTakerName("Joe Root", 1)
//				+ "      :     " + getScoreCard("Joe Root"));
//		System.out.println(getBatsmenName("Ben Stokes") + "   :    " + getWicketTakerName("Ben Stokes", 1)
//				+ "    :     " + getScoreCard("Ben Stokes"));
//		System.out.println(getBatsmenName("Ollie Pope") + "   :    " + getWicketTakerName("Ollie Pope", 1)
//				+ "    :     " + getScoreCard("Ollie Pope"));
//		System.out.println(getBatsmenName("Jos Buttler") + "  :    " + getWicketTakerName("Jos Buttler", 1)
//				+ "   :     " + getScoreCard("Jos Buttler"));
//		System.out.println(getBatsmenName("Dom Bess") + "     :    " + getWicketTakerName("Dom Bess", 1)
//				+ "      :     " + getScoreCard("Dom Bess"));
//		System.out.println(getBatsmenName("Jofra Archer") + " :    " + getWicketTakerName("Jofra Archer", 1)
//				+ "  :     " + getScoreCard("Jofra Archer"));
//		System.out.println(getBatsmenName("Jack Leach") + "   :    " + getWicketTakerName("Jack Leach", 1)
//				+ "    :     " + getScoreCard("Jack Leach"));
//		System.out.println(getBatsmenName("James Anderson") + " :  " + getWicketTakerName("James Anderson", 1)
//				+ "   :  " + getScoreCard("James Anderson"));
//		System.out.println("*******************************************************");
//		System.out.println("INDIA 1ST INNINGS SCORECARD ");
		//System.out.println(getTeamInnings("India 1st INNINGS"));
//		System.out.println(getBatsmenName("Rohit Sharma") + "    :    " + getWicketTakerName("Rohit Sharma", 1)
//				+ "    :     " + getScoreCard("Rohit Sharma"));
//		System.out.println(getBatsmenName("Shubman Gill") + "    :    " + getWicketTakerName("Shubman Gill", 1)
//				+ "    :     " + getScoreCard("Shubman Gill"));
//		System.out.println(getBatsmenName("Cheteshwar Pujara") + "    :    "
//				+ getWicketTakerName("Cheteshwar Pujara", 1) + "    :    " + getScoreCard("Cheteshwar Pujara"));
//		System.out.println(getBatsmenName("Virat Kohli") + "     :    " + getWicketTakerName("Virat Kohli", 1)
//				+ "     :     " + getScoreCard("Virat Kohli"));
//		System.out.println(getBatsmenName("Ajinkya Rahane") + "  :    " + getWicketTakerName("Ajinkya Rahane", 1)
//				+ "  :     " + getScoreCard("Ajinkya Rahane"));
//		System.out.println(getBatsmenName("Rishabh Pant") + "    :    " + getWicketTakerName("Rishabh Pant", 1)
//				+ "    :     " + getScoreCard("Rishabh Pant"));
//		System.out.println(getBatsmenName("Washington Sundar") + "   :  " + getWicketTakerName("Washington Sundar", 1)
//				+ "     :     " + getScoreCard("Washington Sundar"));
//		System.out.println(getBatsmenName("Ravichandran Ashwin") + "    :    "
//				+ getWicketTakerName("Ravichandran Ashwin", 1) + "     :     " + getScoreCard("Ravichandran Ashwin"));
//		System.out.println(getBatsmenName("Shahbaz Nadeem") + "  :    " + getWicketTakerName("Shahbaz Nadeem", 1)
//				+ "   :     " + getScoreCard("Shahbaz Nadeem"));
//		System.out.println(getBatsmenName("Ishant Sharma") + "   :    " + getWicketTakerName("Ishant Sharma", 1)
//				+ "    :     " + getScoreCard("Ishant Sharma"));
//		System.out.println(getBatsmenName("Jasprit Bumrah") + "  :    " + getWicketTakerName("Jasprit Bumrah", 1)
//				+ "   :      " + getScoreCard("Jasprit Bumrah"));

	
	
	public static String getTeamInnings(String inningsName) {
		By name= By.xpath("//h5[text()='"+inningsName+" ']/parent::div/parent::div/parent::div/parent::span/following-sibling::div//a[@data-hover='']");
		List<WebElement> playerName = driver.findElements(name);
		for(WebElement e:playerName ) {
		String engName =e.getText();
		System.out.println(engName);
		}
	    return inningsName;
	//	return System.out.println(engName);
		
		}

	public static String getBatsmenName(String playerName) {
		String BatsmenName = driver.findElement(By.xpath("//a[text()='" + playerName + "']")).getText();
		return BatsmenName;
	}

	public static String getWicketTakerName(String playerName, int innings) {
		String wicketTakerName = driver.findElement(By.xpath("(//a[text()='" + playerName
				+ "']/parent::td/following-sibling::td[@class='text-left'])[" + innings + "]")).getText();
		return wicketTakerName;
	}

	public static List<String> getScoreCard(String playerName) {
		List<String> scoreCardList = new ArrayList<String>();
		List<WebElement> scoreList = driver
				.findElements(By.xpath("//a[text()='" + playerName + "']/parent::td/following-sibling::td"));
		for (int i = 1; i < scoreList.size() / 2; i++) {
			scoreCardList.add(scoreList.get(i).getText());
		}
		return scoreCardList;
	}
}
