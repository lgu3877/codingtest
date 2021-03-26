package codingtest.queue;

import java.util.LinkedList;
import java.util.Queue;

class GameStart {
	
	public int[] start(int n, String [] words) {
	
		for(int i=0; i < words.length; i++) {
			
			if(i % n == 0) {
				Queue<String> Q = new LinkedList<String>();
				
			}
		}
		
		
		
		
		
		
		
		
		return new int[] {0,0};
		
	}
	
	
//	private bindingToPerson(int n, String[] words) {
//		
//		
//	}
	
}


public class EnglishWordChain {

	public static void main(String[] args) {

		GameStart st = new GameStart();
		
		st.start(3, new String [] {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"});
		
	}

}
