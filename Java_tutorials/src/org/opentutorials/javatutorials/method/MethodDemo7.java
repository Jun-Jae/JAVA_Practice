package org.opentutorials.javatutorials.method;

import java.io.BufferedWriter;
import *;

public class MethodDemo7 {
	
	public static String numbering(int init, int limit) {
		int i = init;
		String output = "";
		while(i < limit) {
			output += i;
			i++;
		}
		return output;
	}
	
	public static void main(String[] args) {
		String result = numbering(1, 5);
		System.out.println(result);
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
			out.write(result);
			out.close();
		} catch(IOException e) {
		}
	}
} // 메소드를 이용하면 한번에 다양한 작업을 수행할 수 있다. 예) 파일기록, 저장
