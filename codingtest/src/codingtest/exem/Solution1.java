package codingtest.exem;

import java.util.LinkedList;
import java.util.Queue;


// 1. 문자열 재구성하기
class Resolve1 {
	public String solution(String word) {
		char sortation;	// 문자인지 숫자인지 구분 시켜주는 변수 값
		String answer = "";
		 
		
		Queue<Character> numberQueue = new LinkedList<Character>();
		Queue<Character> stringQueue = new LinkedList<Character>();
		
		
		for(int i=0; i< word.length(); i++) {
			sortation = word.charAt(i);
			
			if(determineType(sortation)) 
				numberQueue.add(sortation);
			else 
				stringQueue.add(sortation);
		}
		
		
		if(!determineChange(numberQueue.size(), stringQueue.size())) return "";
		
		
		
		answer = mixWord(numberQueue, stringQueue);
		
		
		return answer;
	}
	
	
	// 숫자 = true
	// 소문자 = false
	private boolean determineType(char sortation) {
		
		// 소문자인 경우
		if(sortation < 48 || sortation > 58)
			return false;
		
		// 숫자인 경우
		return true;
	}
	
	
	// 문자열을 섞어주는 함수
	private String mixWord(Queue<Character> numberQueue, Queue<Character> stringQueue) {
		return  ((stringQueue.size() >= numberQueue.size()) ? 
								stringFirst(numberQueue, stringQueue) : numberFirst(numberQueue, stringQueue)).replace("null", "");
		
	}
	
	// 문자 먼저 일 때
	private String stringFirst(Queue<Character> numberQueue, Queue<Character> stringQueue) {
		String answer = "";
		while(!numberQueue.isEmpty() || !stringQueue.isEmpty()) {
				answer += stringQueue.poll();
				answer += numberQueue.poll();
		}
		
		return answer;
	}
	
	// 숫자 먼저 일 때
	private String numberFirst(Queue<Character> numberQueue, Queue<Character> stringQueue) {
		String answer = "";
		while(!numberQueue.isEmpty() || !stringQueue.isEmpty()) {
				answer += numberQueue.poll();
				answer += stringQueue.poll();
		}
		
		return answer;
	}
	
	
	// 변경가능한지 구별해주는 함수 
 	// 변경 가능하면 true
	// 변경 불가하면 false
	private boolean determineChange(int numberSize, int stringSize) {
		
		return Math.abs(numberSize - stringSize) < 2 ? true : false;
		
	}
}


public class Solution1 {

	
	public static void main(String[] args) {
		Resolve1 resolve = new Resolve1();
		
		String result1 = resolve.solution("a0b1c2");
		String result2 = resolve.solution("covid2019");
		String result3 = resolve.solution("exem");
		String result4 = resolve.solution("month123456");
		
		System.out.printf("문자열 재구성하기 결과1 => %s \n\n",  result1);
		System.out.printf("문자열 재구성하기 결과2 => %s \n\n",  result2);
		System.out.printf("문자열 재구성하기 결과3 => %s \n\n",  result3);
		System.out.printf("문자열 재구성하기 결과4 => %s \n\n",  result4);

	}

}
