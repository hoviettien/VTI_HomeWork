package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.presentationlayer.DepartmentController;
import com.vti.entity.Department;

public class DepartmentProgram {
	private DepartmentController departmentController;

	public DepartmentProgram() throws FileNotFoundException, IOException {
		super();
		departmentController = new DepartmentController();
	}

	public void getAllDepartment() throws ClassNotFoundException, SQLException {
		List<Department> listDepartments = departmentController.getAllDepartment();

		System.out.println("+-----------+--------------------------------------+");
		System.out.format("|    %-7s|      %-32s|%n", "ID", "Department Name");

		System.out.println("+-----------+--------------------------------------+");

		for (Department department : listDepartments) {
			System.out.format("|    %-7d|      %-32s|%n", department.getId(), department.getName());
		}

		System.out.println("+-----------+--------------------------------------+");
		System.out.println();
	}

	public void getDepartmentById(int id) throws ClassNotFoundException, SQLException {
		Department department = departmentController.getDepartmentById(id);

		if (department != null) {
			System.out.println("Department found:");
			System.out.format("ID: %d, Name: %s%n", department.getId(), department.getName());
		} else {
			System.out.println("Department with ID " + id + " not found.");
		}
		System.out.println();
	}

	public void isDepartmentNameExists(String name) throws ClassNotFoundException, SQLException {
		boolean exists = departmentController.isDepartmentNameExists(name);
		if (exists) {
			System.out.println("Department name '" + name + "' exists.");
		} else {
			System.out.println("Department name '" + name + "' does not exist.");
		}
		System.out.println();
	}

}
