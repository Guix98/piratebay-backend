package bo.edu.ucb.sis.piratebay.dao;

import bo.edu.ucb.sis.piratebay.model.OrderModel;
import bo.edu.ucb.sis.piratebay.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class OrderDao {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public OrderDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public List<OrderModel> findAllOrders() {
        String query = "SELECT order_id, provider_id, warehouse_id, date, status FROM public.order";
        List<OrderModel> result = null;
        try {
            result = jdbcTemplate.query(query, new RowMapper<OrderModel>() {
                @Override
                public OrderModel mapRow(ResultSet resultSet, int i) throws SQLException {
                    return new OrderModel(
                            resultSet.getInt(1),
                            resultSet.getInt(2),
                            resultSet.getInt(3),
                            resultSet.getString(4),
                            resultSet.getInt(5));
                }
            });
        } catch (Exception ex) {
            throw new RuntimeException();
        }
        return result;
    }

}
