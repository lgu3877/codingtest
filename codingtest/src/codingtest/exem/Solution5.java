package codingtest.exem;

// 5. 발 사이즈가 같을 확율 구하기
public class Solution5 {

	public static void main(String[] args) {
		// 250 ~ 320 , 발단위는 5단위
		int numberOfCase = (320-250) / 5;
		
		
		
		// BTS 멤버 7명 
		double result =  (double) 7 / (double)numberOfCase * 100;

		
		
//		13/14 * 7/14
		
		System.out.printf("BTS 멤버들 중 발사이즈가 한명이라도 같은 확율 결과 => %.1f%%",result);
	}

}
