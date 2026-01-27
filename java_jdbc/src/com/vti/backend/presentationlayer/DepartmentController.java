package com.vti.backend.presentationlayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.businesslayer.DepartmentService;
import com.vti.backend.businesslayer.IDepartmentService;
import com.vti.entity.Department;

public class DepartmentController {
	private IDepartmentService departmentService;

	public DepartmentController() throws FileNotFoundException, IOException {
		super();
		departmentService = new DepartmentService();
	}

	public List<Department> getAllDepartment() throws ClassNotFoundException, SQLException {
		List<Department> listDepartments = departmentService.getAllDepartment();
		return listDepartments;
	}

	public Department getDepartmentById(int id) throws ClassNotFoundException, SQLException {
		Department department = departmentService.getDepartmentById(id);
		return department;
	}

	public boolean isDepartmentNameExists(String name) throws ClassNotFoundException, SQLException {
		return departmentService.isDepartmentNameExists(name);
	}
}
