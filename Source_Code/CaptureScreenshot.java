How to capture Screenshot in Selenium Webdriver

import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;

public class ScreenshootGoogle {

 @Test
 public void TestJavaS1()
{
// Open Firefox
 WebDriver driver=new FirefoxDriver();

// Maximize the window
driver.manage().window().maximize();

// Pass the url
driver.get("http://www.google.com");

// Take screenshot and store as a file format
File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
try {
 // now copy the  screenshot to desired location using copyFile //method
FileUtils.copyFile(src, new File("C:/selenium/error.png"));
}

catch (IOException e)
 {
  System.out.println(e.getMessage());

 }
 }


import java.io.File;
 
import java.io.IOException;
 
import org.apache.commons.io.FileUtils;
 
import org.openqa.selenium.OutputType;
 
import org.openqa.selenium.TakesScreenshot;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.firefox.FirefoxDriver;
 
import org.testng.annotations.Test;
 
public class ScreenshootGoogle {
 
 @Test
 public void TestJavaS1()
{
// Open Firefox
 WebDriver driver=new FirefoxDriver();
 
// Maximize the window
driver.manage().window().maximize();
 
// Pass the url
driver.get("http://www.google.com");
 
// Take screenshot and store as a file format
File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
try {
 // now copy the  screenshot to desired location using copyFile //method
FileUtils.copyFile(src, new File("C:/selenium/error.png"));
}
 
catch (IOException e)
 {
  System.out.println(e.getMessage());
 
 }
 }


Example-

 public static void captureScreenShot(WebDriver ldriver){

  // Take screenshot and store as a file format
  File src= ((TakesScreenshot)ldriver).getScreenshotAs(OutputType.FILE);
try {
  // now copy the  screenshot to desired location using copyFile method

 FileUtils.copyFile(src, new File("C:/selenium/"+System.currentTimeMillis()+".png"));
       }

catch (IOException e)

{

System.out.println(e.getMessage());

    }

}

 public static void captureScreenShot(WebDriver ldriver){
 
  // Take screenshot and store as a file format
  File src= ((TakesScreenshot)ldriver).getScreenshotAs(OutputType.FILE);
try {
  // now copy the  screenshot to desired location using copyFile method
 
 FileUtils.copyFile(src, new File("C:/selenium/"+System.currentTimeMillis()+".png"));
       }
 
catch (IOException e)
 
{
 
System.out.println(e.getMessage());
 
    }
 
}

package com.bog.htmldemo;
 

import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;

public class ScreenshootGoogle {

@Test
public void TestJavaS1(){

 // Open Firefox
 WebDriver driver=new FirefoxDriver();

// call method
                        ScreenshootGoogle.captureScreenShot(driver);

// Maximize the window
driver.manage().window().maximize();
                        ScreenshootGoogle.captureScreenShot(driver);

// Pass the url
driver.get("http://www.google.com");
                  ScreenshootGoogle.captureScreenShot(driver);

  }

public static void captureScreenShot(WebDriver ldriver){
// Take screenshot and store as a file format             
 File src=((TakesScreenshot)ldriver).getScreenshotAs(OutputType.FILE);           
try {
// now copy the  screenshot to desired location using copyFile method

FileUtils.copyFile(src, new File("C:/selenium/"+System.currentTimeMillis()+".png"));                              } catch (IOException e)

{
  System.out.println(e.getMessage()) 
 }
  }

}


import java.io.File;
 
import java.io.IOException;
 
import org.apache.commons.io.FileUtils;
 
import org.openqa.selenium.OutputType;
 
import org.openqa.selenium.TakesScreenshot;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.firefox.FirefoxDriver;
 
import org.testng.annotations.Test;
 
public class ScreenshootGoogle {
 
@Test
public void TestJavaS1(){
 
 // Open Firefox
 WebDriver driver=new FirefoxDriver();
 
// call method
                        ScreenshootGoogle.captureScreenShot(driver);
 
// Maximize the window
driver.manage().window().maximize();
                        ScreenshootGoogle.captureScreenShot(driver);
 
// Pass the url
driver.get("http://www.google.com");
                  ScreenshootGoogle.captureScreenShot(driver);
 
  }
 
public static void captureScreenShot(WebDriver ldriver){
// Take screenshot and store as a file format             
 File src=((TakesScreenshot)ldriver).getScreenshotAs(OutputType.FILE);           
try {
// now copy the  screenshot to desired location using copyFile method
 
FileUtils.copyFile(src, new File("C:/selenium/"+System.currentTimeMillis()+".png")); 
                         
  } catch (IOException e)
 
{
  System.out.println(e.getMessage()) 
 }
  }
 
}