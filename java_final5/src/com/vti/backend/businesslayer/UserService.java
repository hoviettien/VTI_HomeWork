package com.vti.backend.businesslayer;

import java.sql.SQLException;
import java.util.List;
import com.vti.backend.datalayer.UserRepository;
import com.vti.backend.datalayer.IUserRepository;
import com.vti.entity.User;



public class UserService implements IUserService {
    private IUserRepository userRepository;

    public UserService() throws Exception{
        userRepository = new UserRepository();
    }

    @Override
    public List<User> getAllByProjectId(int projectId) throws SQLException, ClassNotFoundException {
        return userRepository.getAllByProjectId(projectId);
    }

}
