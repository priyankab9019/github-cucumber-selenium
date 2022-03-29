package random.main.com;

import org.openqa.selenium.WebDriver;


import random.utility.com.demoExcel;



public class DemoRis 
{
	public static WebDriver driver;
	static String filePath="D:\\EclipseProgramsPath\\TrialOnVariousWebelemnt\\TestData\\TestData1.xlsx";
	public static void NewStudy() throws Exception
	{
		String a=demoExcel.getExcelData(filePath, 0, 0);
		System.out.println(a);
		String b=demoExcel.getExcelData(filePath, 1, 0);
		System.out.println(b);
		
	}
	public static void main(String[] args) throws Exception
	{		
		DemoRis.NewStudy();
	}
}
