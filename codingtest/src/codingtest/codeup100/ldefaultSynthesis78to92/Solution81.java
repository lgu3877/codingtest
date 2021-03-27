package codingtest.codeup100.ldefaultSynthesis78to92;

import java.util.Scanner;

public class Solution81 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,y;
		
		String d = sc.nextLine();
		String[] arr =  d.split(" ");
		
		x = Integer.parseInt( arr[0]);
		y =  Integer.parseInt( arr[1]);
		
			
		
		for(int i=1; i <= x; i++) {
			for(int j =1; j <= y;  j++) {
				System.out.println(i + " "+ j);
			}
		}
	}

}
