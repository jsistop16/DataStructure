package list.arraylist.implementation;
//iterator로 add, remove 구현
//원하는 위치에 원소 추가하기
//원하는 위치에 있는 원소를 제거하기
public class Main3 {

	public static void main(String[] args) {
		ArrayList arraylist = new ArrayList();
		
		arraylist.addLast(10);
		arraylist.addLast(20);
		arraylist.addLast(30);
		arraylist.addLast(40);
		
		ArrayList.ListIterator alli = arraylist.listIterator();
		//우변의 listIterator라는 메소드로 ListIterator(리턴값)라는 클래스와 연결
		
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
