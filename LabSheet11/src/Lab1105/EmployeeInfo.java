package Lab1105;

import java.util.*;
import java.io.*;

public class EmployeeInfo {

	public static void main(String[] args) throws IOException{
		
		Scanner input = new Scanner (System.in);
		
		String choose;
		
		System.out.print("Choose Insert or Search Data : ");
		choose = input.next().toLowerCase();
		
		while(!choose.equals("insert") && !choose.equals("search")) {
			System.out.print("Choose Insert or Search Data, again : ");
			choose = input.next().toLowerCase();
		}
		
		SaveAndOpen objFile = new SaveAndOpen();
		
		if(choose.equals("insert")) {
			objFile.insert();
		}
		else if(choose.equals("search")) {
			System.out.print("Enter department : ");
			String dept = input.next();
			
			objFile.setDept(dept);
			objFile.searchData();
		}
		
		input.close();

	}

}
