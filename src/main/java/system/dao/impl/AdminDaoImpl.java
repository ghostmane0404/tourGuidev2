package system.dao.impl;

import system.dao.AdminDao;
import system.model.Tour;
import system.model.User;

import javax.sql.DataSource;

public class AdminDaoImpl extends GuideDaoImpl implements AdminDao {

    @Override
    public void createGuide(User user) {
        String SQL = "INSERT INTO `USERS`(`NAME`, `LOGIN`, `SURNAME`, `PHONE`, `MAST`, `PASS`, `ISWORKING`) VALUES (?,?,?,?,?,?,?)";
        jdbcTemplate.update(SQL, user.getName(), user.getLogin(), user.getSurname(),
                user.getPhone(), user.getMast(), user.getPassword(), user.isWorking());

    }

    @Override
    public void deleteGuide(String login) {
        String SQL = "DELETE FROM USERS WHERE LOGIN = ?";
        jdbcTemplate.update(SQL, login);
    }
}
