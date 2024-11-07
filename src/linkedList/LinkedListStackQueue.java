package linkedList;


public class LinkedListStackQueue {
	/*
	 * ListNode head를 가지고 있는 ListNodeStack 클래스 구현
	 * ListNode head를 가지고 있는 ListNodeQueue 클래스 구현
	 * */
	private Node head;
	
	public LinkedListStackQueue() {
		this.head = null;
	}
	
	public void push(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}
	public int stackPop() {
	    if (head == null) {
	        System.out.println("pop을 할 값이 없습니다.");
	        return -1;
	    }
	    
	    // 단일 노드만 있을 경우, head를 제거
	    if (head.next == null) {
	        int stackData = head.data;
	        head = null; // 리스트가 비어 있게 설정
	        System.out.println("stack Pop : " + stackData);
	        return stackData;
	    }
	    
	    // 여러 노드가 있을 경우, 마지막 노드까지 이동하여 pop
	    Node current = head;
	    Node previous = null;
	    
	    // 마지막 노드로 이동하며 이전 노드 추적
	    while (current.next != null) {
	        previous = current;
	        current = current.next;
	    }
	    
	    // 마지막 노드를 pop
	    int stackData = current.data;
	    previous.next = null; // 이전 노드의 next를 null로 설정하여 마지막 노드 제거
	    System.out.println("stack Pop : " + stackData);
	    return stackData;
	}

	
	public void display() {
        Node current = head;
        while (current != null) { // 리스트의 모든 노드를 탐색
            System.out.print(current.data + " -> "); // 각 노드의 데이터를 출력
            current = current.next;
        }
        System.out.println("끝"); // 리스트의 끝을 표시
    }
	
	public int queuePop() {
		if(head == null) {
			System.out.println("pop을 할 값이 없습니다.");
			return -1;
		}else {
			int stackData;
			stackData = head.data;
			head = head.next;
			//			current = null;
	        System.out.println("stack Pop : " + stackData);
	        return stackData;
		}		
	}
	
	public class Node {
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
}
