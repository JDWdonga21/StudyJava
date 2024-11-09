package binaryTree;

public class TreeNodeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int 값을 가지고 있는 이진 트리를 나타내는 Node 라는 클래스를 정의하세요.
		 * int value, Node left, right를 가지고 있어야 합니다.
		 * BinrayTree라는 클래스를 정의하고 주어진 노드를 기준으로 출력하는 bfs(Node node)와 dfs(Node node) 메소드를 구현하세요.
		 * DFS는 왼쪽, 루트, 오른쪽 순으로 순회하세요.
		 * */
		// BinrayTree 라는 클래스를 정의
		
		// bfs(Node node)
		
		// dfs(Node node)
		
		BinrayTree tree = new BinrayTree();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);

        System.out.print("BFS: ");
        tree.bfs(tree.head); // 출력: 1 2 3 4 5

        System.out.println();

        System.out.print("DFS: ");
        tree.dfs(tree.head); // 출력: 4 2 5 1 3
		
	}

}
