package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.utils.ScannerUtils;

public class Program {
	public static void main(String[] args)
			throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		DepartmentProgram departmentProgram = new DepartmentProgram();

		while (true) {
			System.out.format("+--------------------------------------------------------------------------+%n");
			System.out.format("|                        		Chon chuc nang                             %n");
			System.out.format("+--------------------------------------------------------------------------+%n");
			System.out.format("| %-72s |%n", "1. Hien thi danh sach phong ban");
			System.out.format("| %-72s |%n", "2. Tim kiem phong ban theo ID");
			System.out.format("| %-72s |%n", "3. Kiem tra ton tai ten phong ban");
			System.out.format("| %-72s |%n", "4. Tao moi phong ban");
			System.out.format("| %-72s |%n", "5. Cap nhat ten phong ban");
			System.out.format("| %-72s |%n", "6. Xoa phong ban");
			System.out.format("| %-72s |%n", "7. Thoat chuong trinh");
			System.out.format("+--------------------------------------------------------------------------+%n");

			int choose = ScannerUtils.inputIntPositive();

			switch (choose) {
			case 1:
				departmentProgram.getAllDepartment();
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				return;

			default:
				System.out.println("Nhap lai:");
				break;
			}
		}
	}
}
