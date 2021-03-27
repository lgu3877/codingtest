package codingtest.codeup100.bdefaultInOutPut10to27;

import java.util.Scanner;

public class Solution22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String x = sc.nextLine();
		char[] arr = x.toCharArray();
		
		for(char a : arr) System.out.printf("\'%c\'\n",a);
		
	}

}
