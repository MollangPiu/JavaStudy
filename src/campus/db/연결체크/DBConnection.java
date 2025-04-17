package campus.db.연결체크;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * DB 연결 체크 하는 용
 */
public class DBConnection {

	public static void connectionCheck() {
		
		try {
			final String URL = "jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC";
			final String USER = "root";
			final String PW = "1234";
			
			Connection conn = DriverManager.getConnection(URL, USER, PW);
			
			if(conn == null || conn.isClosed()) {
				System.out.println("== 재 연결 중 ==");
				conn = DriverManager.getConnection(URL, USER, PW);
			}
			
			System.out.println("연결 확인!");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
