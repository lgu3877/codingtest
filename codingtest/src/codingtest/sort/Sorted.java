package codingtest.sort;

import java.util.Comparator;
import java.util.stream.IntStream;


// 내림차순 정렬, 오름차순 정렬
public class Sorted {

	public static void sorted(int [] arr) {
//		Arrays.stream(arr).max(Comparator.naturalOrder()).forEach(i -> System.out.println(i));
		
		// 내림차순 정렬 (맨위에게 제일큰값 -> 440, 207, 30 , 10)
		IntStream.of(arr).boxed().sorted(Comparator.reverseOrder()).forEach(i -> System.out.println(i));
		
		System.out.println("==========================================");
		
		// 오름차순 정렬 (맨위에게 제일 작은값 -> 10,30,207,440)
		IntStream.of(arr).sorted().forEach(i -> System.out.println(i));
		
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = {10,207,30,440};
		
		sorted(arr);
	}
}
