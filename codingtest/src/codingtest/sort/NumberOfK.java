package codingtest.sort;

import java.util.Arrays;

class Solution {
//	2,5,3
//	2번째 ~ 5번째 짜르고 그 중에 3
    public int[] solution(int[] array, int[][] commands) {
    	int[] answer = new int [commands.length];
        
    	
    	for (int i =0; i< commands.length; i++) {
    		int[] tmp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
    		System.out.println("for문 : " + Arrays.toString(tmp));
    		Arrays.sort(tmp);
    		answer[i] = tmp[commands[i][2]-1];
    	}
    	return answer;
    }
}

public class NumberOfK {

	public static void main(String[] args) {
		Solution sl = new Solution();
		int[] answer2 = sl.solution(new int[] {1, 5, 2, 6, 3, 7, 4}, new int[][] {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});
		System.out.println("최종값 : "  + Arrays.toString(answer2));
	}	

}
