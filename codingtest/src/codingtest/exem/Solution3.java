package codingtest.exem;


// 3. 홀수 길의 배열 합 구하기
class Resolve3 {
	public int solution(int[] array) {
		
		int result = 0;
		
		for(int i = 0; i < array.length; i++)
	    {
	        for(int j = i; j < array.length; j += 2)
	        {
	            for(int k = i; k <= j; k++)
	            	result += array[k];
	        }
	    }
		
		return result;
	}
}

public class Solution3 {

	public static void main(String[] args) {
		
		Resolve3 resolve = new Resolve3();
		
		int result = resolve.solution(new int[] {1, 4, 2, 5, 3});
		
		System.out.printf("홀수 길의 배열 합 구하기 결과 => [ %d ] ", result);
	}

}
