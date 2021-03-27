package codingtest.codeup100.defaultBooleanOper53to58;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution55 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		
		List<Integer> arr  =Arrays.stream(Stream.of(x.split(" ")).mapToInt(Integer::parseInt).toArray()).boxed().collect(Collectors.toList());
		
		System.out.println(arr.get(0) ==1 || arr.get(1) == 1 ? 1 : 0);
		
	}

}
