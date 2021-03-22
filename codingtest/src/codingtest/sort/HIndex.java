package codingtest.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Solution3{
	
    public int solution(int[] citations) {
        int answer = 0;
        
       
        List<Integer> ls = new ArrayList<Integer>();
        
        for(int i =0; i < citations.length; i++) {
        	 int low = 0;
             int high = 0;
        	for(int j=0; j< citations.length; j++) {
        		
        		if(citations[i] <= citations[j]) {
        			low++;
        		}
        		if(citations[i] >= citations[j]) {
        			high++;
        		}
        	}
        	System.out.println(low);
        	System.out.println(high);
        	
        	System.out.println();
        	if(high <= low) {
        		ls.add(high);
        	}
        	
        			
        }
        ls.sort(Comparator.reverseOrder());
        
        System.out.println(ls.toString());
        return ls.get(0);
    }
}

public class HIndex {

	public static void main(String[] args) {
		
		Solution3 sl = new Solution3();
		
		sl.solution(new int[] {3, 0, 6, 1, 5});
		
	}

}
