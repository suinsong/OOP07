package com.bit.oop7.inout;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInput01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = "src/com/bit/oop7/inout/Data.txt";
		try {
			FileInputStream fileIn = new FileInputStream(fileName);
			DataInputStream dataIn = new DataInputStream(fileIn);

			int ch = 0;
			//1byte씩 읽음
			while ((ch = dataIn.read()) != -1) {
				if (ch == -1)
					break;
				System.out.println((char) ch);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace(); 이거는 바로 중단해버리는 거라 이렇게 메시지 만들어 주는 거임
			System.out.println("파일을 열 수 없습니다");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("파일을 읽을 수 없습니다");
		}

	}

}
