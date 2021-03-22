package codingtest.greedy;

import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] gymSuits = new int[n];
        int answer = n;
        
        
        IntStream.of(lost).forEach(i -> gymSuits[i-1]--);
        IntStream.of(reserve).forEach(i -> gymSuits[i-1]++);
        
        System.out.println(Arrays.toString(gymSuits));
        
        for(int i=0; i<gymSuits.length; i++) {
        	if(gymSuits[i] == -1) {
        		if(i-1 == 0 && gymSuits[i-1] == 1) {
        			gymSuits[i]++;
        			gymSuits[i-1]--;
        		}
        		else if(i+1 < gymSuits.length && gymSuits[i+1] == 1) {
        			gymSuits[i]++;
        			gymSuits[i]--;
        		}
        		else 
        			answer--;
        	}
        }
        
        
        
        System.out.println(Arrays.toString(gymSuits));
        
        
        
        System.out.println(answer);
        
        return answer;
    }
}

public class GymSuit {

	public static void main(String[] args) {
		Solution sl = new Solution();
		sl.solution(5, new int[] {2, 4}, new int[] {1, 3, 5});
		

	}

}
