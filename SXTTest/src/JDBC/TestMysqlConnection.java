package JDBC;
import java.sql.*;

/**
 * 写一个完成的JDBC的程序，主要是注意JDBC程序编写的好的变成习惯和完整性
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
			 * 【注意：】当用Statement时，必须将SQL语句写在executeQuery里面，安全性低。
			 */
			pstmt = conn.prepareStatement("insert into dept values (?,?,?)");
			pstmt.setInt(1, 55);
			pstmt.setString(2, "db");
			pstmt.setString(3, "北京");
			int n = pstmt.executeUpdate();
			if(n==1){
				System.out.println("插入成功");
			}
			/*
			 * 【注意：】
			 * 而PreparedStatement接口继承了Statement，
			 * PreparedStatement的实例对象包含已预编译的SQL语句，所以其执行速度要快于Statement。
			 * 又因为它使用预编译语句，因此极大地提高了安全性。
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
