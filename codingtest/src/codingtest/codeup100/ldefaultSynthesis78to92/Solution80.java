package codingtest.codeup100.ldefaultSynthesis78to92;

import java.util.Scanner;

public class Solution80 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int count = 0;
		int result = 0;
		while(true) {
			result += count;
			if(a <= result) {
				System.out.println(count);
				return;
			}
			
			count++;
			
			
		}
	}

}
