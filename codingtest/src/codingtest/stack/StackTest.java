package codingtest.stack;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		
		s.push(3);
		System.out.println(s);
		s.push(10);
		System.out.println(s);
		s.push(9);
		System.out.println(s);
		s.push(20);
		System.out.println(s);
		s.push(3);
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.pop();
		System.out.println(s);
		
		while(!s.empty()) {
			System.out.println(s.peek());
			s.pop();
		}
		
		
	}

}
