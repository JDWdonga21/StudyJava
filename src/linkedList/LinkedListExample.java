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
		
		System.out.println("--------- - ---------- - -----------");
		System.out.println("--- linkedlist 활용 stack, Queue ---");
		System.out.println("--------- - ---------- - -----------");
		LinkedListStackQueue myStackList = new LinkedListStackQueue();
		myStackList.push(11);
		myStackList.push(22);
		myStackList.push(33);
		
		myStackList.display();
		myStackList.push(44);
		myStackList.display();
		myStackList.stackPop();
		
		myStackList.display();
		myStackList.stackPop();
		
		myStackList.display();
		myStackList.stackPop();
		myStackList.display();
		LinkedListStackQueue myQueueList = new LinkedListStackQueue();
		myQueueList.push(111);
		myQueueList.push(222);
		myQueueList.push(333);
		
		myQueueList.display();
		
		myQueueList.queuePop();
		myQueueList.push(444);
		myQueueList.display();
		
		myQueueList.queuePop();
		myQueueList.push(555);
		myQueueList.display();
		
		myQueueList.queuePop();
		
		myQueueList.display();
	}

}
