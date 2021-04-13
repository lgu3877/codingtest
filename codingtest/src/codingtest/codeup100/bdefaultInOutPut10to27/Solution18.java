package codingtest.codeup100.bdefaultInOutPut10to27;

import java.util.Scanner;
import java.util.stream.Stream;

public class Solution18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String calender;
		
		calender = sc.next();
		
		int [] arr = Stream.of(calender.split("\\.")).mapToInt(Integer::parseInt).toArray();
		
		System.out.printf("%04d.%02d.%02d",arr[0],arr[1],arr[2]);
	}

}
