package bronze_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num2869 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int up = Integer.parseInt(st.nextToken());
		int down = Integer.parseInt(st.nextToken());
		int meter = Integer.parseInt(st.nextToken());
		
		int day = (meter / (up - down))-2;
		int height = (up - down) * day;
		
		
		while(true) {
			day++;
			height += up;
			if(height >= meter) break;
			height -= down;
		}
		System.out.println(day);
	}
}