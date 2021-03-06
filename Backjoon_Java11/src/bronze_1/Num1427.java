package bronze_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Num1427 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		
		char[] arr1 = new char[str.length()];
		
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = str.charAt(i);
		}
		
		Arrays.sort(arr1);
		
		for(int i = arr1.length-1; i >= 0; i--) {
			bw.append(arr1[i]);
		}
		
		bw.flush();
		bw.close();
	}
}