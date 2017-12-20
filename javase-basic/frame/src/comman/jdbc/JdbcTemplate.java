package comman.jdbc;
	
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import comman.jdbc.callback.QueryCallBack;
import comman.jdbc.callback.UpdateCallBack;

public class JdbcTemplate<T> {
	
	// ���ͨ�÷�����
	public List<T> executeQuery(QueryCallBack<T> sc){
		Connection con = DataPool.getConFromPool();
		List<T> list = new ArrayList<T>();
		list = sc.doSelect(con);
		DataPool.release(con);
		return list;
	}
	
	public int executeUpdate(UpdateCallBack sc){
		Connection con = DataPool.getConFromPool();
		int row = 0;
		row = sc.doUpdate(con);
		DataPool.release(con);
		
		return row;
	}
	
	// ���ûص�����
	public Object query(QueryCallBack<T> queryCallBack) {
		return executeQuery(queryCallBack);
	}
	
	public int insert(UpdateCallBack sc) {
		return executeUpdate(sc);
	}
	
	public int delete(UpdateCallBack sc) {
		return executeUpdate(sc);
	}
	
	public int update(UpdateCallBack sc) {
		return executeUpdate(sc);
	}
}
