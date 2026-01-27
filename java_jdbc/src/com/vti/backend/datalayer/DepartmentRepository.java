package com.vti.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vti.entity.Department;
import com.vti.utils.JdbcUtils;

public class DepartmentRepository implements IDepartmentRepository {
	private JdbcUtils jdbcUtils;

	public DepartmentRepository() throws FileNotFoundException, IOException {
		super();
		jdbcUtils = new JdbcUtils();
	}

	@Override
	public List<Department> getAllDepartment() throws ClassNotFoundException, SQLException {
		String sql_SelectDepartment = "SELECT * FROM Department ORDER BY DepartmentID;";
		ResultSet resultSet = jdbcUtils.executeQuery(sql_SelectDepartment);
		List<Department> listDepartments = new ArrayList<Department>();
		while (resultSet.next()) {
			Department department = new Department();
			department.setId(resultSet.getInt(1));
			department.setName(resultSet.getString(2));

			listDepartments.add(department);
		}
		return listDepartments;
	}

	@Override
	public Department getDepartmentById(int id) throws ClassNotFoundException, SQLException {
		String sql_SelectDepartmentId = "SELECT * FROM DEPARTMENT WHERE DepartmentID = " + id + ";";
		ResultSet result = jdbcUtils.executeQuery(sql_SelectDepartmentId);
		if (result.next()) {
			Department department = new Department();
			department.setId(result.getInt(1));
			department.setName(result.getString(2));
			return department;
		} else {
			return null;
		}
	}

	@Override
	public boolean isDepartmentNameExists(String name) throws ClassNotFoundException, SQLException {
		String sql = "SELECT * FROM DEPARTMENT WHERE DepartmentName = N'" + name + "';";
		ResultSet resultSet = jdbcUtils.executeQuery(sql);
		return resultSet.next();
	}
}
