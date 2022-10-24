package web.dao;

import web.models.User;
import java.util.List;

public interface UserDao {
    void saveUser(User user);
    List<User> listUsers();
}
