package list.arraylist.implementation;
public class Main {

	public static void main(String[] args) {
		ArrayList numbers = new ArrayList();
		
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		numbers.addLast(40);
		//numbers.add(1,15);
//		numbers.remove(1);
//		numbers.addFirst(5);
//		numbers.removeFirst();
//		numbers.removeLast();
//		numbers.get(1);//Ư���Ѱ��� ��������, ArrayList�� ����(index�� ���ٰ���)
		
//		System.out.println(numbers.size());//element ����
//		System.out.println(numbers.indexOf(70));//���ϴ� element�� �����ϴ���, �����Ѵٸ� ����� index����
//		System.out.println(numbers.get(1));
//		System.out.println(numbers);
		
		//for(int i=0; i<numbers.size(); i++) {
			//System.out.println(numbers.get(i));
		//}�ݺ��۾��� ó���ϱ� ���� iterator�� ����Ͽ� �ؿ� �ڵ带 ����
		
		ArrayList.ListIterator li = numbers.listIterator();
		//ArrayListŬ���� �ȿ� �ִ� ListIterator��� Ŭ������ ��ü�� li����
		//ArrayList.ListIterator�� ������ Ÿ��!!
		//�캯�� lsitIterator�� ������ return�Ѵ�. �� ������ li�� ����
//		System.out.println(li.next());
//		System.out.println(li.next());
//		System.out.println(li.next());
//		System.out.println(li.next());
//		System.out.println(li.next());//null
		//�����ٿ��� next�� 5���� �ݺ������� ��ü
		
//		while(true) {
//			System.out.println(li.next());
//			//�̷��Ը� while�� �ۼ��ϸ� elementData�� ũ���� 100�� �ʰ��Ѵٴ� ������
//			//�ݺ����� break�ϴ� ���嵵 �����ؾ��� �׋� ����ϴ°��� hasnext!!
//			
//		}
		
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		//hasNext�� ����Ÿ���� boolean
		
		//for������ iterator������ �� ������
		
	}

}
