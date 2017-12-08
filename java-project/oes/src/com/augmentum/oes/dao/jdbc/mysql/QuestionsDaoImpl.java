package com.augmentum.oes.dao.jdbc.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.augmentum.oes.dao.QuestionsDao;
import com.augmentum.oes.model.Pagination;
import com.augmentum.oes.model.Questions;
import com.augmentum.oes.util.StringUtil;

/*@Repository*/
public class QuestionsDaoImpl implements QuestionsDao {
    /*@Autowired*/
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Questions> fuzzyQuery(Pagination pagination) {

        //get total number of records obtained
        pagination.setTotalCount(getQuestionsTotalCountFuzz(pagination.getKeyWord()));

        //set the current page number
        if (pagination.getCurrentPage() > pagination.getPageCount()) {
            pagination.setCurrentPage(pagination.getPageCount());
        }

        Object params [] = new Object[] {pagination.getKeyWord(), pagination.getOffset(), pagination.getPageSize()};

        String sql = "SELECT * FROM questions WHERE que_title LIKE '% ? %' ORDER BY id DESC LIMIT ? , ?";
        RowMapper<Questions> rowMapper = new RowMapper<Questions>() {

            @Override
            public Questions mapRow(ResultSet resultSet, int arg1)
                    throws SQLException {
                String title = null;

                if (resultSet.getString("que_title").length() > 76) {
                    title = resultSet.getString("que_title").substring(0, 76) + "...";
                } else {
                    title = resultSet.getString("que_title");
                }

                Questions que = new Questions(resultSet.getInt("id"), resultSet.getString("id_number"), resultSet.getString("que_score"), resultSet.getString("que_a_content"), resultSet.getString("que_b_content"), resultSet.getString("que_c_content"), resultSet.getString("que_d_content"), resultSet.getString("que_answer"), resultSet.getString("que_create_time"), resultSet.getString("que_edit_time"),
                        resultSet.getInt("cont_sys_id"), title);

                return que;
            }
        };

        List<Questions> questions = jdbcTemplate.query(sql, params, rowMapper);

        return questions;
    }

    @Override
    public void batchDelete(final String idDelete) {
        jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection)
                    throws SQLException {
                String sql = "DELETE FROM questions WHERE id in ( ? )";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, idDelete);
                return preparedStatement;
            }
        });
    }

    @Override
    public void saveQuestions(final Questions que) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(new PreparedStatementCreator() {

            @Override
            public PreparedStatement createPreparedStatement(Connection connection)
                    throws SQLException {
                String sql = "INSERT INTO questions(que_title, que_a_content, que_b_content, que_c_content, que_d_content, que_answer, que_create_time, cont_sys_id, id_number) values(?, ?, ?, ?, ?, ?, NOW(), ?, ?)";
                PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                preparedStatement.setString(1, que.getQueTitle());
                preparedStatement.setString(2, que.getQueA());
                preparedStatement.setString(3, que.getQueB());
                preparedStatement.setString(4, que.getQueC());
                preparedStatement.setString(5, que.getQueD());
                preparedStatement.setString(6, que.getQueAnswer());
                preparedStatement.setInt(7, que.getContSysId());
                preparedStatement.setString(8, que.getIdNumber());
                return preparedStatement;
            }
        }, keyHolder);

        que.setId(keyHolder.getKey().intValue());
    }

    @Override
    public void updateQuestions(final Questions que) {

        jdbcTemplate.update(new PreparedStatementCreator() {

            @Override
            public PreparedStatement createPreparedStatement(Connection connection)
                    throws SQLException {
                String sql = "UPDATE questions SET que_title = ? , que_a_content = ? , que_b_content = ? , que_c_content = ? , que_d_content = ? , que_answer = ? , que_edit_time = NOW() , cont_sys_id = ? , id_number = ? WHERE id = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                preparedStatement.setString(1, que.getQueTitle());
                preparedStatement.setString(2, que.getQueA());
                preparedStatement.setString(3, que.getQueB());
                preparedStatement.setString(4, que.getQueC());
                preparedStatement.setString(5, que.getQueD());
                preparedStatement.setString(6, que.getQueAnswer());
                preparedStatement.setInt(7, que.getContSysId());
                preparedStatement.setString(8, que.getIdNumber());
                preparedStatement.setInt(9, que.getId());
                return preparedStatement;
            }
        });
   }

    @Override
    public Questions searchQuestionsById(int id) {
        String sql = null;
        String idString = String.valueOf(id);

        if (id == 0) {
            sql = "SELECT * FROM questions ORDER BY id DESC LIMIT 1";
        } else {
            sql = "SELECT * FROM questions WHERE id = ? ";
        }

        Object params [] = new Object[] {idString};

        RowMapper<Questions> rowMapper = new RowMapper<Questions>() {
        @Override
        public Questions mapRow(ResultSet resultSet, int arg1)
                throws SQLException {
                String title = null;

                Questions que = new Questions(resultSet.getInt("id"), resultSet.getString("id_number"), resultSet.getString("que_score"), resultSet.getString("que_a_content"), resultSet.getString("que_b_content"), resultSet.getString("que_c_content"), resultSet.getString("que_d_content"), resultSet.getString("que_answer"), resultSet.getString("que_create_time"), resultSet.getString("que_edit_time"),
                        resultSet.getInt("cont_sys_id"), title);
                return que;
            }
        };

    List<Questions> questions = jdbcTemplate.query(sql, params, rowMapper);
    Questions questionsOne = null;

    if (!questions.isEmpty()) {
        questionsOne = questions.get(0);
    }

    return questionsOne;
    }

    @Override
    public int getQuestionsTotalCountFuzz(String keyWord) {
        String sql = null;
        Boolean flag = true;
        Object params[] = new Object[] {keyWord};

        if (StringUtil.isEmpty(keyWord)) {
            sql = "SELECT COUNT(id) AS questions_total_count FROM questions";
        } else {
            sql = "SELECT COUNT(id) AS questions_total_count FROM questions WHERE que_title LIKE '% ? %'";
            flag = false;
        }

        if (flag) {
            return jdbcTemplate.queryForInt(sql);
        } else {
            return jdbcTemplate.queryForInt(sql, params);
        }
    }
}
