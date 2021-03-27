package codingtest.codeup100.defaultSynthesis78to91;

import java.util.Scanner;

public class Solution78 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 0;
		for(int i=0; i<= n; i++) {
			if(i % 2 == 0 )
				answer += i;
		}
		System.out.println(answer);
	}
}
