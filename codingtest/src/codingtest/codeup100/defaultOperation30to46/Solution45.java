package codingtest.codeup100.defaultOperation30to46;

import java.util.Scanner;
import java.util.stream.Stream;

public class Solution45 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String x;
		
		x= sc.nextLine();
		
		long[] arr = Stream.of(x.split(" ")).mapToLong(Long::parseLong).toArray();
			
		System.out.println(arr[0] + arr[1]);
		System.out.println(arr[0] - arr[1]);
		System.out.println(arr[0] * arr[1]);
		System.out.println(arr[0] / arr[1]);
		System.out.println(arr[0] % arr[1]);
		System.out.printf("%.02f", (double)arr[0] / arr[1]);
		
	}

}
