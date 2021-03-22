package codingtest.dfs;

public class Factorial {

	// 반복
	public static int factorialInterface(int n) {
		int result = 1;
		
		for(int i = 1; i<= n; i++) {
			result *= i;
		}
		return result;
	}
	
	// 재귀
	public static int factorialRecurisve(int n ) {
		if(n <= 1 ) return 1;
		
		return n * factorialRecurisve(n-1);
		
	}
	
	public static void main(String[] args) {
		System.out.println(factorialInterface(5));
		System.out.println(factorialRecurisve(5));
	}

}
