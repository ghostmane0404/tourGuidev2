package system.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import system.dao.UserDao;
import system.model.User;
import system.util.UserMapper;

import javax.jws.soap.SOAPBinding;
import javax.sql.DataSource;
import java.util.Arrays;
import java.util.List;


@Repository
public class UserDaoImp implements UserDao {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;


    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public User getUserById(Integer id) {
        String SQL = "SELECT * FROM USERS WHERE id = ?";
        return (User) jdbcTemplate.queryForObject(SQL, new Object[]{id}, new UserMapper());
    }

    @Override
    public User getUserByLogin(String name) {
        String SQL = "SELECT * FROM USERS WHERE LOGIN = ?";
        return (User) jdbcTemplate.queryForObject(SQL, new Object[]{name}, new UserMapper());

    }

    @Override
    public User getUserByPassword(String password) {
        String SQL = "SELECT * FROM USERS WHERE PASSWORD = ?";
        return (User) jdbcTemplate.queryForObject(SQL, new Object[]{password}, new UserMapper());

    }

    public List<User> listUsers() {
        String SQL = "SELECT * FROM USERS";
        return jdbcTemplate.query(SQL, new UserMapper());
    }

    public void createUser(User user) {
        String SQL = "INSERT INTO USERS(NAME, LOGIN, SURNAME, PHONE, MAST, PASS, ISWORKING) VALUES (?,?,?,?,?,?)";

        jdbcTemplate.update(SQL, user.getName(), user.getLogin(), user.getSurname(),
                user.getPhone(), user.getMast(), user.getPassword(), user.isWorking());
    }

    public void removeUser(Integer id) {
        String SQL = "DELETE FROM USERS WHERE id = ?";
        jdbcTemplate.update(SQL, id);
    }

    public void updateUser(Integer id, String name, String surname, String phone, String mast, String pass, boolean isWorking) {
        String SQL = "UPDATE USERS SET name = ?, surname = ?, phone = ?, mast = ?, pass = ?, isWorking = ?, WHERE id = ?";
        jdbcTemplate.update(SQL, name, surname, phone, mast, pass, isWorking, id);
    }
}
