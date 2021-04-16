package codingtest.feelway;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution1 {
	public static void solution(String input) {
		
		String[] arr = input.split(" ");
		
		int sum = 0;
		
		for(String score : arr) 
			sum += Integer.parseInt(score);
			
		double avg = sum / (double)arr.length;
		
		char grade = determineGrade(avg);
		
		
		
		System.out.printf("%.2f %c", avg, grade);
		
	}
	public static char determineGrade(double avg) {
		char grade;
		
		if(avg >= 90)
			grade = 'A';
		else if (avg >= 80)
			grade = 'B';
		else if (avg >= 70)
			grade = 'C';
		else if (avg >= 60)
			grade = 'D';
		else 
			grade = 'F';
		
		return grade;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		solution(input);
		
	}
}