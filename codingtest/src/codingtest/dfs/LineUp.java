package codingtest.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution6 {
    public int[] solution(int n, long k) {
        int[] answer = new int[n];
       
        List<Integer> al = new ArrayList<>();
        int fn = 1;
        for (int i=1; i<=n; i++) {
        	fn *= i;	// 경우의 수
        	System.out.printf("%d * %d = %d\n",fn,i,fn*i);
        	al.add(i);	// List에 i 추가
        }
       System.out.println(al.toString()); 
       
       
        k--;
        
        System.out.println("\n\n===============\n\n");
        
        
        int idx = 0;
        
        while(n>0) {
        	fn /= n;
        	System.out.printf("\n1. %d / %d = %d\n",fn,n,fn/n);
        	
        	
        	answer[idx++] = al.get((int) (k/fn));
        	System.out.printf("2. %d / %d = %d\n",k,fn,k/fn);
        	
        	System.out.println(al.get((int) (k/fn)));
        	
        	
        	al.remove((int)k/fn);
        	k %= fn;
        	n--;
        }
        
        System.out.println("\n\n============정답==============");
        return answer;
    }
    
    
}

public class LineUp {

	public static void main(String[] args) {
		Solution6 sl = new Solution6();
		
		System.out.println(Arrays.toString(sl.solution(3, 5)));
	}

}
