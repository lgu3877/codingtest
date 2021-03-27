package codingtest.codeup100.defaultSelectExe65to70;

import java.util.Scanner;

public class Solution70 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int weather = sc.nextInt();
		String x = "";
		switch(weather) {
		case 12 :
		case 1:
		case 2:
			x = "winter";
			break;
		case 3:
		case 4:
		case 5:
			x="spring";
			break;
		case 6:
		case 7:
		case 8:
			x="summer";
			break;
		case 9:
		case 10:
		case 11:
			x= "fall";
			break;
		}
		System.out.println(x);
	}

}
