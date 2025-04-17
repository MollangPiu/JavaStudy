package campus.db;

import java.util.Scanner;

import study.db.연결체크.DBConnection;

class 실행 {

	//프로젝트 실행 부분
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		new StudentManagerment().main(sc);

		//DBConnection.connectionCheck();
	}

}
