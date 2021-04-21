package codingtest.exem;

import java.util.ArrayList;
import java.util.List;


class Parcel {
	
	final int LIMITPRODUCTS = 10000;
	
	final int NEWPRODUCTS = 2000;

	List<Slot> slotArray;
	
	protected static int products;
	
	public Parcel(int products, List<Slot> slotArray) {
		Parcel.products = products;
		this.slotArray = slotArray;
	}
	public Parcel() {}
	
	
	private void arriveNewProducts() {
		products += NEWPRODUCTS;
	}
	
	public void afterAnHour(int minute) {
		if(minute % 60 == 0) {
			arriveNewProducts();
		}
	}
}

class Slot extends Parcel {
	Person person;
	Vehicle vehicle;
	
	public Slot(Person person, Vehicle vehicle) {
		this.person = person;
		this.vehicle = vehicle;
	}
	
	public Slot() {}
	final int LIMITPRODUCTS = 200;
	
	
	
	public void getProducts() {
		Parcel.products -= person.THROUGHPUT;
		System.out.printf("노동자들이 %d만큼 물량을 옮겼습니다...\n현재 물량 [ %d ]\n ", person.THROUGHPUT, Parcel.products);
	}
	
	
}

class Person extends Slot{
	
	final int WORKLOOPMINUTE = 25 + 10;
	final int THROUGHPUT = (25 * 6);
	
}

class Vehicle extends Slot{
	
	final int RECHARGEMINUTE = 10;
	
}


// 7. 물류량 구하기
class Resolve7 implements Runnable{
	
	Parcel parcel = new Parcel(2000, new ArrayList<Slot>() {{
		add(new Slot(new Person(), new Vehicle()));
		add(new Slot(new Person(), new Vehicle()));
		add(new Slot(new Person(), new Vehicle()));
		add(new Slot(new Person(), new Vehicle()));
		add(new Slot(new Person(), new Vehicle()));
		add(new Slot(new Person(), new Vehicle()));
	}});
	
	
	public void run () {
		int minute = 0;
		
			try {
				while(Parcel.products <= 10000) {
					Thread.sleep(1);
					minute++;
					System.out.printf("%d시간 %d분 \n현재 물류량 : %d\n\n",minute / 60, minute % 60, Parcel.products);
					
					if(minute == 25 || (minute - 25) % parcel.slotArray.get(0).person.WORKLOOPMINUTE == 0) {
						allotProducts(parcel.slotArray);
						System.out.println("==============트럭 재충전 시간 시작==============");
						
						for (int i = 0; i < parcel.slotArray.get(0).vehicle.RECHARGEMINUTE; i++) {
							Thread.sleep(1);
							minute++;
							System.out.printf("%d시간 %d분 \n현재 물류량 : %d\n\n",minute / 60, minute % 60, Parcel.products);
							
							parcel.afterAnHour(minute);
						}
						
						System.out.println("==============트럭 재충전 시간 종료==============");
					}
					
					
					
					parcel.afterAnHour(minute);
					
					
				}
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	
	// 슬롯들에 컨테이너 벨트 상품을 전달하는 함수
	private void allotProducts(List<Slot> slotArray) {
		for (Slot area : slotArray)
			area.getProducts();
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
