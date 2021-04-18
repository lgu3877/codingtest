package codingtest.exem;

public class Fibonachi {

	public static int fibo(int n) {
		if(n <= 1) return n;
		else return fibo(n-2) + fibo(n-1);
	}
	
	public static void main(String[] args) {

		for(int i =1; i<= 10; i++)
			System.out.println(fibo(i));
	}

}
