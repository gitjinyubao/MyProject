package riqi_zh;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Now {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub//一定要加上throws ParseException ，否则不能执行
		Date now=new Date();
		System.out.println(now);//显示当前时间
		SimpleDateFormat s=new SimpleDateFormat("yyyy年aa月dd日    hh时ss分mm秒");
		String S=s.format(now);//此为String类型
		System.out.println(S);
		
		//String date="2016-9-29  16:49:20";
          String date=S;
          SimpleDateFormat s1=new SimpleDateFormat("yyyy年aa月dd日    hh时ss分mm秒");
          Date d2=s1.parse(date);
          System.out.println(d2);

	}

}
