package app_modules;

import page_object.HomePage;

import page_object.ProductListingPage;

import utility.Constant;

import utility.ExcelUtils;

import utility.Log;

// This is called Modularization, when we club series of actions in to one Module

// For Modular Driven Framework, please see http://toolsqa.com/selenium-webdriver/modular-driven/ 

public class ProductSelectAction {

	// iTestcaseRow is the row number of our Testcase name in the Test Data sheet

	// iTestcaseRow is passed as an Argument to this method, so that it can used inside this method

	// For use of Functions &amp; Parameters, please see http://toolsqa.com/selenium-webdriver/function-parameters/

	public static void productType(int iTestCaseRow) throws Exception{

		try{

        	// iTestcaseRow is the row number of our Testcase name in the Test Data sheet

        	// Constant.Col_ProductType is the column number for Product Type column in the Test Data sheet

        	// Please see the Constant class in the Utility Package

        	// For Use of Constant Variables, please see http://toolsqa.com/selenium-webdriver/constant-variables/

			// If condition will check that if the Excel value for the Product Type is Accessories, then do this

			if("Accessories".equals(ExcelUtils.getCellData(iTestCaseRow, Constant.ColProductType))){

				// Selecting the link Accessories from Home Page under Top Navigation

				// This is call Page Object Model (POM)

	        	// For use of POM, please see http://toolsqa.com/selenium-webdriver/page-object-model/

				HomePage.TopNavigation.Product_Type.Accessories();

	            // Printing the logs

				Log.info("Product Type Accessories is selected from the Top menu");

			}

			// If the Excel value for the Product Type is iMacs, then do this

			if("iMacs".equals(ExcelUtils.getCellData(iTestCaseRow, Constant.ColProductType))){

				HomePage.TopNavigation.Product_Type.iMacs();

				Log.info("Product Type iMacs is selected from the Top menu");

			}

			// If the Excel value for the Product Type is iPads, then do this

			if("iPads".equals(ExcelUtils.getCellData(iTestCaseRow, Constant.ColProductType))){

				HomePage.TopNavigation.Product_Type.iPads();

				Log.info("Product Type iPads is selected from the Top menu");

			}

			// If the Excel value for the Product Type is iPhones, then do this

			if("iPhones".equals(ExcelUtils.getCellData(iTestCaseRow, Constant.ColProductType))){

				HomePage.TopNavigation.Product_Type.iPhones();

				Log.info("Product Type iPhones is selected from the Top menu");

			}

			// If the Excel value for the Product Type is null, then do this

			if("".equals(ExcelUtils.getCellData(iTestCaseRow, Constant.ColProductType))){

				Log.warn("Excel value for Product Type is Blank");

			}

		// Every exception thrown from any class or method, will be catch here and will be taken care off

		// For Exception handling please see http://toolsqa.com/selenium-webdriver/exception-handling-selenium-webdriver/

	    }catch(Exception e){

			// Here I have used this as just for the sake of an example

			// I am just catching the Exception and again throwing it back to the Main testcase, without handling it

	    	// You may like to print some information here, in case of exception

	    	throw(e);

			}

		}

	// iTestcaseRow is the row number of our Testcase name in the Test Data sheet

	// iTestcaseRow is passed as an Argument to this method, so that it can used inside this method

	// For use of Functions &amp; Parameters, please see http://toolsqa.com/selenium-webdriver/function-parameters/

	public static void productNumber(int iTestCaseRow) throws Exception{

		try{

			// iTestcaseRow is the row number of our Testcase name in the Test Data sheet

        	// Constant.Col_ProductNumber is the column number for Product Number column in the Test Data sheet

        	// Please see the Constant class in the Utility Package

        	// For Use of Constant Variables, please see http://toolsqa.com/selenium-webdriver/constant-variables/

			// If condition will check that if the Excel value for the Product Number is "Product 1", then do this

			if("Product 1".equals(ExcelUtils.getCellData(iTestCaseRow, Constant.ColProductNumber))){

				// Clicking on the Add to Cart button for the Product 1

				// This is call Page Object Model (POM)

	        	// For use of POM, please see http://toolsqa.com/selenium-webdriver/page-object-model/

				ProductListingPage.Product_1.btn_AddToCart().click();

				// Printing logs for the performed action

				Log.info("Product 1 is selected from the Product listing page");

			}

			// If the Excel value for the Product Number is "Product 2", then do this

			if("Product 2".equals(ExcelUtils.getCellData(iTestCaseRow, Constant.ColProductNumber))){

				ProductListingPage.Product_2.btn_AddToCart().click();

				Log.info("Product 2 is selected from the Product listing page");

			}

			/// If the Excel value for the Product Type is null, then do this

			if("".equals(ExcelUtils.getCellData(iTestCaseRow, Constant.ColProductNumber))){

				Log.warn("Excel value for Product Number is Blank");

			}

			// Clicking on the "Go to Cart" button on the Pop Up Box

			ProductListingPage.PopUpAddToCart.btn_GoToCart().click();

		 // Every exception thrown from any class or method, will be catch here and will be taken care off

		 // For Exception handling please see http://toolsqa.com/selenium-webdriver/exception-handling-selenium-webdriver/

		 }catch(Exception e){

			// Here I have used this as just for the sake of an example

			// I am just catching the Exception and again throwing it back to the Main testcase, without handling it

		    // You may like to print some information here, in case of exception

			throw(e);

			}

		}

	}