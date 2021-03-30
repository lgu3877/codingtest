package codingtest.greedy;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class Coin2 {

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
		
	}

}
