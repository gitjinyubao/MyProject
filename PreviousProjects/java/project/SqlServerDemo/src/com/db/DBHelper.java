package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * JDBC������
 * @author Administrator
 *
 */
public class DBHelper {
	private static  String DRIVER="com.microsoft.sqlserver.jdbc.SQLServerDriver";//�������·��
	private static  String USERNAME="sa";
	private static  String PASSWORD="1";
	private static  String URL="jdbc:sqlserver://localhost:1433;database=School";

	/**
	 * �������
	 * @return
	 */
	public static Connection getConn(){
		Connection conn = null;
		try {
			//��������
			Class.forName(DRIVER);
			//�������������Ļ����ϻ������
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
	
	/**
	 * �ر�����
	 * @param conn
	 */
	public static void closeConn(Connection conn){
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
	
	/**
	 * ����SQL����в�����ֵ
	 * @param ps
	 * @param values
	 */
	public static void setParam(PreparedStatement ps,Object...values){
		//�ж�SQL������Ƿ��в�
		if(values.length>0){
			//ѭ�����ò�����ֵ
			for (int i = 0; i < values.length; i++) {
				try {
					ps.setObject(i+1, values[i]);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	/**
	 * ִ���� ɾ ��
	 * @param conn
	 * @param sql
	 * @param values
	 * @return
	 */
	public static int executeUpdate(Connection conn, String sql,Object...values){
		int count=0;
		try {
			//��дSQL���
			PreparedStatement ps = conn.prepareStatement(sql);
			//���ò�����ֵ
			setParam(ps,values);
			//ִ��SQL���
			count = ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}
	
	/**
	 * ִ�в�ѯ
	 * @param conn
	 * @param sql
	 * @param values
	 * @return
	 */
	public static ResultSet executeQuery(Connection conn, String sql,Object...values){
		ResultSet rs = null;
		try {
			//��дSQL���
			PreparedStatement ps = conn.prepareStatement(sql);
			//���ò�����ֵ
			setParam(ps,values);
			//ִ��SQL���
			rs  = ps.executeQuery();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	public static void main(String[] args) {
		DBHelper db=new DBHelper();
		Connection con=db.getConn();
		System.out.println(con);
	}
}
