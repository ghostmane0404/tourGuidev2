package system.util;

import org.springframework.jdbc.core.RowMapper;
import system.model.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper {

    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        User developer = new User();
        developer.setId(resultSet.getInt("id"));
        developer.setName(resultSet.getString("name"));
        developer.setSurname(resultSet.getString("surname"));
        developer.setPhone(resultSet.getString("phone"));
        developer.setMast(resultSet.getString("mast"));
        developer.setPassword(resultSet.getString("pass"));
        developer.setWorking(resultSet.getBoolean("isWorking"));
        return developer;
    }
}