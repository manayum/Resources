package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;
public class LogInPage extends BaseClass {
	 
    private static WebElement element = null;

 public LogInPage(WebDriver driver){

     	super(driver);

 }     

 public static WebElement txtbx_UserName() throws Exception{

 	try{

         element = driver.findElement(By.id("log"));

         Log.info("Username text box is found on the Login Page");

 	}catch (Exception e){

    		Log.error("UserName text box is not found on the Login Page");

    		throw(e);

    		}

    	return element;

     }

 public static WebElement txtbx_Password() throws Exception{

 	try{

     	element = driver.findElement(By.id("pwd"));

         Log.info("Password text box is found on the Login page");

 	}catch (Exception e){

 		Log.error("Password text box is not found on the Login Page");

    		throw(e);

    		}

    	return element;

 }

 public static WebElement btn_LogIn() throws Exception{

 	try{

     	element = driver.findElement(By.id("login"));

         Log.info("Submit button is found on the Login page");

 	}catch (Exception e){

 		Log.error("Submit button is not found on the Login Page");

    		throw(e);

    		}

    	return element;

 }

}