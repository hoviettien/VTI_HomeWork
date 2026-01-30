package com.vti.backend.datalayer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import com.vti.entity.Manager;
import com.vti.entity.User;
import com.vti.entity.Employee;
import com.vti.utils.JdbcUtils;


public class UserRepository implements IUserRepository {

    private JdbcUtils jdbcUtils;

    public UserRepository() throws Exception {
        jdbcUtils = new JdbcUtils();
    }

    @Override
    public List<User> getAllByProjectId(int projectId) throws SQLException, ClassNotFoundException {
        List<User> users = new ArrayList<>();
        String sql = "SELECT * FROM Users WHERE project_id = ?";
        PreparedStatement preStatement = jdbcUtils.createPrepareStatement(sql);
        preStatement.setInt(1, projectId);
        ResultSet resultSet = preStatement.executeQuery();
        while (resultSet.next()) {
            String role = resultSet.getString("role");
            if ("EMPLOYEE".equals(role)) {
                Employee employee = new Employee(resultSet.getInt("id"), resultSet.getString("full_name"),
                        resultSet.getString("email"), resultSet.getString("password"), resultSet.getInt("project_id"),
                        resultSet.getString("pro_skill"));
                users.add(employee);
            } else if ("MANAGER".equals(role)) {
                Manager manager = new Manager(resultSet.getInt("id"), resultSet.getString("full_name"),
                        resultSet.getString("email"), resultSet.getString("password"), resultSet.getInt("project_id"),
                        resultSet.getInt("exp_in_year"));
                users.add(manager);
            }
        }
        return users;
    }

    @Override
    public boolean login(String email, String password) throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM Users WHERE email = ? AND password = ?";
        PreparedStatement preStatement = jdbcUtils.createPrepareStatement(sql);
        preStatement.setString(1, email);
        preStatement.setString(2, password);
        ResultSet resultSet = preStatement.executeQuery();
        return resultSet.next();
    }
}