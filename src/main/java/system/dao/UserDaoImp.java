package system.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import system.model.User;
import system.util.UserMapper;

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

    public void createUser(String name, String surname, String phone, String mast, String pass, boolean isWorking) {
        String SQL = "INSERT INTO USERS(NAME, SURNAME, PHONE, MAST, PASS, ISWORKING) VALUES (?,?,?,?,?,?)";

        jdbcTemplate.update(SQL, name, surname, phone, mast, pass, isWorking);
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
