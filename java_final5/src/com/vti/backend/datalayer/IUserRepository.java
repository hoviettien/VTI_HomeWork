package com.vti.backend.datalayer;

import java.sql.SQLException;
import java.util.List;
import com.vti.entity.User;

public interface IUserRepository {
   List<User> getAllByProjectId(int projectId) throws SQLException, ClassNotFoundException;
   boolean login(String email, String password) throws SQLException, ClassNotFoundException;
}
