package com.vti.backend.businesslayer;

import java.sql.SQLException;
import java.util.List;
import com.vti.entity.User;


public interface IUserService {
    List<User> getAllByProjectId(int projectId) throws SQLException, ClassNotFoundException;
    boolean login(String email, String password) throws SQLException, ClassNotFoundException;
}
