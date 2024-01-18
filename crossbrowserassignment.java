package TastNGTool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class crossbrowserassignment {

	 

		public WebDriver a;

		@org.testng.annotations.Parameters("Browser")
		@Test
		public void MyntraTest(String Browser) {
			if(Browser.equalsIgnoreCase("Chrome")) {
				a=new ChromeDriver();
			}
			else if(Browser.equalsIgnoreCase("Edge")){
				a=new EdgeDriver();
				
			}
			else {
				 a=new FirefoxDriver();
				System.out.println("Default Browser");
			}
			
			a.get("https://www.nykaa.com/");
			
	}
}
