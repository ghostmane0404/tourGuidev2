package system.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import system.model.Tour;

import javax.sql.DataSource;

public class GuideDaoImpl implements GuideDao {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void createTour(Tour tour) {
        String SQL = "INSERT INTO `TOURS`(`ID`, `DIRECTION`, `CUSTOMER`, `KODFORGUIDE`, `PRICEOFTUOR`, `DAYOFTOUR`, `PEOPLECOUNT`, `TRANSPORTPRICE`, `TICKETSPRICE`, `OTHERPRICE`) " +
                "VALUES " +
                "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        jdbcTemplate.update(SQL, tour.getDirection(), tour.getCustomer(), tour.getKodForGuide(), tour.getPriceOfTour(),
                tour.getDayOfTour(), tour.getPeopleCount(), tour.getTransportPrice(), tour.getTicketPrice(), tour.getOtherPrice());
    }

}
