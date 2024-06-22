package campus.test;

import java.io.*;
import java.net.*;

public class EchoClient2 {
	private String ip;
	private int port;
	private BufferedReader file;
	private BufferedWriter bufferW;
	private BufferedReader bufferR;
	private Socket tcpSocket;

	public EchoClient2(String ip, int port) {
		this.ip = ip;
		this.port = port;
		try {
			tcpSocket = new Socket(ip, port);  // 소켓 생성
			OutputStream os_socket = tcpSocket.getOutputStream();
			InputStream is_socket = tcpSocket.getInputStream();

			bufferW = new BufferedWriter(new OutputStreamWriter(os_socket));
			bufferR = new BufferedReader(new InputStreamReader(is_socket));
			file = new BufferedReader(new InputStreamReader(System.in));

			while (true) {
				System.out.print("입력: ");
				String str = file.readLine();  // 사용자 입력 받기
				if (str.equalsIgnoreCase("exit")) {  // "exit" 입력 시 반복문 종료
					closeResources();  // 자원 정리
					break;
				}
				str += System.getProperty("line.separator");  // 줄바꿈 추가
				bufferW.write(str);  // 서버로 전송
				bufferW.flush();

				str = bufferR.readLine();  // 서버로부터 응답 받기
				if (str != null) {
					System.out.println("Echo Result: " + str);
				} else {
					System.out.println("서버 연결이 종료되었습니다.");
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void closeResources() {
		try {
			if (file != null) file.close();
			if (bufferW != null) bufferW.close();
			if (bufferR != null) bufferR.close();
			if (tcpSocket != null) tcpSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new EchoClient2("localhost", 3002);
	}
}
