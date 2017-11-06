package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;

public class DBUtil {
	public static Connection con = null;
	
	static {
		Map<String, String> mapProperties = new LoadPropertiesUtil().getPropertiesInfo(ConstantUtil.PROPERTY_PATH);
		try {
			Class.forName(mapProperties.get("driver"));
			con = DriverManager.getConnection(mapProperties.get("url"), mapProperties.get("username"), mapProperties.get("password"));
		}
		catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	// 获得数据库连接
	public static Connection getCon(){
		return con;
	}
	
	// 关闭资源
	public static void closeResource(Object...rs) {
		for(Object o : rs) {
			String ObjectName = o.getClass().getSimpleName();
			try {
				if ("ResultSet".indexOf(ObjectName) != -1) {
					ResultSet rst = (ResultSet) o;
					rst.close();
				}
				if ("Statement".indexOf(ObjectName) != -1) {
					Statement st = (Statement) o;
					st.close();
				}
				/*if ("Connection".indexOf(ObjectName) != -1) {
					Connection con = (Connection) o;
					con.close();
				}*/
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
