package com.vti.backend.datalayer;

import java.sql.SQLException;
import java.util.List;
import com.vti.entity.Manager;

import com.vti.entity.Employee;

public interface IUserRepository {
   List<Employee> getEmployeesByProjectId(int projectId) throws SQLException, ClassNotFoundException;
   List<Manager> getAllManagers() throws SQLException, ClassNotFoundException;
}
