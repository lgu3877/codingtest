package codingtest.codeup100.defaultLoopExe71to77;

import java.util.Scanner;

public class Solution72 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int[] num = new int[size];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}
}