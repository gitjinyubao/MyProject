package timer;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

class MyTaskOne extends TimerTask{
	@Override
	public void run() {
		File srcFolder = new File("demo");
		deleteFolder(srcFolder);
	}
	
	// µÝ¹éÊÇÉ¾³ýÄ¿Â¼
	public void deleteFolder(File srcFolder) {
		File[] fileArray = srcFolder.listFiles();
		
		if (fileArray != null) {
			for (File file : fileArray) {
				if (file.isDirectory()) {
					deleteFolder(file);
				} else {
					file.delete();
				}
			}
			
			srcFolder.delete();
		}
	}
}

public class TimerDemoThree{
	public static void main(String[] args) throws ParseException {
		Timer t = new Timer();
		
		String s = "2017-10-15 09:36:00";
		SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = time.parse(s);
		
		t.schedule(new MyTaskOne(), d, 2000);
	}
}
