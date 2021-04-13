package codingtest.codeup100.jdefaultSelectExe65to70;

import java.util.Scanner;

public class Solution68 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		char a ;
		
		if(x <= 39)
			 a = 'D';
		else if(x < 69)
			a = 'C';
		else if(x <89)
			a = 'B';
		else
			a = 'A';
		System.out.println(a);
	}	

}
