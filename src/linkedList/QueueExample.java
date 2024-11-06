package linkedList;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue newQueue = new Queue(5);
		
		newQueue.push(11);
		newQueue.push(2);
		newQueue.push(3);
		newQueue.push(4);
		newQueue.push(5);
		newQueue.push(6);
		System.out.println(newQueue.isFull());
		
		newQueue.pop();
		newQueue.pop();
		newQueue.pop();
		newQueue.pop();
		newQueue.pop();
		newQueue.pop();
		
		System.out.println(newQueue.isEmpty());
	}
}
