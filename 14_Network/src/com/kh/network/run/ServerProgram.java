package com.kh.network.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerProgram {

	public static void main(String[] args) {

		/*
		 * 통신을 하기 위해서는 데이터 전송 이전에 서버와 클라이언트의 연결이 필요함.
		 * 
		 * ServerSocket
		 * - 포트번호와 연결(Bind)해서 외부의 연결요청을 기다리다가 연결요청이 들어오면 수락해주는 용도
		 * - 수락하는 순간 서버의 Socket 객체 생성
		 * 
		 * Socket
		 * - Process 간의 통신을 담당함
		 * - Socket 객체를 이용해서 통신을 위한 기반스트림 InputStream / OutpitStream을 제공받음
		 * - 기반스트림만으로는 제약이 있으니 보조스트림을 사용할 것.
		 *   
		 *   
		 * - 소켓 통신용 서버측 프로그램 작성 절차
		 * (0)) 필요한 변수 세팅
		 * 1) 포트 번호 지정(서버측에서 몇 번 포트를 열어둘 것인지
		 * 2) ServerSocket 객체 생성 -> 생성자 인자값으로 포트번호 전달(포트결합 - Binding)
		 * 3) 대기상태 
		 * 4) 클라이언트가 연결요청을 하면 수락한 후 통신가능한 Socket 객체를 반환받음
		 * 5) Socket 객체를 이용해서 입/출력용 스트림을 열어주기
		 * 6) 보조스트림을 추가하여 성능 개선
		 * 7) 데이터 주고받기
		 * 8) 자원반납
		 */
		
		// 서버측 프로그램
		
		// 0) 필요한 변수 세팅
		Scanner sc = new Scanner(System.in);
		
		// 자원반납을 위해 미리 참조변수 선언하고 null 값으로 초기화
		ServerSocket server = null;
		PrintWriter pw = null;
		BufferedReader br = null;
		
		// 1) 포트번호 지정
		int portNumber = 12322; // 0~1023 번호들은 Well Known Port로 루트 권한이 있어야 사용가능하며 그렇지 않을 경우 충돌할 가능성이 높다.
		
		try {
			// 2) ServerSocket 객체 생성
			server = new ServerSocket(portNumber);
			

			// 3) 대기상태
			System.out.println("대기중");
			
			// 4) 연결요청이 오면 수락 후 해당 클라이언트와 통신할 수 있는 Socket 객체 생성 예정
			// ServerSocket 클래스의 메소드로 accept() : 사용하고 Socket 객체 반환함.
			
			Socket socket = server.accept();
			// 클라이언트가 연결요청을 할 때까지 하염없이 기다리는 상태가 됨.			
			System.out.println("클라이언트와 연결 완료");
			
			// Socket 객체를 이용해서 Client의 정보를 반환받을 수 있음
			System.out.println(socket.getInetAddress().getHostName());
			
			// 5) 클라이언트와 통신할 수 있는 입/출력용 스트림 생성
			// 6) 보조스트림을 추가해서 성능 개선
			
			socket.getInputStream(); // InputStream은 Byte 형 스트림(1 Byte 크기)인데, BufferedReader는 Char 스트림(2 Byte 크기)이므로 직접적으로는 호환이 안 되는 문제가 발생함.
			br = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 따라서 이를 호환시켜주는 InputStreamReader도 사용해주어야 함. 
			
			// 출력용 스트림(서버가 클라이언트에게 데이터를 전송하기 위한 스트림)
			socket.getOutputStream();
			pw = new PrintWriter(socket.getOutputStream()); // PrintWriter는 2Byte짜리 문자용 스트림이지만 1Byte짜리와도 자동으로 호환이 가능하다.
			
			// 7) 데이터 주고 받기
			// Client와 데이터를 주고 받도록 구성
			while(true) {
				
				// 7_1) 입력받기
				String message = br.readLine();
				System.out.println("클라이언트로부터 받은 메시지 : " + message);
				
				// 7_2) 출력하기
				System.out.print("클라이언트에게 보낼 메시지 > ");
				String sendMessage = sc.nextLine();
				pw.println(sendMessage);
				
				// 스트림에 있는 데이터를 강제로 내보내는 메소드
				pw.flush();
			}
			
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			// 8) 자원 반납 -> 생성의 역순으로
			try {
				if(pw != null) {
			pw.close();
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
			try {
				if(sc != null) {
			sc.close();		
				}
			} catch(Exception e) {
					e.printStackTrace();
				}
			}
			try {
				if(br != null) {
			br.close();		
				}
			} catch(Exception e) {
					e.printStackTrace();
				}
			try {
				if(server != null) {
				server.close();		
				}
			} catch(Exception e) {
				e.printStackTrace();
					}
			}
}
			
			
		
		
		
		
	


