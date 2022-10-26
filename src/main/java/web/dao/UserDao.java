package web.dao;

import web.models.User;
import java.util.List;

public interface UserDao {
    void saveUser(User user);
    List<User> listUsers();

    User getById(int id);

    void update(User user);

    void delete(int id);
}
