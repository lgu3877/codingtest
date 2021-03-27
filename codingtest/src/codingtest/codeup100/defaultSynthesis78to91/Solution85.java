package codingtest.codeup100.defaultSynthesis78to91;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution85 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		List<Long> arr =  Arrays.stream(Stream.of(x.split(" ")).mapToLong(Long::parseLong).toArray()).boxed().collect(Collectors.toList());
		
		System.out.printf( "%.01f MB", (float)(( arr.get(0) * arr.get(1) * arr.get(2) * arr.get(3) ) / 8 ) / 1024 / 1024);
		
	}

}
