package list.arraylist.implementation;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		System.out.println(numbers);//[10,20,30,40]출력

		numbers.add(1,50);
		System.out.println(numbers);//[10,50,20,30,40]출력
		
		numbers.remove(2);
		System.out.println(numbers);//[10,50,30,40]출력
		
		System.out.println(numbers.get(2));//30출력
		System.out.println(numbers.size());//4출력
		
		
		Iterator<Integer> it = numbers.iterator();//ArrayList 가 가지고있는 메소드인 iterator
		//iterator는 어떤한 값을 반환함. 그것을 it에 저장
		//it는 Iterator라는 데이터타입이다. Iterator는 interface
		while(it.hasNext()){
				int value = it.next();
				if (value == 30) {
					it.remove();
				}
				System.out.println(value);
				//10,50,30,40출력
			}
		
		for(int value : numbers) {//현재 numbers에는 10,50,40존재
			System.out.println(value);
			//10,50,40출력
		}
		
		for(int i=0 ; i<numbers.size(); i++) {
			System.out.println(numbers.get(i));
			//10,50,40출력
		}
	}

}
