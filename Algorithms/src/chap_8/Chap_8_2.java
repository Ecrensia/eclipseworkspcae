package chap_8;

import java.util.Hashtable;

public class Chap_8_2 {

	public static void main(String[] args) {
		
		 String[] arr = {"a", "b", "c", "d", "e", "f", "g", "d"};
		 
		 Hashtable<String, Boolean> ht = new Hashtable<>();
		 
		 for(int i = 0; i < arr.length; i++) {
			 if(!ht.containsKey(arr[i])) ht.put(arr[i], true);
			 else {
				 System.out.println(arr[i]);
				 break;
			 }
		 }
		
		
		
	}

}
