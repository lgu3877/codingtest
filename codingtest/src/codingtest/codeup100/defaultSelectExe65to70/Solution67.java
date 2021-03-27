package codingtest.codeup100.defaultSelectExe65to70;

import java.util.Scanner;

public class Solution67 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long l = sc.nextLong();
		String result="";
		

		result += (l < 0) ?	"minus\n" : "plus\n";
		result += (l % 2 == 0) ?	"even" : "odd";
		
			System.out.println(result);
		
	}

}
