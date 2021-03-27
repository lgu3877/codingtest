package codingtest.codeup100.mdefaultArray93to95;

import java.util.Scanner;
import java.util.stream.Stream;

public class Solution93 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int time = Integer.parseInt(sc.nextLine());
		String call = sc.nextLine();
		
		int [] k = Stream.of(call.split(" ")).mapToInt(Integer::parseInt).toArray();
		
		
		int[] arr = new int[23];
		
		for(int i=0; i< arr.length; i++) {
			arr[i] = 0;
		}
		
		for(int i=0; i< k.length; i++) {
			arr[k[i]-1]++;
		}
		
		int count = 0;
		for(int i : arr) {
			if(count == 22)
				System.out.print(i);
			else 
				System.out.print(i + " ");
			count++;
		}
			
		System.out.println();
	}

}

