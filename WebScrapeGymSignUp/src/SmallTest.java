import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class SmallTest {
	public static void main(String[] args)throws InterruptedException {
    // Optional. If not specified, WebDriver searches the PATH for chromedriver.
    System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/chromedriver.exe");

    //Pass the notification pop ups. must be set before initiating the WebDriver.
	    //1. Create a map to store  preferences 
	    Map<String, Object> prefs = new HashMap<String, Object>();
	    //2. Pass the argument 1 to allow and 2 to block
	    prefs.put("profile.default_content_setting_values.notifications", 1);
	    //3. Create an instance of ChromeOptions 
	    ChromeOptions options = new ChromeOptions();
	    //4. set ExperimentalOption - prefs 
	    options.setExperimentalOption("prefs", prefs);
	    //5. Now Pass ChromeOptions instance to ChromeDriver Constructor to initialize chrome driver which will switch off this browser notification on the chrome browser
	    WebDriver driver = new ChromeDriver(options);
    
    //sign in event
    driver.get("https://www.imleagues.com/spa/fitness/5e8104afb444441885eb6b0fd41c48d4/viewevent?eventId=1926396");
    
    WebDriverWait wait = new WebDriverWait(driver, 20);
    
    //once on the selected time section
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("iml-fitness-event-btn")));
    JavascriptExecutor jse = (JavascriptExecutor)driver;
//    jse.executeScript("window.scrollBy(0,100)");
//    Thread.sleep(500);
//    jse.executeScript("window.scrollBy(0,100)");
//    Thread.sleep(500);
//    jse.executeScript("window.scrollBy(0,100)");
//    Thread.sleep(500);
//    jse.executeScript("window.scrollBy(0,100)");
//    Thread.sleep(500);
//    jse.executeScript("window.scrollBy(0,100)");
//    Thread.sleep(500);
//    jse.executeScript("window.scrollBy(0,100)");
//    Thread.sleep(500);
//    jse.executeScript("window.scrollBy(0,100)");
//    Thread.sleep(500);
//    jse.executeScript("window.scrollBy(0,100)");
//    Thread.sleep(500);
//    jse.executeScript("window.scrollBy(0,100)");
//    Thread.sleep(500);
//    jse.executeScript("window.scrollBy(0,100)");
//    Thread.sleep(500);
//    jse.executeScript("window.scrollBy(0,100)");
//    Thread.sleep(500);
//    jse.executeScript("window.scrollBy(0,100)");
//    Thread.sleep(500);
//    jse.executeScript("window.scrollBy(0,100)");
//    Thread.sleep(500);
//    jse.executeScript("window.scrollBy(0,100)");
//    Thread.sleep(500);
//    jse.executeScript("window.scrollBy(0,100)");
//    Thread.sleep(500);
    
    jse.executeScript("window.scrollBy(0,1500)");
    Thread.sleep(500);


    
    driver.findElement(By.className("iml-fitness-event-btn")).findElement(By.linkText("Sign Up")).click();   
    
    //final sign up page before finally registered
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("btn-primary")));
    driver.findElement(By.className("btn-primary")).click();
    System.out.println("done");
   
    //SIGN IN EVENT...
//    driver.findElement(By.linkText("Select School/Organization")).click();
//    WebElement schoolIn = driver.findElement(By.className("bs-searchbox"));
//    schoolIn.sendKeys("NC State" + Keys.ENTER);
//    WebElement userName = driver.findElement(By.name("email"));
//    userName.sendKeys("izhanAnsari97@gmail.com" + Keys.ENTER);
//    Thread.sleep(15000);  // Let the user actually see something!
//    WebElement passIn = driver.findElement(By.name("password"));
//    passIn.sendKeys("Glen3wai!" + Keys.ENTER);
//    Thread.sleep(5000);  // Let the user actually see something!
//    
    //driver.quit();
    
  }
}