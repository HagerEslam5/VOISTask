package test;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class readExcelData {
	
	public String[][]readSheet()throws InvalidFormatException, IOException{
		File myFile= new File(".//testData//Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet mySheet=wb.getSheet("sheet1");
		int numRows= mySheet.getPhysicalNumberOfRows();
		int numCols=mySheet.getRow(0).getLastCellNum();
		String[][]myArray=new String[numRows-1][numCols];
		for(int i=1; i<numRows; i++)
		{
			for (int a=0; a<numCols; a++) {
				XSSFRow row=mySheet.getRow(i);
				myArray[i-1][a]=row.getCell(a).getStringCellValue();			}
		}
		return myArray;
		
	}

}
