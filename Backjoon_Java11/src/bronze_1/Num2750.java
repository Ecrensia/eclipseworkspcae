package bronze_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Num2750 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int number = Integer.parseInt(br.readLine());
		
		int[] arr = new int[number];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		for(int num : arr) System.out.println(num);
	}
}