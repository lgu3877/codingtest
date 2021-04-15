package codingtest.queue;

import java.util.Stack;

class Test1 {
	public int solution(int[][] board, int[] moves) {
		
		Stack<Integer> stack = new Stack<Integer>();
		int answer = 0;
		
		for(int i=0; i< moves.length; i++) {
			for(int j=0; j < board.length; j++) {
				if(board[j][moves[i]-1] != 0) {
					int tmp = 0;
					
					if(!stack.isEmpty())
						tmp = stack.peek();
					
					stack.add(board[j][moves[i]-1]);
					
					if(stack.size() != 1 && tmp == board[j][moves[i]-1]) {
						stack.pop();
						stack.pop();
						answer++;
						answer++;
					}
					
					
					
					board[j][moves[i]-1] = 0;
					

					
					
					break;
				}
			}
			
		}
		return answer;
	}
	
}

public class KakaoCrainDollPickUp {

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		System.out.println(t1.solution(new int[][] {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}}, new int[] {1,5,3,5,1,2,1,4}));
		
	}

}
