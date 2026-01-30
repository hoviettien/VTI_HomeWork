package com.vti.backend.businesslayer;

import java.sql.SQLException;
import java.util.List;
import com.vti.backend.datalayer.UserRepository;
import com.vti.entity.Employee;
import com.vti.backend.datalayer.IUserRepository;
import com.vti.entity.Manager;


public class UserService implements IUserService {
    private IUserRepository userRepository;

    public UserService() throws Exception{
        userRepository = new UserRepository();
    }

    @Override
    public List<Employee> getEmployeesByProjectId(int projectId) throws SQLException, ClassNotFoundException {
		return userRepository.getEmployeesByProjectId(projectId);
	}
    @Override
    public List<Manager> getAllManagers() throws SQLException, ClassNotFoundException {
        return userRepository.getAllManagers();
    }
    @Override
    public boolean login(String email, String password) throws SQLException, ClassNotFoundException {
        return userRepository.login(email, password);
    }

}
