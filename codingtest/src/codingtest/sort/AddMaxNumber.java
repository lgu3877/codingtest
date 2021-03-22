package codingtest.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

// 앞자리가 제일 큰거 기준으로 정렬을 해준다.
// 그다음 다 더한다.
class Solution2 {
	
	int count = 0;
	
	public String solution(int[] arr) {
		
		String[] ob = new String[arr.length];
		
		// int[] arr => String[] ob 이동
		IntStream.of(arr).forEach(i -> {
			ob[count] = Integer.toString(i); 
			count++;
		});
		
		
		// 가장 큰 수로 조합
		Arrays.sort(ob, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				System.out.println("o1 : " + o1);
				System.out.println("o2 : " + o2);
				System.out.println();
				System.out.println();
				return (o2 + o1).compareTo(o1+o2);
						
			}
			
		});
		
		
		
		
		return ob[0].equals("0") ? ob[0] : String.join("" ,ob);
	}
}

public class AddMaxNumber {
	public static void main(String []args) {
		Solution2 sl = new Solution2();
		System.out.println(sl.solution(new int[] {6,10,2}));
		
	}
}
