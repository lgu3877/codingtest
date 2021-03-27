package codingtest.codeup100.defaultTrinomialOper63to64;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution64 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String x = sc.nextLine();
		
		List<Long> arr  =   Arrays.stream(Stream.of(x.split(" ")).mapToLong(Long::parseLong).toArray()).boxed().collect(Collectors.toList());
		
		System.out.println(Collections.min(arr));
		
		
	}

}
