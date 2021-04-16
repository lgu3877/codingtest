package codingtest.feelway;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution3 {

	public static void solution(String input) {
		String[] arr = input.split(" ");
		Map<Character, Integer> map = new HashMap<Character,Integer>();
		
		defaultSetting(map);
		
		
		for(String word : arr) {
			for(int i = 0; i < word.length(); i++) {
				char alpha = word.charAt(i);
				if(alpha >= 65 && alpha <= 90)
					alpha += 32;
				map.put((char)alpha, map.get(alpha) + 1);
				
			}
		}
		
		printOutAll(map);
		
		
	}
	// 초기 세팅 함수
	public static Map<Character, Integer> defaultSetting(Map<Character, Integer> map) {
		for(int i=97; i <= 122; i++) {
			map.put((char) i,0);
		}
		return map;
	}
	
	// 출력 함수
	public static void printOutAll (Map<Character, Integer> map) {
		for(Character alpha : map.keySet()){ //저장된 key값 확인
    	System.out.println(alpha + ":" + map.get(alpha));
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		System.out.println("Hello Goorm! Your input is " + input);
		
		solution(input);
		
	}

}
