package com.sunny.breakpointdown;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/*
 * ģ��ϵ�����
 */
public class Test {
	
	public static void main(String[] args) throws IOException {
		// ����Ҫ���ص���Դ
		URL url = new URL("http://www.sunny.com/a.txt");
		HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
		// tomcat6��ʼ֧�ֶϵ�����
		httpURLConnection.setRequestProperty("Range", "bytes=5-");
		// ��ȡ����
		InputStream in = httpURLConnection.getInputStream();
		int len = 0;
	    byte[] buffer = new byte[1024];
	    // trueΪappend׷�ӵ���˼
	    FileOutputStream out = new FileOutputStream("F:\\a.txt", true);
	    
	    while((len = in.read(buffer)) > 0) {
	    	out.write(buffer, 0, len);
	    }
	    
	    in.close();
	    out.close();
	    
	    /*
	     *  ����
	     *  	Exception in thread "main" java.io.IOException: Server returned HTTP response code: 416 for URL: http://www.sunny.com/a.txt
				at sun.net.www.protocol.http.HttpURLConnection.getInputStream0(HttpURLConnection.java:1840)
				at sun.net.www.protocol.http.HttpURLConnection.getInputStream(HttpURLConnection.java:1441)
				at a.Test.main(Test.java:21)
		    HTTP response code: 416�����ڶ�ȡ�ļ�ʱ���õ�Range������ɵģ������˵�����������д�������
		    	httpURLConnection.setRequestProperty("Range", "bytes5-");-------��������
		    	httpURLConnection.setRequestProperty("Range", "bytes=5-");
	     */
	}
}
