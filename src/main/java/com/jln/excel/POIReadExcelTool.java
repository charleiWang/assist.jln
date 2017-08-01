package com.jln.excel;

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.codec.binary.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.jln.Dto.SurveyDto;

public class POIReadExcelTool {

	 public static List<SurveyDto> readXls() throws Exception {
	        InputStream is = new FileInputStream("D:\\jln\\45_42_2.xls");

	        HSSFWorkbook excel = new HSSFWorkbook(is);
	        SurveyDto stu = null;
	        List<SurveyDto> list = new ArrayList<SurveyDto>();
	        
	        // 循环工作表Sheet
	        for (int numSheet = 0; numSheet < excel.getNumberOfSheets(); numSheet++) {
	            HSSFSheet sheet = excel.getSheetAt(numSheet);
	            if (sheet == null)
	                continue;
	            // 循环行Row
	            for (int rowNum = 1; rowNum < sheet.getLastRowNum(); rowNum++) {
	                HSSFRow row = sheet.getRow(rowNum);
	                if (row == null)
	                    continue;
	                stu = new SurveyDto();
	               
	                HSSFCell cell0 = row.getCell(0);
	                if (cell0 == null)
	                    continue;
	                stu.setSex((int)cell0.getNumericCellValue());
	                HSSFCell cell1 = row.getCell(1);
	                if (cell1 == null)
	                    continue;
	                stu.setName(cell1.getStringCellValue());
	                HSSFCell cell2 = row.getCell(2);
	                if (cell2 == null)
	                    continue;
	                stu.setAge((int)cell2.getNumericCellValue());
	                HSSFCell cell3 = row.getCell(3);
	                if (cell3 == null)
	                    continue;
	                stu.setBirth(new SimpleDateFormat("yyyy-mm-dd").parse(cell3.getStringCellValue()));
	                list.add(stu);
	            }
	        }

	        return list;
	    }
}
