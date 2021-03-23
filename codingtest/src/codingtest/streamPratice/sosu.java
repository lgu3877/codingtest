package codingtest.streamPratice;


class Solution2 {
    public int solution(int N, int M) {
        int answer = 0;
        
        for(int i=0; i<=N; i++) {
        	createPrime(N);
        }
        
        return answer;
    }
    
    private int createPrime(int prime) {
    	if(prime < 2) return 0;
		
		if(prime == 2) return prime;
        
		
		for(int i = 2; i < prime; i++) {
			// 소수가 아닐경우 종료
			if(prime % i == 0) {
				return 0;
			}
		}
		return prime;
    }
}



public class sosu {

	public static void main(String[] args) {
		Solution2 sl = new Solution2();
		sl.solution(10, 12);
		
	}

}
