package com.sunny.breakpointdown;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/*
 * 模拟断点下载
 */
public class Test {
	
	public static void main(String[] args) throws IOException {
		// 连接要下载的资源
		URL url = new URL("http://www.sunny.com/a.txt");
		HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
		// tomcat6开始支持断点续传
		httpURLConnection.setRequestProperty("Range", "bytes=5-");
		// 读取数据
		InputStream in = httpURLConnection.getInputStream();
		int len = 0;
	    byte[] buffer = new byte[1024];
	    // true为append追加的意思
	    FileOutputStream out = new FileOutputStream("F:\\a.txt", true);
	    
	    while((len = in.read(buffer)) > 0) {
	    	out.write(buffer, 0, len);
	    }
	    
	    in.close();
	    out.close();
	    
	    /*
	     *  报错：
	     *  	Exception in thread "main" java.io.IOException: Server returned HTTP response code: 416 for URL: http://www.sunny.com/a.txt
				at sun.net.www.protocol.http.HttpURLConnection.getInputStream0(HttpURLConnection.java:1840)
				at sun.net.www.protocol.http.HttpURLConnection.getInputStream(HttpURLConnection.java:1441)
				at a.Test.main(Test.java:21)
		    HTTP response code: 416是由于读取文件时设置的Range有误造成的，具体的说就是下面这行代码有误：
		    	httpURLConnection.setRequestProperty("Range", "bytes5-");-------》》》》
		    	httpURLConnection.setRequestProperty("Range", "bytes=5-");
	     */
	}
}
