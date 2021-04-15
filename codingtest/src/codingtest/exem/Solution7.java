package codingtest.exem;

import java.util.ArrayList;
import java.util.List;


/* 해당 클레스는 Thread로 직접 동작하는 것을 시간이 남아서 추가로 구현하고 싶었으나
 * 시간이 부족한 관계로 도중에 스킵했습니다.
 * 
 * [ 7번에 대한 답변을 원하신다면 Solution7to1.java 파일을 들어가주세요..!! ]
 *  
 */

class Parcel {
	
	// 컨테이너 밸트 최대 적재량
	final int LIMITPRODUCTS = 10000;
	
	// 1시간 마다 새로 들어오는 물건들
	final int NEWPRODUCTS = 2000;

	
	// 현재 상품량
	int products;
	
	public Parcel(int products) {
		this.products = products;
	}
	public Parcel() {}
	
	
	// 1시간이 지났을 때 들어오는 새로운 물건들
	public void arriveNewProducts() {
		products += NEWPRODUCTS;
	}
	
}

class Slot extends Parcel {
	
	// 슬롯 최대 적재량
	final int LIMITPRODUCTS = 200;
	
	
	// 부모 적재량을 가져올 때 불러오는 함수
	public void getProducts() {
		super.products -= LIMITPRODUCTS;
	}
	
}

class People extends Slot{
	
}


// 7. 물류량 구하기
class Resolve7 implements Runnable{
	
	public void run () {
		int minute = 0;
		
		
			try {
				while(true) {
					Thread.sleep(1000);
					System.out.println(minute);
					
					minute++;
				}
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	
	public void solution(){
		Parcel parcel = new Parcel(2000);
		
		List<Slot> slotArray = new ArrayList<Slot>() {{
			add(new Slot());
			add(new Slot());
			add(new Slot());
			add(new Slot());
			add(new Slot());
			add(new Slot());
		}};
		
		allotProducts(slotArray);
		
	}

	// 슬롯들에 컨테이너 벨트 상품을 전달하는 함수
	private void allotProducts(List<Slot> slotArray) {
		for(Slot area : slotArray)
			area.getProducts();
	}
}


/* 해당 클레스는 Thread로 직접 동작하는 것을 시간이 남아서 추가로 구현하고 싶었으나
 * 시간이 부족한 관계로 도중에 스킵했습니다.
 * 
 * [ 7번에 대한 답변을 원하신다면 Solution7to1.java 파일을 들어가주세요..!! ]
 *  
 */
public class Solution7 {

	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(new Resolve7());
		thread.run();
		

	/* 해당 클레스는 Thread로 직접 동작하는 것을 시간이 남아서 추가로 구현하고 싶었으나
	 * 시간이 부족한 관계로 도중에 스킵했습니다.
	 * 
	 * [ 7번에 대한 답변을 원하신다면 Solution7to1.java 파일을 들어가주세요..!! ]
	 *  
	 */
		
	}

}
