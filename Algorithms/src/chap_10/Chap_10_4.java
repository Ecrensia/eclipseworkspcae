package chap_10;

import java.util.ArrayList;
import java.util.List;

public class Chap_10_4 {
	
	public static void main(String[] args) {
		
		List<Object> arr = new ArrayList<>();							//기초배열
		
		List<Object> arr11 = new ArrayList<>();							//[4,5,6]으로 삽입될 배열
		
		List<Object> arr21 = new ArrayList<>();							//[8]으로 삽입될 배열
		List<Object> arr22 = new ArrayList<>();							//[[9, 10, 11]]로 삽입될 배열
		List<Object> arr23 = new ArrayList<>();							//[12, 13, 14]]로 삽입될 배열

		List<Object> arr31 = new ArrayList<>();							//[12, 13, 14]]로 삽입될 배열
		List<Object> arr32 = new ArrayList<>();							//[12, 13, 14]]로 삽입될 배열
		List<Object> arr33 = new ArrayList<>();							//[12, 13, 14]]로 삽입될 배열
		List<Object> arr34 = new ArrayList<>();							//[12, 13, 14]]로 삽입될 배열
		
		arr34.add(26);
		arr34.add(27);
		arr34.add(29);
		
		arr33.add(23);
		arr33.add(24);
		arr33.add(25);
		arr33.add(arr34);
		
		arr32.add(20);
		arr32.add(21);
		arr32.add(22);
		arr32.add(arr33);
		arr32.add(30);
		arr32.add(31);
		
		arr31.add(15);
		arr31.add(16);
		arr31.add(17);
		arr31.add(18);
		arr31.add(19);
		arr31.add(arr32);
		arr31.add(32);
		
		arr23.add(12);
		arr23.add(13);
		arr23.add(14);
		
		arr22.add(9);
		arr22.add(10);
		arr22.add(11);
		arr22.add(arr23);
		
		arr21.add(8);
		arr21.add(arr22);
		
		arr11.add(4);
		arr11.add(5);
		arr11.add(6);
		
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(arr11);
		arr.add(7);
		arr.add(arr21);
		arr.add(arr31);
		arr.add(33);
		
		printAll(arr);
	}

	@SuppressWarnings("unchecked")
	public static void printAll(List<Object> arr) {
		for(int i = 0; i < arr.size(); i++) {
			if(arr.get(i).getClass().isInstance(arr)) { //if문 내부에 조건에 대한 공부가 더 필요함
				printAll((List<Object>)arr.get(i));
			}
			else System.out.println(arr.get(i));
		}
	}
}