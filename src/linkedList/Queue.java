package linkedList;

public class Queue {
	//푸시테스트
	private int[] queueArray;
	private int top = -1;
	private int size;
	
	//생성자: Queue의 크기를 초기화
	public Queue(int size) {
		this.size = size;
		queueArray = new int[this.size];
	}
	// 데이터를 Queue에 추가하는 메서드
	public void push(int data) {
		//배열이 차 있는가?
		if(size - 1 == top) {
			System.out.println("Queue이 가득차 있습니다.");
		}else {
			top++;
			queueArray[top] = data;
			System.out.println("Queue에 " + data + "추가완료");
		}
	}
	// 테이터를 Queue에 꺼내는 메서드
	public int pop() {
		//top이 -1인가?
		if(top == -1) {
			System.out.println("queue안에 내용이 없습니다.");
			return -1;
		}else {
			int popInt = queueArray[0];
			System.out.println("꺼낸 값 : " + popInt);
			for(int i = 0; i <this.top; i++ ) {
				queueArray[i] = queueArray[i+1];
			}
			top--;
			return popInt;
		}		
	}
	// Queue이 비어있는지 확인하는 메서드
    public boolean isEmpty() {
        return top == -1;
    }
    
    // Queue이 가득 찼는지 확인하는 메서드
    public boolean isFull() {
        return top == size - 1;
    }
}
