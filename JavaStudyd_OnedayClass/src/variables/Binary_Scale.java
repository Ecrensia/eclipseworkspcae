package variables;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;

/*
	 * Writer : SOLA
	 * Book : Do it! 자바 프로그래밍 입문
	 * Chapter : 02-1
	 */

public class Binary_Scale {

	/*
	 * Binary Scale
	 * 
	 * Computer can understand only 0 and 1
	 * Human can understand binary scale, but we usually use decimal
	 * So, we must convert decimal to binary scale for input number to computer
	 * 
	 * Step - convert decimal to binary scale
	 * 1. Set decimal number that want to convert binary scale
	 * 2. Division decimal number using natural number 2
	 * 3. Change quotient to dividend
	 * 4. Division dividend using natural number 2
	 * 5. repeat step 3~4 when remainder 1 or 0
	 * 6. Write continuously remainder
	 * 7. Write subscript end of the binary number.
	 */
	
	
	//Program about decimal to binary code - do not copy. just see.
	public static void main(String[] args) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Integer> sta = new Stack<>();
		
		System.out.println("이진법으로 변환할 십진수를 입력하시오.");
		int decimal = sc.nextInt();
		
		sc.close();
		
		while(decimal != 0) {
			int remainder = decimal % 2;
			sta.push(remainder);
			decimal /= 2;
		}
		
		while(!sta.isEmpty()) {
			bw.append(Integer.toString(sta.pop()));
		}
		
		System.out.print("변환된 이진수 : ");
		bw.flush();
		bw.close();
	}
}