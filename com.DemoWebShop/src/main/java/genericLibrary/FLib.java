package genericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FLib {
    
    // Method to get data from a properties file
    public String getDataFromProperty(String path, String key) throws IOException 
    {
        FileInputStream f = new FileInputStream(path);
        Properties p = new Properties();
        p.load(f);
        f.close(); // Always close the FileInputStream
        return p.getProperty(key);
    }
    
    // Method to get data from an Excel file
    public String getDataFromExcel(String path, String sheetName, int rowNo, int cellNo) 
            throws EncryptedDocumentException, IOException
    {
        FileInputStream f = new FileInputStream(path);
        Workbook book = WorkbookFactory.create(f);
        Sheet row = book.getSheet(sheetName);
        
        return row.getRow(rowNo).getCell(cellNo).getStringCellValue();
        
    }
    
    public static Object[][] toGetMultipleDataFromExcel(String path, String sheetName) throws EncryptedDocumentException, IOException
    {
    	FileInputStream f = new FileInputStream(path);
        Workbook book = WorkbookFactory.create(f);
        Sheet row = book.getSheet(sheetName);
        
        int rows = row.getPhysicalNumberOfRows();
        int cells = row.getRow(0).getPhysicalNumberOfCells();
        Object [][] o = new Object[rows-1][cells];
        
        for(int i = 1;i<rows;i++)
        {
        	for(int j=0;j<cells;j++)
        	{
        		o[i-1][j]= row.getRow(i).getCell(j).getStringCellValue();
        	}
        	
        }
        
        return o;
    	
    }
    
    
}
