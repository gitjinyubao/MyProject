package canender;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;//ע����ЩǶ�����е����д��
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
		//���ַ�ʽ���Եõ��ı��ʱ��
		
		//Date��Calendar�໥ת��
		Date  t=C.getTime();
		System.out.println(t);
		
		Long inmilits=C.getTimeInMillis();
		System.out.println(inmilits);//��õ�ǰ�ĺ�����
		
		
		
		
		//2.                �ı���ʾʱ��ĸ�ʽ
		Date now=new Date();
		System.out.println(now);
		
		Date now1=new Date();
        SimpleDateFormat s=new SimpleDateFormat("yyyy��yy��yy��      yyʱyy��yy��");//������ʽ�Ķ���
        String S=s.format(now1);
        System.out.println(S);
        
        //3.                ���ı��ʱ����ʽ��ԭ�ɹ��ʱ�׼��ʽ
        String g=S;
        SimpleDateFormat s1=new SimpleDateFormat("yyyy��yy��yy��      yyʱyy��yy��");
        Date d2=s1.parse(g);
        System.out.println(d2);
        
	}

}
