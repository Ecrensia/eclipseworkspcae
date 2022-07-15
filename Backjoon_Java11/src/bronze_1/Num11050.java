package bronze_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num11050 {
	
	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int naturalN = Integer.parseInt(st.nextToken());
		int naturalK = Integer.parseInt(st.nextToken());
		
		int factorialN = 1;
		int factorialK = 1;
		int factorialN_K = 1;
		
		for(int i = 1; i <= naturalN; i++) {
			factorialN *= i;
			if(i <= naturalK) factorialK *= i;
			if(i <= (naturalN-naturalK)) factorialN_K *= i;
		}
		
		int binomialCoefficient = factorialN / (factorialK * factorialN_K);
		
		System.out.println(binomialCoefficient);
	}
}