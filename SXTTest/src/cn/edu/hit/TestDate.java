package cn.edu.hit;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * �������ڸ�ʽ��
 * @author zengli
 * @date 2016/5/22
 */
public class TestDate {
	public static void main(String[] args) {
		java.util.Date d = new Date();
		//MM�Ǳ�ʾ�·�Month��mm�Ǳ�ʾ����minute��
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��  hhʱmm��ss��");
		String str = sdf.format(d);
		System.out.println(str);
		
		
	/*******************************************************************************************************/
		/*
		 * ͬʱ����һ��java.util.Date������java.sql.TimeStamp��
		 * ����ͬ����������������java.sql.Date��ֻ�ܱ��������գ�����java.sql.Time(ֻ�ܱ���ʱ����)��
		 * java.sql.TimeStampʱ����ܱ���(�����ա�ʱ���롢����)��
		 * ͬʱ����SimpleDateFormat���Ǽ̳���java.util.Date�������Ҳ������SimpleDateFormat��format�������и�ʽ����
		 */
		/*
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/mydata?user=root&password=123456");
			
			// ��ע�⣺������Statementʱ�����뽫SQL���д��executeQuery���棬��ȫ�Ե͡�
		
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