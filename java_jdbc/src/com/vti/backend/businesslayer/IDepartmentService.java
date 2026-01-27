package com.vti.backend.businesslayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.entity.Department;

public interface IDepartmentService {
	public List<Department> getAllDepartment() throws ClassNotFoundException, SQLException;
	public Department getDepartmentById(int id) throws ClassNotFoundException, SQLException;
}
