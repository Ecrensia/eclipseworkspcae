package normal;

import java.util.Scanner;

public class PowerOfNaturalNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number1_Copy = number1;
		
		for(int i = 0; i < number2-1; i++) {
			number1_Copy *= number1;
		}
		
		System.out.println(number1 + "의 " + number2 + "승은 " + number1_Copy + " 입니다.");
	}
}