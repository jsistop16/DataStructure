package list.arraylist.implementation;
//previous 구현
//hasPrevious 구현

public class Main2 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.addLast(10);
		al.addLast(20);
		al.addLast(30);
		al.addLast(40);
	
		//System.out.println(al);
		ArrayList.ListIterator li = al.listIterator();
		
//		li.next();
//		li.next();
//		li.next();
//		li.next();
//		System.out.println(li.previous());//40
//		System.out.println(li.previous());//30
//		System.out.println(li.previous());//20
//		System.out.println(li.previous());//10
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}
	
	
	

}
