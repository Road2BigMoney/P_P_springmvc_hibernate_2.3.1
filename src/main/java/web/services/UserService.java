package web.services;

import web.models.User;

import java.sql.SQLException;
import java.util.List;

public interface UserService {
    public void saveUser(User user) throws SQLException;
    public List<User> listUsers();
}
