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
			System.out.format(leftAlignFormat, "Question 1. Danh sach nhan vien va quan ly cua cac project");
			System.out.format(leftAlignFormat, "Question 2. Login");
			System.out.format(leftAlignFormat, "3. Thoat chuong trinh");
			System.out.format("+-------------------------------------------------------------------------------+%n");
			switch (ScannerUtils.inputIntPositive()) {
				case 1:
					userFunction.getAllByProjectId();
					break;
				case 2:
					userFunction.login();
					break;
				case 3:
					System.out.println("Thoat chuong trinh!");
					return;
				default:
					System.out.println("Nhap lai:");
					break;
			}

		}
	}
}
