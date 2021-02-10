package com.tree;

public class K_DistanceNode {

	Node root;

	K_DistanceNode() {
		root = null;
	}
	
	void printK_Distance(Node node, int K) {

		if (node == null) {
			return;
		}
		
		if(K == 0) {
			System.out.print(node.data + " ");
		}

		printK_Distance(node.left, K-1);
		printK_Distance(node.right, K-1);
	}

	void printK_DistanceRecursive(int K) {
		printK_Distance(root, K);
	}
	
	
	public static void main(String[] args) {

		K_DistanceNode tree = new K_DistanceNode();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		System.out.print("Node at K distance is : ");
		tree.printK_DistanceRecursive(0);
		System.out.println();
	}
}
