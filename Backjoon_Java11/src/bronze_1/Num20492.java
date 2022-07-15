package bronze_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num20492 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int reward = Integer.parseInt(br.readLine());
		
		System.out.print((int)(reward*0.78));
		System.out.print(" ");
		System.out.print((int)(reward-(reward*0.2*0.22)));
	}
}