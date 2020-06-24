package week3.assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1_Erail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/"); //Opening erail website
		driver.manage().window().maximize(); //Maximizing the browser
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS); //Added wait for 2 seconds
		
		driver.findElementById("chkSelectDateOnly").click(); //Click the 'sort on date' checkbox
		driver.findElementById("txtStationFrom").clear(); //Clear the from station text field
		driver.findElementById("txtStationFrom").sendKeys("Chennai Egmore",Keys.ENTER); //Type in the from station text field
		driver.findElementById("txtStationTo").clear(); //Clear the to station text field
		driver.findElementById("txtStationTo").sendKeys("Coimbatore Jn",Keys.ENTER); //Type in the to station text field
		
		List<WebElement> trainList = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr/td[2]/a");
		int trainListSize = trainList.size(); //getting the size of the list
		System.out.println("The Size of the Train Name list = " + trainListSize); //Printing the size of the list
				
		Set<WebElement> trainSet = new HashSet<WebElement>(); //Creating the set
		for(int i=0;i<trainListSize;i++){
			trainSet.add(trainList.get(i)); //Adding list to set			
		}
		
		int trainSetSize = trainSet.size(); //Getting the size of the set
		System.out.println("The Size of the Train Name set = " + trainSetSize);
		if(trainListSize == trainSetSize){ //comparing the sizes of list and set
			System.out.println("The Names are unique!");
		}
		else{
			System.out.println("The Names are distinct!");
		}
		Thread.sleep(3000);
		driver.quit();			
	
	}

}
