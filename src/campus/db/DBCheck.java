package campus.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 * 테스트용 DB
 * CREATE TABLE MEMBER_INDEX (
 *     NUM INT AUTO_INCREMENT PRIMARY KEY,
 *     COUNT INT,
 *     NAME VARCHAR(30),
 *     KOR_SCORE INT,
 *     ENG_SCORE INT,
 *     MATH_SCORE INT
 * );
 *
 * CREATE TABLE MEMBER_TRIM (
 *     NUM INT AUTO_INCREMENT PRIMARY KEY,
 *     COUNT INT,
 *     COUNTRY VARCHAR(30),    -- 가고싶은 여행지
 *     PRICE VARCHAR(30)       -- 소지금
 * );
 */
public class DBCheck {

    Connection conn;
    PreparedStatement pstmt;
    ResultSet rs;

    public DBCheck() {
        try {
            String url = "jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC";
            String user = "root";
            String pw = "1234";
            conn = DriverManager.getConnection(url, user, pw);

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insert(int count) {


        String sql = "INSERT INTO MEMBER_INDEX (COUNT, NAME, KOR_SCORE, ENG_SCORE, MATH_SCORE) VALUES (?, ?, ?, ?, ?)";

        try {
            pstmt = conn.prepareStatement(sql);

            for(int i=0; i< count; i++) {
                System.out.println("i: "+i);
                String name = RandomName.randomName();
                int randomValue = (int) (Math.random() * 91 + 10);

                pstmt.setInt(1, i);
                pstmt.setString(2, name);
                pstmt.setInt(3, randomValue);
                randomValue = (int) (Math.random() * 91 + 10);
                pstmt.setInt(4, randomValue);
                randomValue = (int) (Math.random() * 91 + 10);
                pstmt.setInt(5, randomValue);
                
                int result = pstmt.executeUpdate();
                System.out.println("결과: "+result);
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(rs != null) rs.close();
                if(pstmt != null) pstmt.close();
                if(conn != null) conn.close();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void delete() {
        String sql = "DELETE FROM MEMBER";

        try {
            pstmt = conn.prepareStatement(sql);

            int result = pstmt.executeUpdate();

            System.out.println("결과: "+result);

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(rs != null) rs.close();
                if(pstmt != null) pstmt.close();
                if(conn != null) conn.close();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    String [] country = {"프랑스", "독일", "일본", "미국", "스위스"};
    String [] price = {"1000만", "800만", "500만", "300만", "100만"};

    public void inserSecond(int count) {


        String sql = "INSERT INTO MEMBER_TRIM (COUNT, COUNTRY, PRICE) VALUES (?, ?, ?)";

        try {
            pstmt = conn.prepareStatement(sql);

            for(int i=0; i< count; i++) {
                System.out.println("i: "+i);
                String name = RandomName.randomName();
                int randomValue = (int) (Math.random() * 5);

                pstmt.setInt(1, i);
                pstmt.setString(2, country[randomValue]);
                randomValue = (int) (Math.random() * 5);
                pstmt.setString(3, price[randomValue]);

                int result = pstmt.executeUpdate();
                System.out.println("결과: "+result);
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(rs != null) rs.close();
                if(pstmt != null) pstmt.close();
                if(conn != null) conn.close();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        DBCheck dbCheck = new DBCheck();

        //dbCheck.insert(2000000);
        dbCheck.inserSecond(2000000);



       // dbCheck.delete();
    }
}
