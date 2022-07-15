package normal;

import java.util.Scanner;

public class Summation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i < number+1; i++) {
			sum += i;
		}
		
		System.out.println("1부터 " + number + "까지의 합은 " + sum + " 입니다.");

		
	}

}
