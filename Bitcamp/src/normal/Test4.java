package normal;

public class Test4 {

	public static void main(String[] args) {
		
		int count = 0;
		
		Loop1: for(int i = 2; i < 101; i++) {
			for(int j = 2; j < i+1; j++) {
				if(i != j && i % j == 0) continue  Loop1;
			}
			System.out.println(i);
			count++;
		}
		
		System.out.println("소수개수 : " + count);
	}
}