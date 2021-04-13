package codingtest.dynamicProgramming;


class Pibo{
	
	public int solution(int n) {
		if(n == 1 || n == 2)
			return 1;
		
		return solution(n-1) + solution(n -2);
		
		
	}
}

public class Pibonachi {

	public static void main(String[] args) {
		Pibo pb = new Pibo();
		
		System.out.println(pb.solution(9999));
		
	}

}
