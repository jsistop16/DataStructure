package list.arraylist.implementation;
//iterator�� add, remove ����
//���ϴ� ��ġ�� ���� �߰��ϱ�
//���ϴ� ��ġ�� �ִ� ���Ҹ� �����ϱ�
public class Main3 {

	public static void main(String[] args) {
		ArrayList arraylist = new ArrayList();
		
		arraylist.addLast(10);
		arraylist.addLast(20);
		arraylist.addLast(30);
		arraylist.addLast(40);
		
		ArrayList.ListIterator alli = arraylist.listIterator();
		//�캯�� listIterator��� �޼ҵ�� ListIterator(���ϰ�)��� Ŭ������ ����
		
//		while(alli.hasNext()) {
//			int number = (int)alli.next();
//			if(number==30) {
//				alli.add(35);
//			}
//			
//		}
//		System.out.println(arraylist);
		
		while(alli.hasNext()) {
			int number = (int)alli.next();
			if(number == 30) {
				alli.remove();
			}
		}
		System.out.println(arraylist);
	}

}
