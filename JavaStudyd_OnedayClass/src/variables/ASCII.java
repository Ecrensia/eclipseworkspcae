package variables;

import java.util.Scanner;

/*
	 * Writer : SOLA
	 * Book : Do it! 자바 프로그래밍 입문
	 * Chapter : 02-3
	 */

public class ASCII {
	
	/*
	 * ASCII - American Standard Code for Information Interchange
	 * base on 1byte
	 * 
	 * Encoding / Decoding
	 * change Character -> Integer(encoding) or reverse(decoding)
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("인코더입니다. ASCII를 통해 인코딩 할 문자를 입력하세요.");
		char ch = sc.nextLine().charAt(0);
		
		System.out.println("ASCII를 통해 인코딩된 정수값 : " + (int)ch);
		
		
	}

}
