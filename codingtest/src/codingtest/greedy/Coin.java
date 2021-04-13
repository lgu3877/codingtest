package codingtest.greedy;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class Coin {
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> coins = new ArrayList<>();
		int result  = 0;
		
		String x = sc.nextLine();
		int [] arr = Stream.of(x.split(" ")).mapToInt(Integer::parseInt).toArray();
		
		while(arr[0] > 0) {
			coins.add(sc.nextInt());
			
			
			arr[0]--;
			
		}
		
		for(int i =coins.size(); i > 0; i--) {
			result += arr[1] / coins.get(i-1);
			arr[1] %= coins.get(i-1);
		}
		
		
		
		System.out.println(result);
		
	}

}
