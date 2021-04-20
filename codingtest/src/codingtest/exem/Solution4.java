package codingtest.exem;

// 4. 대각선 합 구하기
class Resolve4 {
	public int solution(int[][] matrix) {
		
		int result = 0;
		
		int diagonalSum = leftDiagonalLineSum(matrix);
		
		
		int oddSub = oddDetermine(matrix);
		
		
		result = diagonalSum - oddSub;
		return result;
		
	}
	
	// 대각선 합
	private int leftDiagonalLineSum(int[][] matrix) {
		int result = 0;
		
		for(int i = 0; i < matrix.length; i++) {
			result += matrix[i][i];
			result += matrix[i][matrix.length - 1 - i];
		}
		
		return result;
		
	}
	
	
	// 홀수 일 경우에 겹치는 숫자 한 번만 연산
	private int oddDetermine(int[][] matrix) {
		return (matrix.length % 2 != 0) ? 
										  matrix[matrix.length / 2][matrix.length / 2]
										: 0;
	}
}

public class Solution4 {
	public static void main(String[] args) {
		Resolve4 resolve = new Resolve4();
		int result1 = resolve.solution(new int[][] {{1,2,3}, {4,5,6}, {7,8,9}});
		int result2 = resolve.solution(new int[][] {{1,1,1,2}, {1,1,1,1}, {1,1,1,1}, {1,1,1,2}});

		System.out.printf("대각선 합 구하기 결과1 => [ %d ]\n", result1);

		System.out.printf("대각선 합 구하기 결과2 => [ %d ]", result2);
	}
	
}
