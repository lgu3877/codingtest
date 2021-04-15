package codingtest.exem;


// 2. 일치하는 문자 개수 찾기
class Resolve2 {
	
	public int solution(String target, String[] words) {
		
		int answer = 0;
		
		for(String word : words) {
			
			for(int i =0; i < word.length(); i++) {
				String alphabet = String.valueOf(word.charAt(i));
				
				if(!target.contains(alphabet)) 
					break;
				
				else if(i == word.length()-1)
					answer++;
			}
		}
		
		return answer;
		
	}
}

public class Solution2 {

	public static void main(String[] args) {
		Resolve2 resolve = new Resolve2();
		
		int result1 = resolve.solution("abc", new String[] {"a","b","c","ab","ac","bc","abc"});
		int result2 = resolve.solution("cloud", new String[] {"card","cd","lol","doc"});
		
		System.out.printf("result1 결과  => [ %d ] \n", result1);
		System.out.printf("result2 결과  => [ %d ] \n", result2);
		
			
	}

}
