package system.dao;

import system.model.Tour;

import javax.sql.DataSource;

public interface GuideDao {

    void createTour(Tour tour);

    void setDataSource(DataSource dataSource);

}
