package com.augmentum.oes.dao.jdbc.mysql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.augmentum.oes.dao.UserDao;
import com.augmentum.oes.model.User;

/*@Repository*/
public class UserDaoImpl implements UserDao {
    /*@Autowired*/
    private JdbcTemplate jdbcTemplate;

    @Override
    public User getUserByName(final String userName) {
        String sql = "SELECT * FROM user WHERE user_name = ?";
        Object params [] = new Object[] {userName};
        RowMapper<User> rowMapper = new RowMapper<User>() {

        @Override
        public User mapRow(ResultSet rs, int arg1)
                throws SQLException {
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setPassword(rs.getString("user_password"));
            user.setUserName(rs.getString("user_name"));
            return user;
            }
        };

    List<User> users = jdbcTemplate.query(sql, params, rowMapper);
    User userOne = null;

    if (!users.isEmpty()) {
        userOne = users.get(0);
    }

    return userOne;
    }
}
