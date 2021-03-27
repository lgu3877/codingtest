package codingtest.codeup100.defaultInOutPut10to27;

import java.util.Scanner;

public class Solution23 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int k = (int)(Math.log10(a)); 
		while(a > 0) {
			System.out.println("[" + (int)(a - (a % (1 * Math.pow(10,k)))) + "]");
			
			a -= a - (a % (1 * Math.pow(10,k)));
			
			k--;
			
		}
		
		
	}

}
