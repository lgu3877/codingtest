package codingtest.codeup100.ldefaultSynthesis78to92;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution84 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		List<String> arr = Arrays.asList(x.split(" "));
		List<String> result = new ArrayList<>();
		System.out.println(arr.remove(3));
		
		System.out.println();
		reculsion(arr,result, arr.size(), 2);
		
		
		
	}
	
	
	
	private static void reculsion(List<String> arr, List<String> result, int n , int r) {
		if (r==0) {
			System.out.println(result.toString());
			return;
		}
		
		for(int i =0;i<n; i++) {
			result.add(arr.remove(i));
			reculsion(arr, result, n-1, r-1);
			arr.add(i, result.remove(result.size() -1 ));
		}
		
		
	}

}
