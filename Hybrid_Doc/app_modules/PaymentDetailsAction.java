package app_modules;

import org.testng.Reporter;

import page_object.PaymentDetailsPage;

import utility.Constant;

import utility.ExcelUtils;

import utility.Log;

// This is called Modularization, when we club series of actions in to one Module

// For Modular Driven Framework, please see http://toolsqa.com/selenium-webdriver/modular-driven/ 

public class PaymentDetailsAction {

	// iTestcaseRow is the row number of our Testcase name in the Test Data sheet

	// iTestcaseRow is passed as an Argument to this method, so that it can used inside this method

	// For use of Functions &amp; Parameters, please see http://toolsqa.com/selenium-webdriver/function-parameters/

	public static void execute(int iTestCaseRow) throws Exception{

		try{

        	// Storing the Email in to a String variable and Getting the Email address from Test Data Excel sheet

        	// iTestcaseRow is the row number of our Testcase name in the Test Data sheet

        	// Constant.Col_Email is the column number for Email column in the Test Data sheet

        	// Please see the Constant class in the Utility Package

        	// For Use of Constant Variables, please see http://toolsqa.com/selenium-webdriver/constant-variables/

			String sEmail = ExcelUtils.getCellData(iTestCaseRow, Constant.ColEmail);

			// Clearing the pre-populated details on this field

			PaymentDetailsPage.txt_Email().clear();

			// Here we are sending the Email string to the Email Textbox on the Payment Detail Page

        	// This is call Page Object Model (POM)

        	// For use of POM, please see http://toolsqa.com/selenium-webdriver/page-object-model/

			PaymentDetailsPage.txt_Email().sendKeys(sEmail);

			// Printing the logs for what we have just performed

			Log.info(sEmail +" is entered as First Name on the Payment detail page");

			String sFirstName = ExcelUtils.getCellData(iTestCaseRow, Constant.ColFirstName);

			PaymentDetailsPage.txt_FirstName().clear();

			PaymentDetailsPage.txt_FirstName().sendKeys(sFirstName);

			Log.info(sFirstName +" is entered as First Name on the Payment detail page");

			String sLastName = ExcelUtils.getCellData(iTestCaseRow, Constant.ColLastName);

			PaymentDetailsPage.txt_LastName().clear();

			PaymentDetailsPage.txt_LastName().sendKeys(sLastName);

			Log.info(sLastName +" is entered as Last Name on the Payment detail page");

			String sAddress = ExcelUtils.getCellData(iTestCaseRow, Constant.ColAddress);

			PaymentDetailsPage.txt_Address().clear();

			PaymentDetailsPage.txt_Address().sendKeys(sAddress);

			Log.info(sAddress +" is entered as Address on the Payment detail page");

			String sCity = ExcelUtils.getCellData(iTestCaseRow, Constant.ColCity);

			PaymentDetailsPage.txt_City().clear();

			PaymentDetailsPage.txt_City().sendKeys(sCity);

			Log.info(sCity +" is entered as City on the Payment detail page");

			String sCountry = ExcelUtils.getCellData(iTestCaseRow, Constant.ColCountry);

			PaymentDetailsPage.drpdwn_Country(sCountry);

			Log.info(sCountry +" is Selected as Country on the Payment detail page");

			String sPhone = ExcelUtils.getCellData(iTestCaseRow, Constant.ColPhone);

			PaymentDetailsPage.txt_Phone().clear();

			PaymentDetailsPage.txt_Phone().sendKeys(sPhone);

			Log.info(sPhone +" is entered as Phone on the Payment detail page");

			// This is to check that if the Check box for "Same as Billing address" is not already checked

			if(!PaymentDetailsPage.chkbx_SameAsBillingAdd().isSelected()){

				// It it is unchecked, then check the check box

				PaymentDetailsPage.chkbx_SameAsBillingAdd().click();

				Log.info("Same as Billing address check box is selected on the Payment detail page");

			}

			// Clicking on the Purchase button to complete the payment

			PaymentDetailsPage.btn_Purchase().click();

			Log.info("Click action is performed on Purchase button on the Payment detail page");

            // This is another type of logging, with the help of TestNg Reporter log

            // This has to be very carefully used, you should only print the very important message in to this

            // This will populate the logs in the TestNG HTML reports

            // I have used this Reporter log just once in this whole module 

			Reporter.log("Payment is successfully perfromed for the purchased product.");

	    }catch(Exception e){

			throw(e);

			}

		}

}