import java.sql.*;

public abstract class Aadb {

	String jdbcDriver = "com.mysql.cj.jdbc.Driver";
	String jdbcUrl = "jdbc:mysql://localhost/event?serverTimezone=UTC";
	Connection conn;
	
	PreparedStatement pstmt;
	ResultSet rs;
	
	public void connectDB() {
		try {
			// 1단계 JDBC 드라이버 로드
			Class.forName(jdbcDriver);
			
			// 2단계 데이터 베이스 연결
			conn = DriverManager.getConnection(jdbcUrl,"oz","kim008");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void closeDB() {
		try {
			//6단계 연결해제
			pstmt.close();
			rs.close();
			conn.close();
		} catch(SQLException e ) {
			e.printStackTrace();
		}
		
	}
}
