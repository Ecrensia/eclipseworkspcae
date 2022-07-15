package variables;

	/*
	 * Writer : SOLA
	 * Book : Do it! 자바 프로그래밍 입문
	 * Chapter : 02-2
	 */

public class Variable_2 {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		/*
		 * Variable Naming Rule
		 * 
		 * 1. Variable name can't start with number'
		 * 2. Variable name can't use 'reserved word'
		 * 3. Variable name can contain 'character' and 'number'
		 * 4. Variable name can contain special characters witch '$' and '_'
		 */
		
		//Variable Declaration
		byte integer1;
		short integer2;
		int integer3;
		long integer4;
		
		float real_Number1;
		double real_Number2;
		
		char character1;
		
		boolean logic1;
		
		//Variable initialize
		integer1 = 127;
		integer2 = 32767;
		integer3 = 2147483647;
		integer4 = 9223372036854775807l;
		
		real_Number1 = 12.456789f;
		real_Number2 = 12.3456789;
		
		character1 = 'A';
		
		logic1 = true;
		
		
	}
}
