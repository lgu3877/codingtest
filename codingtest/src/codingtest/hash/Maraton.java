package codingtest.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String solution(String[] participant, String[] completion) {
    	Arrays.sort(participant);
    	Arrays.sort(completion);
    	
    	System.out.println(Arrays.toString(participant));
    	System.out.println(Arrays.toString(completion));
    	int i;
    	
    	for(i=0; i< completion.length; i++) {
    		if(!participant[i].equals(completion[i]))
    			return participant[i];
    	}
    	
    	System.out.println("리턴 마지막 : "  + participant[i]);
    	
    	return participant[i];
    }
}
public class Maraton {

	public static void main(String[] args) {
		Solution sl = new Solution();
		System.out.println(sl.solution(new String[] {"marina", "josipa", "nikola", "vinko", "filipa"}, new String[] {"josipa", "filipa", "marina", "nikola"}));
		
	}

}
