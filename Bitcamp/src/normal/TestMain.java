package normal;

public class TestMain {
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			
			System.out.print("  ");
			
			for(int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			
			for(int j = 5; j > i; j--) {
				System.out.print("*");
			}
			if(i > 0) {
				for(int l = 6; l > i; l--) {
					System.out.print(" ");
				}
				for(int m = 0; m < i; m++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
		for(int i = 0; i < 6; i++) {
			if(i < 5) {
				for(int j = 5; j > i; j--) { 
					System.out.print("*");
				}
			}
			
			if(i == 0) { 
				System.out.print(" * ");
				for(int m = 0; m < i+5; m++) { 
					System.out.print("*");
				}
			}
			
			for(int l = 0; l < i; l++) {
				System.out.print(" ");
			}
			
			System.out.print(" ");	
			
			if(i > 0) {
				for(int k = 0; k < i; k++) {
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
	}
}