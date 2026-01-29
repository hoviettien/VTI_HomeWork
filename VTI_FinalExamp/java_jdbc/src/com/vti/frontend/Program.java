package com.vti.frontend;

import com.vti.utils.ScannerUtils;

public class Program {
	public static void main(String[] args) {
		UserFunction userFunction = null;
		try {
			userFunction = new UserFunction();
		} catch (Exception e) {
			e.printStackTrace();
		}
		while (true) {
			System.out.println("-----------------------------MOI BAN CHON TINH NANG------------------------------");
			String leftAlignFormat = "| %-77s |%n";
			System.out.format("+-------------------------------------------------------------------------------+%n");
			System.out.format("|                                Choose please                                  |%n");
			System.out.format("+-------------------------------------------------------------------------------+%n");
			System.out.format(leftAlignFormat, "Question 2. Tim thanh vien là Employee cua Project theo ID");
			System.out.format(leftAlignFormat, "Question 3. Danh sach Manager cua cac project");
			System.out.format(leftAlignFormat, "Question 4. Login");
			System.out.format("+-------------------------------------------------------------------------------+%n");
			switch (ScannerUtils.inputIntPositive()) {
				case 1:
					// userFunction.getEmployeesByProjectId();
					break;
				case 2:
					userFunction.getEmployeesByProjectId();
					break;
				case 3:
					userFunction.getAllManagers();
					break;
				case 4:
					// functionProgram.login();
					return;
				default:
					System.out.println("Nhap lai:");
					break;
			}

		}
	}
}
