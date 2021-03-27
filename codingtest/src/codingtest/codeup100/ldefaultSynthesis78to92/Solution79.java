package codingtest.codeup100.ldefaultSynthesis78to92;

import java.util.Scanner;

public class Solution79 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String x = sc.nextLine();

		String[] arr = x.split(" ");
		for (String a : arr) {
			System.out.println(a);
			if(a.equals("q"))
				break;
			
		}
			
	}

}
