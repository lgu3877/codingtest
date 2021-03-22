package codingtest.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.IntStream;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        
    	int[] answer = new int [truck_weights.length -1];
        
        Queue<Integer> q = new LinkedList<Integer>();
        
//        IntStream.of(truck_weights).
        for(int i=0; i<truck_weights.length; i++) {
        	if(weight >= q.peek()  + truck_weights[i])
        	q.add(truck_weights[i]);
        	
        }
        
        return 0;
        
//        return answer;
    }
}  


public class PassingThroughBridge {

	public static void main(String[] args) {
		Solution sl = new Solution();
		sl.solution(100, 100, new int[]{10});
		
	}

}
