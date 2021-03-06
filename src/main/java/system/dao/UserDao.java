package system.dao;

import system.model.User;

import javax.sql.DataSource;
import java.util.List;

public interface UserDao {

    void setDataSource(DataSource dataSource);

    User getUserById(Integer id);

    User getUserByLogin(String name);

    User getUserByPassword(String password);

    List<User> listUsers();

    void createUser(User user);

    void removeUser(Integer id);

    void updateUser(Integer id, String name, String surname,
                    String phone, String mast, String pass,
                    boolean isWorking);

}
