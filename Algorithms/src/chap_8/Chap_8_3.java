package chap_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;

public class Chap_8_3 {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = (br.readLine()).replaceAll(" ", "");
		
		Hashtable<Character, Boolean> ht = new Hashtable<>();
		
		for(int i = 0; i < str.length(); i++) ht.put(str.charAt(i), true);
		
		for(int i = 97; i < 123; i++) {
			if(!ht.containsKey((char)i)) System.out.println((char)i);
		}
		
		
	}

}
