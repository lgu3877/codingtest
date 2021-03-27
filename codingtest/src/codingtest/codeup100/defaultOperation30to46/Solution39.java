package codingtest.codeup100.defaultOperation30to46;

import java.util.Scanner;
import java.util.stream.Stream;

public class Solution39 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String a = sc.nextLine();
		
		long [] x = Stream.of(a.split(" ")).mapToLong(Long::parseLong).toArray();
		
		System.out.println(x[0]+x[1]);
	}

}
