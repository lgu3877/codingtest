package codingtest.sort;


// 문자열을 거꾸로 생성시켜줌
public class ReverseString {
	
	public static String rs(String input) {
		return new StringBuffer(input).reverse().toString(); 
	}
	
	public static void main(String[] args) {
		System.out.println(rs("couldDead"));
	}
}
