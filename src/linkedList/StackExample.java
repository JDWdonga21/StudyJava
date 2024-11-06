package linkedList;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack newStack = new Stack(3);
		
		newStack.push(10);
		newStack.push(20);
		newStack.push(30);
		newStack.push(40);
		System.out.println(newStack.isFull());
		
		newStack.pop();
		newStack.pop();
		newStack.pop();
		newStack.pop();
		
		newStack.push(50);
		newStack.push(60);
		newStack.push(70);
		
		newStack.pop();
		newStack.pop();
		newStack.pop();
		
		System.out.println(newStack.isEmpty());
	}

}
