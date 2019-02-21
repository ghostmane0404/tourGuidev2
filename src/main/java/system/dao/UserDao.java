package system.dao;

import system.model.User;

import javax.sql.DataSource;
import java.util.List;

public interface UserDao {

    void setDataSource(DataSource dataSource);

    User getUserById(Integer id);

    List<User> listUsers();

    void createUser(String name, String surname, String phone,
                    String mast, String pass, boolean isWorking);

    void removeUser(Integer id);

    void updateUser(Integer id, String name, String surname,
                    String phone, String mast, String pass,
                    boolean isWorking);

}
