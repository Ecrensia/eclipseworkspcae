package normal;

public class Diamond_Star {

	public static void main(String[] args) {
		
		int count = 0;
		
		for(int i = 0; i < 4; i++) {
			count++;
			for(int j = 3; j > i; j--) {
				System.out.print(" ");
			}
			for(int k = 0; k < i + count; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		int count2 = 0;
		
		for(int i = 0; i < 3; i++) {
			count2++;
			for(int j = 0; j < i+1; j++) {
				System.out.print(" ");
			}
			for(int k = 6; k > i+count2; k--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
