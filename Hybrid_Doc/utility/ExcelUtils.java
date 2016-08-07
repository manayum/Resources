package utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	
	private static XSSFSheet wSheet;	 
    private static XSSFWorkbook wBook;
    private static XSSFCell Cell;
    private static XSSFRow Row;
    
    public static void setExcelFile(String Path,String SheetName) throws Exception {
   	 
    	try {
         FileInputStream ExcelFile = new FileInputStream(Path);
         // Access the required test data sheet
         wBook = new XSSFWorkbook(ExcelFile);
         wSheet = wBook.getSheet(SheetName);
         Log.info("Excel sheet opened");
         } catch (Exception e){
             throw (e);
         }
    }
    
    
    public static String getCellData(int RowNum, int ColNum) throws Exception{
    	 
        try {
     	  Cell = wSheet.getRow(RowNum).getCell(ColNum);
          String CellData = Cell.getStringCellValue();
          return CellData;
          }
        catch (Exception e){
             return"";
           }
    }
    
    @SuppressWarnings("static-access")
    public static void setCellData(String Result,  int RowNum, int ColNum) throws Exception    {
    	 
        try{
           Row  = wSheet.getRow(RowNum);
           Cell = Row.getCell(ColNum, Row.RETURN_BLANK_AS_NULL);
           if (Cell == null) {
             Cell = Row.createCell(ColNum);
             Cell.setCellValue(Result);
             }
          else {
                 Cell.setCellValue(Result);
             }
          
          FileOutputStream fileOut = new FileOutputStream(Constant.Path_TestData + Constant.File_TestData);
               wBook.write(fileOut);
               fileOut.flush();
               fileOut.close();
             }
        catch(Exception e){
                 throw (e);
         }
     }
    
    
    public static int getRowContains(String sTestCaseName, int colNum) throws Exception{
   	 
		int i;
		try {
			int rowCount = ExcelUtils.getRowUsed();
			for ( i=0 ; i<rowCount; i++){
				if  (ExcelUtils.getCellData(i,colNum).equalsIgnoreCase(sTestCaseName)){
					break;
				}
			}
			return i;
		}
		catch (Exception e){
			Log.error("Class ExcelUtil | Method getRowContains | Exception desc : " + e.getMessage());
			throw(e);
			}
		} 
    
    
    public static int getRowUsed() throws Exception {
    	 
		try{
			int RowCount = wSheet.getLastRowNum();
			Log.info("Total number of Row used return as &lt; " + RowCount + " &gt;.");		
			return RowCount;
		}catch (Exception e){
			Log.error("Class ExcelUtil | Method getRowUsed | Exception desc : "+e.getMessage());
			System.out.println(e.getMessage());
			throw (e);
		}
	}
}








