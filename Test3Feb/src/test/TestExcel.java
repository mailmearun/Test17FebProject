package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class TestExcel {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\arun\\Desktop\\Test.xls");
		FileInputStream fis = new FileInputStream(file);
		
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		//XSSFWorkbook wb = new XSSFWorkbook(fis);
		HSSFSheet sheet = wb.getSheet("abc");
		
		int Last = sheet.getLastRowNum();
		
		System.out.println(Last);
		for(int i=0;i<=Last;i++)
		{
			
			String Data = sheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(Data);
		}
		
		
	

	}

}
