package chap_9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Chap_9_4 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Character> sta = new Stack<>();
		
		String str = br.readLine();
		
		for(int i = 0; i < str.length(); i++) {
			sta.push(str.charAt(i));
		}
		
		while(true) {
			bw.append(sta.pop());
			
			if(sta.size() == 0) break;
		}
		
		bw.flush();
		bw.close();
		
	}

}
