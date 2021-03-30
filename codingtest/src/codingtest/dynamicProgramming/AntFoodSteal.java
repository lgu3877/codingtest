package codingtest.dynamicProgramming;

import java.util.Scanner;
import java.util.stream.Stream;

public class AntFoodSteal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] dp = new int [101];
		
		int n = Integer.parseInt(sc.nextLine());
		String x = sc.nextLine();
		int[] arr = Stream.of(x.split(" ")).mapToInt(Integer::parseInt).toArray();
		
		
		
		dp[0] = arr[0];
		dp[1] = Math.max(arr[0], arr[1]);
		
		for(int i=2; i < n; i++) {
			dp[i] = Math.max(dp[i-1] , dp[i-2] + arr[i]);
			System.out.println(dp[i-1] + " , " +dp[i-2]+ " + " + arr[i]);
		}
		System.out.println(dp[n-1]);
		
		
		
		
	}

}
