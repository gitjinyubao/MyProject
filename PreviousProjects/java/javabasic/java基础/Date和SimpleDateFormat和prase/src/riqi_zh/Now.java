package riqi_zh;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Now {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub//һ��Ҫ����throws ParseException ��������ִ��
		Date now=new Date();
		System.out.println(now);//��ʾ��ǰʱ��
		SimpleDateFormat s=new SimpleDateFormat("yyyy��aa��dd��    hhʱss��mm��");
		String S=s.format(now);//��ΪString����
		System.out.println(S);
		
		//String date="2016-9-29  16:49:20";
          String date=S;
          SimpleDateFormat s1=new SimpleDateFormat("yyyy��aa��dd��    hhʱss��mm��");
          Date d2=s1.parse(date);
          System.out.println(d2);

	}

}
