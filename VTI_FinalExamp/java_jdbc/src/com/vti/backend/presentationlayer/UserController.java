package com.vti.backend.presentationlayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.businesslayer.UserService;
import com.vti.entity.Employee;
import com.vti.backend.businesslayer.IUserService;
import com.vti.entity.Manager;

public class UserController {
    private IUserService userService;

    public UserController() throws FileNotFoundException, IOException {
        try {
            userService = new UserService();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public List<Employee> getEmployeesByProjectId(int projectId) throws SQLException, ClassNotFoundException {
		return userService.getEmployeesByProjectId(projectId);
	}

    public List<Manager> getAllManagers() throws SQLException, ClassNotFoundException {
        return userService.getAllManagers();
    }

}