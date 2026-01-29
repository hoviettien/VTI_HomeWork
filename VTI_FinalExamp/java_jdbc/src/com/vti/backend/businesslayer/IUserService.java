package com.vti.backend.businesslayer;

import java.sql.SQLException;
import java.util.List;
import com.vti.entity.Manager;

import com.vti.entity.Employee;

public interface IUserService {
    List<Employee> getEmployeesByProjectId(int projectId) throws SQLException, ClassNotFoundException;
    List<Manager> getAllManagers() throws SQLException, ClassNotFoundException;
}
