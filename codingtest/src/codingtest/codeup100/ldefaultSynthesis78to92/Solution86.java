package codingtest.codeup100.ldefaultSynthesis78to92;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution86 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		List<Long> arr =  Arrays.stream(Stream.of(x.split(" ")).mapToLong(Long::parseLong).toArray()).boxed().collect(Collectors.toList());
		
		System.out.printf( "%.02f MB", (float)(( arr.get(0) * arr.get(1) * arr.get(2)) / 8 ) / 1024 / 1024);
		
	}


}
