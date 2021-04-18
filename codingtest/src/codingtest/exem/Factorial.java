package codingtest.exem;

public class Factorial {
	
	public static int facto(int n ) {
		if( n <= 1) return n;
		else return facto(n -1 ) * n;
	}

	public static void main(String[] args) {
		int result =facto(3);
		
		System.out.println(result);
	}

}
