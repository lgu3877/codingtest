package codingtest.codeup100.defaultInOutPut10to27;

import java.util.Scanner;

public class Solution19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String privateNumber;
		
		privateNumber = sc.nextLine();
		
		privateNumber = privateNumber.replace("-", "");
		
		System.out.println(privateNumber);
		
	}

}
