package system.dao;

import system.model.User;

import javax.sql.DataSource;

public interface AdminDao extends GuideDao {

    void createGuide(User user);

    void deleteGuide();
}
