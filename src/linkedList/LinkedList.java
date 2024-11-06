package linkedList;


public class LinkedList {
	/*
	 * ToDo
	 * 1. Node 클래스 정의
	 * 2. LinkedList 클래스 구현
	 * 3. 메서드 구현 (add, remove, contains, display)
	 * */
	
	private Node head; 
	
	public LinkedList() {
		this.head = null;
	}
	
	public void add(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}
	
	public void remove(int data) {
		if (head == null) return;
		if (head.data == data) {
			head = head.next;
			return;
		}
		Node current = head;
		while (current.next != null) {
			if(current.next.data == data) {
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
	}
	
	public void display() {
        Node current = head;
        while (current != null) { // 리스트의 모든 노드를 탐색
            System.out.print(current.data + " -> "); // 각 노드의 데이터를 출력
            current = current.next;
        }
        System.out.println("null"); // 리스트의 끝을 표시
    }
	
	public boolean contains(int data) {
		Node current = head;
        while (current != null) { // 리스트의 모든 노드를 탐색
            if (current.data == data) { // 데이터가 일치하는 경우
                return true; // 데이터가 존재함
            }
            current = current.next;
        }
        return false; // 데이터가 존재하지 않음
	}
	
	public class Node {
		int data;
		Node next;
		
		public Node(int data){
			this.data = data;
            this.next = null;
		}
	}
}
