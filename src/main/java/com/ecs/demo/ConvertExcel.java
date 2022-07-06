package com.ecs.demo;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class ConvertExcel {

	public void readExcelFile() throws IOException {
		

		Scanner sc = new Scanner(System.in); // System.in is a standard input stream
		System.out.print("Enter a name ");
		String name = sc.next();
		System.out.println("student name"+name);
		
		GradeSystem grade=new GradeSystem();
		
		Percentage percentage = new Percentage();

		String excelFilePath = "C:\\Users\\ECS\\Desktop\\input.xlsx";

		FileInputStream inputstream = new FileInputStream(excelFilePath);

		XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
		XSSFSheet sheet = workbook.getSheet("Sheet1");

		int rows = sheet.getLastRowNum();

		for (int r = 1; r <= rows; r++) {
			XSSFRow row = sheet.getRow(r);

			XSSFCell cellName = row.getCell(0);
			XSSFCell cellAdmsn = row.getCell(1);
			XSSFCell cellPhy = row.getCell(2);
			XSSFCell cellChem = row.getCell(3);
			XSSFCell cellMath = row.getCell(4);

			String cellNameStr = cellName.toString();
			Float cellAdmsnStr = Float.parseFloat(cellAdmsn.toString());
			Float cellPhyStr = Float.parseFloat(cellPhy.toString());
			Float cellChemStr = Float.parseFloat(cellChem.toString());
			Float cellMathStr = Float.parseFloat(cellMath.toString());
			List<Student> students=new ArrayList<Student>();
			Student student=new Student();
			student.setName(cellNameStr);
			student.setAdmissionNo(null);

			if (cellNameStr.equals(name)) {
				System.out.println("Name="+cellNameStr);
				System.out.println("Admission num"+cellAdmsnStr);
				percentage.calculatePercentage(cellPhyStr, cellChemStr, cellMathStr);
				System.out.println("Physics="+cellPhyStr);
				grade.gradeSystem(cellPhyStr);
				
				
				//System.out.println("Physics="+cellPhyStr);
			}
			//System.out.println(cellAdmsnStr);

            JSONArray jsonArray = new JSONArray();
            JSONObject jsonObject = new JSONObject();

            jsonObject.put("Name", cellNameStr);
            jsonObject.put("Admission No", cellAdmsnStr);
            jsonObject.put("Physics", cellPhyStr);
            jsonObject.put("Chemistry", cellChemStr);
            jsonObject.put("Maths", cellMathStr);

            jsonArray.add(jsonObject);

            try {
                FileWriter jsonFilePath = new FileWriter("C:\\Users\\ECS\\Desktop\\exceltojs.json", true);
                jsonFilePath.write(jsonArray.toJSONString());
                jsonFilePath.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(jsonArray);

		}

	}
}
