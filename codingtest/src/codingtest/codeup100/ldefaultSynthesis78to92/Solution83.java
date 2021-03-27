package codingtest.codeup100.ldefaultSynthesis78to92;

import java.util.Scanner;

public class Solution83 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i=1; i<=a; i++) {
			System.out.print(i % 3 == 0 ? "X " : i+ " " );
		}
	}

}
