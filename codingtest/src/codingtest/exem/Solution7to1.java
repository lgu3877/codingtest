package codingtest.exem;

class Resolve7to1 {
	public boolean solution() {
		
		//시간당 들어오는 물류 개수
		final int NEWPRODUCTS = 2000;
		
		// 슬롯 개수
		final int SLOTS = 6;
		
		// 최대 허용량 물건 개수
		final int MAXPRODUCTS = 10000;
		
		
		// @슬롯 1개가 처리할 수 있는 양
		// 사람 한 명당  70분에 처리할 수 있는 물류량 
		// (25 * 6) 차 한대에 들어갈 수 있는 물류 개수   (300개)
		final int PERSONCAN = (25 * 6) * 2;  
		
		// (25 * 2) + 20 처리되는데 걸리는  시간 (분 단위)  (70분)
		final int ANHOUR = (25 * 2) + 20;
		
		
		// 1분당 손실되는 물량
		int lossItemsPerMinute = (NEWPRODUCTS / 60) - (PERSONCAN * SLOTS / 70 );
		
		// 재시작되는데 소요되는 분
		int lossMinutes = MAXPRODUCTS / lossItemsPerMinute;
		
		// 재시작되는데 소요되는 시간
		int lossHours = lossMinutes / 60;
		
		System.out.println("7-1번. 아래 두 가지 질의에 대한 답을 구하는 프로그래밍을 작성하세요.");
		System.out.println("멈출 수 밖에 없는 물량이라면 그것은 운영을 시작한 후 언제가 될까? " + lossHours + "시간 이후에");
		
		
		
		// 1시간당 들어오는 물류개수 <= 슬롯 6개가 처리하는 양
		if( NEWPRODUCTS <= PERSONCAN * SLOTS)
			return true;
		else 
			return false;
	}
}

public class Solution7to1 {

	public static void main(String[] args) {
		Resolve7to1 resolve = new Resolve7to1();
		boolean bl = resolve.solution();
		System.out.println("처리 가능한 물류인가 ? " + bl);
		
		
	
		/*	Q. 7-2번 멈추지 않고 운영할 수 있도록 알고리즘이나 해결책을 제시하세요.
		 * 
		 * 
		 *  A. 만약 고정되어있는 제시값을 변경할 수 있다고 가정을 한다면
		 *  슬롯의 개수를 한 개만 더 늘리면 현재 처리하고 있는 물량을 초과하지 않고 
		 *  물건들을 처리할 수 있다.
		 *  
		 *  하지만 개발자로서 접근을 해보자면
		 *  문제상에서 보면 기계팔이 해당 슬롯의 물건이면 밀어 넣고 밀어넣은 물건을 
		 *  사람이 차에 실어나르는 프로세스를 가지고있다.
		 *  
		 *  그렇다면 왜? 차에 꼭 사람이 물건을 실어날라야할까?
		 *  차까지 물건을 실어나를 수 있는 기계팔은 프로그래밍할 수 없을까?
		 *  라는 관점에서 보자면
		 *  차까지 물건을 실어나를 수 있는 기계팔을 프로그래밍하면
		 *  현재 문제에서 제시해준 고정값에서 인력을 더 감축시켜도
		 *  멈추지 않고 운영할 수 있을 것이다.
		 * 
		 */
	}

}
