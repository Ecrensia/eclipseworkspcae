package bronze_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;
////못품
public class Num2108 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int number = Integer.parseInt(br.readLine());
		int sum = 0;
		int[] mode = new int[8001];
		
		for(int i = 0; i < number; i++) {
			int inputCase = Integer.parseInt(br.readLine());
			sum += inputCase;
			
			if(inputCase < 0) {
				mode[Math.abs(inputCase)]++;
			} else if(inputCase > 0){
				mode[inputCase+4000]++;
			} else mode[0]++;
		}
		
		ArrayList<Integer> sortingList = new ArrayList<>();
		
		for(int i = 4000; i > 0; i--) {
			if(mode[i] == 0) continue;
			else for(int j = 0; j < mode[i]; j++) sortingList.add(-i);
		}
		
		for(int i = 0; i < mode[0]; i++) {
			sortingList.add(0);
		}
		
		for(int i = 4000; i < 8001; i++) {
			if(mode[i] == 0) continue;
			else for(int j = 0; j < mode[i]; j++) sortingList.add(i-4000);
		}
		
		IntStream intStream = Arrays.stream(mode);
		OptionalInt optionalMax = intStream.max();
		int frequencyMax = optionalMax.getAsInt();
		
		List<Integer> modeList = new ArrayList<>();
		
		for(int i = 0; i < mode.length; i++) {
			if(mode[i] == frequencyMax) {
				if(i > 4000) modeList.add(i-4000);
				else if(i == 0) modeList.add(0);
				else modeList.add(-i);
			}
		}
		
		if(sum < 0)
			System.out.println((long)(Math.round((double)Math.abs(sum) / number))*-1);
		else
			System.out.println((long)(Math.round((double)(sum) / number)));
		System.out.println(sortingList.get((sortingList.size()-1)/2));
		if(modeList.size() == 1)
			System.out.println(modeList.get(0));
		else {
			Collections.sort(modeList);
			System.out.println(modeList.get(1));
		}
		if(sortingList.get(sortingList.size()-1) == sortingList.get(0))
			System.out.println(0);
		else
			System.out.println(sortingList.get(sortingList.size()-1)-sortingList.get(0));
	}
}