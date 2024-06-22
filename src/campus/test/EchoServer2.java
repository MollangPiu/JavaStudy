package campus.test;

import java.io.*;
import java.net.*;

public class EchoServer2 {
	private ServerSocket serverS;

	public EchoServer2(int port) {
		try {
			serverS = new ServerSocket(port);
			System.out.println("서버가 시작되었습니다. 포트: " + port);
		} catch (IOException ioe) {
			ioe.printStackTrace();
			System.exit(0);
		}

		while (true) {
			Socket tcpSocket = null;
			try {
				tcpSocket = serverS.accept(); // 클라이언트 연결 수락
				System.out.println("입장 IP : " + tcpSocket.getInetAddress().getHostAddress());

				handleClient(tcpSocket);
			} catch (IOException ioe) {
				ioe.printStackTrace();
			} finally {
				if (tcpSocket != null) {
					try {
						tcpSocket.close(); // 클라이언트 소켓 닫기
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	private void handleClient(Socket clientSocket) {
		try (BufferedReader bufferR = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			 BufferedWriter bufferW = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()))) {

			String message;
			while ((message = bufferR.readLine()) != null) {
				if ("exit".equalsIgnoreCase(message.trim())) {
					break; // "exit" 입력 시 연결 종료
				}
				System.out.println("Received message: " + message);
				message += System.getProperty("line.separator");
				bufferW.write(message);
				bufferW.flush();
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new EchoServer2(3002);
	}
}
