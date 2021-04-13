package codingtest.sort;

import java.util.Arrays;
import java.util.HashSet;

class Test {
	public int[] solution(int[] numbers) {
		Arrays.sort(numbers);
		
		System.out.println(Arrays.toString(numbers));
		HashSet<Integer> tmp = new HashSet<Integer>();
		for(int i=0; i < numbers.length; i++) {
			
			for(int j=0; j< i; j++ ) {
				tmp.add(numbers[i] + numbers[j]);
			}
		}
		
		System.out.println(tmp.toString());
		int [] answer = tmp.stream().mapToInt(Number::intValue).toArray();
		Arrays.sort(answer);
		return answer;
	}
}

public class SelectTwo {

	public static void main(String[] args) {
		Test t = new Test();
		
		t.solution(new int[] {5,0,2,7});
		
	}

}
