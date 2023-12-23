package org.opentutorials.javatutorials.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scanner3Demo {

	public static void main(String[] args) {
		try {
			File file = new File("out.txt");
			Scanner sc = new Scanner(file);
			//file로 지정하게 되면 지정된 파일의 내용을 가져온다.
			while(sc.hasNext()) {
				System.out.println(sc.nextInt() * 1000);
			}
			sc.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace(); //예외의 경우를 처리하는 방법
		}
	}
}