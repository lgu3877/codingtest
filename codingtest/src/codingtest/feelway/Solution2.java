package codingtest.feelway;

public class Solution2 {

	
	public static int solution(int n) {
		if (n == 1)
			return 1;
		else if(n == 2)
			return 2;
		else 
            return solution(n-1) + solution(n-2);
	}
	public static void main(String[] args) {

			System.out.println(solution(4));


	}







}
