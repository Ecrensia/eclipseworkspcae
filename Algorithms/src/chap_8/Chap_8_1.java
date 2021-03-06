package chap_8;

import java.util.ArrayList;
import java.util.Hashtable;

public class Chap_8_1 {

	public static void main(String[] args) {
		
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = {0, 2, 4, 6, 8};
		
		ArrayList<Integer> arr3 = new ArrayList<>();
		
		Hashtable<Integer, Boolean> ht = new Hashtable<>();
		
		for(int i = 0; i < arr1.length; i++) {
			ht.put(arr1[i], true);
		}
		
		for(int i = 0; i < arr2.length; i++) {
			if(ht.containsKey(arr2[i])) arr3.add(arr2[i]);
		}
		
		for(Integer arrNum : arr3) System.out.println(arrNum);
	}
}