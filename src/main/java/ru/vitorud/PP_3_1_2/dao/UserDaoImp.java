package ru.vitorud.PP_3_1_2.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;
import ru.vitorud.PP_3_1_2.model.User;

import java.util.List;


@Repository
public class UserDaoImp implements UserDao {
    private EntityManager entityManager;

    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Override
    public void createUser(User user) {
        entityManager.persist(user);
    }
    @Override
    public List<User> userList() {
        return entityManager.createQuery("from User").getResultList();
    }
    @Override
    public User getOneUser(int id) {
        Query query = entityManager.createQuery("SELECT u FROM User u WHERE u.id = :identy");
        query.setParameter("identy", id);
        return (User) query.getSingleResult();
    }

    @Override
    public void deleteUser(int id) {
        User user = entityManager.find(User.class, id);
        if (user != null) {
            entityManager.remove(user);
        }
    }
    @Override
    public void updateUser(User user) {
        entityManager.merge(user);
    }

}
