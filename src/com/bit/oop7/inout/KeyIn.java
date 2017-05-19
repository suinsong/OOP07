package com.bit.oop7.inout;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class KeyIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);// 키보드와 컴퓨터 연결 준비

		System.out.println("영문자 KOREA를 입력하세요");
		InputStream kb = System.in;

		int ch = 0;
		try {
			while ((ch = kb.read()) != -1) {
				if (ch == 13) break;//엔터를 치면 그만해라 엔터13 ESC27
 				System.out.println((char) ch);

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("키보드로부터 값을 읽을 수 없습니다");
		}
	}

}
