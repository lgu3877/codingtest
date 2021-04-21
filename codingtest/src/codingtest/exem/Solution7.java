package codingtest.exem;

import java.util.ArrayList;
import java.util.List;


class Parcel {
	
	final int LIMITPRODUCTS = 10000;
	
	final int NEWPRODUCTS = 2000;

	List<Slot> slotArray;
	
	int products;
	
	public Parcel(int products, List<Slot> slotArray) {
		this.products = products;
		this.slotArray = slotArray;
	}
	public Parcel() {}
	
	
	private void arriveNewProducts() {
		products += NEWPRODUCTS;
	}
	
	
	
	private void allotProducts() {
		for (Slot area : this.slotArray)
			area.getProducts();
	}
	
	public void afterAnHour(int minute) {
		if(minute % 60 == 0) {
			arriveNewProducts();
			allotProducts();
		}
	}
	
}

class Slot extends Parcel {
	
	// 슬롯 최대 적재량
	final int LIMITPRODUCTS = 200;
	
	
	// 부모 적재량을 가져올 때 불러오는 함수
	public void getProducts() {
		super.products -= LIMITPRODUCTS;
		System.out.println(super.products);
	}
	
}

class People extends Slot{
	final int PERSONCAN = (25 * 6) * 2;  
}

class Vehicle extends Slot{
	
}


// 7. 물류량 구하기
class Resolve7 implements Runnable{
	
	Parcel parcel = new Parcel(2000, new ArrayList<Slot>() {{
		add(new Slot());
		add(new Slot());
		add(new Slot());
		add(new Slot());
		add(new Slot());
		add(new Slot());
	}});
	
	
	public void run () {
		int minute = 0;
		
		
			try {
				while(parcel.products < 10000) {
					Thread.sleep(50);
					System.out.printf("%d시간 %d분 \n현재 물류량 : %d\n\n",minute / 60, minute % 60, parcel.products);
					minute++;
					parcel.afterAnHour(minute);
				}
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	
	public void solution(){
	}

	
}


public class Solution7 {

	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(new Resolve7());
		thread.run();
		

		
	}

}
