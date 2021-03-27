package codingtest.codeup100.defaultInOutPut10to27;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Solution25 {

	static int count = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String calender= sc.nextLine();
		
		calender = calender.replace(".", "-");
		
		List<String> as = Arrays.asList(calender.split("-"));
		
		Collections.reverse(as);
		
		as.forEach(i -> {
			if(count < 2)
			System.out.print(i + "-");
			else
				System.out.print(i);
			count++;
		});
		
	}

}
