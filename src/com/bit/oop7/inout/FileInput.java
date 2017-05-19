package com.bit.oop7.inout;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = "src/com/bit/oop7/inout/data.txt";
		FileInputStream fileIn=null;
		DataInputStream dataIn=null;
		
		
		try {
			
			fileIn=new FileInputStream(fileName);
			
//			FileInputStream fileIn = new FileInputStream(fileName);//파일오픈
//			DataInputStream dataIn = new DataInputStream(fileIn);// 파일연결과 읽기

			int ch = 0;
			while ((ch = dataIn.read()) != -1) {
				if (ch == 0)
					break;
				System.out.println((char) ch);
			}
			// System.out.println(dataIn.readLine());

			//파일 오픈 오류(파일이 없어졌을때 발생
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("파일이 없습니다");
			
			
			//파일 읽기 read예외 잡아주기
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("읽기 예외가 발생했습니다");
		}

	}

}
