package codingtest.codeup100.ldefaultSynthesis78to92;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution91 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		List<Long> arr =  Arrays.stream(Stream.of(x.split(" ")).mapToLong(Long::parseLong).toArray()).boxed().collect(Collectors.toList());
		long result = arr.get(0);
		
		for(int i=1; i<arr.get(3); i++) {
			result = (result * arr.get(1)) + arr.get(2);
			System.out.println((result * arr.get(1)) + arr.get(2));
		}
		System.out.println(result);
	}

}
