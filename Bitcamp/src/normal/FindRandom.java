package normal;

import java.util.Scanner;

public class FindRandom {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int randomNumber = (int)(Math.random()*100)+1;
		int count = 0;
		
		while(true) {
			count++;
			
			if(count == 11) {
				System.out.println("시간초과");
				break;
			}
			
			System.out.println("1~100 사이의 숫자 중 랜덤하게 고른 자연수를 추측해보시오.");
			
			int set = sc.nextInt();
			
			if(set == randomNumber) {
				System.out.println("정답입니다.");
				break;
			}
			else if(set < randomNumber) {
				System.out.println("입력값보다 큽니다.");
				continue;
			}
			else {
				System.out.println("입력값보다 작습니다.");
				continue;
			}
		}
	}
}