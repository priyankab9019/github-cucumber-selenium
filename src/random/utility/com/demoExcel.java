package random.utility.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class demoExcel 
{
  static XSSFWorkbook book;
  static XSSFSheet sheet;
  static XSSFRow row;
  static XSSFCell cell;
  
  public static void setExcelFile(String filePath)
  {
	  try 
	  {
		  FileInputStream filein=new FileInputStream(filePath);
		  book=new XSSFWorkbook(filein);
		  sheet=book.getSheet("Sheet1");  		  
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }	 
  }
  public static int getRowCount(String filePath)
  {
	  setExcelFile(filePath);
	  int rows=sheet.getLastRowNum();
	  return rows;
  }
  public static String getExcelData(String filePath,int rownum,int cellnum) 
  {
	  setExcelFile(filePath);
	  String excelData=null;
	  row=sheet.getRow(rownum);
	  if(row==null)
	  {
		  row=sheet.createRow(rownum);		  
	  }
	  if(row.getCell(cellnum)!=null)
	  {
		  cell=row.getCell(cellnum);
		  String data=cell.getStringCellValue();
			  //String data=cell.getStringCellValue().toString();	 
			  excelData=data.toString();		 
	  }
	  else
	  {
		  String cell=(row.getCell(cellnum)+"").toString();
		  excelData=cell;
	  }
	  return excelData;
  }
  public static void setExcelData(String filePath,String data,int rownum,int cellnum) throws IOException
  {
	  setExcelFile(filePath);
	  row=sheet.getRow(rownum);
	  if(row==null)
	  {
		  row=sheet.createRow(rownum);
	  }
	  if(row.getCell(cellnum)!=null)
	  {
		  cell=row.getCell(cellnum);
		  cell.setCellValue(data);		  
	  }
	  else
	  {
		  cell=row.createCell(cellnum);
		  cell.setCellValue(data);
	  }
	  try
	  {
		  FileOutputStream fileOut=new FileOutputStream(filePath);
		  book.write(fileOut);
		  fileOut.flush();
		  fileOut.close();
	  }
	  catch(FileNotFoundException e)
	  {
		  e.printStackTrace();
	  }
	  
  }
  
}
