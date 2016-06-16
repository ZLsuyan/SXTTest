package cn.edu.hit;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * 对于日期、时间、以及时区的处理，以及字符串如何转换成日期的处理
 * @author zengli
 * @date 2016/5/30
 */
public class TestDateAndTime {
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		Date d = new Date();
		System.out.println("使用Date获得的系统时间: "+d);
		Calendar c = Calendar.getInstance();
		System.out.println("现在是5月的第"+c.get(Calendar.DAY_OF_MONTH)+"天。");
		
		String s = "2105-04-28 19:10:20.0";
		Timestamp ts = Timestamp.valueOf(s);
		System.out.println(ts);
		c.setTime(ts);
		System.out.println("这是2015的第"+c.get(Calendar.DAY_OF_YEAR)+"天。");
		
		Calendar cJapan = new GregorianCalendar(TimeZone.getTimeZone("JAPAN"));
		System.out.println("现在是日本的"+cJapan.get(Calendar.HOUR_OF_DAY)+"点。");
		
	} 
}
