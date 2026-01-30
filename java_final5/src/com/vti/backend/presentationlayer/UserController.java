package com.vti.backend.presentationlayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.businesslayer.UserService;
import com.vti.backend.businesslayer.IUserService;

public class UserController {
    private IUserService userService;

    public UserController() throws FileNotFoundException, IOException {
        try {
            userService = new UserService();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public List<com.vti.entity.User> getAllByProjectId(int projectId) {
        try {
            return userService.getAllByProjectId(projectId);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

}