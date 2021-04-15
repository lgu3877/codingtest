package codingtest.sort;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Test1 {
	public int[] solution(int [] arr) {
		List<Integer> ar  = new ArrayList<Integer>();
		
		ar.add(arr[0]);
		
		for(int i=0; i < arr.length; i++) {
			if(i != arr.length-1 && arr[i] != arr[i+1])
				ar.add(arr[i+1]);
			
				
		}
		
		return ar.stream().mapToInt(Integer::intValue).toArray();
//		return (IntStream.of(arr).boxed().collect(Collectors.toCollection(LinkedHashSet::new))).stream().mapToInt(Integer::intValue).toArray();
	}
}

public class SameNumberHate {

	public static void main(String[] args) {
		Test1 t = new Test1();
		t.solution(new int[] {1,1,3,3,0,1,1});
	}

}
