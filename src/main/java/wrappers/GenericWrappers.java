package wrappers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import utils.Reporting;

public class GenericWrappers extends Reporting  implements Wrappers {
	
	public static RemoteWebDriver driver;
	
	public static Properties prop; 
	
	public void loadObjects() {
		try {
			 prop = new Properties();
			prop.load(new FileInputStream("./src/test/java/object.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void unloadObjects() {
		prop=null;
	}

	public void invokeApp(String browser, String url) {
		// TODO Auto-generated method stub
		try {
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			}else if(browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}else if(browser.equalsIgnoreCase("ie")) {
				System.setProperty("wedriver.ie.driver", "./drivers/IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			
            driver.manage().window().maximize();
            driver.get(url);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            //System.out.println("The browser "+browser+" is launched with the url "+url+" successfully");
            reportStep("The browser "+browser+" is launched with the url "+url+" successfully", "Pass");
		} catch (SessionNotCreatedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The browser "+browser+" is not launched due to session not created error");
			reportStep("The browser "+browser+" is not launched due to session not created error", "fail");
		} catch (InvalidArgumentException e) {
			// TODO: handle exception
			//System.err.println("The browser "+browser+" is not launched as the url "+url+" does not contains http/https");
			reportStep("The browser "+browser+" is not launched as the url "+url+" does not contains http/https", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The browser "+browser+" is not launched due to unknown error");
			reportStep("The browser "+browser+" is not launched due to unknown error", "fail");
		} 
	}

	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(idValue).sendKeys(data);
			//System.out.println("The element with id "+idValue+" is entered with data "+data);
			reportStep("The element with id "+idValue+" is entered with data "+data, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+idValue+" is not found in the DOM");
			reportStep("The element with id "+idValue+" is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The element with id "+idValue+" is not visible in the application");
			reportStep("The element with id "+idValue+" is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The element with id "+idValue+" is not interactable in the application");
			reportStep("The element with id "+idValue+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with id "+idValue+" is not stable in the application");
			reportStep("The element with id "+idValue+" is not stable in the application", "fail");
		} catch (WebDriverException e) {
			//System.err.println("The element with id "+idValue+" is not entered with data "+data+" due to unknown error");
			reportStep("The element with id "+idValue+" is not entered with data "+data+" due to unknown error", "fail");
		} 
		
	}

	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			//System.out.println("The element with name "+nameValue+" is entered with data "+data);
			reportStep("The element with name "+nameValue+" is entered with data "+data, "Pass");
		} catch (NoSuchElementException e) {
			//System.err.println("The element with name "+nameValue+" is not found in the DOM");
			reportStep("The element with name "+nameValue+" is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The element with name "+nameValue+" is not visible in the application");
			reportStep("The element with name "+nameValue+" is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The element with name "+nameValue+" is not interactable in the application");
			reportStep("The element with name "+nameValue+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with name "+nameValue+" is not stable in the application");
			reportStep("The element with name "+nameValue+" is not stable in the application", "fail");
		} catch (WebDriverException e) {
			//System.err.println("The element with name "+nameValue+" is not entered with data "+data+" due to an unknown error");
			reportStep("The element with name "+nameValue+" is not entered with data "+data+" due to an unknown error", "fail");
		} 
	}

	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			//System.out.println("The element with xpath "+xpathValue+" is entered with data "+data);
			reportStep("The element with xpath "+xpathValue+" is entered with data "+data, "Pass");
		} catch (NoSuchElementException e) {
			//System.err.println("The element with xpath "+xpathValue+" is not found in the DOM");
			reportStep("The element with xpath "+xpathValue+" is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The element with xpath "+xpathValue+" is not visible in the application");
			reportStep("The element with xpath "+xpathValue+" is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The element with xpath "+xpathValue+" is not interactable in the application");
			reportStep("The element with xpath "+xpathValue+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with xpath "+xpathValue+" is not stable in the application");
			reportStep("The element with xpath "+xpathValue+" is not stable in the application", "fail");
		} catch(WebDriverException e) {
			//System.err.println("The element with xpath "+xpathValue+" is not enetered with data "+data+"due to unknown error");
			reportStep("The element with xpath "+xpathValue+" is not enetered with data "+data+"due to unknown error", "fail");
		} 
		
	}

	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		try {
			String actualTitle = driver.getTitle();
			if(actualTitle.equals(title)) {
				//System.out.println("The title of the page "+actualTitle+" is matched with the expected title "+title);
				reportStep("The title of the page "+actualTitle+" is matched with the expected title "+title, "Pass");
			} else {
				//System.err.println("The title of the page "+actualTitle+" is not matched with the expected title "+title);
				reportStep("The title of the page "+actualTitle+" is not matched with the expected title "+title, "fail");
			}
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The title of the page "+title+" is not verified due to an unknown error");
			reportStep("The title of the page "+title+" is not verified due to an unknown error", "fail");
		} 
		
	}

	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		 try {
			String actualText = driver.findElementById(id).getText();
			 if(actualText.equals(text)) {
				 //System.out.println("The element with id "+id+" is holding the text "+actualText+" is matched with the expected text "+text);
				 reportStep("The element with id "+id+" is holding the text "+actualText+" is matched with the expected text "+text, "Pass");
			 } else {
					 //System.err.println("The element with id "+id+" is holding the text "+actualText+" is not matched with the expected text "+text);
				 reportStep("The element with id "+id+" is holding the text "+actualText+" is not matched with the expected text "+text, "fail");
				 }
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id"+id+"is not found in the DOM");
			reportStep("The element with id"+id+"is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id"+id+"is not visible in the application");
			reportStep("The element with id"+id+"is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not interactable in the application");
			reportStep("The element with id "+id+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not stable in the application");
			reportStep("The element with id "+id+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id"+id+"is not verified due to an unknown error");
			reportStep("The element with id"+id+"is not verified due to an unknown error", "fail");
		} 
		 
		 }
		

	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String actualText = driver.findElementByXPath(xpath).getText();
			if(actualText.equals(text)) {
				//System.out.println("The element with xpath "+xpath+" holding the text "+actualText+" is matched with the expected text "+text);
				reportStep("The element with xpath "+xpath+" holding the text "+actualText+" is matched with the expected text "+text, "Pass");
			} else {
				//System.err.println("The element with xpath "+xpath+" holding the text "+actualText+" is not matched with the expected text "+text);
				reportStep("The element with xpath "+xpath+" holding the text "+actualText+" is not matched with the expected text "+text, "fail");
			}
		} catch (ElementNotVisibleException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpath+" is not visible in the application");
			reportStep("The element with xpath "+xpath+" is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not interactable in the application");
			reportStep("The element with xpath "+xpath+" is not interactable in the application", "fail");
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not found in the DOM");
			reportStep("The element with xpath "+xpath+" is not found in the DOM", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not stable in the application");
			reportStep("The element with xpath "+xpath+" is not stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not verified due to an unknown error");
			reportStep("The element with xpath "+xpath+" is not verified due to an unknown error", "fail");
		} 
		
	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String actualText = driver.findElementByXPath(xpath).getText();
			if(actualText.contains(text)) {
				//System.out.println("The element with xpath "+xpath+" holding the text "+actualText+" contains the text "+text);
				reportStep("The element with xpath "+xpath+" holding the text "+actualText+" contains the text "+text, "Pass");
			} else {
				//System.err.println("The element with xpath "+xpath+" holding the text "+actualText+" does not contains the text "+text);
				reportStep("The element with xpath "+xpath+" holding the text "+actualText+" does not contains the text "+text, "fail");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpath+" is not found in the DOM");
			reportStep("The element with xpath "+xpath+" is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not visible in the application");
			reportStep("The element with xpath "+xpath+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not interactable in the application");
			reportStep("The element with xpath "+xpath+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not stable in the application");
			reportStep("The element with xpath "+xpath+" is not stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not verified due to an unknown error");
			reportStep("The element with xpath "+xpath+" is not verified due to an unknown error", "fail");
		} 
		
	}

	public void clickById(String id) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).click();
			
		//System.out.println("The element with id "+id+" is Clicked");
			reportStep("The element with id "+id+" is Clicked", "Pass");
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not clickable in the application");
			reportStep("The element with id "+id+" is not clickable in the application", "fail");
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not found in the DOM");
			reportStep("The element with id "+id+" is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not visible in the application");
			reportStep("The element with id "+id+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not interactable in the application");
			reportStep("The element with id "+id+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not stable in the application");
			reportStep("The element with id "+id+" is not stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not clicked due to an unknown error");
			reportStep("The element with id "+id+" is not clicked due to an unknown error", "fail");
		} 
		
	}

	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByClassName(classVal).click();
			//System.out.println("The element with ClassName "+classVal+" is Clicked");
			reportStep("The element with ClassName "+classVal+" is Clicked", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with ClassName "+classVal+" is not found in the DOM");
			reportStep("The element with ClassName "+classVal+" is not found in the DOM", "fail");
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with ClassName "+classVal+" is not clickable in the application");
			reportStep("The element with ClassName "+classVal+" is not clickable in the application", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with ClassName "+classVal+" is not visible in the application");
			reportStep("The element with ClassName "+classVal+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with ClassName "+classVal+" is not interactable in the application");
			reportStep("The element with ClassName "+classVal+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with ClasName "+classVal+" is not stable in the application");
			reportStep("The element with ClasName "+classVal+" is not stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with ClassName "+classVal+" is not clicked due to an unknown error");
			reportStep("The element with ClassName "+classVal+" is not clicked due to an unknown error", "fail");
		} 
		
	}

	public void clickByName(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(name).click();
			//System.out.println("The element with name "+name+" is Clicked");
			reportStep("The element with name "+name+" is Clicked", "Pass");
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with name "+name+" is not clickable in the application");
			reportStep("The element with name "+name+" is not clickable in the application", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not visible in the application");
			reportStep("The element with name "+name+" is not visible in the application", "fail");
		}catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not found in the DOM");
			reportStep("The element with name "+name+" is not found in the DOM", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not interactable in the application");
			reportStep("The element with name "+name+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not stable in the application");
			reportStep("The element with name "+name+" is not stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not clicked due to an unknown error");
			reportStep("The element with name "+name+" is not clicked due to an unknown error", "fail");
		} 
		
	}

	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The element with LinkText "+name+" is Clicked");
			reportStep("The element with LinkText "+name+" is Clicked", "Pass");
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with LinkText "+name+" is not clickable in the application");
			reportStep("The element with LinkText "+name+" is not clickable in the application", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with LinkText "+name+" is not visible in the application");
			reportStep("The element with LinkText "+name+" is not visible in the application", "fail");
		}catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with LinkText "+name+" is not found in the DOM");
			reportStep("The element with LinkText "+name+" is not found in the DOM", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with LinkText "+name+" is not interactable in the application");
			reportStep("The element with LinkText "+name+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with LinkText "+name+" is not stable in the application");
			reportStep("The element with LinkText "+name+" is not stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with LinkText "+name+" is not clicked due to an unknown error");
			reportStep("The element with LinkText "+name+" is not clicked due to an unknown error", "fail");
		} 
		
	}

	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The element with LinkText "+name+" is Clicked");
			reportStep("The element with LinkText "+name+" is Clicked", "Pass");
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with LinkText "+name+" is not clickable in the application");
			reportStep("The element with LinkText "+name+" is not clickable in the application", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with LinkText "+name+" is not visible in the application");
			reportStep("The element with LinkText "+name+" is not visible in the application", "fail");
		}catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with LinkText "+name+" is not found in the DOM");
			reportStep("The element with LinkText "+name+" is not found in the DOM", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with LinkText "+name+" is not interactable in the application");
			reportStep("The element with LinkText "+name+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with LinkText "+name+" is not stable in the application");
			reportStep("The element with LinkText "+name+" is not stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with LinkText "+name+" is not clicked due to an unknown error");
			reportStep("The element with LinkText "+name+" is not clicked due to an unknown error", "fail");
		}
		
	}

	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The element with xpath "+xpathVal+" is Clicked");
			reportStep("The element with xpath "+xpathVal+" is Clicked", "Pass");
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathVal+" is not clickable in the application");
			reportStep("The element with xpath "+xpathVal+" is not clickable in the application", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not visible in the application");
			reportStep("The element with xpath "+xpathVal+" is not visible in the application", "fail");
		}catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not found in the DOM");
			reportStep("The element with xpath "+xpathVal+" is not found in the DOM", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not interactable in the application");
			reportStep("The element with xpath "+xpathVal+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("the element with xpath "+xpathVal+" is not stable in the application");
			reportStep("the element with xpath "+xpathVal+" is not stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not clicked due to an unexpected error");
			reportStep("The element with xpath "+xpathVal+" is not clicked due to an unexpected error", "fail");
		} 
		 
	}

	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The element with xpath "+xpathVal+" is Clicked");
			reportStep("The element with xpath "+xpathVal+" is Clicked", "Pass");
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathVal+" is not clickable in the application");
			reportStep("The element with xpath "+xpathVal+" is not clickable in the application", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not visible in the application");
			reportStep("The element with xpath "+xpathVal+" is not visible in the application", "fail");
		}catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not found in the DOM");
			reportStep("The element with xpath "+xpathVal+" is not found in the DOM", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not interactable in the application");
			reportStep("The element with xpath "+xpathVal+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("the element with xpath "+xpathVal+" is not stable in the application");
			reportStep("the element with xpath "+xpathVal+" is not stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not clicked due to an unexpected error");
			reportStep("The element with xpath "+xpathVal+" is not clicked due to an unexpected error", "fail");
		}
		
	}

	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		String actualText=null;
		try {
			 actualText = driver.findElementById(idVal).getText(); 
			//System.out.println("The element with id "+idVal+"is getting the corresponding text "+actualText);
			 reportStep("The element with id "+idVal+"is getting the corresponding text "+actualText, "Pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+idVal+"is not found in the DOM");
			reportStep("The element with id "+idVal+"is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idVal+"is not visible in the application");
			reportStep("The element with id "+idVal+"is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("the element with id "+idVal+"is not interactable in the application");
			reportStep("the element with id "+idVal+"is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idVal+"is not stable in the application");
			reportStep("The element with id "+idVal+"is not stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idVal+"is not getting the corresponding text due to unknown error");
			reportStep("The element with id "+idVal+"is not getting the corresponding text due to unknown error", "fail");
		} 
		
		return actualText;
	}

	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		String actualText = null;
		try {
			actualText = driver.findElementByXPath(xpathVal).getText();
			//System.out.println("The element with xpath "+xpathVal+"is getting the corresponding text");
			reportStep("The element with xpath "+xpathVal+"is getting the corresponding text", "Pass");
		} catch (NoSuchElementException  e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathVal+"is not found in the DOM");
			reportStep("The element with xpath "+xpathVal+"is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+"is not visible in the application");
			reportStep("The element with xpath "+xpathVal+"is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+"is not interactable in the application");
			reportStep("The element with xpath "+xpathVal+"is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+"is not stable in the application");
			reportStep("The element with xpath "+xpathVal+"is not stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+"is not getting the corresponding text due to unknown error");
			reportStep("The element with xpath "+xpathVal+"is not getting the corresponding text due to unknown error", "fail");
		} finally {
			takeSnap();
		}
		
		return actualText;
	}

	public void selectVisibleTextById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement visibletext = driver.findElementById(id);
			Select sel = new Select(visibletext);
			sel.selectByVisibleText(value);
			//System.out.println("The element with id "+id+"is selected by the visible text "+value);
			reportStep("The element with id "+id+"is selected by the visible text "+value, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+"is not found in the DOM");
			reportStep("The element with id "+id+"is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+"is not visible in the application");
			reportStep("The element with id "+id+"is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+"is not interactable in the application");
			reportStep("The element with id "+id+"is not interactable in the application", "fail");
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.out.println("The element with id "+id+"is not selected using the visible text"+value+" since it is disabled");
			reportStep("The element with id "+id+"is not selected using the visible text"+value+" since it is disabled", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+"is not stable in the application");
			reportStep("The element with id "+id+"is not stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+"is not selected by the visible text"+value+" due to unknown error");
			reportStep("The element with id "+id+"is not selected by the visible text"+value+" due to unknown error", "fail");
		} 
	}

	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement index = driver.findElementById(id);
			Select sele = new Select(index);
			sele.selectByIndex(value);
			//System.out.println("The element with id "+id+"is selected by the corresponding index value"+value);
			reportStep("The element with id "+id+"is selected by the corresponding index value"+value, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+"is not found in the DOM");
			reportStep("The element with id "+id+"is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+"is not visible in the application");
			reportStep("The element with id "+id+"is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+"is not interactable in the application");
			reportStep("The element with id "+id+"is not interactable in the application", "fail");
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+"is not selectable using the index value "+value+"since it is diabled");
			reportStep("The element with id "+id+"is not selectable using the index value "+value+"since it is diabled", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+"is not stable in the application");
			reportStep("The element with id "+id+"is not stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+"is not selectable using index value "+value+"due to unknown error");
			reportStep("The element with id "+id+"is not selectable using index value "+value+"due to unknown error", "fail");
		} 
		
	}

	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> allwinids = driver.getWindowHandles();
			for(String eachid:allwinids) {
				driver.switchTo().window(eachid);
				break;
			}
			//System.out.println("The control is now moved to Parent window");
			reportStep("The control is now moved to Parent window", "Pass");
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			//System.err.println("The control cannot be moved to parent window since there is no such window found");
			reportStep("The control cannot be moved to parent window since there is no such window found", "fail");
		} catch (SessionNotCreatedException e) {
			// TODO: handle exception
			//System.err.println("The control cannot be moved to parent window, since Session id is not created for that window");
			reportStep("The control cannot be moved to parent window, since Session id is not created for that window", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The control cannot be moved to parent window due to unknown error");
			reportStep("The control cannot be moved to parent window due to unknown error", "fail");
		} 
		
	}

	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> allwinid = driver.getWindowHandles();
			for(String eachid:allwinid) {
				driver.switchTo().window(eachid);
			}
			//System.out.println("The control is now moved to the last window");
			reportStep("The control is now moved to the last window", "Pass");
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			//System.err.println("The control cannot be movwd to last window since there is no such window found");
			reportStep("The control cannot be movwd to last window since there is no such window found", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The control cannot be moved to last window due to unknown error");
			reportStep("The control cannot be moved to last window due to unknown error", "fail");
		} 
		
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().accept();
			//System.out.println("The opened alert is accepted in the application");
			reportStep("The opened alert is accepted in the application", "Pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("There is no alert present in the application to accept ");
			reportStep("There is no alert present in the application to accept ", "fail");
		} catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The alert cannot be accepted because of some unexpected error occurred in the application");
			reportStep("The alert cannot be accepted because of some unexpected error occurred in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The opened alert is not accepted in the application due to unknown error");
			reportStep("The opened alert is not accepted in the application due to unknown error", "fail");
		} 
		
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().dismiss();
			//System.out.println("The opened alert is dismissed in the application");
			reportStep("The opened alert is dismissed in the application", "Pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("There is no alert present in the application to dismiss");
			reportStep("There is no alert present in the application to dismiss", "fail");
		} catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The alert cannot be dismissed due to some unexpected error occurred in the application");
			reportStep("The alert cannot be dismissed due to some unexpected error occurred in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The opened alert cannot be dismissed in the application due to unknown error");
			reportStep("The opened alert cannot be dismissed in the application due to unknown error", "fail");
		} 
		
		
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		
		String actualText = null;
		try {
			actualText = driver.switchTo().alert().getText();
			//System.out.println("The text from the alert "+actualText+" has been captured");
			reportStep("The text from the alert "+actualText+" has been captured", "Pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("There is no alert in the application to gettext");
			reportStep("There is no alert in the application to gettext", "fail");
		} catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The alert text cannot be captured due to some unexpected error in the application");
			reportStep("The alert text cannot be captured due to some unexpected error in the application", "fail");
		} catch (WebDriverException e) {
			//System.err.println("The alert text cannot be captured due to an unknown error");
			reportStep("The alert text cannot be captured due to an unknown error", "fail");
			// TODO: handle exception
		}
		
		return actualText;
	}

	public long takeSnap() {
		// TODO Auto-generated method stub
		
		long number =0;
		try {
			
			
			number = (long) (Math.floor(Math.random()*100000000)+100000);
			
			File tmp = driver.getScreenshotAs(OutputType.FILE);
			File dest = new File("./reports/screenshots/"+number+".png");
			FileUtils.copyFile(tmp, dest);
		
			//System.out.println("Snapshot of the browser is taken for the application");
			//reportStep("Snapshot of the browser is taken for the application", "Pass");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("Unable to take snapshot of the browser due to unknown error");
			//reportStep("Unable to take snapshot of the browser due to unknown error", "fail");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//System.err.println("Unable to take snapshot of the browser due to IO invalid");
		//	reportStep("Unable to take snapshot of the browser due to IO invalid", "fail");
		}
		
		return number;
		
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.close();
			//System.out.println("The current opened window of the browser is closed successfully");
			reportStep("The current opened window of the browser is closed successfully", "Pass", false);
			// TODO Auto-generated catch block
			//System.err.println("Unable to close the window of the browser since no such window is active");
			reportStep("Unable to close the window of the browser since no such window is active", "fail");
		} catch (SessionNotCreatedException e) {
			// TODO: handle exception
			//System.err.println("Unable to close the active window due to unknown error ");
			reportStep("Unable to close the active window due to unknown error ", "fail");
		} 
		
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try {
			driver.quit();
			//System.out.println("All the opned browsers of the application are closed successfully");
			reportStep("All the opned browsers of the application are closed successfully", "Pass", false);
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			//System.err.println("Unable to close the browsers since there is no such window opened");
			reportStep("Unable to close the browsers since there is no such window opened", "fail");
		} catch (SessionNotCreatedException e) {
			// TODO: handle exception
			//System.err.println("Unable to close the browsers since the session id's are not created");
			reportStep("Unable to close the browsers since the session id's are not created", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Unable to close the browsers due to unknown error");
			reportStep("Unable to close the browsers due to unknown error", "fail");
		} 
	}

	public void waitProperty(long time) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(time);
			//System.out.println("The execution waited for "+time+"ms");
			reportStep("The execution waited for "+time+"ms", "Pass");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("Error occurred during wait");
			reportStep("Error occurred during wait", "fail");
		}
		
	}

	public void selectValueByXpath(String xpathVal, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement valuexpath = driver.findElementByXPath(xpathVal);
			Select selxv = new Select(valuexpath);
			selxv.selectByValue(value);
			//System.out.println("The element with xpath "+xpathVal+"is selected by the value "+value);
			reportStep("The element with xpath "+xpathVal+"is selected by the value "+value, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathVal+"is not found in the DOM");
			reportStep("The element with xpath "+xpathVal+"is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+"is not visible in the application");
			reportStep("The element with xpath "+xpathVal+"is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+"is not interactable in the application");
			reportStep("The element with xpath "+xpathVal+"is not interactable in the application", "fail");
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.out.println("The element with xpath "+xpathVal+"is not selected using the value"+value+" since it is disabled");
			reportStep("The element with xpath "+xpathVal+"is not selected using the value"+value+" since it is disabled", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+"is not stable in the application");
			reportStep("The element with xpath "+xpathVal+"is not stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+"is not selected by the value"+value+" due to unknown error");
			reportStep("The element with xpath "+xpathVal+"is not selected by the value"+value+" due to unknown error", "fail");
		} 
	}

	public void selectVisibleTextByXpath(String xpathVal, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement visxpath = driver.findElementByXPath(xpathVal);
			Select selxvt = new Select(visxpath);
			selxvt.selectByVisibleText(value);
			//System.out.println("The element with xpath "+xpathVal+"is selected by the visible text "+value);
			reportStep("The element with xpath "+xpathVal+"is selected by the visible text "+value, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathVal+"is not found in the DOM");
			reportStep("The element with xpath "+xpathVal+"is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+"is not visible in the application");
			reportStep("The element with xpath "+xpathVal+"is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+"is not interactable in the application");
			reportStep("The element with xpath "+xpathVal+"is not interactable in the application", "fail");
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.out.println("The element with xpath "+xpathVal+"is not selected using the visible text"+value+" since it is disabled");
			reportStep("The element with xpath "+xpathVal+"is not selected using the visible text"+value+" since it is disabled", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+"is not stable in the application");
			reportStep("The element with xpath "+xpathVal+"is not stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+"is not selected by the visible text"+value+" due to unknown error");
			reportStep("The element with xpath "+xpathVal+"is not selected by the visible text"+value+" due to unknown error", "fail");
		} 
		
	}

	public void selectIndexByXpath(String xpathVal, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement indexx = driver.findElementByXPath(xpathVal);
			Select selix = new Select(indexx);
			selix.selectByIndex(value);
			//System.out.println("The element with xpath "+xpathVal+"is selected by the corresponding index value"+value);
			reportStep("The element with xpath "+xpathVal+"is selected by the corresponding index value"+value, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathVal+"is not found in the DOM");
			reportStep("The element with xpath "+xpathVal+"is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+"is not visible in the application");
			reportStep("The element with xpath "+xpathVal+"is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+"is not interactable in the application");
			reportStep("The element with xpath "+xpathVal+"is not interactable in the application", "fail");
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+"is not selectable using the index value "+value+"since it is diabled");
			reportStep("The element with xpath "+xpathVal+"is not selectable using the index value "+value+"since it is diabled", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+"is not stable in the application");
			reportStep("The element with xpath "+xpathVal+"is not stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+"is not selectable using index value "+value+"due to unknown error");
			reportStep("The element with xpath "+xpathVal+"is not selectable using index value "+value+"due to unknown error", "fail");
		} 
	}

	public void enterByXpathKeys(String xpathVal, Keys keyval) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).sendKeys(keyval);
			//System.out.println("The element with xpath "+xpathVal+" is performed with action "+keyval);
			reportStep("The element with xpath "+xpathVal+" is performed with action "+keyval, "Pass");
		} catch (NoSuchElementException e) {
			//System.err.println("The element with xpath "+xpathVal+" is not found in the DOM");
			reportStep("The element with xpath "+xpathVal+" is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The element with xpath "+xpathVal+" is not visible in the application");
			reportStep("The element with xpath "+xpathVal+" is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The element with xpath "+xpathVal+" is not interactable in the application");
			reportStep("The element with xpath "+xpathVal+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with xpath "+xpathVal+" is not stable in the application");
			reportStep("The element with xpath "+xpathVal+" is not stable in the application", "fail");
		} catch(WebDriverException e) {
			//System.err.println("The element with xpath "+xpathVal+" is not not performed with action "+keyval+"due to unknown error");
			reportStep("The element with xpath "+xpathVal+" is not not performed with action "+keyval+"due to unknown error", "fail");
		} 
		
	}

	public void selectValueByClassName(String name, String classVal) {
		// TODO Auto-generated method stub
		try {
			WebElement clsval = driver.findElementByClassName(name);
			Select selcv = new Select(clsval);
			selcv.selectByValue(classVal);
			//System.out.println("The element with classname "+name+"is selected by the value "+classVal);
			reportStep("The element with classname "+name+"is selected by the value "+classVal, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with classname "+name+"is not found in the DOM");
			reportStep("The element with classname "+name+"is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with classname "+name+"is not visible in the application");
			reportStep("The element with classname "+name+"is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with classname "+name+"is not interactable in the application");
			reportStep("The element with classname "+name+"is not interactable in the application", "fail");
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.out.println("The element with classname "+name+"is not selected using the value"+classVal+" since it is disabled");
			reportStep("The element with classname "+name+"is not selected using the value"+classVal+" since it is disabled", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with classname "+name+"is not stable in the application");
			reportStep("The element with classname "+name+"is not stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with classname "+name+"is not selected by the value"+classVal+" due to unknown error");
			reportStep("The element with classname "+name+"is not selected by the value"+classVal+" due to unknown error", "fail");
		} 
		
	}

	public void selectValueById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement idval = driver.findElementById(id);
			Select seliv = new Select(idval);
			seliv.selectByValue(value);
			//System.out.println("The element with id "+id+"is selected by the value "+value);
			reportStep("The element with id "+id+"is selected by the value "+value, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+"is not found in the DOM");
			reportStep("The element with id "+id+"is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+"is not visible in the application");
			reportStep("The element with id "+id+"is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+"is not interactable in the application");
			reportStep("The element with id "+id+"is not interactable in the application", "fail");
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.out.println("The element with id "+id+"is not selected using the value"+value+" since it is disabled");
			reportStep("The element with id "+id+"is not selected using the value"+value+" since it is disabled", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with classname "+id+"is not stable in the application");
			reportStep("The element with classname "+id+"is not stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with classname "+id+"is not selected by the value"+value+" due to unknown error");
			reportStep("The element with classname "+id+"is not selected by the value"+value+" due to unknown error", "fail");
		} 
	}

	public void enterByIdTxtKeys(String id, String val, Keys keyval) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).sendKeys(val,keyval);
			//System.out.println("The element with id "+id+" is entered with data "+val+" and performed with action "+keyval);
			reportStep("The element with id "+id+" is entered with data "+val+" and performed with action "+keyval, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not found in the DOM");
			reportStep("The element with id "+id+" is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The element with id "+id+" is not visible in the application");
			reportStep("The element with id "+id+" is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The element with id "+id+" is not interactable in the application");
			reportStep("The element with id "+id+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with id "+id+" is not stable in the application");
			reportStep("The element with id "+id+" is not stable in the application", "fail");
		} catch (WebDriverException e) {
			//System.err.println("The element with id "+id+" is not entered with data "+val+" or the key action"+keyval+ "is not performed due to unknown error");
			reportStep("The element with id "+id+" is not entered with data "+val+" or the key action"+keyval+ "is not performed due to unknown error", "fail");
		} 
		
	}

	public void selectValueByName(String name, String namval) {
		// TODO Auto-generated method stub
		try {
			WebElement nmval = driver.findElementByName(name);
			Select selnv = new Select(nmval);
			selnv.selectByValue(namval);
			//System.out.println("The element with name "+name+"is selected by the value "+namval);
			reportStep("The element with name "+name+"is selected by the value "+namval, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with name "+name+"is not found in the DOM");
			reportStep("The element with name "+name+"is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+"is not visible in the application");
			reportStep("The element with name "+name+"is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+"is not interactable in the application");
			reportStep("The element with name "+name+"is not interactable in the application", "fail");
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.out.println("The element with classname "+name+"is not selected using the value"+namval+" since it is disabled");
			reportStep("The element with classname "+name+"is not selected using the value"+namval+" since it is disabled", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with classname "+name+"is not stable in the application");
			reportStep("The element with classname "+name+"is not stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+"is not selected by the value"+namval+" due to unknown error");
			reportStep("The element with name "+name+"is not selected by the value"+namval+" due to unknown error", "fail");
		} 
		
	}

	public void switchToFrame(int indval) {
		// TODO Auto-generated method stub
		
		try {
			driver.switchTo().frame(indval);
			//System.out.println("The pointer is switched to the frame with value"+indval);
			reportStep("The pointer is switched to the frame with value"+indval, "Pass");
		} catch (NoSuchFrameException e) {
			// TODO Auto-generated catch block
			//System.err.println("The frame with value"+indval+" is not found in the DOM");
			reportStep("The frame with value"+indval+" is not found in the DOM", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Couldn't locate the frame with value "+indval+"due to some unknown error");
			reportStep("Couldn't locate the frame with value "+indval+"due to some unknown error", "fail");
		}
		
	}

	public void switchToFrame(String strval) {
		// TODO Auto-generated method stub
		
		try {
			driver.switchTo().frame(strval);
			//System.out.println("The pointer is switched to the frame with string"+strval);
			reportStep("The pointer is switched to the frame with string"+strval, "Pass");
		} catch (NoSuchFrameException e) {
			// TODO Auto-generated catch block
			//System.err.println("The frame with string"+strval+" is not found in the DOM");
			reportStep("The frame with string"+strval+" is not found in the DOM", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Couldn't locate the frame with string "+strval+"due to some unknown error");
			reportStep("Couldn't locate the frame with string "+strval+"due to some unknown error", "fail");
		}
		
		
	}

	public void switchToFrame(WebElement webval) {
		// TODO Auto-generated method stub
		
		try {
			driver.switchTo().frame(webval);
			//System.out.println("The pointer is switched to the frame with webelement"+webval);
			reportStep("The pointer is switched to the frame with webelement"+webval, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with element "+webval+"is not found in the DOM");
			reportStep("The element with element "+webval+"is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with element "+webval+"is not visible in the application");
			reportStep("The element with element "+webval+"is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with element "+webval+"is not interactable in the application");
			reportStep("The element with element "+webval+"is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with element "+webval+"is not stable in the application");
			reportStep("The element with element "+webval+"is not stable in the application", "fail");
		} catch (NoSuchFrameException e) {
			// TODO Auto-generated catch block
			//System.err.println("The frame with web element"+webval+" is not found in the DOM");
			reportStep("The frame with web element"+webval+" is not found in the DOM", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Couldn't locate the web element with value "+webval+"due to some unknown error");
			reportStep("Couldn't locate the web element with value "+webval+"due to some unknown error", "fail");
		}
		
		
	}

	public void switchToDefaultCont() {
		// TODO Auto-generated method stub
		
		try {
			driver.switchTo().defaultContent();
			//System.out.println("The pointer is now switched to the main/default frame");
			reportStep("The pointer is now switched to the main/default frame", "Pass");
		} catch (NoSuchFrameException e) {
			// TODO Auto-generated catch block
			//System.err.println("The default frame is not found in the DOM");
			reportStep("The default frame is not found in the DOM", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Couldn't switch to default frame due to some unknown error");
			reportStep("Couldn't switch to default frame due to some unknown error", "fail");
		}
		
	}

	public String getAlertTextReturnVal() {
		// TODO Auto-generated method stub
		String text = null;
		try {
			text = driver.switchTo().alert().getText();
			//System.out.println("The alert text "+text+" has been captured");
			reportStep("The alert text "+text+" has been captured", "Pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("There is no alert in the application to gettext");
			reportStep("There is no alert in the application to gettext", "fail");
		} catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The alert text cannot be captured due to some unexpected error in the application");
			reportStep("The alert text cannot be captured due to some unexpected error in the application", "fail");
		} catch (WebDriverException e) {
			//System.err.println("The alert text cannot be captured due to an unknown error");
			reportStep("The alert text cannot be captured due to an unknown error", "fail");
			// TODO: handle exception
		}
		return text;
	}

	public void refresh() {
		// TODO Auto-generated method stub
		
		try {
			driver.navigate().refresh();
			//System.out.println("The page has been refreshed successfully");
			reportStep("The page has been refreshed successfully", "Pass");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The page cannot be refreshed due to some unknown error");
			reportStep("The page cannot be refreshed due to some unknown error", "fail");
		}
		
	}

	public void InputAlertText(String data) {
		// TODO Auto-generated method stub
		
		try {
			driver.switchTo().alert().sendKeys(data);
			//System.out.println("The opened alert is entered with data"+data);
			reportStep("The opened alert is entered with data"+data, "Pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("There is no alert present in the application to accept ");
			reportStep("There is no alert present in the application to accept ", "fail");
		} catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The alert cannot be accepted because of some unexpected error occurred in the application");
			reportStep("The alert cannot be accepted because of some unexpected error occurred in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The opened alert is not entered with given input due to unknown error");
			reportStep("The opened alert is not entered with given input due to unknown error", "fail");
		} 
	}

	public void verifyTextContainsById(String id, String text) {
		// TODO Auto-generated method stub
		
		try {
			String actualText = driver.findElementById(id).getText();
			if(actualText.contains(text)) {
				//System.out.println("The element with id "+id+" holding the text "+actualText+" contains the text "+text);
				reportStep("The element with id "+id+" holding the text "+actualText+" contains the text "+text, "Pass");
			} else {
				//System.err.println("The element with id "+id+" holding the text "+actualText+" does not contains the text "+text);
				reportStep("The element with id "+id+" holding the text "+actualText+" does not contains the text "+text, "fail");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not found in the DOM");
			reportStep("The element with id "+id+" is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not visible in the application");
			reportStep("The element with id "+id+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not interactable in the application");
			reportStep("The element with id "+id+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not stable in the application");
			reportStep("The element with id "+id+" is not stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not verified due to an unknown error");
			reportStep("The element with id "+id+" is not verified due to an unknown error", "fail");
		} 
		
		
	}

	public void verifyNoTextContainsById(String id, String text) {
		// TODO Auto-generated method stub
		
		try {
			String actualText = driver.findElementById(id).getText();
			if(!actualText.contains(text)) {
				//System.out.println("The element with id "+id+" holding the text "+actualText+" does not contain the text "+text);
				reportStep("The element with id "+id+" holding the text "+actualText+" does not contain the text "+text, "Pass");
			} else {
				//System.err.println("The element with id "+id+" holding the text "+actualText+"  contains the text "+text);
				reportStep("The element with id "+id+" holding the text "+actualText+"  contains the text "+text, "fail");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not found in the DOM");
			reportStep("The element with id "+id+" is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not visible in the application");
			reportStep("The element with id "+id+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not interactable in the application");
			reportStep("The element with id "+id+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not stable in the application");
			reportStep("The element with id "+id+" is not stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not verified due to an unknown error");
			reportStep("The element with id "+id+" is not verified due to an unknown error", "fail");
		} 
		
	}

	public void enterByXpathTxtKeys(String xpath, String val, Keys keyval) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByXPath(xpath).sendKeys(val,keyval);
			//System.out.println("The element with xpath "+xpath+" is entered with data "+val+" and performed with action "+keyval);
			reportStep("The element with xpath "+xpath+" is entered with data "+val+" and performed with action "+keyval, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpath+" is not found in the DOM");
			reportStep("The element with xpath "+xpath+" is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The element with xpath "+xpath+" is not visible in the application");
			reportStep("The element with xpath "+xpath+" is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The element with xpath "+xpath+" is not interactable in the application");
			reportStep("The element with xpath "+xpath+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with xpath "+xpath+" is not stable in the application");
			reportStep("The element with xpath "+xpath+" is not stable in the application", "fail");
		} catch (WebDriverException e) {
			//System.err.println("The element with xpath "+xpath+" is not entered with data "+val+" or the key action"+keyval+ "is not performed due to unknown error");
			reportStep("The element with xpath "+xpath+" is not entered with data "+val+" or the key action"+keyval+ "is not performed due to unknown error", "fail");
		}
	}
	
	public void clickByXpathTxtKeys(String xpath, Keys keyval) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByXPath(xpath).sendKeys(keyval);
			//System.out.println("The element with xpath "+xpath+" is entered with data "+val+" and performed with action "+keyval);
			reportStep("The element with xpath "+xpath+" is entered with data and performed with action "+keyval, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpath+" is not found in the DOM");
			reportStep("The element with xpath "+xpath+" is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The element with xpath "+xpath+" is not visible in the application");
			reportStep("The element with xpath "+xpath+" is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The element with xpath "+xpath+" is not interactable in the application");
			reportStep("The element with xpath "+xpath+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with xpath "+xpath+" is not stable in the application");
			reportStep("The element with xpath "+xpath+" is not stable in the application", "fail");
		} catch (WebDriverException e) {
			//System.err.println("The element with xpath "+xpath+" is not entered with data "+val+" or the key action"+keyval+ "is not performed due to unknown error");
			reportStep("The element with xpath "+xpath+" is not entered with data or the key action"+keyval+ "is not performed due to unknown error", "fail");
		}
	}

	public void enterByClassName(String className, String data) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByClassName(className).sendKeys(data);
			//System.out.println("The element with className "+className+" is entered with data "+data);
			reportStep("The element with className "+className+" is entered with data "+data, "Pass");
		} catch (NoSuchElementException e) {
			//System.err.println("The element with className "+className+" is not found in the DOM");
			reportStep("The element with className "+className+" is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The element with className "+className+" is not visible in the application");
			reportStep("The element with className "+className+" is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The element with className "+className+" is not interactable in the application");
			reportStep("The element with className "+className+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with className "+className+" is not stable in the application");
			reportStep("The element with className "+className+" is not stable in the application", "fail");
		} catch (WebDriverException e) {
			//System.err.println("The element with className "+className+" is not entered with data "+data+" due to an unknown error");
			reportStep("The element with className "+className+" is not entered with data "+data+" due to an unknown error", "fail");
		} 
		
	}

	public void mouseHoverByLinkText(String linktext) {
		// TODO Auto-generated method stub
		
		try {
			WebElement target = driver.findElementByLinkText(linktext);
			Actions builder = new Actions(driver);
			builder.moveToElement(target);
			//System.out.println("The mouse is moved to the element which has linktext "+linktext);
			reportStep("The mouse is moved to the element which has linktext "+linktext, "Pass");
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with LinkText "+linktext+" is not clickable in the application");
			reportStep("The element with LinkText "+linktext+" is not clickable in the application", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with LinkText "+linktext+" is not visible in the application");
			reportStep("The element with LinkText "+linktext+" is not visible in the application", "fail");
		}catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with LinkText "+linktext+" is not found in the DOM");
			reportStep("The element with LinkText "+linktext+" is not found in the DOM", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with LinkText "+linktext+" is not interactable in the application");
			reportStep("The element with LinkText "+linktext+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with LinkText "+linktext+" is not stable in the application");
			reportStep("The element with LinkText "+linktext+" is not stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with LinkText "+linktext+" is not clicked due to an unknown error");
			reportStep("The element with LinkText "+linktext+" is not clicked due to an unknown error", "fail");
		} 
		
	}

	public void mouseHoverByXpath(String xpath) {
		// TODO Auto-generated method stub
		
		try {
			WebElement target = driver.findElementByXPath(xpath);
			Actions builder = new Actions(driver);
			builder.moveToElement(target).perform();
			//System.out.println("The mouse is moved to the element which has xpath "+xpath);
			reportStep("The mouse is moved to the element which has xpath "+xpath, "Pass");
		} catch (NoSuchElementException e) {
			//System.err.println("The element with xpath "+xpath+" is not found in the DOM");
			reportStep("The element with xpath "+xpath+" is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The element with xpath "+xpath+" is not visible in the application");
			reportStep("The element with xpath "+xpath+" is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The element with xpath "+xpath+" is not interactable in the application");
			reportStep("The element with xpath "+xpath+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with xpath "+xpath+" is not stable in the application");
			reportStep("The element with xpath "+xpath+" is not stable in the application", "fail");
		} catch(WebDriverException e) {
			//System.err.println("The element with xpath "+xpath+" is not found due to an unknown error");
			reportStep("The element with xpath "+xpath+" is not found due to an unknown error", "fail");
		} 
	}

	public void Refresh() {
		// TODO Auto-generated method stub
		
	}

	
	}


	

	
