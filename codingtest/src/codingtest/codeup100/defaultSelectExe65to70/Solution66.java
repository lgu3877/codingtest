package codingtest.codeup100.defaultSelectExe65to70;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution66 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String x = sc.nextLine();
		
		List<Long> as = Arrays.stream(Stream.of(x.split(" ")).mapToLong(Long::parseLong).toArray()).boxed().collect(Collectors.toList());
		
		as.forEach(i ->  {
			if(i%2==0)
				System.out.println("even");
			else
				System.out.println("odd");
			
		});
		
	}

}
