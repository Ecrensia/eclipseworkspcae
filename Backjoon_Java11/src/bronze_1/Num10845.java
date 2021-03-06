package bronze_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Num10845 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> queue = new LinkedList<>();
		
		int orderNum = Integer.parseInt(br.readLine());
		int rear = 0;
		
		while(orderNum > 0) {
			int number = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			String order = st.nextToken();
			if(st.hasMoreTokens()) {
				number = Integer.parseInt(st.nextToken());
				rear = number;
			}
			
			switch(order) {
			case "push":
				if(number != 0) queue.offer(number);
				break;
			case "pop":
				if(queue.poll() == null) System.out.println(-1);
				break;
			case "size":
				queue.size();
				break;
			case "empty":
				if(queue.isEmpty()) System.out.println(1);
				else System.out.println(0);
				break;
			case "front":
				if(queue.peek() == null) System.out.println(-1);
				else queue.peek();
				break;
			case "back":
				if(queue.isEmpty()) System.out.println(1);
				else if(number != 0)System.out.println(number);
				break;
			}
			orderNum--;
		}

	}

}
