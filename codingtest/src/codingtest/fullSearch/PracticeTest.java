package codingtest.fullSearch;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
	
    public int[] solution(int[] answers) {
    	int[] answer = new int[3];
        
        int [] p1 = {1,2,3,4,5};
        int [] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int [] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
         
        for(int i = 0; i < 5; i++) {
        	if(answers[i] == p1[i%5]) {
        		answer[0]++;
        	}
        	if(answers[i] == p1[i%8]) {
        		answer[1]++;
        	}
        	if(answers[i] == p1[i%10]) {
        		answer[2]++;
        	}
        } 
        
    	int maxScore = Arrays.stream(answer).max().getAsInt();
        ArrayList<Integer> list = new ArrayList<>();
        if(maxScore == answer[0]) {list.add(1);}
        if(maxScore == answer[1]) {list.add(2);}
        if(maxScore == answer[2]) {list.add(3);}
        
        System.out.println(list.toString());
        return list.stream().mapToInt(i->i.intValue()).toArray();
    }
}


public class PracticeTest {

	public static void main(String[] args) {
		Solution sl = new Solution();
		System.out.println(sl.solution(new int[] {1,2,3,4,5}));
		
	}

}
