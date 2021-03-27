package codingtest.codeup100.defaultcompareOper49to52;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution51 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		String x =	sc.nextLine();
		List<Long> arr = Arrays.stream(Stream.of(x.split(" ")).mapToLong(Long::parseLong).toArray()).boxed().collect(Collectors.toList());
		
		System.out.println(arr.get(0) <= arr.get(1) ? 1 : 0);
	}

}
