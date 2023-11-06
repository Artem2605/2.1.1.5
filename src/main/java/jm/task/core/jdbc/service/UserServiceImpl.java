package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.*;
import jm.task.core.jdbc.model.User;
import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao user = new UserDaoHibernateImpl();

    public void createUsersTable() {
        user.createUsersTable();
    }

    public void dropUsersTable() {
        user.dropUsersTable();
    }

    public void saveUser(String name, String lastName, Byte age) {
        user.saveUser(name, lastName, age);
        //todo: service все-таки долен писать в консоль, что происходит. Например, в Log... или в сильно упрощенном варианте,  System.out.println("Saved User: " + name);
    }

    public void removeUserById(Long id) {
        user.removeUserById(id);
    }

    public List<User> getAllUsers() {
        return user.getAllUsers();
    }

    public void cleanUsersTable() {
        user.cleanUsersTable();
    }
}