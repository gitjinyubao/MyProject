package comman.jdbc;

import java.sql.Connection;
import java.util.LinkedList;

import utils.ConstantUtil;
import utils.DBUtil;
import utils.LoadPropertiesUtil;

/*
 * ͨ��ʵ��DataSource�������Լ������ݿ����ӳ�
 */
public class DataPool {
	
	// ����Linkedlist����Ϊ�洢���ݿ����ӵļ��ϣ��ڲ��������ݽ������������Ƴ��Լ����
	private static LinkedList<Connection> pool = new LinkedList<Connection>();
	
	static {
		try {	
			int maxConNum = Integer.parseInt(LoadPropertiesUtil.getPropertiesInfo(ConstantUtil.JDBC_PROPERTY_PATH).get("maxNum"));
			for (int i = 0; i < maxConNum; i++) {
				Connection con = DBUtil.getCon(); //�õ�һ������
				DataPool.pool.add(con);
			}
		} catch(Exception e) {
			throw new ExceptionInInitializerError("���ݿ�����ʧ�ܣ���������");
		}
	}
	
	// �ӳ��еõ�һ������
	public static Connection getConFromPool() {
		if (!pool.isEmpty()) {
			return DataPool.pool.removeFirst();
		} else {
			return null;
		}
	}
	
	// �ͷ���Դ
	public static void release(Connection con){
		if (con != null) {
			DataPool.pool.addLast(con);
		}
	}
}
