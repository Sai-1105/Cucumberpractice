package com.FunctionalLibrary;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FunctionalLibrary {
	
	

public static WebDriver driver; 
	
	public static WebDriver getDriver(String browser) throws Throwable {
		try {
			
		
		if (browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Sai Prasath\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
			
		}else if (browser.equalsIgnoreCase("ie")) {
			
			System.setProperty("webdriver.ie.driver",
					"C:\\Users\\Sai Prasath\\eclipse-workspace\\Selenium\\Driver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			
		} else if(browser.equalsIgnoreCase("gecko")){
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Sai Prasath\\eclipse-workspace\\Selenium\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}else {
			throw new Exception("Invalid Browser name");
		}
		
		return driver;
	}  catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		throw new Exception("Issue is with Browser Launch");
	}
	}
	
	public static void geturl(String url) throws Throwable {
		try {
			driver.get(url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("Url is not valid");
		}
	}
	
	public static int gettingtextint(WebElement element) throws Throwable {
		try {
			int i=0;
			String s = element.getText();
			i=Integer.parseInt(s);
			return i;
		} catch (NumberFormatException e) {
			e.printStackTrace();
			throw new Exception("element not found");
			
			
		}
	}
	
	public static String gettextstring(WebElement element) {
		
		String s=element.getText();
				return s;

	}

	public static void EXwait(WebElement element) throws Throwable {
		try {
			WebDriverWait wb=new WebDriverWait(driver, 50);
					wb.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("Timeout");
		}
	}
	
	public static void impwait(WebElement element) throws Throwable {
		try {
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("Timeout");
		}
	}
	
	public static boolean isDisplayed(WebElement element) throws Throwable {
		try {
			boolean displayed = element.isDisplayed();
			return displayed;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("element not displayed");
		}
	}
	public static boolean isEnabled(WebElement element) throws Exception {
		try {
			boolean enabled = element.isEnabled();
			return enabled;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("element not enabled");
		}
	}
	public static void clear(WebElement element) throws Exception {
		try {
			element.clear();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception();

		}
	}

	public static void clearAndsendElement(WebElement element, String values) throws Throwable {
		try {
			EXwait(element);
			if (isDisplayed(element) && isEnabled(element)) {
				clear(element);
				element.sendKeys(values);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}
	
	public static void click(WebElement element) throws Throwable {
		try {
			EXwait(element);
			element.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception();

		}
	}
	
	public static void mouseHover(WebElement element) throws Throwable {
		try {
			EXwait(element);
			Actions ac = new Actions(driver);
			ac.moveToElement(element).build().perform();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception();

		}

	}
	public static void Navigate(String options) throws Exception {
		if (options.equalsIgnoreCase("forward")) {
			driver.navigate().forward();
		} else if (options.equalsIgnoreCase("backward")) {
			driver.navigate().back();
		} else if (options.equalsIgnoreCase("refresh")) {
			driver.navigate().refresh();
		} else {
			throw new Exception("Not a valid option");
		}

	}
	
	public static void driverNavigateToUrl(String url) throws Throwable {
		try {
			driver.navigate().to(url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception();
		}
	}
	
	public static String getPageTitle() throws Exception {
		try {
			String title = driver.getTitle();
			return title;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception();
		}
	}
	public static String getCurrentURL() throws Throwable {
		try {
			String currentUrl = driver.getCurrentUrl();
			return currentUrl;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception();
		}
	}
	
	public static void dropDown(WebElement element, String value) throws Throwable {
		
		try {
			Select s=new Select(element);
			s.selectByVisibleText(value);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception();
		}

	}
	public static void Dropdowna(WebElement element, String options, String values) throws Throwable {
		EXwait(element);
		Select sc = new Select(element);
		if (options.equalsIgnoreCase("index")) {
			sc.selectByIndex(Integer.parseInt(values));
		} else if (options.equalsIgnoreCase("value")) {
			sc.selectByValue(values);
		} else if (options.equalsIgnoreCase("visibletext")) {
			sc.selectByVisibleText(values);
		} else {
			throw new Exception("Not a valid options");

		}

	}
	
	public static void scrollToElement(WebElement element) throws Exception {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", element);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception();
		}
	}
	
	public static void scrollUsingCoordinates(int width, int height) throws Exception {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(" + width + "," + height + ")");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception();
		}
	}
	public static void scrollToPageHeight(String options) throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		if (options.equalsIgnoreCase("up")) {
			js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
		} else if (options.equalsIgnoreCase("down")) {
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		} else {
			throw new Exception("Not a valid option");
		}
	}
	
	public static void dragAndDroptoElement(WebElement source, WebElement target) throws Throwable {
		EXwait(source);
		Actions ac = new Actions(driver);
		ac.dragAndDrop(source, target).build().perform();
	}


	public static void rightClickOntheElement(WebElement element) {
	Actions ac = new Actions(driver);
	ac.contextClick(element).build().perform();

}

	public static void doubleClickOntheElement(WebElement element) {
	Actions ac = new Actions(driver);
	ac.doubleClick(element).build().perform();
}

	public static void actionsforSendkeys(WebElement element, String values) {
	Actions ac = new Actions(driver);
	ac.sendKeys(element, values).build().perform();
}

	public static void actionsForClick(WebElement element) {
	Actions ac = new Actions(driver);
	ac.click(element).build().perform();
}


public static void screenshot(String name) throws Throwable {
		
		try {
			TakesScreenshot tk=(TakesScreenshot) driver;
			File scr = tk.getScreenshotAs(OutputType.FILE);
			
			File st=new File("C:\\Users\\Sai Prasath\\Desktop\\Java test answers\\Screenshot\\"+name+".png");
			FileUtils.copyFile(scr, st);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

public static void switchToWindows(int index) throws Exception {
	try {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> li = new ArrayList<String>();
		li.addAll(windowHandles);
		String winID = li.get(index);
		driver.switchTo().window(winID);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		throw new Exception();
	}
	
	
	
}
//converting text to int

public static int textToInt(WebElement element) {
	
	String s=element.getText();
	int value=0;
	if (s.contains(","))
	{ String replace1 = s.replace(",","").trim();
		s=replace1;
	}
	if (s.contains("₹"))
	{
		String replace2 = s.replace("₹","").trim();
		s=replace2;
	}
	value = Integer.parseInt(s);
	return value ;
	}


}


