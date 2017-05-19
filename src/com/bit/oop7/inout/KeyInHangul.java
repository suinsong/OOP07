package com.bit.oop7.inout;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class KeyInHangul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ★★한글입력하는 방법
		
		
		InputStream ins = System.in;
		InputStreamReader hKB = new InputStreamReader(ins);

		System.out.println("문자열을 입력하세요");
		int ch = 0;
		try {
			while ((ch = hKB.read()) != -1) {
				if (ch == 13)
					break;

				System.out.println((char) ch);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
