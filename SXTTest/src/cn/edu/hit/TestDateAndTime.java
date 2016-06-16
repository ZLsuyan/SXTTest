package cn.edu.hit;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * �������ڡ�ʱ�䡢�Լ�ʱ���Ĵ����Լ��ַ������ת�������ڵĴ���
 * @author zengli
 * @date 2016/5/30
 */
public class TestDateAndTime {
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		Date d = new Date();
		System.out.println("ʹ��Date��õ�ϵͳʱ��: "+d);
		Calendar c = Calendar.getInstance();
		System.out.println("������5�µĵ�"+c.get(Calendar.DAY_OF_MONTH)+"�졣");
		
		String s = "2105-04-28 19:10:20.0";
		Timestamp ts = Timestamp.valueOf(s);
		System.out.println(ts);
		c.setTime(ts);
		System.out.println("����2015�ĵ�"+c.get(Calendar.DAY_OF_YEAR)+"�졣");
		
		Calendar cJapan = new GregorianCalendar(TimeZone.getTimeZone("JAPAN"));
		System.out.println("�������ձ���"+cJapan.get(Calendar.HOUR_OF_DAY)+"�㡣");
		
	} 
}
