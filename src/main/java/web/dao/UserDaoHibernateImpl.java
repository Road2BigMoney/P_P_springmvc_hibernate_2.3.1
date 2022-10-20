package web.dao;

import org.springframework.stereotype.Component;
import web.models.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.sql.SQLException;
import java.util.List;
@Component
public class UserDaoHibernateImpl implements UserDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void saveUser(User user) throws SQLException {
//        Session session = sessionFactory.openSession();
//        session.save(user);
        entityManager.persist(user);
    }

    @Override
    public List<User> listUsers() {
//        return sessionFactory.getCurrentSession().createQuery("from User").getResultList();
        return entityManager.createQuery("select u from User u", User.class).getResultList();
    }
}
