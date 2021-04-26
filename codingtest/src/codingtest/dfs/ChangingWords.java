package codingtest.dfs;

import java.util.Arrays;

class Solution {
    public int solution(String begin, String target, String[] words) {
    	if(Arrays.stream(words).allMatch(result -> !result.equals(target))) return 0;
    	int answer = 0;
    	Arrays.stream(words).forEach(i -> System.out.println(i));
        return answer;
    }
}


public class ChangingWords {

	public static void main(String[] args) {
		Solution sl = new Solution();
		
		sl.solution("hit", "cog", new String[] {"hot", "dot", "dog", "lot", "log", "cog"});
		
	}

}
