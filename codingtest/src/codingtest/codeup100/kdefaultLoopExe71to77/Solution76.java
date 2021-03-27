package codingtest.codeup100.kdefaultLoopExe71to77;

import java.util.Scanner;

public class Solution76 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char c = sc.next().charAt(0);
		
		int n = 97;
		while((int)c >= n) {
			System.out.print((char)n++ + " ");
		}
	}

}
