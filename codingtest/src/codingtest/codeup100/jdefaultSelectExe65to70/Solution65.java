package codingtest.codeup100.jdefaultSelectExe65to70;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution65 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String x = sc.nextLine();
		
		List<Long> as = Arrays.stream(Stream.of(x.split(" ")).mapToLong(Long::parseLong).filter(i->i%2==0).toArray()).boxed().collect(Collectors.toList());
		
		as.forEach(System.out::println);
		
	}

}
