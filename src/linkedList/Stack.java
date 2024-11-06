package linkedList;


public class Stack {
	/*
	 * ToDo
	 * 1. int 배열을 사용해서 정수를 저장하는 Stack을 구현하세요.
	 * 2. void push(int data)를 구현하세요.
	 * 3. int pop()을 구현하세요.
	 * */
	
	private int[] stackArray;
	private int top = -1;
	private int size;
	
	
	// 생성자: Stack의 크기를 초기화
	public Stack(int size) {
		this.size = size;
		stackArray = new int[this.size];
	}
	// 데이터를 Stack에 추가하는 메서드
	public void push(int data) {
		//stack이 가득차 있는가??
		if(size - 1 == top) {
			System.out.println("Stack이 가득차 있습니다.");
		} else {
			top++;
			stackArray[top] = data;
			System.out.println("Stack에 " + data + "추가완료");
		}
	}
	// 데이터를 Stack에서 꺼내는 메서드
	public int pop() {
		//top이 -1인가?
		if(top == -1) {
			System.out.println("Stack안에 내용이 없습니다.");
			return -1;
		}else {			
			int popInt = stackArray[this.top--];
			System.out.println("꺼낸 값 : " + popInt);
			return popInt;
		}		
	}
	
	// Stack이 비어있는지 확인하는 메서드
    public boolean isEmpty() {
        return top == -1;
    }
    
    // Stack이 가득 찼는지 확인하는 메서드
    public boolean isFull() {
        return top == size - 1;
    }
}
