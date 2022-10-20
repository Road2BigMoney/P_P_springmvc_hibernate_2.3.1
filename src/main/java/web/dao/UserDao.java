package web.dao;

import web.models.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDao {
    void saveUser(User user) throws SQLException;
    List<User> listUsers();
}
