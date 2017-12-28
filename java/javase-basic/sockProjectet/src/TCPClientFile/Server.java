package TCPClientFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(8888);
		
		Socket s = ss.accept();
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String line = bufferedReader.readLine();
		
		while ((line = bufferedReader.readLine()) != null) {
			/*if ("over".equals(line)) {
				break;
			}*/
			System.out.println(line);
		}
		
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		bufferedWriter.write("∂¡»°ÕÍ±œ");
		bufferedWriter.newLine();
		bufferedWriter.flush();
		
		s.close();
	}
}
