import java.sql.*;

public abstract class Aadb {

	String jdbcDriver = "com.mysql.cj.jdbc.Driver";
	String jdbcUrl = "jdbc:mysql://localhost/event?serverTimezone=UTC";
	Connection conn;
	
	PreparedStatement pstmt;
	ResultSet rs;
	
	public void connectDB() {
		try {
			// 1�ܰ� JDBC ����̹� �ε�
			Class.forName(jdbcDriver);
			
			// 2�ܰ� ������ ���̽� ����
			conn = DriverManager.getConnection(jdbcUrl,"oz","kim008");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void closeDB() {
		try {
			//6�ܰ� ��������
			pstmt.close();
			rs.close();
			conn.close();
		} catch(SQLException e ) {
			e.printStackTrace();
		}
		
	}
}
