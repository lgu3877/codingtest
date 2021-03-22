package codingtest.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
	
	Student(int score, String name) {
		setScore(score);
		setName(name);
	}
	
	private int score;
	private String name;

	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class StudentScoreSort {
	
	public static void main(String[] args) {
		List<Student> tmp = Arrays.asList( new Student(90, "이건욱"), new Student(70, "이사랑"), new Student(120, "구구루"));
		
		// 내림차순 정렬
		tmp.sort(Comparator.comparing(Student::getScore));
		
		tmp.forEach(i -> System.out.println(i.getScore() + " : " +  i.getName()));
		
		
		System.out.println("======================================================");
		
		// 오름차순 정렬
		tmp.sort(Comparator.comparing(Student::getScore).reversed());
		
		
		tmp.forEach(i -> System.out.println(i.getScore() + " : " +  i.getName()));
		
	}

}
