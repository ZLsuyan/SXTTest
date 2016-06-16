package JDBC;
import java.sql.*;

/**
 * дһ����ɵ�JDBC�ĳ�����Ҫ��ע��JDBC�����д�ĺõı��ϰ�ߺ�������
 * @author zengli
 * @date 2016/5/22
 */
public class TestMysqlConnection {
	public static void main(String[] args) {	
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			conn = DriverManager.getConnection("jdbc:mysql://localhost/mydata?user=root&password=123456");
			/*
			 * ��ע�⣺������Statementʱ�����뽫SQL���д��executeQuery���棬��ȫ�Ե͡�
			 */
			pstmt = conn.prepareStatement("insert into dept values (?,?,?)");
			pstmt.setInt(1, 55);
			pstmt.setString(2, "db");
			pstmt.setString(3, "����");
			int n = pstmt.executeUpdate();
			if(n==1){
				System.out.println("����ɹ�");
			}
			/*
			 * ��ע�⣺��
			 * ��PreparedStatement�ӿڼ̳���Statement��
			 * PreparedStatement��ʵ�����������Ԥ�����SQL��䣬������ִ���ٶ�Ҫ����Statement��
			 * ����Ϊ��ʹ��Ԥ������䣬��˼��������˰�ȫ�ԡ�
			 */
	//		PreparedStatement pst = conn.prepareStatement("Select * from dept");
	//		ResultSet rs1 = pst.executeQuery();
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException ex) {
			System.out.println("SQLException:"+ex.getMessage());
			System.out.println("SQLState:"+ex.getSQLState());
			System.out.println("VendorError:"+ex.getErrorCode());
		}finally {
			try {
				if(pstmt != null) {
					pstmt.close();
					pstmt = null;
				}
				if(conn !=null){
					conn.close();
					conn = null;
				}
				
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
}
