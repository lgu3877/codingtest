package codingtest.codeup100.ldefaultSynthesis78to92;

import java.util.Scanner;

public class Solution82 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		int x = Integer.valueOf(tmp,16);
		
        
        for(int i=1; i< 16; i++) {
        	System.out.printf("%X*%X=%X \n",x,i,x*i);
        }
		
	}

}
