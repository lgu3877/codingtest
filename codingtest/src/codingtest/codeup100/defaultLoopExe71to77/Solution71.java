package codingtest.codeup100.defaultLoopExe71to77;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution71 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		Queue<Long> ls  = new LinkedList<Long> (Arrays.stream(Stream.of(x.split(" ")).mapToLong(Long::parseLong).toArray()).boxed().collect(Collectors.toList()));
		
		while(!ls.isEmpty()) {
			if(ls.peek() == 0)
				break;
			System.out.println(ls.poll());
			
		}
		
		
		
	}

}
