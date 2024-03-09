package application.Task8.dao;


import application.Task8.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    void saveUser(User user);

    void updateUser(User user);

    User getUserById(Long id);

    void deleteUserById(Long id);

}
