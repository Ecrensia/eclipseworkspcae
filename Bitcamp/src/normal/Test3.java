package normal;

public class Test3 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 9; i++) {
			if(i == 0) {
				for(int j = 0; j < 9; j++) {
					System.out.print(" " + (j+1) + "단");
					if(j < 8) {
						System.out.print("\t");
					}
				}
				System.out.println();
			}
			
			for(int k = 0; k < 9; k++) {
				System.out.print((i+1) + "*" + (k+1) + "=" + (i+1)*(k+1));
				if(k < 8) {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
}