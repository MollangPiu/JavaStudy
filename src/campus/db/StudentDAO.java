package campus.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
	
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;

	
	public StudentDAO() {

		try {
			final String URL = "jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC";
			final String USER = "study";
			final String PW = "1234";

			this.conn = DriverManager.getConnection(URL, USER, PW);

			if (conn == null || conn.isClosed()) {
				System.out.println("== 재 연결 중 ==");
				conn = DriverManager.getConnection(URL, USER, PW);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//state
	//preparedStatement
	public void registStatment(StudentVO studentVO) {
		try {
			
			stmt = conn.createStatement();
			String sql = "INSERT into T_STUDENT ( NAME, KOR_SCORE, ENG_SCORE, MATH_SCORE ) "
					+ "VALUES('"+ studentVO.getName() + "', "+ studentVO.getKorScore()+", "+studentVO.getEngScore()+", "+studentVO.getMathScore()+")";
			
			int result = stmt.executeUpdate(sql);
			
			conn.commit();
			System.out.println("result: "+result);
		}
		catch(Exception e) {
			e.printStackTrace();
		} finally {
			try { if(stmt != null) {stmt = null; } } catch(Exception e) {}
			try { if(conn != null) {conn = null; } } catch(Exception e) {}
		}
	}
	
	public List<StudentVO> printStatment() {
		
		List<StudentVO> lists = new ArrayList<StudentVO>();
		try {
			
			stmt = conn.createStatement();
			String sql = "select IDX, NAME, KOR_SCORE, ENG_SCORE, MATH_SCORE from T_STUDENT";
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				StudentVO stu = new StudentVO();
				int idx = rs.getInt("IDX");
				stu.setIdx(idx);
				String name = rs.getString("NAME");
				stu.setName(name);
				int korScore =  rs.getInt("KOR_SCORE");
				stu.setKorScore(korScore);
				int engScore = rs.getInt("ENG_SCORE");
				stu.setEngScore(engScore);
				int mathScore = rs.getInt("MATH_SCORE");
				stu.setMathScore(mathScore);
				lists.add(stu);
			}
			
			
			return lists;
			
		}
		catch(Exception e) {
			e.printStackTrace();
		} finally {
			try { if(rs != null) {rs = null; } } catch(Exception e) {}
			try { if(stmt != null) {stmt = null; } } catch(Exception e) {}
			try { if(conn != null) {conn = null; } } catch(Exception e) {}
		}
		
		
		return lists;
	}
	
}
