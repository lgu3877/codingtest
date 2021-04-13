package codingtest.codeup100.bdefaultInOutPut10to27;

import java.util.Scanner;

public class Solution21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a;
		
		a = sc.nextDouble();
		
		String[] arr = Double.toString(a).split("\\.");
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
	}

}
