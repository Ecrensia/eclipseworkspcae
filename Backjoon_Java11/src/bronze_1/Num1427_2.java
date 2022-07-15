package bronze_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Stack;

public class Num1427_2 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Character> sta = new Stack<>();
		
		char[] arr = br.readLine().toCharArray();
		
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++) sta.push(arr[i]);

		for(int i = 0; i < arr.length; i++) bw.append(sta.pop());
		
		bw.flush();
		bw.close();
	}
}