package codingtest.epopcorn;

import java.util.Scanner;

class Solution {
	
	// 1. 소수 문제
	public void solution1(int n) {
		
		System.out.print("소수 목록 => ");
		
		for (int i = 2; i <= n; i++) {
			int cnt = 0;
			for (int j=2; j <i; j++) {
				if(i % j == 0)
					cnt +=1;
			}
			
			// cnt가 증가하지 않은 것이 소수입니다.
			if(cnt == 0)
				System.out.print(i + " / ");
		}
	}
	
	
	// 2. 사칙 연산
	public void solution2() {
		
		Scanner sc = new Scanner(System.in);
		
		  
		
		// a,b => 곱해질 수
		// answer => 정답
		int a,b,answer = 0;
		
		// oper 연산기호
		char oper;
		
		// 나갈지 진행할지 입력받는 String
		String userInput ="";
		
		while(true) {
			
			// 처음에 사용자에게 질문을 던집니다.
			// 계속 진행하려면 y 나가려면 exit
			System.out.println("사칙연산을 진행하시려면 y, 종료하실려면 exit를 입력해주세요..");
			userInput = sc.next();
			
			if(userInput.equals("y")) {
				try {
					System.out.println("숫자 A를 입력하시오");
					a = Integer.parseInt(sc.next());
					
					System.out.println("숫자 B를 입력하시오");
					b = Integer.parseInt(sc.next());
					
					System.out.println("수행할 연산을 입력하시오");
					oper = sc.next().charAt(0);
					
					switch(oper) {
					case '+' :
						answer = a + b;
						break;
					case '-' :
						answer = a-b;
						break;
					case '*':
						answer = a*b;
						break;
					case '/' :
						answer = a/b;
						break;
					}
					System.out.println("결과 : " + answer);
					
					System.out.println("---------------------------");
				}
				catch(Exception e) {
					System.out.println("잘못된 입력 값입니다. 다시 시도해주세요.");
				}
				
				
			}
			else if(userInput.equals("exit")) {
				System.out.println("시스템을 종료합니다...");
				return;
			}
			else {
				System.out.println("잘못된 입력값입니다..!");
			}
			
			
			
			
		}
		
	}
	
	
}



// 3. 구구단 쓰레드 문제
class MultiplicationTable extends Thread {
	int n;
	
	// 생성자로 구구단을 실행할 값을 입력받습니다.
	public MultiplicationTable(int n) {
		this.n = n ;
	}
	
	// 쓰레드가 동작되는 run 함수입니다.
	public void run() {
		
		try {
			for (int i = 1; i < n; i++) {
				Thread.sleep(10);
				multip(i);
			}
			
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	private void multip(int k) {
		for (int i=1; i < 10; i++) {
			System.out.printf("%d X %d = %d \n",k,i,k*i);
		}
	}
	
}


public class Coindgtest {

	public static void main(String[] args) {
		Solution sl = new Solution();
		
		System.out.println("======================문제 1 (소수 문제)========================\n");
		// 1. 소수문제
		sl.solution1(100);
		
		System.out.println("\n\n\n\n======================문제 2 (사칙 연산)========================\n");
		
		// 2. 사칙 연산
		sl.solution2();
		
		
		// 3. 1~9단까지의 구구단 Thread
		System.out.println("\n\n\n\n======================문제 3 (구구단 Thread)========================\n");
		MultiplicationTable mt1 = new MultiplicationTable(10);
		mt1.start();
	}

}
