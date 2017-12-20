package dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;
import comman.jdbc.JdbcTemplate;
import comman.jdbc.callback.QueryCallBack;
import comman.jdbc.callback.UpdateCallBack;
import dao.StudentDao;
import model.Student;
import utils.DBUtil;

public class StudentDaoImpl implements StudentDao {
	private JdbcTemplate<Student> jt = new JdbcTemplate<Student>();
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Student> getStudents() {
		return (List<Student>) jt.query(new QueryCallBack<Student>() {
			public List<Student> doSelect(Connection con) {
				List<Student> list = new ArrayList<Student>();
				PreparedStatement ps = null;
				ResultSet rs = null;
				String sql = "select * from student";
				
				try {
					ps = (PreparedStatement) con.prepareStatement(sql);
					rs = ps.executeQuery();
					
					while(rs.next()) {
						Student s = new Student();
						s.setId(rs.getInt("id"));
						s.setName(rs.getString("name"));
						s.setSex(rs.getString("sex"));
						s.setStunumber(rs.getString("stunumber"));
						list.add(s);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				} finally{
					DBUtil.closeResource(ps, rs);
				}
				
				return list;
			}
		});
	}

	@Override
	public int deleteStudentById(Object... objects) {
		// 初始化影响行数
		int row =0;
		
		row = jt.delete(new UpdateCallBack() {
			
			@Override
			public int doUpdate(Connection con) {
				int influenceRow = 0; 
				PreparedStatement ps = null;
				String sql = "delete from student where id = ?";
				try {
					ps = (PreparedStatement) con.prepareStatement(sql);
					ps.setInt(1, 2);
					influenceRow = ps.executeUpdate();
				} catch (SQLException e) {
					e.printStackTrace();
				} finally{
					DBUtil.closeResource(ps);
				}
				return influenceRow;
			}
		});
		
		return row;
	}

	@Override
	public int updateStudent(Object... objects) {
		// 初始化影响行数
		int row =0;
		
		row = jt.delete(new UpdateCallBack() {
			
			@Override
			public int doUpdate(Connection con) {
				int influenceRow = 0; 
				PreparedStatement ps = null;
				String sql = "update student set name = ? where id = ?";
				try {
					ps = (PreparedStatement) con.prepareStatement(sql);
					ps.setString(1, objects[0].toString());
					ps.setInt(2, Integer.parseInt(objects[1].toString()));
					influenceRow = ps.executeUpdate();
				} catch (SQLException e) {
					e.printStackTrace();
				} finally{
					DBUtil.closeResource(ps);
				}
				return influenceRow;
			}
		});
		
		return row;
	}

	@Override
	public int addStudent(Object... objects) {
		// 初始化影响行数
		int row =0;
		
		row = jt.delete(new UpdateCallBack() {
			
			@Override
			public int doUpdate(Connection con) {
				int influenceRow = 0; 
				PreparedStatement ps = null;
				String sql = "insert into student(name, stunumber) values(?, ?)";
				try {
					ps = (PreparedStatement) con.prepareStatement(sql);
					ps.setString(1, objects[0].toString());
					ps.setString(2, objects[1].toString());
					influenceRow = ps.executeUpdate();
				} catch (SQLException e) {
					e.printStackTrace();
				} finally{
					DBUtil.closeResource(ps);
				}
				return influenceRow;
			}
		});
		
		return row;
	}
}
