package codingtest.codeup100.ddefaultOperation30to46;

import java.util.Scanner;
import java.util.stream.Stream;

public class Solution42 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		
		String a = sc.nextLine();
		
		long []arr = Stream.of(a.split(" ")).mapToLong(Long::parseLong).toArray();		
		
		
		System.out.println(arr[0] / arr[1]);
	}

}
