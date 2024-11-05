package linkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList myLinkList = new LinkedList();
		
		myLinkList.add(10);
		myLinkList.add(20);
		myLinkList.add(30);
		myLinkList.add(40);
		myLinkList.add(50);
		
		myLinkList.display();
		
		myLinkList.remove(30);
		
		myLinkList.display();
		
		boolean test;
		
		test = myLinkList.contains(30);
		System.out.println(test);
		test = myLinkList.contains(40);
		System.out.println(test);
	}

}
