package bronze_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Num2798 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		StringTokenizer st = new StringTokenizer(br.readLine(), " ", false);
		
		int numberOfCards = Integer.parseInt(st.nextToken());
		int wantSum = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ", false);
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i = 0; i < numberOfCards; i++) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		
		int sum = 0;
		int count = 0;
		for(int i = 0; i < arr.size()-2; i++) {
			for(int j = i+1; j < arr.size()-1; j++) {
				for(int k = j+1; k < arr.size(); k++) {
					count++;
					int caseSum = arr.get(i) + arr.get(j) + arr.get(k);
					if(sum < caseSum && caseSum <= wantSum) sum = caseSum;
					if(sum == wantSum) break;
				}
			}
		}
		System.out.println(sum + " " + count);
	}
}