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
		System.out.println(numbers);//[10,20,30,40]���

		numbers.add(1,50);
		System.out.println(numbers);//[10,50,20,30,40]���
		
		numbers.remove(2);
		System.out.println(numbers);//[10,50,30,40]���
		
		System.out.println(numbers.get(2));//30���
		System.out.println(numbers.size());//4���
		
		
		Iterator<Integer> it = numbers.iterator();//ArrayList �� �������ִ� �޼ҵ��� iterator
		//iterator�� ��� ���� ��ȯ��. �װ��� it�� ����
		//it�� Iterator��� ������Ÿ���̴�. Iterator�� interface
		while(it.hasNext()){
				int value = it.next();
				if (value == 30) {
					it.remove();
				}
				System.out.println(value);
				//10,50,30,40���
			}
		
		for(int value : numbers) {//���� numbers���� 10,50,40����
			System.out.println(value);
			//10,50,40���
		}
		
		for(int i=0 ; i<numbers.size(); i++) {
			System.out.println(numbers.get(i));
			//10,50,40���
		}
	}

}
