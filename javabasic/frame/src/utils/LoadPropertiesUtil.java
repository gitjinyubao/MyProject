package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class LoadPropertiesUtil {
	
	public Map<String, String> getPropertiesInfo(String fileName) {
		// �洢�ļ�����ϸ��Ϣ
		Map<String, String> map = new HashMap<String, String>();
		
		try {
			// �����ļ�
			Properties ps = new Properties();
			FileInputStream fis = new FileInputStream(fileName);
			ps.load(fis);
			fis.close();
			
			// ���ļ�����Ϣ�洢����map��
			ps.entrySet();
			Set<Entry<Object, Object>> s = ps.entrySet();
			for(Entry<Object, Object> e : s) {
				map.put(e.getKey().toString(), e.getValue().toString());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return map;
	}
}
