package codingtest.codeup100.defaultOperation30to46;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution46 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String x;
		
		x= sc.nextLine();
		
		List<Long> arr =  Arrays.stream((Stream.of(x.split(" ")).mapToLong(Long::parseLong).toArray())).boxed().collect(Collectors.toList());
		
		long sum =  arr.stream().mapToLong(Long::longValue).sum();
		
		System.out.println(sum);
		System.out.printf("%.01f", (double) sum / arr.size());

		
	}

}
