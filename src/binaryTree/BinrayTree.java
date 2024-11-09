package binaryTree;


/*
 * int 값을 가지고 있는 이진 트리를 나타내는 Node 라는 클래스를 정의하세요.
 * int value, Node left, right를 가지고 있어야 합니다.
 * BinrayTree라는 클래스를 정의하고 주어진 노드를 기준으로 출력하는 bfs(Node node)와 dfs(Node node) 메소드를 구현하세요.
 * DFS는 왼쪽, 루트, 오른쪽 순으로 순회하세요.
 * */

public class BinrayTree {
	// 트리의 루트 노드를 나타내는 변수
	//    private Node head;
	public Node head;
	
	// 생성자 : 트리의 head를 초기화합니다.
    public BinrayTree() {
        this.head = null;
    }

    // Node 클래스 정의 - 각 트리의 노드
    public class Node {
        int value;
        Node left;
        Node right;
        
        // 생성자 : 노드의 값을 정의하고, 자식 노드를 null로 초기화
        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    // 간단한 큐 클래스 정의 - BFS 구현을 위해 노드를 저장하는 큐
    public class NodeQueue {
        private QueueNode front; // 큐의 앞부분을 가리키는 포인터
        private QueueNode rear; // 큐의 뒷부분을 가리키는 포인터

        // 큐의 각 노드를 나타내는 내부 클래스
        private class QueueNode {
            Node treeNode; //트리의 노드를 저장
            QueueNode next; // 다음 큐 노드를 가리키는 포인터
            
            // 생성자 : 트리 노드를 설정하고, 다음 노드를 null로 초기화
            public QueueNode(Node treeNode) {
                this.treeNode = treeNode;
                this.next = null;
            }
        }
        
        // 생성자 : 큐의 front와 rear를 초기화
        public NodeQueue() {
            this.front = null;
            this.rear = null;
        }

        // 큐가 비어있는지 확인
        public boolean isEmpty() {
            return front == null;
        }

        // 큐에 요소 추가
        public void enqueue(Node treeNode) {
            QueueNode newNode = new QueueNode(treeNode);
            if (rear == null) {
            	// 큐가 비어있다면 front와 rear가 모두 새로운 노드를 가리킴
                front = rear = newNode;
            } else {
            	// 그렇지 않다면 rear의 다믐 노드로 설정하고, rear를 이동
                rear.next = newNode;
                rear = newNode;
            }
        }

        // 큐에서 요소 제거 및 반환
        public Node dequeue() {
            if (isEmpty()) {
                return null;
            }
            // front가 가리키는 노드를 제거하고 변환
            Node treeNode = front.treeNode;
            front = front.next;
            if (front == null) {
                rear = null;
            }
            return treeNode;
        }
    }

    // insert 메서드 수정: 직접 구현한 큐 사용
    public void insert(int value) {
        Node newNode = new Node(value);

        if (head == null) {
        	// 트리가 비어있다면, 새로운 노드를 head로 설정
            head = newNode;
            return;
        }
        
        // BFS 방식으로 트리를 순회하여 빈 자리에 노드를 추가
        NodeQueue queue = new NodeQueue();
        queue.enqueue(head);

        while (!queue.isEmpty()) {
            Node current = queue.dequeue();
            
            // 왼쪽 자식이 비어있다면 왼쪽에 추가
            if (current.left == null) {
                current.left = newNode;
                break;
            } else {
                queue.enqueue(current.left);
            }
            // 오른쪽 자식이 비어있다면 오른쪽에 추가
            if (current.right == null) {
                current.right = newNode;
                break;
            } else {
                queue.enqueue(current.right);
            }
        }
    }

    // BFS 메서드: 트리를 너비 우선으로 순회합니다.
    public void bfs(Node node) {
        if (node == null) return;

        NodeQueue queue = new NodeQueue(); //큐를 사용하여 순회
        queue.enqueue(node);

        while (!queue.isEmpty()) {
            Node current = queue.dequeue();
            System.out.print(current.value + " ");

            if (current.left != null)
                queue.enqueue(current.left);

            if (current.right != null)
                queue.enqueue(current.right);
        }
    }

    // DFS 메서드 (왼쪽, 루트, 오른쪽 순서)
    public void dfs(Node node) {
        if (node == null) return;

        dfs(node.left);                 // 왼쪽 자식 방문
        System.out.print(node.value + " "); // 노드 방문
        dfs(node.right);                // 오른쪽 자식 방문
    }
}
