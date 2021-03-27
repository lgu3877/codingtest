package codingtest.codeup100.ldefaultSynthesis78to92;

import java.util.Scanner;

public class Solution87 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int result = 0;
		int count =1;
		while(result < x) {
			
			result += count;
			
			count ++;
					
		}
		
		System.out.println(result);
		
	}	

}
