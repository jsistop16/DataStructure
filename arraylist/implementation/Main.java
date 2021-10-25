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
//		numbers.get(1);//특정한값을 가져오기, ArrayList의 장점(index로 접근가능)
		
//		System.out.println(numbers.size());//element 개수
//		System.out.println(numbers.indexOf(70));//원하는 element가 존재하는지, 존재한다면 몇번쨰 index인지
//		System.out.println(numbers.get(1));
//		System.out.println(numbers);
		
		//for(int i=0; i<numbers.size(); i++) {
			//System.out.println(numbers.get(i));
		//}반복작업을 처리하기 위해 iterator를 사용하여 밑에 코드를 구성
		
		ArrayList.ListIterator li = numbers.listIterator();
		//ArrayList클래스 안에 있는 ListIterator라는 클래스의 객체인 li선언
		//ArrayList.ListIterator는 데이터 타입!!
		//우변의 lsitIterator는 변수를 return한다. 그 변수를 li에 저장
//		System.out.println(li.next());
//		System.out.println(li.next());
//		System.out.println(li.next());
//		System.out.println(li.next());
//		System.out.println(li.next());//null
		//다음줄에서 next문 5개를 반복문으로 대체
		
//		while(true) {
//			System.out.println(li.next());
//			//이렇게만 while문 작성하면 elementData의 크기인 100을 초과한다는 에러뜸
//			//반복문을 break하는 문장도 구성해야함 그떄 사용하는것이 hasnext!!
//			
//		}
		
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		//hasNext의 리턴타입이 boolean
		
		//for문보다 iterator패턴을 더 권장함
		
	}

}
