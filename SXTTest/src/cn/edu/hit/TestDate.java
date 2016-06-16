package cn.edu.hit;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 测试日期格式化
 * @author zengli
 * @date 2016/5/22
 */
public class TestDate {
	public static void main(String[] args) {
		java.util.Date d = new Date();
		//MM是表示月份Month，mm是表示分钟minute。
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日  hh时mm分ss秒");
		String str = sdf.format(d);
		System.out.println(str);
		
		
	/*******************************************************************************************************/
		/*
		 * 同时介绍一下java.util.Date的子类java.sql.TimeStamp，
		 * 它不同于它另外两个子类java.sql.Date（只能保存年月日），和java.sql.Time(只能保存时分秒)，
		 * java.sql.TimeStamp时间戳能保存(年月日、时分秒、纳秒)，
		 * 同时它和SimpleDateFormat都是继承于java.util.Date，因此它也可以用SimpleDateFormat的format方法进行格式化。
		 */
		/*
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/mydata?user=root&password=123456");
			
			// 【注意：】当用Statement时，必须将SQL语句写在executeQuery里面，安全性低。
		
			stmt = conn.createStatement();
			rs = stmt.executeQuery("Select * from dept order by depno desc");
			Timestamp td = rs.getTimestamp("1");
			SimpleDateFormat sdf1 = new SimpleDateFormat(" hh:mm:ss");
		} catch(ClassNotFoundException e){
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) {
					rs.close();
					rs = null;
				}
				if(stmt != null) {
					stmt.close();
					stmt = null;
				}
				if(conn !=null){
					conn.close();
					conn = null;
				}
				
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		*/
	}
}