package campus.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

    public static void main(String[] args) {

        try {

            String url = "jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC";
            String user = "root";
            String pw = "qwe123!@#";
            Connection conn = DriverManager.getConnection(url, user, pw);

            System.out.println("123");

            //연결 실패 시, 다시 재 연결
            if(conn == null || conn.isClosed()) {
                conn = DriverManager.getConnection(url, user, pw);
                System.out.println("체크");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
