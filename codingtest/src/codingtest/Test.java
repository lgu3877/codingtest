package codingtest;

import java.util.Arrays;
import java.util.stream.Stream;


class Solve<N>{
	public int solution(String conditions, String arr) {
		int[] condition = Stream.of(conditions.split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] arrs = Stream.of(arr.split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] ar = Arrays.stream(arrs).sorted().toArray();

		int count = 0;
		count += condition[1] % (condition[2]+1);
		
		int max = ar[ar.length-1];
		int secondMax = ar[ar.length-2];
		
		
		return ( max * count ) + ((condition[1] - count) *secondMax);
	}
}

//24 + 8 + 5 + 2 = 41
//5 + 3 + 2 + 4 + 2 + 1 = 17
//58
//m


public class Test {

	
	
	public static void main(String[] args) {
		Solve<Integer> sv = new Solve<Integer>();
		int [] arr = {5,8,3};
		int [] arr2 = {2,4,5,4,6};

		
		int reuslt = sv.solution("6 12 4","23 8 9 15 12 9 12");
		
		
		System.out.println("@@" + reuslt);
	}

}
