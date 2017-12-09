package canender;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;//注意这些嵌入其中的类的写法
import java.util.Date;
import java.util.Calendar;
public class Cld {
	public static void main(String[] args) throws ParseException{
		// TODO Auto-generated method stub
		//1.
		Calendar C=Calendar.getInstance();
		int year=C.get(Calendar.YEAR);
		int month=C.get(Calendar.MONTH);
		int day=C.get(Calendar.DAY_OF_MONTH);
		int hour=C.get(Calendar.HOUR_OF_DAY);
		int minutes=C.get(Calendar.MINUTE);
		int second=C.get(Calendar.SECOND);
		System.out.println(year+"-"+(month+1)+"-"+day+"     "+hour+"-"+minutes+"-"+second);
		//此种方式可以得到改变的时间
		
		//Date和Calendar相互转化
		Date  t=C.getTime();
		System.out.println(t);
		
		Long inmilits=C.getTimeInMillis();
		System.out.println(inmilits);//获得当前的毫秒数
		
		
		
		
		//2.                改变显示时间的格式
		Date now=new Date();
		System.out.println(now);
		
		Date now1=new Date();
        SimpleDateFormat s=new SimpleDateFormat("yyyy年yy月yy日      yy时yy分yy秒");//创建格式的对象
        String S=s.format(now1);
        System.out.println(S);
        
        //3.                将改变的时间样式还原成国际标准样式
        String g=S;
        SimpleDateFormat s1=new SimpleDateFormat("yyyy年yy月yy日      yy时yy分yy秒");
        Date d2=s1.parse(g);
        System.out.println(d2);
        
	}

}
