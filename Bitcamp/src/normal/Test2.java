package normal;

public class Test2 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <i; j++) {
				System.out.print("*");
			}
			System.out.print(i+1);
			for(int k = 4; k > i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i == j) {
					System.out.print(i+1);
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}