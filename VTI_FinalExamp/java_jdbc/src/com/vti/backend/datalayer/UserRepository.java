package com.vti.backend.datalayer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import com.vti.entity.Manager;

import com.vti.entity.Employee;
import com.vti.utils.JdbcUtils;

public class UserRepository implements IUserRepository {

    private JdbcUtils jdbcUtils;

    public UserRepository() throws Exception {
        jdbcUtils = new JdbcUtils();
    }

    @Override
	public List<Employee> getEmployeesByProjectId(int projectId) throws SQLException, ClassNotFoundException {
		List<Employee> lisEmployees = new ArrayList<>();
		String sql = "SELECT * FROM Users WHERE role = 'EMPLOYEE' AND project_id = ?";
		PreparedStatement preStatement = jdbcUtils.createPrepareStatement(sql);
		preStatement.setInt(1, projectId);
		ResultSet resultSet = preStatement.executeQuery();
		while (resultSet.next()) {
			Employee employee = new Employee(resultSet.getInt("id"), resultSet.getString("full_name"),
					resultSet.getString("email"), resultSet.getString("password"), resultSet.getInt("project_id"),
					resultSet.getString("pro_skill"));
			lisEmployees.add(employee);
		}

		return lisEmployees;
	}

    @Override
    public List<Manager> getAllManagers() throws SQLException, ClassNotFoundException {
        List<Manager> managers = new ArrayList<>();
        String sql = "SELECT * FROM Users WHERE role = 'MANAGER'";
        PreparedStatement preStatement = jdbcUtils.createPrepareStatement(sql);
        ResultSet resultSet = preStatement.executeQuery();
        while (resultSet.next()) {
            Manager manager = new Manager(resultSet.getInt("id"), resultSet.getString("full_name"),
                    resultSet.getString("email"), resultSet.getString("password"), resultSet.getInt("project_id"),
                    resultSet.getInt("exp_in_year"));
            managers.add(manager);
        }
        return managers;
    }

}