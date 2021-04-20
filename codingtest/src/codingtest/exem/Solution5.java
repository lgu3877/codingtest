package codingtest.exem;

// 5. 발 사이즈가 같을 확율 구하기
public class Solution5 {

	public static void main(String[] args) {
		
		final int NUMBEROFCASE = (320-250) / 5;
		
		float result = (float)13 / NUMBEROFCASE;
		
		for(int i = 7; i < 13; i++) 
			result *= ((float) i / NUMBEROFCASE);
			

		result = (1 - result) * 100;
		
		System.out.printf("BTS 멤버들 중 발사이즈가 한명이라도 같은 확율 결과 => %.1f%%",result);
		
	}

}
