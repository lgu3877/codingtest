package codingtest.codeup100.defaultInOutPut10to27;

import java.util.Scanner;

public class Solution24 {

	public static void main(String[] args) {
		
		String time;
		Scanner sc =new Scanner(System.in);
		
		time= sc.next();
		
		if(time.split(":")[1].equals("00"))
			System.out.printf("%d", Integer.parseInt(time.split(":")[1]));
		
		else
			System.out.printf("%02d", Integer.parseInt(time.split(":")[1]));
	}

}
