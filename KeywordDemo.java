package com.udemy;

import java.io.File;
import java.util.HashMap;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KeywordDemo
{
 
	@BeforeMethod
	public static WebDriver open_browser(String browser_type)
	{
		WebDriver driver = null;
		if(browser_type.equalsIgnoreCase("IE"))
		{
			driver = new InternetExplorerDriver();
		}
		if(browser_type.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		if(browser_type.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
			
		}
		return driver;		
	}
	
	public static void navigate_to(WebDriver driver, String url)
	{
		driver.get(url);	
	}
	
	public static void send_Keys(WebDriver driver, String locator, String locString,String data)
	{
		switch(locator)
		{
			case "xpath"	: driver.findElement(By.xpath(locString)).clear();driver.findElement(By.xpath(locString)).sendKeys(data);break;
			case "name"		: driver.findElement(By.name(locString)).clear(); driver.findElement(By.name(locString)).sendKeys(data); break;
			case "id"		: driver.findElement(By.id(locString)).clear(); driver.findElement(By.id(locString)).sendKeys(data); break;
		}
		
	}
	
	public static void click_element(WebDriver driver,String locator, String locString)
	{
		switch(locator)
		{
			case "xpath"	: driver.findElement(By.xpath(locString)).click();  break;
			case "name"		: driver.findElement(By.name(locString)).click(); break;
			case "id"		: driver.findElement(By.id(locString)).clear(); break;
		}
	}
	
	public void verify_element(WebDriver driver, String locator, String locString)
	{
		WebDriverWait wait = null;
		switch(locator)
		{
			case "xpath"	: wait = new WebDriverWait(driver,60); wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locString)));break;
			case "name"		: wait = new WebDriverWait(driver,60); wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(locString)));break;
			case "id"		: wait = new WebDriverWait(driver, 60); wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locString)));break;
		}
	}
	
	public static String store_text(WebDriver driver, String locator, String locString)
	{
		String v_text=null;
		switch(locator)
		{
		case "xpath"	: v_text = driver.findElement(By.xpath(locString)).getText();
		case "name"		: v_text = driver.findElement(By.name(locString)).getText();
		case "id"		: v_text = driver.findElement(By.id(locString)).getText();
		
		}
		return v_text;
	}
	
	public static String[][] excelRead() throws Exception
	{
		File excel = new File("C:\\dir\\excel file");
		FileInputStream fis = new FileInputStream(excel);
		HSSFWorkbook wb = new HSSFWorkboo(fis);
		HSSFWorksheet ws = wb.getSheet("Input");
		
		int rowNum = ws.getLastRowNum()+1;
		int colNum = ws.getRow(0).getLastCellNum();
		
		String [][] data = new String [rowNum][colNum];
		
		for(int i =0; i<rowNum; i++)
		{
			HSSFRow row =  ws.getRow(i);
			for(int j=0; j<colNum; j++)
			{
				HSSFCell cell = row.getCell(j);
				String value = cellToString(cell);
				data[i][j] = value;
			}
			
		}
		return data;
		
	}
	
	
	public static String cellToString(HSSFCell cell)
	{
		
		int type;
		Object result;
		type = cell.getCellType();
		switch(type)
		{
			case 0	: result = cell.getNumericCellValue();break;
			case 1	: result = cell.getStringCellValue();break;
			case 2	: result = "_"; break;
			default : throw new RuntimeException("There are no support for this type of cell");
		
		}
		return result.toString();
	}
		
	@Test
	public void testOrbitz()
	{
		String [][] steps;
		HashMap<K, V> map = new HashMap();
		String itin;
		steps = excelRead(Strng sheet);
		double price;
		WebDriver driver = null;
		for(int i =1;1<steps.length;i++)
		{
			if(steps[i][0].equalsIgnoreCase("Y"))
				switch(steps[i][4])
				{
				case "open_browser"	:
					open_browser(steps[i][7]);break; 
					
				case "navigate_to"	:	
					navigate_to(driver,steps[i][7]);break;
					
				case "click_element":
					click_element(driver,steps[i][5],steps[i][6]);break;
					
				case "send_keys"	: 
					send_Keys(driver,steps[i][5],steps[i][6],steps[i][7]);break;
					
				case "verify_element":
					verify_element(driver, steps[i][5],steps[i][6]);break;
					
				case "store_text"	: 
					String sprice = store_text(driver,steps[i][5],steps[i][6]);
					price = Double.parseDouble(sprice.replaceAll("total", "").replaceAll("\n", "").replaceAll("per person", "").replaceAll("$", "").replaceAll(",", ""));
					itin = steps[i][1];
					System.out.println(itin + price);
					map.put(price, itin);
					break;
					
				case "close_browser"	: close_browser(driver);break;
					
				}
			
		}
		
		
	}
	
	@AfterMethod
	public static void close_browser(WebDriver driver)
	{
		driver.close();
	}
}